package br.ce.samueleite.core;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	private static WebDriver driver;
	
	private DriverFactory() {}
	
	public static WebDriver getDriver() {
		if(driver == null) {
			switch (Propriedades.browser) {
			case FIREFOX: driver = new FirefoxDriver(); break;
			case CHROME:  driver = new ChromeDriver(); break;
			default:
				break;			
			}
			System.setProperty("webdriver.gecko.driver", "C:/Samuel/Driver/geckodriver.exe");
			System.setProperty("webdriver.chrome.driver", "C:/Samuel/Driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().setSize(new Dimension(1200, 765));			
		}
		return driver;
	}

	public static void killDriver() {
		if(driver != null) {
			driver.close();
			driver = null;	
		}
	}
	
}
