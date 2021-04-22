package ro.ase.cts.strategy.clase;

public class Card implements ModalitatePlata {

    private float sold;

    public Card(float sold) {
        this.sold = sold;
    }

    @Override
    public void achita(float suma) {
        if (suma <= sold) {
            System.out.println("S-a realizat plata cu cardul pt suma: " + suma);
            sold -= suma;
        } else {
            System.out.println("Fonduri insuficiente!");
        }

    }
}
