package ro.ase.cts.facade.clase.readers;

import ro.ase.cts.facade.clase.Aplicant;
import ro.ase.cts.facade.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends Reader {

    public ElevReader(String fileName) {
        super(fileName);
    }

    public List<Aplicant> readAplicants() throws FileNotFoundException {
        Scanner input = new Scanner(new File(super.fileName));
        input.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<>();

        while (input.hasNext()) {
            Elev e = new Elev();
            super.readAplicant(e, input);
            e.setClasa(input.nextInt());
            e.setTutore(input.next());
            elevi.add(e);
        }

        input.close();
        return elevi;
    }
}
