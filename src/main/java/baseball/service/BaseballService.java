package baseball.service;

import java.util.List;
import java.util.Objects;

public class BaseballService {
    private static int length = 3;
    public boolean[] checkStrike(List<Integer> userNumber, List<Integer> computerNumber) {
        boolean[] visitNumber = new boolean[length];
        for(int i=0; i<length; i++) {
            if (Objects.equals(userNumber.get(i), computerNumber.get(i))) {
                visitNumber[i] = true;
            }
        }
        return visitNumber;
    }

    public int countStrike(boolean[] visitNumber) {
        int count = 0;
        for (boolean visit : visitNumber) {
            if (visit) {
                count += 1;
            }
        }
        return count;
    }



}
