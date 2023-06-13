package TestNGExamples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterTestExample2 {
	
	@BeforeSuite
	public void SuiteMessageBefore() {
		
		System.out.println("Welcome to suite-1 testing");	
	}
	
	@BeforeTest
	 public void TestingMessage() {
		  System.out.println("About to start testing");	  
	  }
	
	@BeforeClass		
	  public void Login() {
		  System.out.println("Logging in example2");	  
	  }
	
	@BeforeMethod	
	  public void SendMSG() {
		  System.out.println("About to execute Method2");	  
	  }
@Test
public void searchHome() {
	  System.out.println("Searching Home In example2");	  
}
@Test
public void searchBody() {
	  System.out.println("Searching Body In example2");	  
}

@AfterMethod	
public void SendMSG2() {
	  System.out.println("Just executed Method-2");	  
}

@AfterClass
public void logout() {
	  System.out.println("Logging Out");	  
}}
