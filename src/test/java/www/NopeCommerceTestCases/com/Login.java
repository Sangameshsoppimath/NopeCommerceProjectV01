package www.NopeCommerceTestCases.com;

import org.testng.annotations.Test;

import www.NopeCommercePages.com.LoginPage;

public class Login extends Base
{
	LoginPage lp=new LoginPage(driver);
	
	@Test(priority=1)
	public void PosTestlog() throws InterruptedException
	{
		test=extent.createTest("Login Positive Testcase","Logged in Successfully");
		LoginPage lp=new LoginPage(driver);
		lp.ClickOnMainLogin();
		Thread.sleep(2000);
		lp.EnterEmail("sanman12@gmail.com");
		Thread.sleep(2000);
		lp.EnterPassword("San@123");
		Thread.sleep(2000);
		lp.ClickOnLoginbutton();
	}
	@Test(priority=2)
	public void NegTestlog() throws InterruptedException
	{
		test=extent.createTest("Login Negetive Testcase","User is not able to login with invalid credentials");
		LoginPage lp=new LoginPage(driver);
		lp.ClickOnMainLogin();
		Thread.sleep(2000);
		lp.EnterEmail("sasdvervn@gmail.com");
		Thread.sleep(2000);
		lp.EnterPassword("2t3gwvreg45h");
		Thread.sleep(2000);
		lp.ClickOnLoginbutton();
		www.NopeCommercsUtils.com.AssertionHepler.NegTestlogerrormsg(lp.getNegTesterrormsg(), "Welcome, Please Sign In!");
	
	}
	
}
