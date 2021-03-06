package ro.ase.cts.adapter.program;

import ro.ase.cts.adapter.clase.AdapterBilet;
import ro.ase.cts.adapter.clase.Bilet;
import ro.ase.cts.adapter.clase.BiletOnline;
import ro.ase.cts.adapter.clase.AdapterBiletObiect;

public class Main {

    public static void rezervaSiVindeBilet(BiletOnline biletOnline) {
        biletOnline.rezervaBilet();
        biletOnline.vindeBilet();
    }

    public static void rezervaSiVindeBiletCasa(Bilet bilet) {
        bilet.rezerva();
        bilet.vinde();
    }

    public static void main(String[] args) {

        Bilet bilet = new Bilet(30);
        rezervaSiVindeBiletCasa(bilet);

        BiletOnline biletOnline = new AdapterBilet(40);
        rezervaSiVindeBilet(biletOnline);


        AdapterBiletObiect adapterBiletObiect = new AdapterBiletObiect(bilet);
        rezervaSiVindeBilet(adapterBiletObiect);
    }
}
