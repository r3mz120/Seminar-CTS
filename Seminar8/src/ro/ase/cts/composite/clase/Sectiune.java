package ro.ase.cts.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements ComponentaMeniu {

    private String numeSectiune;
    private List<ComponentaMeniu> lista;

    public Sectiune(String numeSectiune) {
        this.numeSectiune = numeSectiune;
        this.lista = new ArrayList<ComponentaMeniu>();
    }


    @Override
    public void adaugareNod(ComponentaMeniu componentaMeniu) {
        lista.add(componentaMeniu);
    }

    @Override
    public void stergereNod(ComponentaMeniu componentaMeniu) {
        lista.remove(componentaMeniu);
    }

    @Override
    public void afiseazaInformatii() {
        System.out.println("Sectiune " + numeSectiune);
        for (ComponentaMeniu s : lista) {
            s.afiseazaInformatii();
        }
    }

    @Override
    public ComponentaMeniu getComponenta(int index) throws Exception {
        if (index >= 0 && index < lista.size()) {
            return lista.get(index);
        } else {
            throw new Exception("Index-ul nu exista");
        }
    }
}
