package TestNGExamples;

import org.testng.annotations.Test;

public class Day1Test {
  @Test()
  public void setUp() {
	  System.out.println("Setting up test environment-STEP1");
  }
  @Test
  public void logIn() {
	  System.out.println("loggingin to app -step-2");	  
  }
  @Test
  public void logOut() {
	  System.out.println("loggingout to app -step-3");	  
}
  }
