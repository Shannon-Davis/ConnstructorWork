package Reptiles;

public class Lizards {
    public String species;
    public  double inches;
    public String color;

    @Override
    public String toString() {
        return "Lizards{" +
                "species='" + species + '\'' +
                ", inches=" + inches +
                ", color='" + color + '\'' +
                '}';
    }

    public Lizards(String species, String color, double inches){
        this.species = species;
        this.color = color;
        this.inches = inches;
    }

    public String squeak(){
        return "ekkk";
    }
}
