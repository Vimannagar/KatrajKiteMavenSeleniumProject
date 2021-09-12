package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.ExtentListeners;

public class DashBoardTest extends ExtentListeners {
	
	
	@Test(priority = 2)
	public void searchShares()
	{
		db.searchInstruments();
		test.info("Search for the shares has been done");
		
	}
	
	@Test(priority = 3)
	public void buyShares()
	{
		db.buySharesWithMarketClose();
		test.info("order has been placed but market is closed");
		Assert.assertEquals(false, true);
	
		
		
	}
	
	
	
	
	
	

}
