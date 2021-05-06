package ro.ase.cts.chain.program;

import ro.ase.cts.chain.clase.*;

public class Main {
    public static void main(String[] args) {
        Cont contCurent = new ContCurent("Ion", 100);
        Cont contEconomii = new ContEconomii("Ion", 200);
        Cont contDeCredit = new ContDeCredit("Ion", 500);
        Cont contIndisponibil = new ContIndisponibil("Ion");

        contCurent.setSuccesor(contEconomii);
        contEconomii.setSuccesor(contDeCredit);
        contDeCredit.setSuccesor(contIndisponibil);

        contCurent.realizeazaPlata(50);
        contCurent.realizeazaPlata(100);
        contCurent.realizeazaPlata(300);
        contCurent.realizeazaPlata(600);
    }
}
