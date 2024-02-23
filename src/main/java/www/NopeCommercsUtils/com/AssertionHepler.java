package www.NopeCommercsUtils.com;

import org.testng.Assert;

public class AssertionHepler 
{
	public static void titleOfPage(String actualtitle,String Expectedtitle,String message)
	{
		Assert.assertEquals(actualtitle, Expectedtitle,message);
	}
	
	public static void registerconfirmation(String actuaconfirmation,String Expectedconfirmation,String message)
	{
		Assert.assertEquals(actuaconfirmation, Expectedconfirmation,message);
	}
	public static void addtocartsuccsessmsg(String actualsussessmsg,String Expectedsucsesmsg,String message)
	{
		Assert.assertEquals(actualsussessmsg, Expectedsucsesmsg,message);
	}
	public static void orderConfirmationmsg(String actaulordersuccesmsg, String expordersuccesmsg)
	{
		Assert.assertEquals(actaulordersuccesmsg, expordersuccesmsg);
	}
	public static void NegTestlogerrormsg(String actualnegerrormsg ,String expnegerrormsg)
	{
		Assert.assertEquals(actualnegerrormsg, expnegerrormsg);
	}
	public static void searchedItemConfirmation(String actsearchresult,String expsearcheditemresult)
	{
		
		Assert.assertEquals(actsearchresult, expsearcheditemresult);
	}
	public static void wishlistsuccesmsg(String actwishlistmsg,String expwishlistmsg)
	{
		Assert.assertEquals(actwishlistmsg, expwishlistmsg);
	}
	
	
}
