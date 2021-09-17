package Reptiles;

public class Snakes {
    public String type;
    public int  weight;
    public float length;

    @Override
    public String toString() {
        return "Snakes{" +
                "type='" + type + '\'' +
                ", weight=" + weight +
                ", length=" + length +
                '}';
    }

    public Snakes(String type, int weight, float length){
        this.type = type;
        this.weight = weight;
        this.length = length;
    }
    public String Hiss(){
        return "ssssss";
    }
}
