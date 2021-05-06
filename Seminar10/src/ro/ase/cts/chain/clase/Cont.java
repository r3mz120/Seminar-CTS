package ro.ase.cts.chain.clase;

public abstract class Cont {

    private String detinator;
    private float sold;
    private Cont succesor;

    public Cont(String detinator, float sold) {
        this.detinator = detinator;
        this.sold = sold;
        this.succesor = null;
    }


    public void setSold(float sold) {
        this.sold = sold;
    }

    public void setSuccesor(Cont succesor) {
        this.succesor = succesor;
    }

    public abstract void realizeazaPlata(float suma);

    public String getDetinator() {
        return detinator;
    }

    public float getSold() {
        return sold;
    }

    public Cont getSuccesor() {
        return succesor;
    }
}
