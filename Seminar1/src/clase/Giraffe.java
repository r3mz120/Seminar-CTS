package clase;

public class Giraffe extends Animal {

    private int height;

    public Giraffe(String name) {
        super(name);
        this.height = 400;
    }

    public Giraffe(String name, int height) {
        super(name);
        this.height = height;
    }
}
