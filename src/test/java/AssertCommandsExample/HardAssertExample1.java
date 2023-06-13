package AssertCommandsExample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample1 {
  @Test
  public void HelloMsg() {	 
	  String msg ="How are you?" ;
	  Assert.assertEquals(msg,"How are you?", "Message does not match");	  
	  System.out.println("Hard Assertion1 completed");  }
  @Test
  public void HelloMsg2() {	 
	  int age1=16;
	  int age2=10;	  
	  if (age1>age2)
	  {	 System.out.println("Age 1 is greater than age2");
	      Assert.assertTrue(true);
	      }
	      else
	      { System.out.println("Age2 is greater than age1");
	        Assert.assertTrue(false);	  
	        System.out.println("Hard Assertion2 completed"); }
}}
