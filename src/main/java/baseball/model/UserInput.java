package baseball.model;

import nextstep.utils.Console;

public class UserInput {

    NumberValidator numberValidator;

    public UserInput() {
        numberValidator = new NumberValidator();
    }

    // 예측할 숫자 콘솔에서 유저에게 입력받으며 validation 통과할때까지 반복
    public String getPredictNumberInput() {
        String input = "";
        boolean isPass = false;
        while (!isPass) {
            input = Console.readLine();
            isPass = numberValidator.isPassValidation(input);
        }
        return input;
    }
}
