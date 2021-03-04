package ro.ase.cts.clase.readers;

import ro.ase.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

public abstract class Reader {

    protected String fileName;

    public Reader(String fileName) {
        this.fileName = fileName;
    }

    public abstract List<Aplicant> readAplicants() throws FileNotFoundException, NumberFormatException;
}
