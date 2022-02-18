package test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;

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
//		Browser.getBrowser().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		Thread.sleep(2000);
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

//		Browser.getBrowser().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		Thread.sleep(20000);
		fishingBooker.getBookingDonePage().getBookingNumberAndCopyToTxtFile();

	}

}
