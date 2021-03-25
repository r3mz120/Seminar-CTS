package ro.ase.cts.simpleFactory.program;

import ro.ase.cts.simpleFactory.clase.*;

public class Main {
    public static void main(String[] args) {
        Factory f = new Factory();
        Jucator jucator1 =  f.createJucator(TipJucator.Fundas,"Ionel");
        Jucator jucator2 =  f.createJucator(TipJucator.Portar,"Gigel");


        System.out.println(jucator1.toString());
        System.out.println(jucator2.toString());
     }
}
