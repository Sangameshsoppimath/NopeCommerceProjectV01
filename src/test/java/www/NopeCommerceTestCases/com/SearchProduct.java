package www.NopeCommerceTestCases.com;

import java.io.IOException;

import org.testng.annotations.Test;

import www.NopeCommercePages.com.SearchProductPage;
import www.NopeCommercsUtils.com.AssertionHepler;

public class SearchProduct extends Base
{

	@Test
	public void serachProduct() throws IOException, InterruptedException
	{
		test=extent.createTest("Search");
		
		SearchProductPage srch=new SearchProductPage(driver);
		Thread.sleep(2000);
		srch.providesearchinput("Lenovo Thinkpad X1 Carbon Laptop");
		Thread.sleep(2000);
		srch.clickSearchbutton();
		Thread.sleep(2000);
		AssertionHepler.searchedItemConfirmation(srch.ListOflaptop(), "Lenovo Thinkpad X1 Carbon Laptop");
	}
	
}
