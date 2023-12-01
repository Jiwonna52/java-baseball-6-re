package baseball.view;

public class OutputView {

    public void printWStartGame() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public void printGetUserNumber() {
        System.out.print("숫자를 입력해주세요 : ");
    }
    public void printBallResult(int ballCount) {
        System.out.print(ballCount + "볼");
    }

    public void printStrikeResult(int strikeCount) {
        System.out.println(strikeCount + "스트라이크");
    }

    public void printNothingResult() {
        System.out.println("나싱");
    }

    public void printWin() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public void printGoOrStop() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}
