package baseball.service;

import java.util.List;
import java.util.Objects;

public class BaseballService {
    private static int length = 3;
    public int checkStrike(List<Integer> userNumber, List<Integer> computerNumber) {
        int count = 0;
        for(int i=0; i<length; i++) {
            if (Objects.equals(userNumber.get(i), computerNumber.get(i))) {
                count += 1;
            }
        }
        return count;
    }

}
