package baseball.exceptionTest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InputExceptionTest {

    private InputException inputException = new InputException();

    @Test
    @DisplayName("범위 안에 숫자가 들어오지 않을 경우 예외")
    void numRangeExceptionTest() {
        int wrongNum1 = 0;
        int wrongNum2 = 10;

        Assertions.assertThatThrownBy(() -> inputException.numRangeException(wrongNum1))
                .isInstanceOf(IllegalArgumentException.class);
        Assertions.assertThatThrownBy(() -> inputException.numRangeException(wrongNum2))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("고유 숫자의 길이가 3이 아니면 예최 처리")
    void numLengthExceptionTest() {
        int wrongLength1 = 2;
        int wrongLength2 = 4;

        Assertions.assertThatThrownBy(() -> inputException.numUniqueLengthException(wrongLength1))
                .isInstanceOf(IllegalArgumentException.class);
        Assertions.assertThatThrownBy(() -> inputException.numUniqueLengthException(wrongLength2))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("숫자가 아니면 예외")
    void notNumExceptionTest() {
        char notNum1 = 'a';
        char notNum2 = '(';

        Assertions.assertThatThrownBy(() -> inputException.notNumException(notNum1))
                .isInstanceOf(IllegalArgumentException.class);
        Assertions.assertThatThrownBy(() -> inputException.notNumException(notNum2))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
