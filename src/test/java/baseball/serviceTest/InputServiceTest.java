package baseball.serviceTest;

import baseball.service.InputService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class InputServiceTest {

    private InputService inputService = new InputService();
    @Test
    @DisplayName("숫자 범위 테스트")
    void checkRangeServiceTest() {
        List<Integer> rightUserNum = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> wrongUserNum = new ArrayList<>(List.of(0, 1, 2));

        inputService.checkRangeService(rightUserNum);
        Assertions.assertThatThrownBy(() -> inputService.checkRangeService(wrongUserNum)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("숫자 길이 테스트")
    void checkLengthServiceTest() {
        List<Integer> rightUserNum = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> wrongUserNum = new ArrayList<>(List.of(1, 1, 1, 1));

        inputService.checkLengthService(rightUserNum);
        Assertions.assertThatThrownBy(() -> inputService.checkLengthService(wrongUserNum)).isInstanceOf(IllegalArgumentException.class);
    }
}
