package AllAnnotation;

import org.testng.annotations.*;

public class AllAnExample {
	
	
	@BeforeSuite	
	public void beforeSuite() {
		System.out.println("This is before Suite Testing-Welcome");
		}
	@AfterSuite
	public void afterSuite() {
		System.out.println("This is after suite Message-Thanks for your support for testing");
	}	
	@BeforeTest
	public void beforeTest () {
		System.out.println("This is before test message -starting testing for test");		
	}
	@AfterTest
	public void afterTest () {
		System.out.println("This is after test message - testing concluded for test");		
	}
	@BeforeClass
	public void beforeClass () {
		System.out.println("This is BeforeClass message - Logging in");		
	}
	@AfterClass
	public void afterClass () {
		System.out.println("This is after Class message - Logging out");		
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is before Method message -about To execute Method-Please remain out of test env");		
	}
	@AfterMethod
	public void afterMethod () {
		System.out.println("This is after Method message - Executed method just now");		
	}	
  @Test(priority=1)
  public void TestMethod1() {
	  System.out.println("Executing TestMethod1");
  }
  @Test(priority=2)
  public void TestMehod2() {
	  System.out.println("Executing TestMethod 2");
  }
  @Test(priority=3)
  public void TestMethod3() {
	  System.out.println("Executing TestMethod 3");
  }
}
