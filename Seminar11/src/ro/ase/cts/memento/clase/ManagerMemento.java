package ro.ase.cts.memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {
    private List<Memento> list;

    public ManagerMemento() {
        this.list = new ArrayList<>();
    }

    public void adaugaMemento(Memento memento) {
        list.add(memento);
    }

    public Memento getMemento(int pozitieMemento) {
        if (pozitieMemento >= 0 && pozitieMemento <= list.size()) {
            return list.get(pozitieMemento);
        }
        throw new IndexOutOfBoundsException();
    }
}
