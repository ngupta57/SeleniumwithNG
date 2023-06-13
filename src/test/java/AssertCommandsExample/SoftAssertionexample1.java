package AssertCommandsExample;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftAssertionexample1 {
  @Test
  public void msg() {
	 int salary = 2000;
	 String Name ="Radha";
	  System.out.println("going to print message");
	  SoftAssert cs = new SoftAssert();
	  cs.assertEquals(salary, 1000);
	  System.out.println("SOFT aSSERTION 1 EXECUTED");
	  if (Name == "Rata") {
		  Assert.fail();
	  }else
	  {System.out.println("Name is correct");
	   cs.assertNotEquals(Name, "gori");
	  }
	  cs.assertAll();
	  
	  
  }
}
