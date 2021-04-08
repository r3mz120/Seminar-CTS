package ro.ase.cts.adapter.clase;

public class AdapterBiletObiect implements BiletOnline {
    private Bilet bilet;


    public AdapterBiletObiect(Bilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void vindeBilet() {
        this.bilet.vinde();
    }

    @Override
    public void rezervaBilet() {
        this.bilet.rezerva();
    }
}
