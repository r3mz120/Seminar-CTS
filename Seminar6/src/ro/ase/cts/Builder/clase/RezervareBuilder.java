package ro.ase.cts.Builder.clase;

public class RezervareBuilder implements BuilderAbstract {

    private Rezervare rezervare;

    public RezervareBuilder() {
        this.rezervare = new Rezervare(0, false, false, false, false, "pop");
    }

    @Override
    public Rezervare build() {
        return this.rezervare;
    }


    public RezervareBuilder setCodRezervare(int codRezervare) {
        this.rezervare.setCodRezervare(codRezervare);
        return this;
    }

    public RezervareBuilder setAreMancareInclusa(boolean areMancareInclusa) {
        this.rezervare.setAreMancareInclusa(areMancareInclusa);
        return this;
    }

    public RezervareBuilder setAreBauturaInclusa(boolean areBauturaInclusa) {
        this.rezervare.setAreBauturaInclusa(areBauturaInclusa);
        return this;
    }

    public RezervareBuilder setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.rezervare.setAreScaunErgonomic(areScaunErgonomic);
        return this;
    }

    public RezervareBuilder setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
        this.rezervare.setAreMuzicaAmbientala(areMuzicaAmbientala);
        return this;
    }

    public RezervareBuilder setGenMuzica(String genMuzica) {
        this.rezervare.setGenMuzica(genMuzica);
        return this;
    }
}
