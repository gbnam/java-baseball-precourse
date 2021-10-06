package baseball.view;

public class ConsoleView {

    public static void printPredictNumber() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public static void printPredictResult(String gameResultText) {
        System.out.println(gameResultText);
    }

    public static void printGameFinished(){
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 끝");
    }

    public static void printSelectRestart(){
        System.out.print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요 : ");
    }

    public static void printWrongGameFinishInput(){
        System.out.print("[ERROR] 입력이 잘못되었습니다. 1 또는 2를 입력해주세요. : ");
    }

    public static void printDuplicatedNumber(){
        System.out.print("[ERROR] 중복인 숫자가 존재합니다. 서로 다른 3자리 숫자를 입력해주세요. : ");
    }

    public static void printNotNumber(){
        System.out.print("[ERROR] 숫자가 아닌 문자가 존재합니다. 서로 다른 3자리 숫자를 입력해주세요. : ");
    }

    public static void printWrongInputLength(){
        System.out.print("[ERROR] 입력 길이가 잘못되었습니다. 서로 다른 3자리 숫자를 입력해주세요. : ");
    }

    public static void printCloseGame(){
        System.out.println("게임을 종료합니다.");
    }
}
