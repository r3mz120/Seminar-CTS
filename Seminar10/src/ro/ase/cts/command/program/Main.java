package ro.ase.cts.command.program;

import ro.ase.cts.command.clase.*;

public class Main {
    public static void main(String[] args) {
        ContBancar contBancar = new ContBancar("Gigel");
        ManagerComenzi managerComenzi = new ManagerComenzi();
        managerComenzi.invoca(new ComandaConstituire(contBancar, 50));
        managerComenzi.invoca(new ComandaDepunere(contBancar, 30));
        managerComenzi.executaComanda();
        managerComenzi.invoca(new ComandaRetragere(contBancar, 30));
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
    }
}
