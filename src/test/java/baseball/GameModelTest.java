package baseball;

import baseball.model.GameModel;
import nextstep.test.NSTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class GameModelTest extends NSTest {

    GameModel gameModel;

    @BeforeEach
    void beforeEach() {
        super.setUp();
        gameModel = new GameModel();
    }

    @RepeatedTest(5)
    void 랜덤숫자생성_테스트() {
        GameModel gameModel = new GameModel();
        assertThat(gameModel.initNumber()).hasSize(3);
    }

    @AfterEach
    void tearDown() {
        outputStandard();
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
