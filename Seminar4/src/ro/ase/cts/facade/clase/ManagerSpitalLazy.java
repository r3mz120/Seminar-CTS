package ro.ase.cts.facade.clase;

public class ManagerSpitalLazy {
    private String nume;
    private int varsta;
    private int marca;

    private static ManagerSpitalLazy manager = null;

    public ManagerSpitalLazy(String nume, int varsta, int marca) {
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
        return "ManagerSpitalLazy{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", marca=" + marca +
                '}';
    }

    public static synchronized ManagerSpitalLazy getManagerLazy(String nume, int varsta, int marca) {
        if (manager == null) {
            manager = new ManagerSpitalLazy(nume, varsta, marca);
        }

        return manager;
    }
}
