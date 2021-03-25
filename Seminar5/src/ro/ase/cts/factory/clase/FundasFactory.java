package ro.ase.cts.factory.clase;

public class FundasFactory implements JucatorFactory {
    @Override
    public Jucator creareJucator(String numeJucator) {
        return new Fundas(numeJucator);
    }
}
