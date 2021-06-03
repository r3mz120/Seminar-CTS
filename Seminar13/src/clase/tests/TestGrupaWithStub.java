package clase.tests;

import clase.Grupa;
import clase.IStudent;
import clase.dubluri.StudentDummy;
import clase.dubluri.StudentStub;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGrupaWithStub {

    @Test
    public void testGetPromovabilitate() {
        IStudent s = new StudentStub();
        Grupa grupa = new Grupa(1076);

        grupa.adaugaStudent(s);
        assertEquals(1, grupa.getPromovabilitate(), 0.01);
    }
}
