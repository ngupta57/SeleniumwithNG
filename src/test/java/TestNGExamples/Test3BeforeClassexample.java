package TestNGExamples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Test3BeforeClassexample {
	WebDriver driver;	
	//method with test annotation and priority flag
	  @BeforeClass
	  public void setWebDriver() throws InterruptedException {
		  WebDriverManager.chromedriver().setup();
		  ChromeOptions chromeOptions = new ChromeOptions();
		  chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		  driver = new ChromeDriver(chromeOptions);	  
		  //launch browser & navigate to Facebook.com
		  driver.get("https://www.facebook.com");	 
		  driver.manage().window().maximize();
		  Thread.sleep(5000);
	  }
	  @Test(priority=1)
	  public void loggingIn() {
		  //find webelement via xpath
		  driver.findElement(By.xpath("//input[@id='email' or @name= 'email']")).sendKeys("narinder.gupta@gmail.com");
			//find element by xpath Tag Attribute 1 and 2
			driver.findElement(By.xpath("//input[@name='pass' and @id= 'pass']")).sendKeys("Americaisbest23?");
			//click login button
			//find element by cssSelector tag& attribute
			driver.findElement(By.cssSelector("button[name=login]")).click();
	  }
	  @AfterClass
	  public void teardown() {
		  System.out.println("about to close browser");
		  driver.close();
		  driver.quit();
	  }}
	  
			
  

























	

	
 
	  
  
  
  
