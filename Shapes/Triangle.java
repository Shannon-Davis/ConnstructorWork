package Shapes;

public class Triangle {
    public int height;
    public int base;
    public int side1;
    public int side2;

public Triangle(int base,int side1,int side2,int height){
    this.height = height;
    this.base = base;
    this.side1 = side1;
    this.side2 = side2;

} public int perimeter(){
    return this.base + this.side1 + this.side2;
    }public int area(){
    return this.height * this.base /2;
    }

}
