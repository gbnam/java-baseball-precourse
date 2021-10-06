package baseball.model;

import baseball.dto.ComputerDTO;
import baseball.dto.GameResultDTO;
import baseball.view.ConsoleView;
import nextstep.utils.Console;
import nextstep.utils.Randoms;

public class GameModel {

    CompareNumbers compareNumbers;
    NumberValidator numberValidator;
    UserInput userInput;

    public GameModel() {
        compareNumbers = new CompareNumbers();
        numberValidator = new NumberValidator();
        userInput = new UserInput();
    }

    // 숫자 예측값 받아서 비교 후 결과 리턴
    public GameResultDTO predictNumber(ComputerDTO computerDto) {
        ConsoleView.printPredictNumber();
        String input = userInput.getPredictNumberInput();
        GameResultDTO gameResult = compareNumbers.compare(input, computerDto.getComputerNumber());
        ConsoleView.printPredictResult(getResultText(gameResult));
        return gameResult;
    }

    // 출력될 게임결과 text 리턴
    public String getResultText(GameResultDTO gameResult) {
        String result = "";
        if (gameResult.getStrikeCount() > 0)
            result += gameResult.getStrikeCount() + "스트라이크 ";
        if (gameResult.getBallCount() > 0)
            result += gameResult.getBallCount() + "볼";
        if (gameResult.getStrikeCount() + gameResult.getBallCount() == 0)
            result = "낫싱";
        return result;
    }

    // 랜덤숫자 생성
    public String initNumber() {
        String randomNumber = "";
        boolean isPass = false;
        while (!isPass) {
            randomNumber = Integer.toString(Randoms.pickNumberInRange(1, 9) * 100
                    + Randoms.pickNumberInRange(1, 9) * 10 + Randoms.pickNumberInRange(1, 9));
//            randomNumber = Integer.toString(Randoms.pickNumberInRange(123,987)); // 테스트시 에러발생
            isPass = numberValidator.isPassValidation(randomNumber); // 생성된 랜덤숫자 validation 통과할때까지 반복
        }
        return randomNumber;
    }

    // 3스트라이크일 경우 컴퓨터 숫자 초기화
    public void initCheck(int strikeCount, ComputerDTO computerDto) {
        if (strikeCount >= 3)
            computerDto.setComputerNumber(initNumber());
    }

    // 게임결과가 3스트라이크인 경우 재시작 or 종료 선택
    public boolean isContinueCheck(GameResultDTO gameResult) {
        if (gameResult.getStrikeCount() >= 3) {
            ConsoleView.printGameFinished();
            return isRestart();
        }
        return true;
    }

    // 1을 입력받으면 재시작, 2를 입력받으면 종료
    public boolean isRestart() {
        ConsoleView.printSelectRestart(); // 재시작 문구 출력
        String inputSelectContinue = Console.readLine();
        if ("1".equals(inputSelectContinue)) {
            return true;
        } else if ("2".equals(inputSelectContinue)) {
            return false;
        }
        return false;
    }
}
