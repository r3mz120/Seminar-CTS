package ro.ase.cts.clase;

public class BazaDeDateHuligani {
    public static boolean esteInListaDeHuligani(Persoana persoana){
        return (Integer.parseInt("" + persoana.getCnp().charAt(11)) % 2 == 0);
    }
}
