package pachet;

import clase.Giraffe;
import clase.Zebra;
import clase.Zoo;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        Giraffe g1 = new Giraffe("G1");
        Giraffe g2 = new Giraffe("G2", 500);

        Zebra z1 = new Zebra("Z1");
        Zebra z2 = new Zebra("Z2",20);


        zoo.addAnimal(g1);
        zoo.addAnimal(g2);

        zoo.addAnimal(z1);
        zoo.addAnimal(z2);

        zoo.feedAnimals();
    }
}
