package baseball.controller;

import baseball.dto.ComputerDTO;
import baseball.dto.GameResultDTO;
import baseball.model.GameModel;
import baseball.view.ConsoleView;

public class GameController {

    GameModel gameModel;
    ComputerDTO computerDto;

    public GameController() {
        gameModel = new GameModel();
        computerDto = new ComputerDTO(gameModel.initNumber()); // 컴퓨터 숫자생성
    }

    /*
      1. 숫자입력 콘솔출력
      2. 숫자입력받기
      3. 번호비교
      4. 비교결과 콘솔출력
      5. 3스트라이크가 나올때까지 반복
      6. 3스트라이크일 경우 컴퓨터 숫자 재생성 및 재시작/종료 선택
    */
    public void runGame() {
        boolean isContinue = true;
        while (isContinue) {
            GameResultDTO gameResult = gameModel.predictNumber(computerDto); // 예측숫자 입력받아 정답과 비교
            gameModel.initCheck(gameResult.getStrikeCount(), computerDto); // 3스트라이크일 경우 초기화
        }
        ConsoleView.printCloseGame();
    }
}
