package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.Bilet;
import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorMesajLMA;
import ro.ase.cts.decorator.clase.DecoratorMesajSustinere;

public class Main {
    public static void main(String[] args) {
        Bilet bilet = new Bilet("FCSB", "Dinamo", "Gigel");
        bilet.rezervaBilet();


        DecoratorMesajSustinere decoratorMesajSustinere = new DecoratorMesajSustinere(bilet);

        decoratorMesajSustinere.rezervaBilet();

        DecoratorMesajLMA decoratorMesajLMA = new DecoratorMesajLMA(bilet);
        System.out.println();
        decoratorMesajLMA.rezervaBilet();
        System.out.println();

        DecoratorAbstract decoratorAbstract = new DecoratorMesajLMA(decoratorMesajSustinere);
        decoratorAbstract.rezervaBilet();


    }
}
