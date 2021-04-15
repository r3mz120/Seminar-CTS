package ro.ase.cts.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaFlyweight {
    private Map<String, Flyweight> clienti;

    public FabricaFlyweight() {
        this.clienti = new HashMap<>();
    }

    public Flyweight getClient(String telefon) {
        Client client = (Client) clienti.get(telefon);
        if (client == null) {
            client = new Client("Popescu", telefon, "popescu@gmail.com");
            clienti.put(telefon, client);
        }
        return client;
    }
}
