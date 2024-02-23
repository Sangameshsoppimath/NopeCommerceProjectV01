package www.NopeCommercePages.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProductPage 
{
	WebDriver driver;
	public SearchProductPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="small-searchterms")
	WebElement searchbox;
	
	@FindBy(xpath="//button[@class='button-1 search-box-button']")
	WebElement searchbutton;
	
	@FindBy(xpath="//h2[@class='product-title']")
	WebElement Listoflaptops;
	
	public void providesearchinput(String laptop)
	{
		searchbox.sendKeys(laptop);;
	}
	public void clickSearchbutton()
	{
		searchbutton.click();
	}
	public String ListOflaptop()
	{
		return Listoflaptops.getText();
	}
	
}
