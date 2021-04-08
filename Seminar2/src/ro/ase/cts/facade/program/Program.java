package ro.ase.cts.facade.program;

import ro.ase.cts.facade.clase.Angajat;
import ro.ase.cts.facade.clase.Aplicant;
import ro.ase.cts.facade.clase.Proiect;
import ro.ase.cts.facade.clase.UniversalReader;
import ro.ase.cts.facade.clase.readers.AngajatReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        System.out.println(Angajat.getFinantare());
        List<Aplicant> listaAplicanti;
        try {
            listaAplicanti = UniversalReader.readAplicant(new AngajatReader("Seminar2/angajati.txt"));
            for (Aplicant aplicant : listaAplicanti) {
                System.out.println(aplicant.getSumaFinantata());
                System.out.println(aplicant.toString());
                aplicant.afisareStatutProiect(new Proiect(80));
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
