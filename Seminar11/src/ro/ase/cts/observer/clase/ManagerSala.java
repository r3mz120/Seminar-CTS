package ro.ase.cts.observer.clase;

public class ManagerSala extends Subiect {

    public void anuntaMeciFotbal() {
        super.notificaClienti("A fost programat un meci de fotbal");
    }

    public void anuntaMeciVolei() {
        super.notificaClienti("A fost programat un meci de volei");
    }

    public void anuntaMeciHandbal() {
        super.notificaClienti("A fost programat un meci de handbal");
    }


}
