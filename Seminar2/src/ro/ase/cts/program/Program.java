package ro.ase.cts.program;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.readers.AngajatReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Aplicant> listaAplicanti;
        try {
            listaAplicanti = AngajatReader.readAngajati("Seminar2/angajati.txt");
            for (Aplicant aplicant : listaAplicanti)
                System.out.println(aplicant.toString());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}