package co.frontend.selemium.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("http://localhost:3000");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='/tutorial']")).click(); //click to tutorial
		Thread.sleep(1500);
		driver.findElement(By.cssSelector(".thumbnail#investing")).click();
		Thread.sleep(1500);
	//	driver.findElement(By.xpath("//subtopic-name-label[timemoney]")).click();
	//	Thread.sleep(1500);
		// add side-bar navigation actions  
	//	driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		// basically return to home page
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		Thread.sleep(1500);
		driver.findElement(By.className("login-email")).sendKeys("admin@rbc.com");
		Thread.sleep(1500);
		driver.findElement(By.className("login-password")).sendKeys("ubctester");
		Thread.sleep(1500);
		driver.findElement(By.className("login-btn")).click();
		// add some log-out
		Thread.sleep(15000);
		driver.close();
		//driver.findElement(By.cssSelector(".btn.btn-primary")).click(); //click to simulation
		//driver.findElement()
	}
}
