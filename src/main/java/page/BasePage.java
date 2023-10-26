package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	public int generateRandomNum(int boundryNum) {
		Random rnd = new Random();
		int generateNum =rnd.nextInt(boundryNum);
		return generateNum;
		
	}
	public void selectFromDropDown(WebElement element, String visibleText) {
		Select sel = new Select(element);
		sel.selectByVisibleText(visibleText);
	}

}
