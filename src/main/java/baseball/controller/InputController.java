package baseball.controller;

import baseball.service.InputService;

import java.util.List;

public class InputController {
    private InputService inputService = new InputService();


    public List<Integer> inputController() {
        while (true) {
            try {
                String inputNum = inputService.inputNumber();
                return checkRightInputController(inputNum);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }


    public List<Integer> checkRightInputController(String inputNum) {
        List<Integer> userNum = inputService.makeNumService(inputNum);
        inputService.checkRangeService(userNum);
        inputService.checkLengthService(userNum);
        inputService.checkDuplicateNumber(userNum);
        return userNum;
    }
}
