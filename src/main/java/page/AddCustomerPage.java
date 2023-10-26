package page;

import org.testng.Assert;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddCustomerPage extends BasePage{
	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/div[1]/h5")WebElement ADD_CUSTOMER_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")WebElement COMPANY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")WebElement EMAIL_ELEMENT;

	public void verifyAddCustomerPage(String addCustomer) {
		Assert.assertEquals(ADD_CUSTOMER_HEADER_ELEMENT.getText(), addCustomer, "Add Customer Page not found.");
	}

	public void insertFullName(String fullName) {
	FULL_NAME_ELEMENT.sendKeys(fullName + generateRandomNum(123456));
	}

	

	public void insertComapnyName(String Company) {
    selectFromDropDown(COMPANY_ELEMENT, Company);
    
		
	
	}

	

	public void insertEmail(String email) {

		EMAIL_ELEMENT.sendKeys(generateRandomNum(1234) + email);

	}
}