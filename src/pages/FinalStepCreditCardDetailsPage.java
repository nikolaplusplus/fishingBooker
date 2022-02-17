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
	private String postalCode = "postal-code";
	private String confirmBookingButton = "//body/div[@id='main-content']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/div[1]/div[2]/button[1]";
	private String billingCountrySerbia = "//option[contains(text(),'Serbia')]";

	public void getCardNumberField() {
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(10));
		WebElement el = wait.until(ExpectedConditions.presenceOfElementLocated(By.name(cardNumber)));
		el.clear();
		el.sendKeys("4009348888881881");
	}

	public void getExpiryDateField() {
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(10));
		WebElement el = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(expiryDate)));
		el.clear();
		el.sendKeys("224");
	}

	public void getSecurityCodeField() {
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(10));
		WebElement el = wait.until(ExpectedConditions.presenceOfElementLocated(By.className(securityCode)));
		el.clear();
		el.sendKeys("356");
	}

	public void getNameOnCardField() {
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(10));
		WebElement el = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(nameOnCard)));
		el.clear();
		el.sendKeys("Petar");
	}

	public void getBillingCountryField() {
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(10));
		WebElement el = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(billingCountryBox)));
		el.click();

	}

	public void getPostalCodeField() {
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(10));
		WebElement el = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(postalCode)));
		el.clear();
		el.sendKeys("11070");
	}

	public void getConfirmBookingButton() {
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(10));
		WebElement el = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(confirmBookingButton)));
		el.clear();
		el.sendKeys("4009348888881881");
	}

	public void getBillingCountrySerbia() {
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(10));
		WebElement el = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(billingCountrySerbia)));
		el.click();

	}

//	public void getCardNumberField() {
//	WebDriverWait(session, 20).until(EC.frame_to_be_available_and_switch_to_it((By.ID,"braintree-hosted-field-number")));
//	WebDriverWait(session, 20).until(EC.element_to_be_clickable((By.CSS_SELECTOR, "input.number#credit-card-number"))).send_keys("0000000000000000");
//	
//	ccNumber = session.find_element_by_css_selector('input[name=credit-card-number]')
//			wait = WebDriverWait(session, 100)wait.until(EC.element_to_be_selected(ccNumber))
//	}

//	public void getCardNumberField() {
//	WebElement element = Browser.getBrowser().findElement(By.xpath(cardNumber));
//	JavascriptExecutor executor = (JavascriptExecutor)Browser.getBrowser();
//	executor.executeScript("arguments[0].click();", element);
//	}

//	public void getCardNumberField() {
//	WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(5));
//	WebElement minusButton = Browser.getBrowser().findElement(By.cssSelector(cardNumber));
//	minusButton.click();

//	public void getCardNumberField() {
//	JavascriptExecutor executor = (JavascriptExecutor)Browser.getBrowser();
//	executor.executeScript("arguments[0].click();", element);
//	Browser.getBrowser().execute_script(cardNumber.click());
//	}

//	public void getSecurityCodeField() {
//	WebElement element = Browser.getBrowser().findElement(By.id(securityCode));
//	 JavascriptExecutor jse = (JavascriptExecutor)Browser.getBrowser();
//	 jse.executeScript("arguments[0].value='222';", element);
//	}

//	
//
//	public WebElement getConfirmBookingButton() {
//		return findElement(confirmBookingButton);
//	}

//	public void getSecurityCodeField() {
//		JavascriptExecutor js = (JavascriptExecutor)Browser.getBrowser();
//		 js.executeScript("document.getElementById('cvv').value='222';");
//	}


//	
//	
//	public WebElement getCardNumberField() {
//		return	Browser.getBrowser().findElement(By.id(nameOnCard));
//	}
//	
//	

//	
//	
//	
//	public WebElement getExpiryDateField() {
//		return findElement(expiryDate);
//	}
//	
//	public WebElement getSecurityCodeField() {
//		return findElement(securityCode);
//	}
//	
//	
//	
//	
//	
//	
//	public WebElement getNameOnCardField() {
//		return findElement(nameOnCard);
//	}
//	
//	public void getNameOnCardField() {
//		Browser.getBrowser().findElement(By.id("cardholder-name")).sendKeys("Goa", Keys.ENTER);
//	}
//	
//	
//	
//	
//	
//	


}
