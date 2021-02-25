package clase;

public class Zebra extends Animal {

    private int noLines;

    public Zebra(String name) {
        super(name);
        this.noLines = 0;
    }

    public Zebra(String name, int noLines) {
        super(name);
        this.noLines = noLines;
    }
}

