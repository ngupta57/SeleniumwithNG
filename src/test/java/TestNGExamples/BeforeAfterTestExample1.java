package TestNGExamples;

import org.testng.annotations.*;

public class BeforeAfterTestExample1 {
	
	@AfterSuite
	
	public void thankingTeamPostSuite() {
		System.out.println("tHANKS FOR ALL YOUR SUPPORT-WE CONCLUDED TESTING FOR THE SUITE1");
	}
	
	
	@BeforeClass		
	  public void Login() {
		  System.out.println("Logging in");	  
	  }
	
	@BeforeMethod	
	  public void SendMSG() {
		  System.out.println("About to execute Method");	  
	  }
  @Test
  public void searchHome() {
	  System.out.println("Searching Home In example1");	  
  }
  @Test
  public void searchBody() {
	  System.out.println("Searching Body In example1");	  
  }
  
  @AfterMethod	
  public void SendMSG2() {
	  System.out.println("Just executed Method");	  
  }
  
  @AfterClass
  public void logout() {
	  System.out.println("Logging Out");	  
  }
  @AfterTest
  public void TestingCompMSG() {
	  System.out.println("TESTING OF TEST COMPLETED.");	  
  }
  
}
