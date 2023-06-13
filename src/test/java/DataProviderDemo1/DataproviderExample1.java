package DataProviderDemo1;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataproviderExample1 {	
	WebDriver driver;
	@BeforeClass	
	void setUP() throws InterruptedException
	{
	WebDriverManager.chromedriver().setup();	
	ChromeOptions chromeOptions = new ChromeOptions();
	chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
	driver =new ChromeDriver(chromeOptions);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(4000);
	driver.manage().window().maximize();			
	}	
	
  @Test(dataProvider ="dp")
  public void login(String userName, String pwd) throws InterruptedException
    {
	  
	  driver.findElement(By.xpath("//input[@placeholder='username']")).sendKeys(userName);
	  driver.findElement(By.xpath("//input[@placeholder='password']")).sendKeys(pwd);	  
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  Thread.sleep(4000);
	  String ExpectedTitle ="OrangeHRM";
	  String ActualTitle=driver.getTitle();
	  System.out.println(ActualTitle);
	 
	 //' Assert.assertEquals(ActualTitle, ExpectedTitle);
	  
 
  }
  
  
@AfterClass
  
void teardown() {
	driver.quit();  
} 
  @DataProvider(name ="dp")  
  String [][] loginData()  {
	  String data [] [] = {
			  {"Admin", "admin123"},
			  {"admin", "admin1"},
			  {"Admin", "admin123"},
			  {"narinder.gupta@gmail.com", "Test423"}
	  };
	  return data;	
  }
  }
  
  
 

