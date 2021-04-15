package ro.ase.cts.composite.clase;

public interface ComponentaMeniu {
    void adaugareNod(ComponentaMeniu componentaMeniu);

    void stergereNod(ComponentaMeniu componentaMeniu);

    void afiseazaInformatii();

    ComponentaMeniu getComponenta(int index) throws Exception;

}
