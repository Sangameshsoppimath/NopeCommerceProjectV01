package www.NopeCommerceTestCases.com;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import www.NopeCommercePages.com.AddingitemtocartPage;
import www.NopeCommercePages.com.CheckOutPage;

public class AddingItemToCart extends Base
{
	@Test
	
	public void assuslaptopaddtocart() throws InterruptedException
	{
		test=extent.createTest("AddToCart");
		AddingitemtocartPage ac=new AddingitemtocartPage(driver);
		ac.clickComputer();
		Thread.sleep(2000);
		ac.clickNotebook();
		Thread.sleep(2000);
		ac.selectAsusnotebook();
		Thread.sleep(2000);
		ac.clickAddtocart();
		Thread.sleep(2000);
		ac.clickClose();
		www.NopeCommercsUtils.com.AssertionHepler.addtocartsuccsessmsg(ac.succsmsg(), "The product has been added to your shopping cart", "added successfully");
		Actions act=new Actions(driver);
		act.moveToElement(ac.clickcartlist()).build().perform();
		Thread.sleep(3000);
		act.moveToElement(ac.clickGotocartpage()).click().build().perform();
		CheckOutPage ch=new CheckOutPage(driver);
		ch.clicktermsCheckbox();
		Thread.sleep(2000);
		ch.clickcheckOutbutton();
		Thread.sleep(2000);
		ch.clickasGuest();
		ch.enterbillFname("sanam");
		ch.enterbillLname("manaman");
		ch.enterbillEmail("sanamna@gmail.com");
		ch.selectcountryDropdown("India");
		ch.enterbillCity("sancity");
		ch.enterbillAddress("sancity 1st cross main road Newyork");
		ch.enterbillZipcode("123456");
		ch.enterbillPhoneNumber("1234567898");
		ch.clickBillNext();
		ch.clickshippingNextbutton();
		ch.clickpaymentNextbutton();
		ch.clickpaymentinfonextbutton();
		ch.clickconfirmationordernextbutton();
		www.NopeCommercsUtils.com.AssertionHepler.orderConfirmationmsg(ch.getorderconfirmationmsg(), "Billing Address");
		ch.clickLatContinuebutton();
		
		
	}

}
