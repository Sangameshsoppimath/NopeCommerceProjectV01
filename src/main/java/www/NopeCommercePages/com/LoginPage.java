package www.NopeCommercePages.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		super();
		//this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@class='ico-login']")
	WebElement MainLogin;
	@FindBy(xpath="//input[@class='email']")
	WebElement Email;
	@FindBy(xpath="//input[@class='password']")
	WebElement Password;
	@FindBy(xpath="//button[@class='button-1 login-button']")
	WebElement Loginbutton;
	@FindBy(xpath="//div[@class='page-title']")
	WebElement NegTesterrormsg;
	
	public void ClickOnMainLogin()
	{
		 MainLogin.click();
	}
	public void EnterEmail(String UserEmail)
	{
		Email.sendKeys(UserEmail);
	}
	public void EnterPassword(String UserPassword)
	{
		Password.sendKeys(UserPassword);
	}
	public void ClickOnLoginbutton()
	{
		Loginbutton.click();
	}
	public String getNegTesterrormsg()
	{
		return NegTesterrormsg.getText();
	}

}
