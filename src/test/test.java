package test;

import java.io.IOException;
import java.time.Duration;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import browser.Browser;

public class test extends BaseTest {

	@Test
	public void test() throws InterruptedException, IOException {

		fishingBooker.getFsbFishingTourPage().clickOnViewAvailabilityButton();
		fishingBooker.getFsbFishingTourPage().clickOnCalendarDayInTripDateDropdown();
		fishingBooker.getFsbFishingTourPage().clickOnGroupSizeDropdown();
		fishingBooker.getFsbFishingTourPage().clickOnGroupSizeAdultsMinusButton();
		fishingBooker.getFsbFishingTourPage().clickOnGroupSizeChildrenPlusButton();
		fishingBooker.getFsbFishingTourPage().clickOnCheckAvailabilityButton();
		fishingBooker.getFsbFishingTourPage().clickOnHalfDayTripPmInstantBookButton();

		fishingBooker.getHalfDayTripBookingDetailsPage().populateFirstNameField();
		fishingBooker.getHalfDayTripBookingDetailsPage().populateLastNameField();
		fishingBooker.getHalfDayTripBookingDetailsPage().populateEmailAddressField();
		fishingBooker.getHalfDayTripBookingDetailsPage().clickOnAreaCodeFlagContainerDropdown();
		fishingBooker.getHalfDayTripBookingDetailsPage().clickOnSerbiaAreaCode();
		fishingBooker.getHalfDayTripBookingDetailsPage().populateMobileNumberField();
		fishingBooker.getHalfDayTripBookingDetailsPage().populateTextBox();
		fishingBooker.getHalfDayTripBookingDetailsPage().clickOnContinueButton();

		Browser.getBrowser().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		fishingBooker.getFinalStepCreditCardDetailsPage().populateCardNumberField();
		fishingBooker.getFinalStepCreditCardDetailsPage().populateExpiryDateField();
		fishingBooker.getFinalStepCreditCardDetailsPage().populateSecurityCodeField();
		fishingBooker.getFinalStepCreditCardDetailsPage().populateNameOnCardField();
		fishingBooker.getFinalStepCreditCardDetailsPage().clickOnBillingCountryDropdown();
		fishingBooker.getFinalStepCreditCardDetailsPage().clickOnBillingCountrySerbia();
		fishingBooker.getFinalStepCreditCardDetailsPage().populatePostalCodeField();
		fishingBooker.getFinalStepCreditCardDetailsPage().clickOnConfirmBookingButton();

		Browser.getBrowser().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		fishingBooker.getBookingDonePage().getBookingNumberAndCopyToTxtFile();

		Assert.assertTrue(Browser.getBrowser()
				.findElement(
						By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[1]/div[2]/strong[1]"))
				.isDisplayed());
	}
}
