package clase.tests;

import clase.Grupa;
import clase.IStudent;
import clase.Student;
import clase.dubluri.StudentDummy;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGrupaWithDummy {

    @Test
    public void testAdaugaStudenti(){
        IStudent s = new StudentDummy();
        Grupa grupa = new Grupa(1076);

        grupa.adaugaStudent(s);
        assertEquals(1,grupa.getStudenti().size());
    }
}
