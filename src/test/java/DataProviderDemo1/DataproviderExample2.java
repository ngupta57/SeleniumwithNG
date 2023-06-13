package DataProviderDemo1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataproviderExample2 {	
	WebDriver driver;	
  @Test(dataProvider ="dp")
  public void login(String userName, String pwd) throws InterruptedException
    {
	    WebDriverManager.chromedriver().setup();	
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		driver =new ChromeDriver(chromeOptions);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		driver.manage().window().maximize();	  
	    driver.findElement(By.name("username")).sendKeys(userName);
	    driver.findElement(By.name("password")).sendKeys(pwd);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(4000);
	    String ExpectedTitle ="OrangeHRM";
	    String ActualTitle=driver.getTitle();
	    System.out.println("The actuial title"+ ActualTitle);
	    Assert.assertEquals(ActualTitle, ExpectedTitle,"title mismatch found " );	 
	    driver.quit();   
  }
  @DataProvider(name ="dp",indices= {0,2,3})  
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
  
  
 

