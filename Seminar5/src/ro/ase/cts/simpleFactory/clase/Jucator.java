package ro.ase.cts.simpleFactory.clase;

public abstract class Jucator {
    private String nume;

    public Jucator(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public String toString() {
        return
                "nume='" + nume ;

    }
}
