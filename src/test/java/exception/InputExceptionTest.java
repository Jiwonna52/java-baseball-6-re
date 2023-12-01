package exception;

import baseball.exception.InputException;
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

        Assertions.assertThatThrownBy(() -> inputException.numRangeException(wrongNum1)).isInstanceOf(IllegalArgumentException.class);
        Assertions.assertThatThrownBy(() -> inputException.numRangeException(wrongNum2)).isInstanceOf(IllegalArgumentException.class);
    }
}
