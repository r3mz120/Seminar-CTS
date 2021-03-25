package ro.ase.cts.factory.clase;

public class PortarFactory implements JucatorFactory {


    @Override
    public Jucator creareJucator(String numeJucator) {
        return new Portar(numeJucator);
    }
}
