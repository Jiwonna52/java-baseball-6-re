package baseball.service;

import baseball.exceptionTest.InputException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InputService {
    private BufferedReader br;
    private InputException inputException = new InputException();
    public String inputNumber() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }


    public List<Integer> makeNumService(String input) throws IllegalArgumentException{
        List<Integer> userNumber = new ArrayList<>();
        for (char c : input.toCharArray()) {
            inputException.notNumException(c);
            userNumber.add(c-'0');
        }
        return userNumber;
    }

    public void checkRangeService(List<Integer> userNum) throws IllegalArgumentException {
        for (int num : userNum) {
            inputException.numRangeException(num);
        }
    }

    public void checkLengthService(List<Integer> userNum) throws IllegalArgumentException {
        int length = userNum.size();
        inputException.numLengthException(length);
    }

    public void checkDuplicateNumber(List<Integer> userNum) throws IllegalArgumentException {
        Set<Integer> uniqueSet = new HashSet<>(userNum);
        int length = uniqueSet.size();
        inputException.numUniqueLengthException(length);
    }
}
