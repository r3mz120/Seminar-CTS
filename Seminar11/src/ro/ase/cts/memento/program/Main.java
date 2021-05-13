package ro.ase.cts.memento.program;

import ro.ase.cts.memento.clase.ManagerMemento;
import ro.ase.cts.memento.clase.MeciJucat;
import ro.ase.cts.memento.clase.Memento;

public class Main {
    public static void main(String[] args) {
        MeciJucat meciJucat = new MeciJucat(50000, "Steaua", "Dinamo", 50000, 10000, 1000);

        ManagerMemento managerMemento = new ManagerMemento();
        managerMemento.adaugaMemento(meciJucat.salvareInformatii());

        meciJucat.setNrSpectatori(400);
        meciJucat.setNumeEchipaGazda("Chiajna");
        meciJucat.setNumeEchipaOaspeti("Chindia");
        managerMemento.adaugaMemento(meciJucat.salvareInformatii());

        System.out.println(meciJucat);
        meciJucat.revenire(managerMemento.getMemento(0));
        System.out.println(meciJucat);
    }
}
