package www.NopeCommercePages.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddingitemtocartPage 
{
	WebDriver driver;
	public AddingitemtocartPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[@href='/computers'])[1]")
	WebElement Computer;
	@FindBy(xpath="//img[@title='Show products in category Notebooks']")
	WebElement NoteBook;
	@FindBy(xpath="//a[@title='Show details for Asus N551JK-XO076H Laptop']")
	WebElement AsusNotebook;
	@FindBy(id="add-to-cart-button-5")
	WebElement addcartbutton;
	@FindBy(xpath="//span[@class='close']")
	WebElement closeconf;
	@FindBy(id="topcartlink")
	WebElement movetocartele;
	@FindBy(xpath="//button[@class='button-1 cart-button']")
	WebElement gotocartpage;
	@FindBy(xpath="//p[@class='content']")
	WebElement addcartsucssmsg;
	
	
	public void clickComputer()
	{
		Computer.click();
	
	}
	public void clickNotebook()
	{
		NoteBook.click();
	}
	public void selectAsusnotebook()
	{
		AsusNotebook.click();
	}
	public void clickAddtocart()
	{
		addcartbutton.click();
	}
	public void clickClose()
	{
		closeconf.click();
	}
	public WebElement clickcartlist()
	{
		return movetocartele;
	}
	public WebElement clickGotocartpage()
	{
		return gotocartpage;
	}
	public String succsmsg()
	{
		return addcartsucssmsg.getText();
	}
	
	
}
