package pachet;

import clase.Giraffe;
import clase.Zoo;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        Giraffe g1 = new Giraffe("G1");
        Giraffe g2 = new Giraffe("G2", 500);

        zoo.addAnimal(g1);
        zoo.addAnimal(g2);

        zoo.feedAnimals();
    }
}
