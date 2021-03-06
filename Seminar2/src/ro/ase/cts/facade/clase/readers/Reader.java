package ro.ase.cts.facade.clase.readers;

import ro.ase.cts.facade.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class Reader {

    protected String fileName;

    public Reader(String fileName) {
        this.fileName = fileName;
    }

    public abstract List<Aplicant> readAplicants() throws FileNotFoundException, NumberFormatException;

    public void readAplicant(Aplicant aplicant, Scanner input) {
        String nume = input.next();
        String prenume = (input.next());
        int varsta = Integer.valueOf(input.nextInt());
        int punctaj = Integer.valueOf(input.nextInt());
        int nr = Integer.valueOf(input.nextInt());
        String[] vect = new String[nr];
        for (int i = 0; i < nr; i++)
            vect[i] = input.next();

        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setDenumiriProiecte(nr, vect);

    }
}
