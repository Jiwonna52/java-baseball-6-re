package baseball.service;

public class OutputService {

    private int strikeCount = 3;
    public boolean checkThreeStrike(int count) {
        if (count == strikeCount) {
            return true;
        }
        return false;
    }

    public boolean checkNothing(int strikeCount, int ballCount) {
        if (strikeCount == 0 && ballCount == 0) {
            return true;
        }
        return false;
    }

}
