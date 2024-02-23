package www.NopeCommercePages.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage 
{
	WebDriver driver;
	public WishlistPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
 
	@FindBy(id="//div[@class='add-to-wishlist']")
	WebElement wishlistbutton;
	
	@FindBy(xpath="//span[@class='close']")
	WebElement closenotification;
	
	@FindBy(xpath="//a[@class='ico-wishlist']")
	WebElement ClickOnWislist;
	
	@FindBy(xpath="//span[@class='sku-number']")
	WebElement productwishlist;
	
	public void clickOnWishlist()
	{
		wishlistbutton.click();
	}
	public void clickWishlistNotification()
	{
		closenotification.click();
	}
	
	public void getwishlistmsg()
	{
		ClickOnWislist.click();;
	}
	public void getListofproducts()
	{
		productwishlist.isDisplayed();
	}
}
