package baseball.exception;

public class InputException {

    private int min = 1;
    private int max = 9;

    public void numRangeException(int num) {
        if (num < min || num > max) {
            throw new IllegalArgumentException();
        }
    }

}
