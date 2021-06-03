package clase.tests;


import clase.Grupa;
import clase.tests.categorii.TesteGetPromovabilitate;
import clase.tests.categorii.TesteNormale;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({TestGrupa.class,TestGrupaCuSetUp.class,TestGrupaWithDummy.class,TestGrupaWithFake.class,TestGrupaWithStub.class})
@Categories.IncludeCategory(TesteGetPromovabilitate.class)
@Categories.ExcludeCategory(TesteNormale.class)
public class SuitaCustom {
}
