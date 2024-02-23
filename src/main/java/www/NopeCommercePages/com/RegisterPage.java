package www.NopeCommercePages.com;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RegisterPage 
{
	WebDriver driver;
	public RegisterPage(WebDriver driver)
	{
		super();//this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='ico-register']")
	WebElement maiRegister;
	
	@FindBy(xpath="//input[@id='gender-male']")
	WebElement Gender;
	@FindBy(id="FirstName")
	WebElement Fname;
	@FindBy(id="LastName")
	WebElement Lname;
	@FindBy(xpath="//select[@name='DateOfBirthDay']/option")
	List<WebElement> day;
	@FindBy(xpath="//select[@name='DateOfBirthMonth']/option")
	List<WebElement> month;
	@FindBy(xpath="//select[@name='DateOfBirthYear']/option")
	List<WebElement> year;
	@FindBy(id="Email")
	WebElement Usermail;
	@FindBy(id="Company")
	WebElement CompanyName;
	@FindBy(id="Password")
	WebElement UserPassword;
	@FindBy(id="ConfirmPassword")
	WebElement ConfirmuserPass;
	@FindBy(id="register-button")
	WebElement RegiButton;
	@FindBy(xpath="//span[@id='FirstName-error']")
	WebElement errorMsg;
	
	
	public void clickmaiRegister()
	{
		maiRegister.click();
	}
	
	
	public void SelectGender()
	{
		Gender.click();
	
	}
	public void EnterFname(String UserFirstName)
	{
		Fname.sendKeys(UserFirstName);
	}
	public void EnterLname(String UserLastName)
	{
		Lname.sendKeys(UserLastName);
	}
	public void Selectday(String desiredDay)
	{
		day.stream().filter(option -> option.getText()
		.equals(desiredDay)).findFirst().ifPresent(WebElement::click);
		/*this code snippet is attempting to find the first element 
		in the collection day whose text matches the value of desiredDay, and 
		if such an element is found, it performs a click operation on it using 
		the WebElement::click method reference.*/

	}
	public void Selectmonth(String DesiredMonth)
	{
		month.stream().filter(monthsoption->monthsoption.getText()
		.equals(DesiredMonth)).findFirst().ifPresent(WebElement::click);
	}
	public void Selecyear(String DesiredYear)
	{
		year.stream().filter(yearoption->yearoption.getText()
		.equals(DesiredYear)).findFirst().ifPresent(WebElement::click);
	}
	public void EnterUsermail(String UserEmail)
	{
		Usermail.sendKeys(UserEmail);
	}
	public void EnterCompanyName(String UserCompanyName)
	{
		CompanyName.sendKeys(UserCompanyName);
	}
	public void EnterUserPassword(String UserUserPassword)
	{
		UserPassword.sendKeys(UserUserPassword);
	}
	public void EnterConfirmuserPass(String UserConfirmuserPass)
	{
		ConfirmuserPass.sendKeys(UserConfirmuserPass);
	}
	public void ClickOnRegiButton()
	{
		RegiButton.click();
	}
	public void fnameErrormsg()
	{
		String act = errorMsg.getText();
		String exp = "First name is required.";	
		Assert.assertEquals(act, exp);
		System.out.println(act);
	}
}
