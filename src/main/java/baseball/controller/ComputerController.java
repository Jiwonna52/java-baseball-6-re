package baseball.controller;

import baseball.service.ComputerService;

import java.util.List;

public class ComputerController {
    private ComputerService computerService = new ComputerService();
    public List<Integer> computerController() {
        return computerService.haveThreeRandNumber();
    }
}
