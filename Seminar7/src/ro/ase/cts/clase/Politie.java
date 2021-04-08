package ro.ase.cts.clase;

public class Politie {
    public static boolean esteUrmarita(Persoana persoana) {
        return (Integer.parseInt("" + persoana.getCnp().charAt(12)) % 2 == 0);
    }
}
