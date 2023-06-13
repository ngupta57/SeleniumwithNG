package GroupsTestNG;


/* Grouping the tests the following 
 * groups of tests are to be created
 * Class1Test 1-loginWithEmail() - Sanity & Regression
 * Class1Test 2-loginWithGoogle() - Sanity & Regression
 * Class1Test 3-forgotPWD() - Functional
 * Class1Test 4-SignupWithEmail() - Sanity 
 * Class1Test 5-SignupWithFacebook() -Sanity & Regression
 * Class1Test 6-SignupWithTwitter()-Functional
 * Class1Test 7-contactUs()--Functional
 * Class1Test 8-reqCalendar()-Regression  
 *  */

import org.testng.annotations.Test;

public class GroupExampleCl1 {
  @Test(priority=1,groups ={"Sanity","Regression"})
  public void loginWithEmail() {
	  System.out.println("Launched & loggedin success--test 1");
  }  
  @Test(priority=2,groups ={"Sanity","Regression"}) 
  public void loginWithGoogle() {
	  System.out.println("logged in via google success--test 2");	  
  }
  @Test(priority=3,groups ={"Functional"})  
  public void forgotPWD() {
	  System.out.println("reset pwd success--test 3");  
  }
  @Test(priority=4,groups ={"Sanity"})    
  public void SignupWithEmail()  {
	  System.out.println("signed up with email  success--test 4");  
  }
  @Test(priority=5,groups ={"Sanity","Regression"})  
  public void SignupWithFacebook(){	  
	  System.out.println("SignupWithFacebook success--test 5");
  }
  @Test(priority=6,groups ={"Functional"})    
  public void SignupWithTwitter() {	  
	  System.out.println("signed up with Twitter  success--test 6");
  }
  @Test(priority=7,groups ={"Functional"})    
  public void contactUs() {
	  System.out.println("ContactUs success--test 7");  
  }
  @Test(priority=8,groups ={"Regression"})    
  public void reqCalendar() {
	  System.out.println("cal req success--test 8");
	  
  }
 
}
