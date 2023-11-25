package baseball.serviceTest;

import baseball.service.BaseballService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class BaseballServiceTest {

    private BaseballService baseballService = new BaseballService();

    @DisplayName("스트라이크 확인 테스트")
    @Test
    void checkStrikeTest() {
        List<Integer> userNumber1 = new LinkedList<>(List.of(1, 2, 3));
        List<Integer> computerNumber1 = new LinkedList<>(List.of(1, 2, 3));
        Assertions.assertThat(baseballService.checkStrike(userNumber1, computerNumber1))
                .isEqualTo(3);

        List<Integer> userNumber2 = new LinkedList<>(List.of(1, 2, 4));
        List<Integer> computerNumber2 = new LinkedList<>(List.of(1, 2, 3));
        Assertions.assertThat(baseballService.checkStrike(userNumber2, computerNumber2))
                .isEqualTo(2);

        List<Integer> userNumber3 = new LinkedList<>(List.of(1, 4, 5));
        List<Integer> computerNumber3 = new LinkedList<>(List.of(1, 2, 3));
        Assertions.assertThat(baseballService.checkStrike(userNumber3, computerNumber3))
                .isEqualTo(1);

        List<Integer> userNumber4 = new LinkedList<>(List.of(4, 5, 6));
        List<Integer> computerNumber4 = new LinkedList<>(List.of(1, 2, 3));
        Assertions.assertThat(baseballService.checkStrike(userNumber4, computerNumber4))
                .isEqualTo(0);
    }

}
