package Reptiles;

public class zoo {
    public static void main(String[] args) {
        Snakes snake1 = new Snakes("Boa", 209, 20 );
        System.out.println(snake1);
        System.out.println(snake1.Hiss());

        Lizards lizard1 = new Lizards("Gecko", "Blue", 6.5);
        System.out.println(lizard1);
        System.out.println(lizard1.squeak());
    }
}



