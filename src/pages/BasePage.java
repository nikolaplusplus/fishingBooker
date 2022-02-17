package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import browser.Browser;

public class BasePage {
	
	public static WebElement findElement(String xpath) {
		return Browser.getBrowser().findElement(By.xpath(xpath));
	}

}
