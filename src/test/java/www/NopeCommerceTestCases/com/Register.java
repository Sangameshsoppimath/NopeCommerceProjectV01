package www.NopeCommerceTestCases.com;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import www.NopeCommercePages.com.RegisterPage;

public class Register extends Base
{
	
	@Test(priority=1,dataProvider="Register data")
	public void register(String Fname,String Lname,String day,String Month,String year,String email,String companyname,String password,String confirmpass) throws InterruptedException
	{
		test=extent.createTest("Register","Registered Successfully");
		
		RegisterPage rp=new RegisterPage(driver);
		rp.clickmaiRegister();
		www.NopeCommercsUtils.com.AssertionHepler.titleOfPage(driver.findElement(By.xpath("//div[@class='page-title']")).getText(), "Register", "Title of page is correct");
		rp.SelectGender();
		Thread.sleep(2000);
		rp.EnterFname(Fname);
		Thread.sleep(2000);
		rp.EnterLname(Lname);
		Thread.sleep(2000);
		rp.Selectday(day);
		Thread.sleep(2000);
		rp.Selectmonth(Month);
		Thread.sleep(2000);
		rp.Selecyear(year);
		Thread.sleep(2000);
		rp.EnterUsermail(email);
		Thread.sleep(2000);
		rp.EnterCompanyName(companyname);
		Thread.sleep(2000);
		rp.EnterUserPassword(password);
		Thread.sleep(2000);
		rp.EnterConfirmuserPass(confirmpass);
		Thread.sleep(2000);
		rp.ClickOnRegiButton();
		Thread.sleep(2000);
		www.NopeCommercsUtils.com.AssertionHepler.registerconfirmation(driver.findElement(By.xpath("//div[@class='result']")).getText(), "Your registration completed", "Resgiter Coonfirmation message");
		
	}
	
	@DataProvider(name="Register data")
	public Object[][] getdata()
	{
		return new Object[][]{ {"Sanman","Manpan","10","March","2010","sangrsfdddgr@gmail.com","SnamNaLimited","123456","123456"},
		{"Sanmdan","Manpan","10","March","2010","sangrsddfeddr@gmail.com","SnamNaLimdited","123456","123456"}};
	

	}

}
