package testcases;

import org.testng.annotations.Test;

public class DashBoardTest extends BaseTest {
	
	
	@Test(priority = 2)
	public void searchShares()
	{
		db.searchInstruments();
	}
	
	
	

}
