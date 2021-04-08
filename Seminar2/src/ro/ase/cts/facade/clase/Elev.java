package ro.ase.cts.facade.clase;

public class Elev extends Aplicant {
    private int clasa;
    private String tutore;
    private static float sumaFinantata = 30;

    public int getClasa() {
        return clasa;
    }

    public void setClasa(int i) {
        this.clasa = i;
    }

    public String getTutore() {
        return tutore;
    }

    public void setTutore(String tutore) {
        this.tutore = tutore;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Elev:");
        sb.append(super.toString()).append("clasa= ").append(clasa).append('\'');
        sb.append(", tutore=").append(tutore);
        return sb.toString();
    }

    public Elev() {
        super();
    }

    @Override
    public float getSumaFinantata() {
        return sumaFinantata;
    }

    public Elev(String nume, String prenume, int varsta, int punctaj,
                int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
        super(nume, prenume, varsta, punctaj, nr_proiecte, denumireProiect);
        this.clasa = clasa;
        this.tutore = tutore;
    }


    public static float getFinantare() {
        return sumaFinantata;
    }

    public static void setSumaFinantata(float sumaFinantata) {
        Elev.sumaFinantata = sumaFinantata;
    }
}
