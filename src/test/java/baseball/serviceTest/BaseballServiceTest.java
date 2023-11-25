package baseball.serviceTest;

import baseball.service.BaseballService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BaseballServiceTest {

    private BaseballService baseballService = new BaseballService();


    @DisplayName("스트라이크 확인 테스트")
    @Test
    void checkStrikeTest() {
        List<Integer> userNumber1 = new LinkedList<>(List.of(1, 2, 3));
        List<Integer> computerNumber1 = new LinkedList<>(List.of(1, 2, 3));
        boolean[] visitNumber1 = baseballService.checkStrike(userNumber1, computerNumber1);
        int count1 = baseballService.countStrike(visitNumber1);
        Assertions.assertThat(count1).isEqualTo(3);


        List<Integer> userNumber2 = new LinkedList<>(List.of(1, 2, 4));
        List<Integer> computerNumber2 = new LinkedList<>(List.of(1, 2, 3));
        boolean[] visitNumber2 = baseballService.checkStrike(userNumber2, computerNumber2);
        int count2 = baseballService.countStrike(visitNumber2);
        Assertions.assertThat(count2).isEqualTo(2);

        List<Integer> userNumber3 = new LinkedList<>(List.of(1, 4, 5));
        List<Integer> computerNumber3 = new LinkedList<>(List.of(1, 2, 3));
        boolean[] visitNumber3 = baseballService.checkStrike(userNumber3, computerNumber3);
        int count3 = baseballService.countStrike(visitNumber3);
        Assertions.assertThat(count3).isEqualTo(1);


        List<Integer> userNumber4 = new LinkedList<>(List.of(4, 5, 6));
        List<Integer> computerNumber4 = new LinkedList<>(List.of(1, 2, 3));
        boolean[] visitNumber4 = baseballService.checkStrike(userNumber4, computerNumber4);
        int count4 = baseballService.countStrike(visitNumber4);
        Assertions.assertThat(count4).isEqualTo(0);
    }

    @DisplayName("볼 확인 테스트")
    @Test
    void countBallTest() {
        List<Integer> userNumber1 = new LinkedList<>(List.of(1, 2, 3));
        List<Integer> computerNumber1 = new LinkedList<>(List.of(1, 2, 3));
        boolean[] visitNumber1 = {true, true, true};
        int count1 = baseballService.countBall(userNumber1, computerNumber1, visitNumber1);
        Assertions.assertThat(count1).isEqualTo(0);

        List<Integer> userNumber3 = new LinkedList<>(List.of(1, 4, 2));
        List<Integer> computerNumber3 = new LinkedList<>(List.of(1, 2, 3));
        boolean[] visitNumber3 = {true, false, false};
        int count3 =  baseballService.countBall(userNumber3, computerNumber3, visitNumber3);
        Assertions.assertThat(count3).isEqualTo(1);

    }

}
