package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {

	WebDriver driver;
	// login data
	String userName = "demo@techfios.com";
	String password = "abc123";
	//Test data
	String dashboard = "Dashboard";
	String addCustomer = "Add Contact";
	String fullName = "Istar Carman";
	String company = "Techfios";
	String email = "demo1@techfios.com";
	String phone ="123456789";
	String country = "Texas";

	@Test
	public void userShouldBeAbleToAddCustomer() throws InterruptedException {
       
		//calling the init method.
		
		driver = BrowserFactory.init();
		//calling LoginPage.
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.performLogin(userName, password);

		DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardpage.verifyDashboardPage(dashboard);
		dashboardpage.clickOnCustomerMenuButton();
		dashboardpage.clickOnAddCustomerMenuButton();
		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.verifyAddCustomerPage(addCustomer);
		addCustomerPage.insertFullName(fullName);
		addCustomerPage.insertComapnyName(company);
		addCustomerPage.insertEmail(email);
	}

}
