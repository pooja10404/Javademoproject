package pages;

import org.testng.Assert;

import common.BaseTest;

public class DashboardPage extends BaseTest {
	
	public DashboardPage(){
		//this.driver=BaseTest.driver;
	}
	public void verifyDashboardPage() {
		String url=BaseTest.driver.getCurrentUrl();
		if(url.contains("dashboard")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
}
