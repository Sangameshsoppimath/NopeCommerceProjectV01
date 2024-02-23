package www.NopeCommerceTestCases.com;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import www.NopeCommercePages.com.AddingitemtocartPage;
import www.NopeCommercePages.com.SortingPage;

public class Sorting extends Base
{
	@Test
	public void sortingProductByZtoA() throws InterruptedException
	{
		test=extent.createTest("sortingProductByZtoA");
		AddingitemtocartPage ac= new AddingitemtocartPage(driver);
		Thread.sleep(2000);
		ac.clickComputer();
		Thread.sleep(2000);
		ac.clickNotebook();
		Thread.sleep(2000);
		SortingPage sr=new SortingPage(driver);
		Select s=new Select(sr.clickonsortingdrp());
		s.selectByVisibleText("Name: Z to A");
		List<WebElement> nosort = sr.getcollectionofproducts();
		List<String> oglist = nosort.stream().map(ss->ss.getText()).collect(Collectors.toList());
		List<String> aftersort = nosort.stream().map(ss->ss.getText()).sorted().collect(Collectors.toList());
		Assert.assertEquals(oglist, aftersort);
		
	}

	

	
}
