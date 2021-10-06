package baseball.model;

import nextstep.utils.Randoms;

public class GameModel {

    // 랜덤숫자 생성
    public String initNumber() {
        return Integer.toString(Randoms.pickNumberInRange(1, 9) * 100 + Randoms.pickNumberInRange(1, 9) * 10
                + Randoms.pickNumberInRange(1, 9));
    }
}
