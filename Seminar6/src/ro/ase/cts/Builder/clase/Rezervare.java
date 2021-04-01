package ro.ase.cts.Builder.clase;

public class Rezervare {
    private int codRezervare;
    private boolean areMancareInclusa;
    private boolean areBauturaInclusa;
    private boolean areScaunErgonomic;
    private boolean areMuzicaAmbientala;
    private String genMuzica;

    public Rezervare(int codRezervare, boolean areMancareInclusa, boolean areBauturaInclusa, boolean areScaunErgonomic, boolean areMuzicaAmbientala, String genMuzica) {
        this.codRezervare = codRezervare;
        this.areMancareInclusa = areMancareInclusa;
        this.areBauturaInclusa = areBauturaInclusa;
        this.areScaunErgonomic = areScaunErgonomic;
        this.areMuzicaAmbientala = areMuzicaAmbientala;
        this.genMuzica = genMuzica;
    }


    public void setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
    }

    public void setAreMancareInclusa(boolean areMancareInclusa) {
        this.areMancareInclusa = areMancareInclusa;
    }

    public void setAreBauturaInclusa(boolean areBauturaInclusa) {
        this.areBauturaInclusa = areBauturaInclusa;
    }

    public void setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
    }

    public void setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
        this.areMuzicaAmbientala = areMuzicaAmbientala;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "codRezervare=" + codRezervare +
                ", areMancareInclusa=" + areMancareInclusa +
                ", areBauturaInclusa=" + areBauturaInclusa +
                ", areScaunErgonomic=" + areScaunErgonomic +
                ", areMuzicaAmbientala=" + areMuzicaAmbientala +
                ", genMuzica='" + genMuzica + '\'' +
                '}';
    }
}
