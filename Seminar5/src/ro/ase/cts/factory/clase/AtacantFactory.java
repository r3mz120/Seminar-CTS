package ro.ase.cts.factory.clase;

public class AtacantFactory implements JucatorFactory {
    @Override
    public Jucator creareJucator(String numeJucator) {
        return new Atacant(numeJucator);
    }
}
