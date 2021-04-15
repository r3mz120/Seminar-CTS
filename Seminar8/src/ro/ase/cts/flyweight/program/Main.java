package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.Client;
import ro.ase.cts.flyweight.clase.FabricaFlyweight;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare(3, 4, 2);
        Rezervare rezervare2 = new Rezervare(2, 5, 1);
        Rezervare rezervare3 = new Rezervare(5, 3, 4);

        FabricaFlyweight fabricaFlyweight = new FabricaFlyweight();


        Client client = (Client) fabricaFlyweight.getClient("0700000000");
        client.afisareInformatii(rezervare);
        Client client1 = (Client) fabricaFlyweight.getClient("0700000001");
        client1.afisareInformatii(rezervare2);
        fabricaFlyweight.getClient("0700000000").afisareInformatii(rezervare3);
    }
}
