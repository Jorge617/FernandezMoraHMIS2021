package org.ual.hmis.FernandezMora;

// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class TestPaginaWeb {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@Before
	public void setUp() {
		// Browser selector
		String browserProperty = "";
		browserProperty = System.getProperty("browserWebDriver");

		// run headless: clean test -DbrowserWebDriver=firefox -Dheadless=true
		Boolean headless = false;
		if (System.getProperty("headless").equals("true")) {
			headless = true;
		}

		switch (browserProperty) {
		case "firefox": // firefox
			// Firefox
			// Descargar geckodriver de https://github.com/mozilla/geckodriver/releases
			// Descomprimir el archivo geckodriver.exe en la carpeta drivers

//			System.setProperty("webdriver.gecko.driver", "/Users/martafernandez/Downloads/geckodriver");
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			if (headless) firefoxOptions.setHeadless(headless);
			driver = new FirefoxDriver(firefoxOptions);

			break;
		case "chrome": // chrome
			// Chrome
			// Descargar Chromedriver de https://chromedriver.chromium.org/downloads
			// Descomprimir el archivo chromedriver.exe en la carpeta drivers

//			System.setProperty("webdriver.chrome.driver", "/Users/martafernandez/Downloads/chromedriver");
			ChromeOptions chromeOptions = new ChromeOptions();
			if (headless)
				chromeOptions.setHeadless(headless);
			chromeOptions.addArguments("window-size=1920,1080");
			driver = new ChromeDriver(chromeOptions);

			break;

		default:
			fail("Please select a browser");
			break;
		}
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void testPaginaGitHubBoton() {
		// Test name: TestPaginaGitHub
		// Step # | name | target | value
		// 1 | open |
		// http://hmis2021-web.eastus.cloudapp.azure.com/FernandezMoraHMIS2021/pagina_web/
		// |
		driver.get("http://hmis2021-web.eastus.cloudapp.azure.com/FernandezMoraHMIS2021/pagina_web/");
		// 2 | setWindowSize | 658x458 |
		driver.manage().window().setSize(new Dimension(658, 458));
		// 3 | click | css=.btn |
		driver.findElement(By.cssSelector(".btn")).click();
		// Comprobar URL de la p�gina
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://github.com/mfg306/FernandezMoraHMIS2021/tree/master/pagina_web");

	}

	@Test
	public void testPaginaGitHubEnlace() {
		driver.get("http://hmis2021-web.eastus.cloudapp.azure.com/FernandezMoraHMIS2021/pagina_web/");
		driver.manage().window().setSize(new Dimension(658, 458));
		driver.findElement(By.cssSelector(".order-lg-1 a")).click();
		// Comprobar URL de la p�gina
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://github.com/mfg306/FernandezMoraHMIS2021/tree/master/pagina_web");
	}

	@Test
	public void testDocumentacionGitHub() {
		// Test name: TestDocumentacionGitHub
		// Step # | name | target | value
		// 1 | open |
		// http://hmis2021-web.eastus.cloudapp.azure.com/FernandezMoraHMIS2021/pagina_web/
		// |
		driver.get("http://hmis2021-web.eastus.cloudapp.azure.com/FernandezMoraHMIS2021/pagina_web/");
		// 2 | setWindowSize | 1552x840 |
		driver.manage().window().setSize(new Dimension(1552, 840));
		// 3 | click | linkText=Enlace de acceso |
		driver.findElement(By.linkText("Enlace de acceso")).click();
		// Comprobar URL de la p�gina
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://docs.github.com/es");

	}

	@Test
	public void testOrganizacionHMIS() {
		// Test name: TestOrganizacionHMIS
		// Step # | name | target | value
		// 1 | open |
		// http://hmis2021-web.eastus.cloudapp.azure.com/FernandezMoraHMIS2021/pagina_web/
		// |
		driver.get("http://hmis2021-web.eastus.cloudapp.azure.com/FernandezMoraHMIS2021/pagina_web/");
		// 2 | setWindowSize | 1552x840 |
		driver.manage().window().setSize(new Dimension(1552, 840));
		// 3 | click | css=.col-lg-6 > a |
		driver.findElement(By.cssSelector(".col-lg-6 > a")).click();
		// Comprobar URL de la p�gina
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://github.com/ualhmis/");

	}

	@Test
	public void testGitBook() {
		// Test name: TestGitBook
		// Step # | name | target | value
		// 1 | open |
		// http://hmis2021-web.eastus.cloudapp.azure.com/FernandezMoraHMIS2021/pagina_web/
		// |
		driver.get("http://hmis2021-web.eastus.cloudapp.azure.com/FernandezMoraHMIS2021/pagina_web/");
		// 2 | setWindowSize | 1552x840 |
		driver.manage().window().setSize(new Dimension(1552, 840));
		// 3 | click | css=.col-lg-6:nth-child(2) a:nth-child(2) |
		driver.findElement(By.cssSelector(".col-lg-6:nth-child(2) a:nth-child(2)")).click();
		// Comprobar URL de la p�gina
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.gitbook.com/");

	}

	@Test
	public void testAzurePortal() {
		// Test name: TestAzurePortal
		// Step # | name | target | value
		// 1 | open |
		// http://hmis2021-web.eastus.cloudapp.azure.com/FernandezMoraHMIS2021/pagina_web/
		// |
		driver.get("http://hmis2021-web.eastus.cloudapp.azure.com/FernandezMoraHMIS2021/pagina_web/");
		// 2 | setWindowSize | 1552x840 |
		driver.manage().window().setSize(new Dimension(1552, 840));
		// 3 | click | css=.col-lg-6:nth-child(1) > .p-5 > a:nth-child(2) |
		driver.findElement(By.cssSelector(".col-lg-6:nth-child(1) > .p-5 > a:nth-child(2)")).click();
		// Comprobar URL de la p�gina
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url,
				"https://azure.microsoft.com/es-es/free/search/?&ef_id=EAIaIQobChMIvpHqx6Go7wIV8e3mCh0ggASREAAYASAAEgLMnfD_BwE:G:s&OCID=AID2100112_SEM_EAIaIQobChMIvpHqx6Go7wIV8e3mCh0ggASREAAYASAAEgLMnfD_BwE:G:s");

	}

	@Test
	public void testDocumentacionAzure() {
		// Test name: TestDocumentacionAzure
		// Step # | name | target | value
		// 1 | open |
		// http://hmis2021-web.eastus.cloudapp.azure.com/FernandezMoraHMIS2021/pagina_web/
		// |
		driver.get("http://hmis2021-web.eastus.cloudapp.azure.com/FernandezMoraHMIS2021/pagina_web/");
		// 2 | setWindowSize | 1552x840 |
		driver.manage().window().setSize(new Dimension(1552, 840));
		// 3 | click | css=section:nth-child(5) .col-lg-6:nth-child(2) a |
		driver.findElement(By.cssSelector("section:nth-child(5) .col-lg-6:nth-child(2) a")).click();
		// Comprobar URL de la p�gina
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://docs.microsoft.com/es-es/azure/?product=featured");

	}

	@Test
	public void testPaginaJorge() {
		// Test name: TestPaginaJorge
		// Step # | name | target | value
		// 1 | open |
		// http://hmis2021-web.eastus.cloudapp.azure.com/FernandezMoraHMIS2021/pagina_web/
		// |
		driver.get("http://hmis2021-web.eastus.cloudapp.azure.com/FernandezMoraHMIS2021/pagina_web/");
		// 2 | setWindowSize | 1552x840 |
		driver.manage().window().setSize(new Dimension(1552, 840));
		// 3 | click | css=.nav-item:nth-child(1) > .nav-link |
		driver.findElement(By.cssSelector(".nav-item:nth-child(1) > .nav-link")).click();
		// Comprobar URL de la p�gina
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url,
				"http://hmis2021-web.eastus.cloudapp.azure.com/FernandezMoraHMIS2021/pagina_web/jorge.html");

	}

	@Test
	public void testPaginaMarta() {
		// Test name: TestPaginaMarta
		// Step # | name | target | value
		// 1 | open |
		// http://hmis2021-web.eastus.cloudapp.azure.com/FernandezMoraHMIS2021/pagina_web/
		// |
		driver.get("http://hmis2021-web.eastus.cloudapp.azure.com/FernandezMoraHMIS2021/pagina_web/");
		// 2 | setWindowSize | 1552x840 |
		driver.manage().window().setSize(new Dimension(1552, 840));
		// 3 | click | css=.nav-item:nth-child(2) > .nav-link |
		driver.findElement(By.cssSelector(".nav-item:nth-child(2) > .nav-link")).click();
		// Comprobar URL de la p�gina
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url,
				"http://hmis2021-web.eastus.cloudapp.azure.com/FernandezMoraHMIS2021/pagina_web/marta.html");

	}

	@Test
	public void testPaginaPrincipal() {
		// Test name: TestPaginaPrincipal
		// Step # | name | target | value
		// 1 | open |
		// http://hmis2021-web.eastus.cloudapp.azure.com/FernandezMoraHMIS2021/pagina_web/
		// |
		driver.get("http://hmis2021-web.eastus.cloudapp.azure.com/FernandezMoraHMIS2021/pagina_web/");
		// 2 | setWindowSize | 1552x840 |
		driver.manage().window().setSize(new Dimension(1552, 840));
		// 3 | click | css=.navbar-brand |
		driver.findElement(By.cssSelector(".navbar-brand")).click();
		// Comprobar URL de la p�gina
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url,
				"http://hmis2021-web.eastus.cloudapp.azure.com/FernandezMoraHMIS2021/pagina_web/index.html");

	}

}
