package ro.ase.cts.command.clase;

public class ContBancar {
    private String detinator;
    private float sold;

    public ContBancar(String detinator) {
        this.detinator = detinator;
    }

    public void constituire(float suma) {
        sold = suma;
        System.out.println("S-a constituit contul cu suma de " + suma);
    }

    public void retragere(float suma) {
        if (suma < sold) {
            sold -= suma;
            System.out.println("S-a retras suma de " + suma);
        } else {
            System.out.println("Nu s-a retras suma de " + suma);
        }
    }

    public void depunere(float suma) {
        sold += suma;
        System.out.println("S-a depus suma de " + suma);
    }
}
