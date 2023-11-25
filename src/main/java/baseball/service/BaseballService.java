package baseball.service;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

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

    public int countBall(List<Integer> userNumber, List<Integer> computerNumber, boolean[] visitNumber) {
        Set<Integer> uniqueUserNumber = new HashSet<>();
        Set<Integer> uniqueComputerNumber = new HashSet<>();
        for(int i=0; i<length; i++) {
            if (!visitNumber[i]) {
                uniqueUserNumber.add(userNumber.get(i));
                uniqueComputerNumber.add(computerNumber.get(i));
            }
        }
        uniqueUserNumber.retainAll(uniqueComputerNumber);
        return uniqueUserNumber.size();
    }



}
