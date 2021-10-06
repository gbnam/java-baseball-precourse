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
            randomNumber = Integer.toString(Randoms.pickNumberInRange(1, 9) * 100 + Randoms.pickNumberInRange(1, 9) * 10
                    + Randoms.pickNumberInRange(1, 9));
//            randomNumber = Integer.toString(Randoms.pickNumberInRange(123,987)); // 테스트시 에러발생
            isPass = numberValidator.isPassValidation(randomNumber); // 생성된 랜덤숫자 validation 통과할때까지 반복
        }
        return randomNumber;
    }

}
