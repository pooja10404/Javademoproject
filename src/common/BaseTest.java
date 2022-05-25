package common;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	public static WebDriver driver=null;
	public BaseTest(){
		
	}
//	@BeforeClass
	public void initDrivers() {
		File f1 = new File(".");
		try {
			
			System.setProperty("webdriver.chrome.driver", f1.getCanonicalPath()+f1.separator+"chromedriver");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	
}
