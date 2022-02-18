package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import browser.Browser;

public class FinalStepCreditCardDetailsPage extends BasePage {

	private String cardNumber = "credit-card-number";
	private String expiryDate = "expiration";
	private String securityCode = "cvv";
	private String nameOnCard = "cardholder-name";
	private String billingCountryBox = "//body/div[@id='main-content']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[4]/div[1]/div[1]/select[1]";
	private String billingCountrySerbia = "//option[contains(text(),'Serbia')]";
	private String postalCode = "postal-code";
	private String confirmBookingButton = "//body/div[@id='main-content']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/div[1]/div[2]/button[1]";

	public void getCardNumberField() {
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(5));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("braintree-hosted-field-number"));
		WebElement p = Browser.getBrowser().findElement(By.id(cardNumber));
		p.click();
		p.sendKeys("4009348888881881");
	}

	public void getExpiryDateField() {
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(5));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("braintree-hosted-field-expirationDate"));
		WebElement p = Browser.getBrowser().findElement(By.id(expiryDate));
		p.click();
		p.sendKeys("224");
	}

	public void getSecurityCodeField() {
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(5));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("braintree-hosted-field-cvv"));
		WebElement p = Browser.getBrowser().findElement(By.id(securityCode));
		p.click();
		p.sendKeys("569");
	}

	public void getNameOnCardField() {
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(5));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("braintree-hosted-field-cardholderName"));
		WebElement p = Browser.getBrowser().findElement(By.id(nameOnCard));
		p.click();
		p.sendKeys("Petar");
	}

//	public void getBillingCountryField() {
//		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(""));
//		WebElement p = Browser.getBrowser().findElement(By.id(billingCountryBox));
//		p.click();
//	}

	public void getBillingCountryField() {
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(10));
		WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(billingCountryBox)));
		el.click();

	}

	public void getBillingCountrySerbia() {
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(10));
		WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(billingCountrySerbia)));
		el.click();
	}

	public void getPostalCodeField() {
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(5));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("braintree-hosted-field-postalCode"));
		WebElement p = Browser.getBrowser().findElement(By.id(postalCode));
		p.click();
		p.sendKeys("11070");
	}

//	public void getConfirmBookingButton() {
//		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(""));
//		WebElement p = Browser.getBrowser().findElement(By.id(confirmBookingButton));
//		p.click();
//	}

	public void getConfirmBookingButton() {
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(10));
		WebElement el = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(confirmBookingButton)));
		el.click();

	}

}
