package steps;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import common.BaseTest;
import pages.DashboardPage;
import pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login  {
	//WebDriver driver;
//	BaseTest baseTest=new BaseTest();
	LoginPage loginPage=new LoginPage();
	DashboardPage dashboardPage=new DashboardPage();
	



	@Given("User enters valid login credentials")
	public void entersUsername() throws InterruptedException {	
		//loginPage.initDrivers();
		loginPage.userLoginDashboard();

	}

	
	@Then("User should be able to login sucessfully")
	public void sucessfullLogin() throws InterruptedException {
		dashboardPage.verifyDashboardPage();

	}

	
}
