package baseball.exceptionTest;

public class InputException {

    private int min = 1;
    private int max = 9;
    private int targetLength = 3;

    public void numRangeException(int num) {
        if (num < min || num > max) {
            throw new IllegalArgumentException();
        }
    }

    public void numUniqueLengthException(int length) {
        if (targetLength != length) {
            throw new IllegalArgumentException();
        }
    }

    public void notNumException(char num) {
        if (!Character.isDigit(num)) {
            throw new IllegalArgumentException();
        }
    }


}
