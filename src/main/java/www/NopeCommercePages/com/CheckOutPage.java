package www.NopeCommercePages.com;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage 
{
	WebDriver driver;
	public CheckOutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="termsofservice")
	WebElement termsCheckbox;
	@FindBy(id="checkout")
	WebElement checkOutbutton;
	@FindBy(xpath="//button[@class='button-1 checkout-as-guest-button']")
	WebElement asGuest;
	@FindBy(id="BillingNewAddress_FirstName")
	WebElement billFname;
	@FindBy(id="BillingNewAddress_LastName")
	WebElement billLname;
	@FindBy(id="BillingNewAddress_Email")
	WebElement billEmail;
	@FindBy(xpath="//select[@name='BillingNewAddress.CountryId']/option")
	List<WebElement> countryDropdown;
	@FindBy(id="BillingNewAddress_City")
	WebElement billCity;
	@FindBy(id="BillingNewAddress_Address1")
	WebElement billAddress;
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	WebElement billZipcode;
	@FindBy(id="BillingNewAddress_PhoneNumber")
	WebElement billPhoneNumber;
	@FindBy(xpath="//div[@id='billing-buttons-container']")
	WebElement BillNext;
	@FindBy(xpath="//button[@class='button-1 shipping-method-next-step-button']")
	WebElement shippingNextbutton;
	@FindBy(xpath="//button[@class='button-1 payment-method-next-step-button']")
	WebElement paymentNextbutton;
	@FindBy(xpath="//button[@class='button-1 payment-info-next-step-button']")
	WebElement paymentinfonextbutton;
	@FindBy(xpath="//button[@class='button-1 confirm-order-next-step-button']")
	WebElement confirmationordernextbutton;
	@FindBy(xpath="(//div[@class='title'])[1]")
	WebElement orderconfirmationmsg;
	@FindBy(xpath="//div[@class='details-link']")
	WebElement LatContinuebutton;
	
	
	public void clicktermsCheckbox()
	{
		termsCheckbox.click();
	}
	public void clickcheckOutbutton()
	{
		checkOutbutton.click();
	}
	public void clickasGuest()
	{
		asGuest.click();
	}
	public void enterbillFname(String Fname)
	{
		billFname.sendKeys(Fname);
	}
	public void enterbillLname(String Lname)
	{
		billLname.sendKeys(Lname);
	}
	public void enterbillEmail(String email)
	{
		billEmail.sendKeys(email);
	}
	public void selectcountryDropdown(String DesiredCountry)
	{
		countryDropdown.stream().filter(countries->countries.getText().equals(DesiredCountry)).findFirst().ifPresent(WebElement::click);;
	}
	public void enterbillCity(String city)
	{
		billCity.sendKeys(city);
	}
	public void enterbillAddress(String address)
	{
		billAddress.sendKeys(address);
	}
	public void enterbillZipcode(String pincode)
	{
		billZipcode.sendKeys(pincode);
	}
	public void enterbillPhoneNumber(String Phnumber)
	{
		billPhoneNumber.sendKeys(Phnumber);
	}
	public void clickBillNext()
	{
		BillNext.click();
	}
	public void clickshippingNextbutton()
	{
		shippingNextbutton.click();
	}
	public void clickpaymentNextbutton()
	{
		paymentNextbutton.click();
	}
	public void clickpaymentinfonextbutton()
	{
		paymentinfonextbutton.click();
	}
	public void clickconfirmationordernextbutton()
	{
		confirmationordernextbutton.click();
	}
	public String getorderconfirmationmsg()
	{
		return orderconfirmationmsg.getText();
	}
	public void clickLatContinuebutton()
	{
		LatContinuebutton.click();
	}
}
