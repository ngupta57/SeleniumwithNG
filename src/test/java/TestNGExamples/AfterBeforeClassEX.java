package TestNGExamples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AfterBeforeClassEX {
	
	 @BeforeClass
	  public void login1() {
		  System.out.println("loging in-1");  
	  }
  @Test
  public void advancedSearch1(){
	  System.out.println("its advanced search1 method");
  }
  @Test
  
  public void search1() {
	  System.out.println("its search1 method");  
  }
  @AfterClass
  public void logout1() {
	  System.out.println("loging out1");  
  }
  
}
