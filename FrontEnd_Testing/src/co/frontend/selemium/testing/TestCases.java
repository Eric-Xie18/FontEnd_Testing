package co.frontend.selemium.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class TestCases {

	private WebDriver chromeDriver;
	private String relativePath = "\\webdriver\\chromedriver.exe";
	private String driverPath;
	
	@Test
	void testSimulation() throws InterruptedException{
		StringBuilder builder = new StringBuilder();
		builder.append(System.getProperty("user.dir"));
		builder.append(relativePath);
		driverPath = builder.toString();
		System.setProperty("webdriver.chrome.driver", driverPath);
		this.chromeDriver =  new ChromeDriver();
		this.chromeDriver.get("http://localhost:3000");
		this.chromeDriver.manage().window().maximize();
		Thread.sleep(200);
	    chromeDriver.findElement(By.xpath("//a[@href='/login']")).click();
	    Thread.sleep(600);
	    chromeDriver.findElement(By.xpath("//input[@class='login-email']")).sendKeys("ubc@ubc.com");
	    Thread.sleep(600);
	    chromeDriver.findElement(By.xpath("//input[@class='login-password']")).sendKeys("ubctester");
	    Thread.sleep(600);
	    chromeDriver.findElement(By.xpath("//button[@class='login-btn']")).click();
	    Thread.sleep(1000);
	    this.chromeDriver.get("http://localhost:3000");

		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) chromeDriver;
		chromeDriver.findElement(By.xpath("//a[@href='/simulation']")).click();
		WebElement dropdown = chromeDriver.findElement(By.id("input-occupation-search"));
		js.executeScript("arguments[0].click();", dropdown);
		Thread.sleep(1000);
		chromeDriver.findElement(By.xpath("//li[@value='28']")).click();
		Thread.sleep(1000);
		WebElement element = chromeDriver.findElement(By.cssSelector(".car.col-sm-4.col-md-4"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		Thread.sleep(600);
		chromeDriver.findElement(By.xpath("//select[@name='car']")).sendKeys("5");
		Thread.sleep(200);
		js.executeScript("arguments[0].scrollIntoView();", chromeDriver.findElement(By.xpath("//select[@name='business']")));
		Thread.sleep(1500);
		
		js.executeScript("arguments[0].scrollIntoView();", chromeDriver.findElement(By.xpath("//label[@for='food']")));
		Thread.sleep(1200);
		element = chromeDriver.findElement(By.id("Salad"));
		js.executeScript("arguments[0].click();", element);
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();", chromeDriver.findElement(By.xpath("//label[@for='rent']")));
		Thread.sleep(1000);
		element = chromeDriver.findElement(By.xpath("//input[@name='rent']"));
		element.sendKeys("1000");
		Thread.sleep(1000);
		element = chromeDriver.findElement(By.xpath("//label[@for='Heating']"));
		js.executeScript("arguments[0].click();", element);
		element = chromeDriver.findElement(By.xpath("//label[@for='Phone Plan']"));
		js.executeScript("arguments[0].click();", element);
		Thread.sleep(1000);
		element = chromeDriver.findElement(By.xpath("//label[@for='Internet']"));
		js.executeScript("arguments[0].click();", element);
		Thread.sleep(1000);
		element = chromeDriver.findElement(By.xpath("//label[@for='Electricity']"));
		js.executeScript("arguments[0].click();", element);
		Thread.sleep(1000);
		element = chromeDriver.findElement(By.xpath("//label[@for='Gas']"));
		js.executeScript("arguments[0].click();", element);
		Thread.sleep(1000);
		element = chromeDriver.findElement(By.xpath("//label[@for='Water']"));
		js.executeScript("arguments[0].click();", element);
		Thread.sleep(1000);
		element = chromeDriver.findElement(By.xpath("//label[@for='Public Transit']"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		Thread.sleep(1000);
		element.click();
		Thread.sleep(1000);
		
		element = chromeDriver.findElement(By.xpath("//input[@id='studentLoan']"));
		element.sendKeys("10000");
		Thread.sleep(1000);
		
		element = chromeDriver.findElement(By.id("input-occupation-search"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		Thread.sleep(1500);
		this.chromeDriver.manage().window().setSize(new Dimension(320, 768));
		Thread.sleep(1000);
		for(int i=0;i<15;i++) {
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0, 300)","");
		Thread.sleep(600);
		}
		
		this.chromeDriver.manage().window().maximize();
		element = chromeDriver.findElement(By.id("btn-simulation-submit"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		Thread.sleep(600);
		element.click(); 
		
		Thread.sleep(1000);
		element = chromeDriver.findElement(By.id("show-summary"));
		js.executeScript("arguments[0].click();", element);
		Thread.sleep(2000);
	    
		element = chromeDriver.findElement(By.xpath("//button[@class='close']"));
		js.executeScript("arguments[0].click();", element);
		Thread.sleep(1500);
		element = chromeDriver.findElement(By.xpath("//a[@href='/findadvisor']"));
		js.executeScript("arguments[0].click();", element);
		Thread.sleep(3000);
		chromeDriver.navigate().back();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,400 )","");
		
		element = chromeDriver.findElement(By.xpath("//a[@href='#collapse1']"));
		js.executeScript("arguments[0].click();", element);
		for(int i=0;i<4;i++) {
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0, 300)","");
			}
		Thread.sleep(700);
		
		element = chromeDriver.findElement(By.xpath("//a[@href='#collapse2']"));
		js.executeScript("arguments[0].click();", element);
		for(int i=0;i<4;i++) {
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0, 300)","");
			}
		Thread.sleep(700);
		
		element = chromeDriver.findElement(By.xpath("//a[@href='#collapse3']"));
		js.executeScript("arguments[0].click();", element);
		for(int i=0;i<4;i++) {
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0, 300)","");
			}
		Thread.sleep(700);
		
		element = chromeDriver.findElement(By.xpath("//a[@href='#collapse4']"));
		js.executeScript("arguments[0].click();", element);
		for(int i=0;i<4;i++) {
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0, 300)","");
			}
		Thread.sleep(700);
		
	}
	
	@Test
		void testAdmin() throws InterruptedException{
		    StringBuilder builder = new StringBuilder();
		    builder.append(System.getProperty("user.dir"));
		    builder.append(relativePath);
		    driverPath = builder.toString();
			System.setProperty("webdriver.chrome.driver", driverPath);
			this.chromeDriver =  new ChromeDriver();
			this.chromeDriver.get("http://localhost:3000");
			this.chromeDriver.manage().window().maximize();
			assertTrue(chromeDriver.findElement(By.xpath("//a[@href='/login']")).isDisplayed());
			chromeDriver.findElement(By.xpath("//a[@href='/login']")).click();
			Thread.sleep(1500);
			assertTrue(chromeDriver.findElement(By.className("login-email")).isDisplayed());
			chromeDriver.findElement(By.className("login-email")).sendKeys("admin@admin.com");
			Thread.sleep(1500);
			assertTrue(chromeDriver.findElement(By.className("login-password")).isDisplayed());
			chromeDriver.findElement(By.className("login-password")).sendKeys("ubctester");
			Thread.sleep(1500);
			assertTrue(chromeDriver.findElement(By.className("login-btn")).isDisplayed());
			chromeDriver.findElement(By.className("login-btn")).click();
			JavascriptExecutor js = (JavascriptExecutor) chromeDriver;
			for(int i=0;i<4;i++) {
				Thread.sleep(500);
				js.executeScript("window.scrollBy(0, 300)","");
				}
			
			WebElement element = chromeDriver.findElement(By.xpath("//a[@href='/edittutorial']"));
			js.executeScript("arguments[0].click();", element);
			Thread.sleep(700);
			
			element = chromeDriver.findElement(By.xpath("//a[@id='bonds']"));
			js.executeScript("arguments[0].click();", element);
			Thread.sleep(1000);
			
			element = chromeDriver.findElement(By.xpath("//a[@id='stocks']"));
			js.executeScript("arguments[0].click();", element);
			Thread.sleep(1000);
             
			element = chromeDriver.findElement(By.xpath("//button[text()='Save Changes']"));
			js.executeScript("arguments[0].click();", element);
			Thread.sleep(1000);
			
			element = chromeDriver.findElement(By.xpath("//button[@data-bb-handler='ok']"));
			js.executeScript("arguments[0].click();", element);
			Thread.sleep(1000);
			
			element = chromeDriver.findElement(By.xpath("//a[@id='user-profile']"));
			js.executeScript("arguments[0].click();", element);
			Thread.sleep(1000);
			
			element = chromeDriver.findElement(By.xpath("//li[@class='header-logout']"));
			js.executeScript("arguments[0].click();", element);
			Thread.sleep(1000);
			
		}	
	
	
	
	@Test
	void testTutorialPage() throws InterruptedException {
		StringBuilder builder = new StringBuilder();
		builder.append(System.getProperty("user.dir"));
		builder.append(relativePath);
		driverPath = builder.toString();
		System.setProperty("webdriver.chrome.driver", driverPath);
		this.chromeDriver =  new ChromeDriver();
		this.chromeDriver.get("http://localhost:3000");
		this.chromeDriver.manage().window().maximize();
		
		chromeDriver.findElement(By.xpath("//a[@href='/tutorial']")).click(); //click to tutorial
		Thread.sleep(1500);
		assertTrue(chromeDriver.findElement(By.cssSelector(".thumbnail#investing")).isDisplayed());
		chromeDriver.findElement(By.cssSelector(".thumbnail#investing")).click();
		Thread.sleep(1500);
		chromeDriver.findElement(By.xpath("//a[@href='#timemoney']")).click();
		Thread.sleep(1500);
		chromeDriver.findElement(By.xpath("//a[@href='#saveacc']")).click();
		Thread.sleep(1500);
		// add side-bar navigation actions
		chromeDriver.navigate().back();
		Thread.sleep(1500);
		chromeDriver.close();
		
}
	
	
}