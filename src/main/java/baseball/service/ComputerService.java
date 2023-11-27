package baseball.service;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class ComputerService {

    private int numberLength = 3;

    private int takeRandNumber() {
        return Randoms.pickNumberInRange(1, 9);
    }

    public List<Integer> haveThreeRandNumber() {
        List<Integer> computerNumber = new ArrayList<>();
        while (computerNumber.size() < numberLength) {
            computerNumber.add(takeRandNumber());
        }
        return computerNumber;
    }
}
