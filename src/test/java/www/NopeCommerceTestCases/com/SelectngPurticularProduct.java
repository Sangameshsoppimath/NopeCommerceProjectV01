package www.NopeCommerceTestCases.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import www.NopeCommercePages.com.SearchProductPage;

public class SelectngPurticularProduct extends Base
{
	@Test
	public void searchProductDyanamically() throws InterruptedException
	{
		test=extent.createTest("Seleted Purticular laptop");
		SearchProductPage srch=new SearchProductPage(driver);
		Thread.sleep(2000);
		srch.providesearchinput("Laptop");
		Thread.sleep(2000);
		srch.clickSearchbutton();
		Thread.sleep(2000);
		String deriserdlaptop = "Asus N551JK-XO076H Laptop";
		Thread.sleep(2000);
		List<WebElement> listoflaptops = driver.findElements(By.xpath("//h2[@class='product-title']"));
		listoflaptops.stream().filter(laptoplist->laptoplist.getText().equals(deriserdlaptop)).findFirst().ifPresent(WebElement::click);
	}
	
				
}
