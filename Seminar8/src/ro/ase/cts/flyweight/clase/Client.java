package ro.ase.cts.flyweight.clase;

public class Client implements Flyweight {

    private String nume;
    private String telefon;
    private String email;

    public Client(String nume, String telefon, String email) {
        this.nume = nume;
        this.telefon = telefon;
        this.email = email;
    }


    @Override
    public void afisareInformatii(Rezervare rezervare) {

        System.out.println(toString() + rezervare.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", telefon='").append(telefon).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
