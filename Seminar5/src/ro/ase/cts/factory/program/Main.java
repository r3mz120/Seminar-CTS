package ro.ase.cts.factory.program;

import ro.ase.cts.factory.clase.*;

public class Main {

    public static void printeazaJucator(JucatorFactory fabrica, String numeJucator) {
        Jucator jucator1 = fabrica.creareJucator(numeJucator);
        System.out.println(jucator1.toString());
    }

    public static void main(String[] args) {
        printeazaJucator(new MijlocasFactory(),"Ilie");
        printeazaJucator(new FundasFactory(), "Gigel");
        printeazaJucator(new AtacantFactory(), "Ionel");

    }
}
