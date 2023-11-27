package baseball.view;

public class ExceptionView {
    public void outOFRangeException() {
        System.out.println("각 숫자는 1에서 9까지 입력해주세요");
    }

    public void notRightLength() {
        System.out.println("숫자는 3개 입력해주세요");
    }

    public void notDigit() {
        System.out.println("숫자로 입력해주세요.");
    }
    
}
