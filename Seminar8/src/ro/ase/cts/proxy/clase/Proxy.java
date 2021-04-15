package ro.ase.cts.proxy.clase;

public class Proxy implements IOperatorRezervare {

    private OperatorRezervare operatorRezervare;
    private int nrMinimPersoane;

    public Proxy(OperatorRezervare operatorRezervare, int nrMinimPersoane) {
        this.operatorRezervare = operatorRezervare;
        this.nrMinimPersoane = nrMinimPersoane;
    }

    @Override
    public void rezerva(int nrPersoane) {
        if (nrPersoane >= this.nrMinimPersoane) {
            operatorRezervare.rezerva(nrPersoane);
        } else {
            System.out.println("Nu se poate realiza rezervarea!");
        }

    }
}
