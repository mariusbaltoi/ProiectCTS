package Teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TesteBanca.class, TesteClient.class, TesteCont.class, TesteCredit.class, TesteDepozit.class,
		TesteEchipa.class, TestFisier.class })
public class TesteleMele {

}
