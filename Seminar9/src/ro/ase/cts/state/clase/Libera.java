package ro.ase.cts.state.clase;

public class Libera implements Stare {
    @Override
    public void schimbaStarea(Masa masa) {
        if (!(masa.getStare() instanceof Libera)) {
            System.out.println("Masa " + masa.getNr() + " a fost eliberata!");
            masa.setStare(new Libera());
        } else {
            System.out.println("Masa " + masa.getNr() + " este deja libera!");
        }
    }
}
