package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.clase.Card;
import ro.ase.cts.strategy.clase.Cash;
import ro.ase.cts.strategy.clase.Client;

public class Main {
    public static void main(String[] args) {
        Card card = new Card(5000);

        Client client = new Client("Gigel", card);
        client.platesteNota(300);
        client.setModalitatePlata(new Cash());

        client.platesteNota(50);

        client.setModalitatePlata(card);
        client.platesteNota(8000);

    }
}
