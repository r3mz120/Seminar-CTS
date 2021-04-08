package ro.ase.cts.facade.program;

import ro.ase.cts.facade.clase.ManagerSpital;
import ro.ase.cts.facade.clase.ManagerSpitalLazy;

public class Main {

    public static void main(String[] args) {
        ManagerSpital m1 = ManagerSpital.getManager();
        ManagerSpital m2 = ManagerSpital.getManager();

        System.out.println(m1.toString());
        System.out.println(m2.toString());

        ManagerSpitalLazy ml1 =  ManagerSpitalLazy.getManagerLazy("Gigel",23,1000);
        ManagerSpitalLazy ml2 =  ManagerSpitalLazy.getManagerLazy("Ionel",23,1000);

        ml1.setVarsta(21);
        ml2.setNume("Raducu");


        System.out.println(ml1.toString());
        System.out.println(ml2.toString());




    }

}
