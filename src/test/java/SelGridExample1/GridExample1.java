package SelGridExample1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GridExample1 {	
	WebDriver driver;	
	String url ="https://www.facebook.com/";
	String hubURL= "http://172.16.0.30:4444";
	String bname ="chrome";
	
	@Test
	public void login1() throws MalformedURLException, InterruptedException {
		System.out.println("login1 test is starting");
		DesiredCapabilities dc =new DesiredCapabilities();
		dc.setBrowserName(bname);
		dc.setPlatform(Platform.WIN11);
		WebDriverManager.chromedriver().setup();
		  ChromeOptions chromeOptions = new ChromeOptions();
		  chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		  driver = new RemoteWebDriver(new URL(hubURL),dc);	  
		  //launch browser & navigate to Facebook.com
		  driver.get(url);	 
		  driver.manage().window().maximize();
		  Thread.sleep(5000);
		//find webelement via xpath
		  driver.findElement(By.xpath("//input[@id='email' or @name= 'email']")).sendKeys("narinder.gupta@gmail.com");
			//find element by xpath Tag Attribute 1 and 2
			driver.findElement(By.xpath("//input[@name='pass' and @id= 'pass']")).sendKeys("Americaisbest23?");
			//click login button
			//find element by cssSelector tag& attribute
			driver.findElement(By.cssSelector("button[name=login]")).click();
			 System.out.println("about to close browser");
			  driver.close();
			  driver.quit();
			  System.out.println("Test1 ended");
	  }	
	@Test
	public void login2() throws MalformedURLException, InterruptedException {
		System.out.println("login 2 test is starting");
		DesiredCapabilities dc =new DesiredCapabilities();
		dc.setBrowserName(bname);
		dc.setPlatform(Platform.WIN11);
		WebDriverManager.chromedriver().setup();
		  ChromeOptions chromeOptions = new ChromeOptions();
		  chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		  driver = new RemoteWebDriver(new URL(hubURL),dc);	  
		  //launch browser & navigate to Facebook.com
		  driver.get(url);	 
		  driver.manage().window().maximize();
		  Thread.sleep(5000);
		//find webelement via xpath
		  driver.findElement(By.xpath("//input[@id='email' or @name= 'email']")).sendKeys("narinder.gupta@gmail.com");
			//find element by xpath Tag Attribute 1 and 2
			driver.findElement(By.xpath("//input[@name='pass' and @id= 'pass']")).sendKeys("Americaisbest23?");
			//click login button
			//find element by cssSelector tag& attribute
			driver.findElement(By.cssSelector("button[name=login]")).click();
			 System.out.println("about to close browser");
			  driver.close();
			  driver.quit();
			  System.out.println("Test2 ended");
	  }	
	
	@Test
	public void login3() throws MalformedURLException, InterruptedException {
		System.out.println("login 3 test is starting");
		DesiredCapabilities dc =new DesiredCapabilities();
		dc.setBrowserName(bname);
		dc.setPlatform(Platform.WIN11);
		WebDriverManager.chromedriver().setup();
		  ChromeOptions chromeOptions = new ChromeOptions();
		  chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		  driver = new RemoteWebDriver(new URL(hubURL),dc);	  
		  //launch browser & navigate to Facebook.com
		  driver.get(url);	 
		  driver.manage().window().maximize();
		  Thread.sleep(5000);
		//find webelement via xpath
		  driver.findElement(By.xpath("//input[@id='email' or @name= 'email']")).sendKeys("narinder.gupta@gmail.com");
			//find element by xpath Tag Attribute 1 and 2
			driver.findElement(By.xpath("//input[@name='pass' and @id= 'pass']")).sendKeys("Americaisbest23?");
			//click login button
			//find element by cssSelector tag& attribute
			driver.findElement(By.cssSelector("button[name=login]")).click();
			 System.out.println("about to close browser");
			  driver.close();
			  driver.quit();
			  System.out.println("Test3 ended");
	  }	
	

}
