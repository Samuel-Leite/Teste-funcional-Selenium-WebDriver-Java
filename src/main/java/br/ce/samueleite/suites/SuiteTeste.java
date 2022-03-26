package br.ce.samueleite.suites;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.ce.samueleite.core.DriverFactory;
import br.ce.samueleite.test.TesteCadastro;
import br.ce.samueleite.test.TesteRegrasCadastro;

@RunWith(Suite.class)
@SuiteClasses({
	TesteCadastro.class,
	TesteRegrasCadastro.class,
})
public class SuiteTeste {
	
	@AfterClass
	public static void finalizarTudo() {
		DriverFactory.killDriver();
	}
}
