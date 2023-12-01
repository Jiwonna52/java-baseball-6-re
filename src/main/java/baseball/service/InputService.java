package baseball.service;

import baseball.exceptionTest.InputException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class InputService {
    private BufferedReader br;
    private InputException inputException = new InputException();
    public String inputNumber() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
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
}
