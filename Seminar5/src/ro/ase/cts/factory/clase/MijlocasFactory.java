package ro.ase.cts.factory.clase;

public class MijlocasFactory implements JucatorFactory {
    @Override
    public Jucator creareJucator(String numeJucator) {
        return new Mijlocas(numeJucator);
    }
}
