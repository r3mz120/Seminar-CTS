package ro.ase.cts.observer.program;

import ro.ase.cts.observer.clase.Client;
import ro.ase.cts.observer.clase.ManagerSala;
import ro.ase.cts.observer.clase.Observer;

public class Main {
    public static void main(String[] args) {

        ManagerSala managerSala = new ManagerSala();

        Observer c1 = new Client("Ionel");
        Observer c2 = new Client("Gigel");
        managerSala.adaugaObserver(c1);
        managerSala.adaugaObserver(c2);

        managerSala.anuntaMeciFotbal();
        managerSala.stergereObserver(c2);
        System.out.println();
        managerSala.anuntaMeciVolei();

    }
}
