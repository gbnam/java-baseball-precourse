package baseball.model;

import nextstep.utils.Randoms;

public class GameModel {

    NumberValidator numberValidator;

    public GameModel() {
        numberValidator = new NumberValidator();
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
