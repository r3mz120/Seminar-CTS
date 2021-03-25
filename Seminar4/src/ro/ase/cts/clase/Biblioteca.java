package ro.ase.cts.clase;

public class Biblioteca {
    private int nrCarti;
    private String nume;
    private boolean esteDeschisa;


    private static Biblioteca biblioteca = null;

    public Biblioteca(int nrCarti, String nume, boolean esteDeschisa) {
        this.nrCarti = nrCarti;
        this.nume = nume;
        this.esteDeschisa = esteDeschisa;
    }

    public void setNrCarti(int nrCarti) {
        this.nrCarti = nrCarti;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setEsteDeschisa(boolean esteDeschisa) {
        this.esteDeschisa = esteDeschisa;
    }

    public static void setBiblioteca(Biblioteca biblioteca) {
        Biblioteca.biblioteca = biblioteca;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nrCarti=" + nrCarti +
                ", nume='" + nume + '\'' +
                ", esteDeschisa=" + esteDeschisa +
                '}';
    }

    public static synchronized Biblioteca getInstance(int nrCarti, String numeBiblioteca, boolean esteDeschisa) {
        if (biblioteca == null) {
            biblioteca = new Biblioteca(nrCarti, numeBiblioteca, esteDeschisa);
        }
        return biblioteca;
    }
}
