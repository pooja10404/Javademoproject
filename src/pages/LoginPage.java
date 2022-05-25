package pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import common.BaseTest;

public class LoginPage extends BaseTest{
	
	public LoginPage(){
		//this.driver=BaseTest.driver;
	}
	private WebElement userNameTextBox=BaseTest.driver.findElement(By.id("txtUsername"));
	private WebElement passwordTextBox=BaseTest.driver.findElement(By.id("txtPassword"));
	private WebElement loginButton=BaseTest.driver.findElement(By.id("btnLogin"));
	
	public void userLoginDashboard() {
		
		userNameTextBox.sendKeys("Admin");
		passwordTextBox.sendKeys("admin123");
		loginButton.click();
	}
//	public void initDrivers() {
//		File f1 = new File(".");
//		try {
//			
//			System.setProperty("webdriver.chrome.driver", f1.getCanonicalPath()+f1.separator+"chromedriver");
//
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		driver = new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/");
//	}
	
}
