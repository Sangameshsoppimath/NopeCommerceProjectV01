package www.NopeCommercePages.com;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SortingPage 
{
	WebDriver driver;
	public SortingPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//select[@id='products-orderby']")
	WebElement sortingdropdown;
	
	@FindBy(xpath="//div[@class='item-box']")
	List<WebElement> collectionofproducts;
	
	
	public WebElement clickonsortingdrp()
	{
		return sortingdropdown;
	}
	
	public List<WebElement> getcollectionofproducts()
	{
		return collectionofproducts;
	}
	
}
