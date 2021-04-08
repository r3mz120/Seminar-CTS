package ro.ase.cts.facade.clase.readers;

import ro.ase.cts.facade.clase.Angajat;
import ro.ase.cts.facade.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatReader extends Reader {

    public AngajatReader(String fileName) {
        super(fileName);
    }

    public List<Aplicant> readAplicants() throws FileNotFoundException {
        Scanner input = new Scanner(new File(super.fileName));
        input.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<>();

        while (input.hasNext()) {
            Angajat a = new Angajat();
            super.readAplicant(a, input);
            a.setSalariu(input.nextInt());
            a.setOcupatie(input.next());
            angajati.add(a);
        }
        input.close();
        return angajati;
    }

}
