package clase.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({TestGrupa.class,TestGrupaCuSetUp.class,TestGrupaWithDummy.class,TestGrupaWithFake.class,TestGrupaWithStub.class})
public class AllTests {
}
