package runner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import common.BaseTest;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	
@CucumberOptions(tags = "@RunWith", features = "features", glue = {"steps"},plugin = {"pretty"},strict = true) 
	public class TestRunner extends AbstractTestNGCucumberTests {
	@BeforeClass
	public static void InitializeClass() {
		BaseTest baseTest=new BaseTest();
		baseTest.initDrivers();
	}
	
	@AfterClass
	public static void tearDown() {
		BaseTest.driver.close();
		BaseTest.driver.quit();
		BaseTest.driver=null;
	}
	}

