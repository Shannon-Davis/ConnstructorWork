package Shapes;

public class Square {
    public int side;

    public Square(int side){
        this.side = side;
    }public int calcArea(){
        return this.side * this.side;
    }public int calcper(){
        return this.side * 4;
    }
}
