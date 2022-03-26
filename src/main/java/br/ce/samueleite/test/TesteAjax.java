package br.ce.samueleite.test;
import static br.ce.samueleite.core.DriverFactory.getDriver;
import static br.ce.samueleite.core.DriverFactory.killDriver;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.ce.samueleite.core.DSL;
import br.ce.samueleite.core.DriverFactory;

public class TesteAjax {

	private DSL dsl;

	@Before
	public void inicializa(){
		DriverFactory.getDriver().get("https://www.primefaces.org/showcase-v8/ui/ajax/basic.xhtml");
		dsl = new DSL();
	}
	
	@After
	public void finaliza(){
		killDriver();
	}
	
	@Test
	public void testeAjax() {
		dsl.escrever("j_idt718:name", "Teste");
		dsl.clicarBotao("j_idt718:j_idt721");
		WebDriverWait wait = new WebDriverWait(getDriver(),30);
//		wait.until(ExpectedConditions.textToBe(By.id("j_idt718:display"), "Teste"));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("j_idt98")));
		Assert.assertEquals("Teste", dsl.obterTexto("j_idt718:display"));
	}
}