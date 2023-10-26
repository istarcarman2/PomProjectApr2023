package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {

	WebDriver driver;
	// login data
	String userName = "demo@techfios.com";
	String password = "abc123";
	String dashboard = "Dashboard";

	@Test
	public void validUserShouldBeAbleToLogin() {

		driver = BrowserFactory.init();
      // created object for LoginPage.
		// extending LoginPage to LoginTest by creating PageFactory(driver and LoginPage)
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clicksSigninButton();
		
      // created object for DashboardPage
		DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardpage.verifyDashboardPage(dashboard);
      
		// calling tearDown method.
		BrowserFactory.tearDown();

	}
}
