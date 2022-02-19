package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import browser.Browser;

public class FsbFishingTourPage extends BasePage {

	private String groupSizeBox = "//body/div[@id='main-content']/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[2]/div[1]/div[3]/div[2]/input[1]";
	private String groupSizeAdultsMinusButton = "//body[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/button[1]";
	private String groupSizeChildrenPlusButton = "//body[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[3]/button[1]";
	private String tripDateBox = "//input[@id='booking_date_availability_form_search']";
	private String tripDateBoxCalendarDay = "//td[contains(text(),'22')]";
	private String checkAvailability = "//button[@id='check-availability-btn']";
	private String viewAvailability = "//body/div[@id='main-content']/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/ul[1]/div[1]/li[7]/div[1]/div[2]/div[1]/div[2]/button[1]";
	private String changeSearch = "//button[@id='change-search-btn']";
	private String instantBookHalfDayTripPm = "bookbtn-3";
	private String popUpWindowCloseButton = "//body/div[6]/div[2]/button[1]/span[1]";

	public void clickOnGroupSizeDropdown() {
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(10));
		WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(groupSizeBox)));
		el.click();
	}

	public void clickOnChangeSearchButton() {
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(10));
		WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(changeSearch)));
		el.click();
	}

	public void closePopUpWindow() {
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(10));
		WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(popUpWindowCloseButton)));
		el.click();
	}

	public void clickOnTripDateDropdown() {
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(10));
		WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(tripDateBox)));
		el.click();
	}
	
	public void clickOnCalendarDayInTripDateDropdown() {
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(10));
		WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(tripDateBoxCalendarDay)));
		el.click();
	}

	public void clickOnGroupSizeAdultsMinusButton() {
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(10));
		WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(groupSizeAdultsMinusButton)));
		el.click();
	}

	public void clickOnGroupSizeChildrenPlusButton() {
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(10));
		WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(groupSizeChildrenPlusButton)));
		el.click();
	}

	public void clickOnCheckAvailabilityButton() {
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(10));
		WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(checkAvailability)));
		el.click();
	}

	public void clickOnHalfDayTripPmInstantBookButton() {
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(10));
		WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.id(instantBookHalfDayTripPm)));
		el.click();
		
	}

	public void clickOnViewAvailabilityButton() {
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(10));
		WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(viewAvailability)));
		el.click();
	}

}
