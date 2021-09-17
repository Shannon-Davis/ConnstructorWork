package Math;

public class Calculator {
    public int num1;
    public int num2;

    public Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public int multipyNum(){
        return this.num1 * this.num2;
    }
    public int divideNum(){
        return this.num1 / this.num2;
    }
    public int addNum(){
        return this.num1 + this.num2;
    }public int subtractNum(){
        return this.num1 - this.num2;
    }
}
