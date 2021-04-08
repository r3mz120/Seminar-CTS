package ro.ase.cts.facade.clase;

import ro.ase.cts.facade.clase.readers.Reader;
import java.io.FileNotFoundException;
import java.util.List;

public class UniversalReader {

    public static List<Aplicant> readAplicant(Reader reader) throws FileNotFoundException {
        return reader.readAplicants();
    }

}
