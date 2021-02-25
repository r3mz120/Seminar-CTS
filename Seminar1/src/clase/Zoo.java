package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private Zookeeper zookeeper;
    private List<Animal> animals;


    public Zoo(Zookeeper zookeeper, List<Animal> animals) {
        this.zookeeper = zookeeper;
        this.animals = animals;
    }

    public Zoo() {
        this.zookeeper = new Zookeeper("Ionel");
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }


    public void feedAnimals() {
        for (Animal a : this.animals) {
            zookeeper.feed(a);
        }
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public Zookeeper getZookeeper() {
        return zookeeper;
    }

    public void setZookeeper(Zookeeper zookeeper) {
        this.zookeeper = zookeeper;
    }
}
