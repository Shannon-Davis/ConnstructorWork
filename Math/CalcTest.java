package Math;

public class CalcTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(64,28);
        System.out.println(calculator.multipyNum());
        System.out.println(calculator.addNum());
        System.out.println(calculator.divideNum());
        System.out.println(calculator.subtractNum());
    }
}
