package ro.ase.cts.memento.clase;

public class Memento {
    private int nrSpectatori;
    private String echipaGazda;
    private String echipaOaspeti;

    public Memento(int nrSpectatori, String echipaGazda, String echipaOaspeti) {
        this.nrSpectatori = nrSpectatori;
        this.echipaGazda = echipaGazda;
        this.echipaOaspeti = echipaOaspeti;
    }

    public int getNrSpectatori() {
        return nrSpectatori;
    }

    public void setNrSpectatori(int nrSpectatori) {
        this.nrSpectatori = nrSpectatori;
    }

    public String getEchipaGazda() {
        return echipaGazda;
    }

    public void setEchipaGazda(String echipaGazda) {
        this.echipaGazda = echipaGazda;
    }

    public String getEchipaOaspeti() {
        return echipaOaspeti;
    }

    public void setEchipaOaspeti(String echipaOaspeti) {
        this.echipaOaspeti = echipaOaspeti;
    }
}
