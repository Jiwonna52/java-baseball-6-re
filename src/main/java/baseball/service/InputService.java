package baseball.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputService {
    private BufferedReader br;
    public String inputNumber() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }
}
