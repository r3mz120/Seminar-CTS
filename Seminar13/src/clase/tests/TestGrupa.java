package clase.tests;

import clase.Grupa;
import clase.Student;
import clase.tests.categorii.TesteGetPromovabilitate;
import clase.tests.categorii.TesteNormale;
import clase.tests.categorii.TesteUrgente;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestGrupa {


    @Test
    @Category(TesteUrgente.class)
    public void testConstructorRight() {
        Grupa grupa = new Grupa(1076);
        assertEquals(1076, grupa.getNrGrupa());

    }

    @Test
    @Category(TesteNormale.class)
    public void testConstructorBoundaryInf() {
        Grupa grupa = new Grupa(1000);
        assertEquals(1000, grupa.getNrGrupa());
    }

    @Test
    public void testConstructorBoundarySup() {
        Grupa grupa = new Grupa(1100);
        assertEquals(1100, grupa.getNrGrupa());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorErrorSub1000() {
        Grupa grupa = new Grupa(999);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorError() {
        Grupa grupa = new Grupa(1200);
    }

    @Test(timeout = 500)
    public void testConstructorPerformanta() {
        Grupa grupa = new Grupa(1076);
    }

    @Test
    @Category(TesteNormale.class)
    public void testConstructorLungime() {
        Grupa grupa = new Grupa(1076);
        assertNotNull(grupa.getStudenti());
    }

    @Test
    @Category(TesteGetPromovabilitate.class)
    public void testPromovabilitateRight() {
        Grupa grupa = new Grupa(1076);
        for (int i = 0; i < 5; i++) {
            Student student = new Student("ion");
            student.adaugaNota(10);
            student.adaugaNota(9);
            student.adaugaNota(8);
            grupa.adaugaStudent(student);
        }
        for (int i = 0; i < 7; i++) {
            Student student = new Student("gigel");
            student.adaugaNota(2);
            student.adaugaNota(3);
            student.adaugaNota(4);
            grupa.adaugaStudent(student);
        }

        assertEquals(0.41, grupa.getPromovabilitate(), 0.05);
    }

    @Test
    @Category({TesteGetPromovabilitate.class, TesteUrgente.class})
    public void testPromovabilitateBoundaryInf() {
        Grupa grupa = new Grupa(1076);
        for (int i = 0; i < 7; i++) {
            Student student = new Student("gigel");
            student.adaugaNota(3);
            student.adaugaNota(2);
            student.adaugaNota(6);
            student.adaugaNota(4);
            student.adaugaNota(8);
            grupa.adaugaStudent(student);
        }
        assertEquals(0, grupa.getPromovabilitate(), 0.01);
    }

    @Test
    @Category(TesteGetPromovabilitate.class)
    public void testPromovabilitateBoundarySup() {
        Grupa grupa = new Grupa(1076);
        for (int i = 0; i < 7; i++) {
            Student student = new Student("gigel");
            student.adaugaNota(7);
            student.adaugaNota(8);
            student.adaugaNota(6);
            student.adaugaNota(9);
            student.adaugaNota(8);
            grupa.adaugaStudent(student);
        }
        assertEquals(1, grupa.getPromovabilitate(), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    @Category(TesteGetPromovabilitate.class)
    public void testPromovabilitateCross() {
        Grupa grupa = new Grupa(1076);
        grupa.getPromovabilitate();
    }


}
