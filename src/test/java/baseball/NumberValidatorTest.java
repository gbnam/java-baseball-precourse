package baseball;

import nextstep.test.NSTest;
import nextstep.utils.Randoms;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mockStatic;

public class NumberValidatorTest extends NSTest {
    @BeforeEach
    void beforeEach() {
        super.setUp();
    }

    @Test
    void 유저입력값_테스트() {
        try (final MockedStatic<Randoms> mockRandoms = mockStatic(Randoms.class)) {
            mockRandoms
                    .when(() -> Randoms.pickNumberInRange(anyInt(), anyInt()))
                    .thenReturn(1, 3, 9);
            running("13","1ab","477");
            verify("[ERROR] 입력 길이가 잘못되었습니다.", "[ERROR] 숫자가 아닌 문자가 존재합니다.", "[ERROR] 중복인 숫자가 존재합니다.");
        }
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
