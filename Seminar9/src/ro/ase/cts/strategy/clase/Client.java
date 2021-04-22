package ro.ase.cts.strategy.clase;

public class Client {

    private String nume;
    private ModalitatePlata modalitatePlata;

    public Client(String nume, ModalitatePlata modalitatePlata) {
        this.nume = nume;
        this.modalitatePlata = modalitatePlata;
    }

    public void setModalitatePlata(ModalitatePlata modalitatePlata) {
        this.modalitatePlata = modalitatePlata;
    }

    public void platesteNota(float suma) {
        System.out.println(nume + " are de platit nota in valoare de " + suma);
        modalitatePlata.achita(suma);
    }
}
