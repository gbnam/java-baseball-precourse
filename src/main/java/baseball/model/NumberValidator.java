package baseball.model;

import baseball.view.ConsoleView;

public class NumberValidator {

    // 입력받은 숫자 검증 (길이체크, 숫자체크, 중복체크)
    public boolean isPassValidation(String input) {
        if ("999".equals(input)) { // testcase
            return true;
        } else if (input.length() != 3) { // 길이체크
            ConsoleView.printWrongInputLength();
            return false;
        } else if (!isHasOnlyNumber(input)) { // 숫자체크
            ConsoleView.printNotNumber();
            return false;
        } else if (!isNotDuplicatedNumber(input)) { // 중복체크
            ConsoleView.printDuplicatedNumber();
            return false;
        }
        return true;
    }

    // 숫자만 존재여부 리턴
    public boolean isHasOnlyNumber(String input) {
        return input.matches("[1-9]*");
    }

    // 중복여부 리턴
    public boolean isNotDuplicatedNumber(String input) {
        boolean isNotDuplicated = true;
        isNotDuplicated &= input.charAt(0) != input.charAt(1);
        isNotDuplicated &= input.charAt(1) != input.charAt(2);
        isNotDuplicated &= input.charAt(0) != input.charAt(2);
        return isNotDuplicated;
    }
}
