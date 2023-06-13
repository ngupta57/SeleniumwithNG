package dependecyMethodExample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDependMethod {
  @Test(priority=1)
  public void launchApp() {	  
	 System.out.println("APP LAUNCHED");
	 Assert.assertTrue(true);
  }
  
  @Test(priority=2, dependsOnMethods= {"launchApp"})
  
  public void login() {
	  Assert.assertTrue(false, "Test failed");
  } 
  
  @Test(priority=3, dependsOnMethods= {"launchApp"})  
  public void Find() {
	  Assert.assertTrue(true, "Test passed");
  }
  @Test(priority=4, dependsOnMethods= {"launchApp"})  
  public void Findall() {
	  Assert.assertTrue(true, "Test passed");
  }
  @Test(priority=5, dependsOnMethods= {"login","launchApp"})  
  public void FindallNew() {
	  Assert.assertTrue(true, "find all new Test passed");
  }
}
