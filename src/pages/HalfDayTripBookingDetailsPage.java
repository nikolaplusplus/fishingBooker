package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import browser.Browser;

public class HalfDayTripBookingDetailsPage extends BasePage {

	private String firstName = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]";
	private String lastName = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]";
	private String emailAddress = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/input[1]";
	private String mobileNumber = "//input[@id='']";
	private String continueButton = "//body/div[@id='main-content']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/div[2]/button[1]";
	private String areaCodeFlagIcon = "//body/div[@id='main-content']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]";
	private String serbiaAreaCode = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[196]/span[1]";
	private String messageBox = "//body/div[@id='main-content']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/div[3]/div[1]/textarea[1]";

	public void getFirstNameField() {
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(10));
		WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(firstName)));
		el.clear();
		el.sendKeys("Petar");
	}

	public void getLastNameField() {
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(10));
		WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(lastName)));
		el.clear();
		el.sendKeys("Petrovic");
	}

	public void getEmailAddressField() {
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(10));
		WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(emailAddress)));
		el.clear();
		el.sendKeys("peraa7908@gmail.com");
	}

	public void getMobileNumberField() {
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(10));
		WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(mobileNumber)));
		el.click();
		el.sendKeys("652883900");
	}

	public void getContinueButton() {
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(10));
		WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(continueButton)));
		el.click();
	}

	public void getAreaCodeFlagIcon() {
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(10));
		WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(areaCodeFlagIcon)));
		el.click();
	}

	public void getSerbiaAreaCode() {
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(10));
		WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(serbiaAreaCode)));
		el.click();
	}

	public void getMessageBox() {
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(10));
		WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(messageBox)));
		el.clear();
		el.sendKeys("Ay Ay Captain!");
	}

}
