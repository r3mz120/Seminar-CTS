package ro.ase.cts.clase;


import ro.ase.cts.clase.readers.Reader;

import java.io.FileNotFoundException;
import java.util.List;

public class UniversalReader {

    public static List<Aplicant> readAplicant(Reader reader) throws FileNotFoundException {
        return reader.readAplicants();
    }

}
