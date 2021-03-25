package ro.ase.cts.simpleFactory.clase;

public class Factory {
    public Jucator createJucator(TipJucator tipJucator, String numeJucator) {
        switch (tipJucator) {
            case Portar:
                return new Portar(numeJucator);
            case Fundas:
                return new Fundas(numeJucator);
            case Atacant:
                return new Atacant(numeJucator);
            default:
                throw new IllegalArgumentException("Tipul primit nu exista");
        }
    }
}
