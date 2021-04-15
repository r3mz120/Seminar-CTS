package ro.ase.cts.proxy.program;

import ro.ase.cts.proxy.clase.OperatorRezervare;
import ro.ase.cts.proxy.clase.Proxy;

public class Main {
    public static void main(String[] args) {
        OperatorRezervare operatorRezervare1 = new OperatorRezervare("Local");
        operatorRezervare1.rezerva(3);

        Proxy proxy = new Proxy(operatorRezervare1,4);
        proxy.rezerva(3);
        proxy.rezerva(10);
    }
}
