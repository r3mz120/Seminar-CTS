package ro.ase.cts.memento.clase;

public class MeciJucat {
    private int nrSpectatori;
    private String numeEchipaGazda;
    private String numeEchipaOaspeti;
    private int nrBileteVandute;
    private int nrSticleApaVandute;
    private int nrJandarmi;

    public MeciJucat(int nrSpectatori, String numeEchipaGazda, String numeEchipaOaspeti, int nrBileteVandute, int nrSticleApaVandute, int nrJandarmi) {
        this.nrSpectatori = nrSpectatori;
        this.numeEchipaGazda = numeEchipaGazda;
        this.numeEchipaOaspeti = numeEchipaOaspeti;
        this.nrBileteVandute = nrBileteVandute;
        this.nrSticleApaVandute = nrSticleApaVandute;
        this.nrJandarmi = nrJandarmi;
    }

    public int getNrSpectatori() {
        return nrSpectatori;
    }

    public void setNrSpectatori(int nrSpectatori) {
        this.nrSpectatori = nrSpectatori;
    }

    public String getNumeEchipaGazda() {
        return numeEchipaGazda;
    }

    public void setNumeEchipaGazda(String numeEchipaGazda) {
        this.numeEchipaGazda = numeEchipaGazda;
    }

    public String getNumeEchipaOaspeti() {
        return numeEchipaOaspeti;
    }

    public void setNumeEchipaOaspeti(String numeEchipaOaspeti) {
        this.numeEchipaOaspeti = numeEchipaOaspeti;
    }

    public int getNrBileteVandute() {
        return nrBileteVandute;
    }

    public void setNrBileteVandute(int nrBileteVandute) {
        this.nrBileteVandute = nrBileteVandute;
    }

    public int getNrSticleApaVandute() {
        return nrSticleApaVandute;
    }

    public void setNrSticleApaVandute(int nrSticleApaVandute) {
        this.nrSticleApaVandute = nrSticleApaVandute;
    }

    public int getNrJandarmi() {
        return nrJandarmi;
    }

    public void setNrJandarmi(int nrJandarmi) {
        this.nrJandarmi = nrJandarmi;
    }

    public Memento salvareInformatii() {
        Memento memento = new Memento(this.nrSpectatori, this.numeEchipaGazda, this.numeEchipaOaspeti);
        return memento;

    }

    public void revenire(Memento memento) {
        this.nrSpectatori = memento.getNrSpectatori();
        this.numeEchipaGazda = memento.getEchipaGazda();
        this.numeEchipaOaspeti = memento.getEchipaOaspeti();

    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MeciJucat{");
        sb.append("nrSpectatori=").append(nrSpectatori);
        sb.append(", numeEchipaGazda='").append(numeEchipaGazda).append('\'');
        sb.append(", numeEchipaOaspeti='").append(numeEchipaOaspeti).append('\'');
        sb.append(", nrBileteVandute=").append(nrBileteVandute);
        sb.append(", nrSticleApaVandute=").append(nrSticleApaVandute);
        sb.append(", nrJandarmi=").append(nrJandarmi);
        sb.append('}');
        return sb.toString();
    }
}
