package baseball.dto;

public class GameResultDTO {

    // 스트라이크 횟수
    int strikeCount = 0;

    // 볼 횟수
    int ballCount = 0;

    // 낫싱여부
    boolean nothing = false;

    public int getStrikeCount() {
        return strikeCount;
    }

    public void setStrikeCount(int strikeCount) {
        this.strikeCount = strikeCount;
    }

    public int getBallCount() {
        return ballCount;
    }

    public void setBallCount(int ballCount) {
        this.ballCount = ballCount;
    }

    public boolean isNothing() {
        return nothing;
    }

    public void setNothing(boolean nothing) {
        this.nothing = nothing;
    }
}
