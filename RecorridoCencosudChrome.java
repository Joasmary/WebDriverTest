package example;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;



public class RecorridoCencosudChrome {

	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeMethod
	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {


		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("jenkins.label","amd64");
		capabilities.setCapability("jenkins.nodeName","chrome");
		capabilities.setJavascriptEnabled(true);
		capabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
		driver = new RemoteWebDriver(new URL("http://localhost:4445/wd/hub"), capabilities);
		baseUrl = "http://192.168.0.90:1337/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void testUntitled() throws Exception {
		// open | / | 
		driver.get(baseUrl);
		// type | name=email | alejandra.alvarez@cencosud.cl
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("alejandra.alvarez@cencosud.cl");
		// type | name=password | 1002
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("1002");
		// click | //input[@value='Ingresar'] | 
		driver.findElement(By.xpath("//input[@value='Ingresar']")).click();

		Thread.sleep(8000);
		// click | link=INGRESO HORAS | 	
		String valor= driver.findElement(By.xpath("//a[contains(text(), 'INGRESO HORAS')]")).getAttribute("href");
		driver.get(valor);

		Thread.sleep(8000);
		// click | link=PROYECTOS | 
		//driver.findElement(By.partialLinkText("PROYECTOS")).click();
		valor= driver.findElement(By.xpath("//a[contains(text(), 'PROYECTOS')]")).getAttribute("href");
		driver.get( valor);

		Thread.sleep(8000);
		//click | link=REPORTES | 
		driver.findElement(By.linkText("REPORTES")).click();

		Thread.sleep(8000);
		// click | link=Dashboard | 
		driver.findElement(By.linkText("Dashboard")).click();

		Thread.sleep(8000);
		// click | link=REPORTES | 
		driver.findElement(By.linkText("REPORTES")).click();

		Thread.sleep(8000);
		// click | link=Reporte General | 

		driver.findElement(By.linkText("Reporte General")).click();

		Thread.sleep(8000);
		// click | link=MANTENEDORES | 
		driver.findElement(By.linkText("MANTENEDORES")).click();

		Thread.sleep(8000);
		// click | link=Torre | 
		driver.findElement(By.linkText("Torre")).click();

		Thread.sleep(8000);
		// click | link=MANTENEDORES | 
		driver.findElement(By.linkText("MANTENEDORES")).click();
		// click | link=Gerencia | 

		Thread.sleep(8000);
		driver.findElement(By.linkText("Gerencia")).click();

		Thread.sleep(8000);
		// click | link=MANTENEDORES | 
		driver.findElement(By.linkText("MANTENEDORES")).click();

		Thread.sleep(8000);
		// click | link=Roles | 
		driver.findElement(By.linkText("Roles")).click();

		Thread.sleep(8000);
		// click | link=MANTENEDORES | 
		driver.findElement(By.linkText("MANTENEDORES")).click();

		Thread.sleep(8000);
		// click | link=Unidad de Negocio | 
		driver.findElement(By.linkText("Unidad de Negocio")).click();

		Thread.sleep(8000);
		// click | link=MANTENEDORES | 
		driver.findElement(By.linkText("MANTENEDORES")).click();

		Thread.sleep(8000);
		// click | link=Proveedores y Tarifas | 
		driver.findElement(By.linkText("Proveedores y Tarifas")).click();

		Thread.sleep(8000);
		// click | link=MANTENEDORES | 
		driver.findElement(By.linkText("MANTENEDORES")).click();

		Thread.sleep(8000);
		// click | link=Cambio Moneda a USD | 
		driver.findElement(By.linkText("Cambio Moneda a USD")).click();

		Thread.sleep(8000);
		// click | link=MANTENEDORES | 
		driver.findElement(By.linkText("MANTENEDORES")).click();

		Thread.sleep(8000);
		// click | link=Maestro Tercero | 
		driver.findElement(By.linkText("Maestro Tercero")).click();

		Thread.sleep(8000);
		// click | link=MANTENEDORES | 
		driver.findElement(By.linkText("MANTENEDORES")).click();

		Thread.sleep(8000);
		// click | link=Usuario | 
		driver.findElement(By.linkText("Usuario")).click();

		Thread.sleep(8000);
		// click | link=MANTENEDORES | 
		driver.findElement(By.linkText("MANTENEDORES")).click();

		Thread.sleep(8000);
		// click | link=País | 
		driver.findElement(By.linkText("País")).click();

		Thread.sleep(8000);
		// click | link=MANTENEDORES | 
		driver.findElement(By.linkText("MANTENEDORES")).click();

		Thread.sleep(8000);
		// click | link=Agrupación | 
		driver.findElement(By.linkText("Agrupación")).click();

		Thread.sleep(8000);
		// click | link=MANTENEDORES | 
		driver.findElement(By.linkText("MANTENEDORES")).click();

		Thread.sleep(8000);
		// click | link=Líderes de Proyecto | 
		driver.findElement(By.linkText("Líderes de Proyecto")).click();

		Thread.sleep(8000);
		// click | link=ORDEN DE SERVICIO | 
		driver.findElement(By.linkText("ORDEN DE SERVICIO")).click();

		Thread.sleep(8000);
		// click | link=Alejandra Alvarez (Administrador) | 
		driver.findElement(By.linkText("Alejandra Alvarez (Administrador)")).click();

		Thread.sleep(8000);
		// click | link=Cerrar Sesión | 
		driver.findElement(By.linkText("Cerrar Sesión")).click();
	}

	@AfterMethod
	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {

		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			Assert.fail(verificationErrorString);
		}
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Antes del método");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Después del metodo");
	}
}

