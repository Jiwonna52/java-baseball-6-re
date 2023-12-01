package baseball.controller;

import baseball.model.Result;
import baseball.service.BaseballService;

import java.util.List;

public class BaseballController {

    private BaseballService baseballService = new BaseballService();

    public Result baseballController(List<Integer> userNum, List<Integer> computerNum) {
        boolean[] checkedStrike = baseballService.checkStrike(userNum, computerNum);
        int strikeCount = baseballService.countStrike(checkedStrike);
        int ballCount = baseballService.countBall(userNum, computerNum, checkedStrike);

        return new Result(strikeCount, ballCount);
    }
}
