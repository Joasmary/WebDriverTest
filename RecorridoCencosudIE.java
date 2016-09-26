package example;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;



public class RecorridoCencosudIE {

	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeMethod
	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {


		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability("jenkins.label","amd64");
		capabilities.setCapability("jenkins.nodeName","pruebas");
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		capabilities.setJavascriptEnabled(true);
		capabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
		driver = new RemoteWebDriver(new URL("http://localhost:4446/wd/hub"), capabilities);
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
		valor= driver.findElement(By.xpath("//a[contains(text(), 'REPORTES')]")).getAttribute("href");
		driver.get( valor);

		Thread.sleep(8000);
		// click | link=Dashboard | 
		valor= driver.findElement(By.xpath("//a[contains(text(), 'Dashboard')]")).getAttribute("href");
		driver.get( valor);

		Thread.sleep(8000);
		// click | link=REPORTES | 
		valor= driver.findElement(By.xpath("//a[contains(text(), 'REPORTES')]")).getAttribute("href");
		driver.get( valor);

		/*Thread.sleep(8000);
		// click | link=Reporte General | 
		valor= driver.findElement(By.xpath("//a[contains(text(), 'Reporte General')]")).getAttribute("href");
		driver.get( valor);*/

		Thread.sleep(8000);
		// click | link=MANTENEDORES | 
		valor= driver.findElement(By.xpath("//a[contains(text(), 'MANTENEDORES')]")).getAttribute("href");
		driver.get( valor);

		Thread.sleep(8000);
		// click | link=Torre | 
		valor= driver.findElement(By.xpath("//a[contains(text(), 'Torre')]")).getAttribute("href");
		driver.get( valor);

		Thread.sleep(8000);
		// click | link=MANTENEDORES | 
		valor= driver.findElement(By.xpath("//a[contains(text(), 'MANTENEDORES')]")).getAttribute("href");
		driver.get( valor);

		Thread.sleep(8000);
		// click | link=Gerencia | 
		valor= driver.findElement(By.xpath("//a[contains(text(), 'Gerencia')]")).getAttribute("href");
		driver.get( valor);

		Thread.sleep(8000);
		// click | link=MANTENEDORES | 
		valor= driver.findElement(By.xpath("//a[contains(text(), 'MANTENEDORES')]")).getAttribute("href");
		driver.get( valor);

		Thread.sleep(8000);
		// click | link=Roles | 
		valor= driver.findElement(By.xpath("//a[contains(text(), 'Roles')]")).getAttribute("href");
		driver.get( valor);

		Thread.sleep(8000);
		// click | link=MANTENEDORES | 
		valor= driver.findElement(By.xpath("//a[contains(text(), 'MANTENEDORES')]")).getAttribute("href");
		driver.get( valor);

		Thread.sleep(8000);
		// click | link=Unidad de Negocio | 
		valor= driver.findElement(By.xpath("//a[contains(text(), 'Unidad de Negocio')]")).getAttribute("href");
		driver.get( valor);

		Thread.sleep(8000);
		// click | link=MANTENEDORES | 
		valor= driver.findElement(By.xpath("//a[contains(text(), 'MANTENEDORES')]")).getAttribute("href");
		driver.get( valor);

		Thread.sleep(8000);
		// click | link=Proveedores y Tarifas | 
		valor= driver.findElement(By.xpath("//a[contains(text(), 'Proveedores y Tarifas')]")).getAttribute("href");
		driver.get( valor);

		Thread.sleep(8000);
		// click | link=MANTENEDORES | 
		valor= driver.findElement(By.xpath("//a[contains(text(), 'MANTENEDORES')]")).getAttribute("href");
		driver.get( valor);

		Thread.sleep(8000);
		// click | link=Cambio Moneda a USD | 
		valor= driver.findElement(By.xpath("//a[contains(text(), 'Cambio Moneda a USD')]")).getAttribute("href");
		driver.get( valor);

		Thread.sleep(8000);
		// click | link=MANTENEDORES | 
		valor= driver.findElement(By.xpath("//a[contains(text(), 'MANTENEDORES')]")).getAttribute("href");
		driver.get( valor);

		Thread.sleep(8000);
		// click | link=Maestro Tercero | 
		valor= driver.findElement(By.xpath("//a[contains(text(), 'Maestro Tercero')]")).getAttribute("href");
		driver.get( valor);

		Thread.sleep(8000);
		// click | link=MANTENEDORES | 
		valor= driver.findElement(By.xpath("//a[contains(text(), 'MANTENEDORES')]")).getAttribute("href");
		driver.get( valor);

		Thread.sleep(8000);
		// click | link=Usuario | 
		valor= driver.findElement(By.xpath("//a[contains(text(), 'Usuario')]")).getAttribute("href");
		driver.get( valor);

		Thread.sleep(8000);
		// click | link=MANTENEDORES | 
		valor= driver.findElement(By.xpath("//a[contains(text(), 'MANTENEDORES')]")).getAttribute("href");
		driver.get( valor);

		Thread.sleep(8000);
		// click | link=País | 
		valor= driver.findElement(By.xpath("//a[contains(text(), 'País')]")).getAttribute("href");
		driver.get( valor);

		Thread.sleep(8000);
		// click | link=MANTENEDORES | 
		valor= driver.findElement(By.xpath("//a[contains(text(), 'MANTENEDORES')]")).getAttribute("href");
		driver.get( valor);

		Thread.sleep(8000);
		// click | link=Agrupación | 
		valor= driver.findElement(By.xpath("//a[contains(text(), 'Agrupación')]")).getAttribute("href");
		driver.get( valor);

		Thread.sleep(8000);
		// click | link=MANTENEDORES | 
		valor= driver.findElement(By.xpath("//a[contains(text(), 'MANTENEDORES')]")).getAttribute("href");
		driver.get( valor);

		Thread.sleep(8000);
		// click | link=Líderes de Proyecto | 
		valor= driver.findElement(By.xpath("//a[contains(text(), 'Líderes de Proyecto')]")).getAttribute("href");
		driver.get( valor);

		Thread.sleep(8000);
		// click | link=ORDEN DE SERVICIO | 
		valor= driver.findElement(By.xpath("//a[contains(text(), 'ORDEN DE SERVICIO')]")).getAttribute("href");
		driver.get( valor);

		Thread.sleep(8000);
		// click | link=Alejandra Alvarez (Administrador) | 
		valor= driver.findElement(By.xpath("//a[contains(text(), 'Alejandra Alvarez (Administrador)')]")).getAttribute("href");
		driver.get( valor);

		Thread.sleep(8000);
		// click | link=Cerrar Sesión | 
		valor= driver.findElement(By.xpath("//a[contains(text(), 'Cerrar Sesión')]")).getAttribute("href");
		driver.get( valor);
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

