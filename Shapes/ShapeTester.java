package Shapes;

public class ShapeTester {
    public static void main(String[] args) {
        Triangle tri1 = new Triangle(20,30,50,10);
        System.out.println("Triangle area " + tri1.area()  + " Perimeter " + tri1.perimeter());

        Square squ1 =new Square(22);
        System.out.println("Square area " + squ1.calcArea() + " Perimeter " + squ1.calcper());

    }
}
