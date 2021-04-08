package ro.ase.cts.facade.clase;

public class ManagerSpital {
    private String nume;
    private int varsta;
    private int marca;

    private static ManagerSpital manager = new ManagerSpital("m1",34,1000);



    public ManagerSpital(String nume, int varsta, int marca) {
        this.nume = nume;
        this.varsta = varsta;
        this.marca = marca;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "ManagerSpital{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", marca=" + marca +
                '}';
    }

    public static ManagerSpital getManager() {
        return manager;
    }
}
