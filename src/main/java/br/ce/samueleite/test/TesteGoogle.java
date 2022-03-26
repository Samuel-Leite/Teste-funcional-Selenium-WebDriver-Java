package br.ce.samueleite.test;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteGoogle {
	
	@Test
	public void teste() {
		System.setProperty("webdriver.gecko.driver", "C:/Samuel/Driver/geckodriver.exe");
//		System.setProperty("webdriver.chrome.driver", "C:/Samuel/Driver/chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
//		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().setSize(new Dimension(700, 700));
		driver.get("http://www.google.com");
		Assert.assertEquals("Google", driver.getTitle());
		driver.close();
	}

}