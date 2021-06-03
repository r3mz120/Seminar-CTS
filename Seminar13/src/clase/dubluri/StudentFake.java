package clase.dubluri;

import clase.IStudent;

import java.util.List;

public class StudentFake implements IStudent {

    String valoareGetNume;
    float valoareGetMedie;
    int valoareGetNota;
    boolean valoareAreRestante;


    public void setValoareGetNume(String valoareGetNume) {
        this.valoareGetNume = valoareGetNume;
    }

    public void setValoareGetMedie(float valoareGetMedie) {
        this.valoareGetMedie = valoareGetMedie;
    }

    public void setValoareGetNota(int valoareGetNota) {
        this.valoareGetNota = valoareGetNota;
    }

    public void setValoareAreRestante(boolean valoareAreRestante) {
        this.valoareAreRestante = valoareAreRestante;
    }

    @Override
    public String getNume() {
        return valoareGetNume;
    }

    @Override
    public void setNume(String nume) {

    }

    @Override
    public List<Integer> getNote() {
        return null;
    }

    @Override
    public void adaugaNota(int nota) {

    }

    @Override
    public float calculeazaMedie() {
        return valoareGetMedie;
    }

    @Override
    public int getNota(int index) {
        return valoareGetNota;
    }

    @Override
    public boolean areRestante() {
        return valoareAreRestante;
    }
}
