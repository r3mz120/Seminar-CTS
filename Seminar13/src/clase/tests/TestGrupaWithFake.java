package clase.tests;

import clase.Grupa;
import clase.IStudent;
import clase.dubluri.StudentFake;
import clase.tests.categorii.TesteGetPromovabilitate;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

public class TestGrupaWithFake {

    @Test
    @Category(TesteGetPromovabilitate.class)
    public void testPromovabilitateRight() {
        Grupa g = new Grupa(1076);
        for (int i = 0; i < 8; i++) {
            StudentFake s = new StudentFake();
            s.setValoareAreRestante(false);
            g.adaugaStudent(s);
        }

        for (int i = 0; i < 2; i++) {
            StudentFake s = new StudentFake();
            s.setValoareAreRestante(true);
            g.adaugaStudent(s);
        }

        assertEquals(0.8, g.getPromovabilitate(), 0.01);

    }
}
