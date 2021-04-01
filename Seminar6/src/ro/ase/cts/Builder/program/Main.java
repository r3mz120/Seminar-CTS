package ro.ase.cts.Builder.program;

import ro.ase.cts.Builder.clase.Rezervare;
import ro.ase.cts.Builder.clase.RezervareBuilder;

public class Main {

    public static void main(String[] args) {
        RezervareBuilder rezervareBuilder1 = new RezervareBuilder();
        Rezervare rezervare1 = rezervareBuilder1.setAreBauturaInclusa(true).build();
        Rezervare rezervare2 = new RezervareBuilder().setAreMuzicaAmbientala(true).setGenMuzica("rock").build();
        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());

    }
}
