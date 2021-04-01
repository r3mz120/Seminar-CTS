package ro.ase.cts.Builder.program;

import ro.ase.cts.Builder.clase.BuilderRezervareV2;
import ro.ase.cts.Builder.clase.Rezervare;
import ro.ase.cts.Builder.clase.RezervareBuilder;

public class Main {

    public static void main(String[] args) {
        RezervareBuilder rezervareBuilder1 = new RezervareBuilder();
        Rezervare rezervare1 = rezervareBuilder1.setAreBauturaInclusa(true).build();
        Rezervare rezervare2 = new RezervareBuilder().setAreMuzicaAmbientala(true).setGenMuzica("rock").build();
        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());


        BuilderRezervareV2 builderRezervareV2 = new BuilderRezervareV2();
        Rezervare rezervare3 = builderRezervareV2.setAreBauturaInclusa(true).build();
        Rezervare rezervare4 = builderRezervareV2.setAreBauturaInclusa(true).setGenMuzica("rock").build();

        System.out.println(rezervare3.toString());
        System.out.println(rezervare4.toString());
    }
}
