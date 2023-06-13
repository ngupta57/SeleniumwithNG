package TestNGExamples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example_Annotation2 {
	
	 @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("login");
	  }
	
	 @Test
	  public void search() {
		  System.out.println("SEARCH METHOD");
	  }
	 
	  @Test
	  public void advSearch() {
		  System.out.println("Advanced Search Method");
	  }
	  @AfterMethod
	  public void logout() {
		  System.out.println("logging out");	  
	  }
   
  }

