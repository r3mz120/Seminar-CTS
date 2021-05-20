package clase.tests;

import clase.Student;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTests {

    @Test
    public void testConstructorCuParametri() {
        String nume = "Ionel";
        Student student = new Student(nume);

        assertEquals(nume, student.getNume());
    }

    @Test
    public void testConstructorFaraParametri() {
        Student student = new Student();

        assertEquals("Student", student.getNume());
    }

    @Test
    public void testAreRestanta() {
        Student student = new Student();
        student.adaugaNota(4);
        student.adaugaNota(6);
        assertTrue("Studentul care are restanta este marcat ca neavand restanta!", student.areRestante());
    }

    @Test
    public void testNuAreRestanta() {
        Student student = new Student();
        student.adaugaNota(7);
        student.adaugaNota(6);
        assertFalse("Studentul care nu are restanta este marcat ca avand restanta!", student.areRestante());
    }

    @Test
    public void testAdaugaNota() {
        Student student = new Student();
        student.adaugaNota(10);

        assertEquals(1, student.getNote().size());
    }

    @Test
    public void testNotaAdaugataEsteCorecta() {
        Student student = new Student();
        int nota = 10;
        student.adaugaNota(nota);
        assertEquals(nota, student.getNota(0));

    }

    @Test
    public void testCalculeazaMedia() {
        Student student = new Student();
        student.adaugaNota(5);
        student.adaugaNota(6);
        assertEquals(5.5, student.calculeazaMedie(), 0.01);
    }

    @Test
    public void testCalculeazaMediaFaraNote() {
        Student student = new Student();
        assertEquals(0, student.calculeazaMedie(), 0.01);
    }

    @Test
    public void testCalculeazaMediaONota() {
        int nota = 8;
        Student student = new Student();
        student.adaugaNota(nota);
        assertEquals(nota, student.calculeazaMedie(), 0.01);
    }

    @Test
    public void testAdaugaNotaIncorecta() {

        Student student = new Student();
        int nota = 14;

        try {
            student.adaugaNota(nota);
            fail("Nu trebuia sa se ajunga aici");
        } catch (IllegalArgumentException err) {

        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdaugaNotaIncorectaJU4() {
        Student student = new Student();
        student.adaugaNota(13);
    }
}
