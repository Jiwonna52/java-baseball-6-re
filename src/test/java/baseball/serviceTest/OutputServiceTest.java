package baseball.serviceTest;

import baseball.service.OutputService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OutputServiceTest {

    private OutputService outputService = new OutputService();

    @DisplayName("낫싱 확인 테스트")
    @Test
    void checkNothingTest() {
        int strikeCount1 = 0;
        int ballCount1 = 0;

        int strikeCount2 = 1;
        int ballCount2 = 0;

        int strikeCount3 = 0;
        int ballCount3 = 1;

        boolean result1 = outputService.checkNothing(strikeCount1, ballCount1);
        boolean result2 = outputService.checkNothing(strikeCount2, ballCount2);
        boolean result3 = outputService.checkNothing(strikeCount3, ballCount3);

        assertThat(result1).isEqualTo(true);
        assertThat(result2).isEqualTo(false);
        assertThat(result3).isEqualTo(false);
    }

    @DisplayName("3개 스트라이크 확인 테스트")
    @Test
    void checkThreeStrikeTest() {
        int count1 = 3;
        int count2 = 1;

        boolean result1 = outputService.checkThreeStrike(count1);
        boolean result2 = outputService.checkThreeStrike(count2);

        assertThat(result1).isEqualTo(true);
        assertThat(result2).isEqualTo(false);
    }
}
