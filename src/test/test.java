package test;

import static org.junit.Assert.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import browser.Browser;

public class test extends BaseTest {

	@Test
	public void test() throws InterruptedException {

		fishingBooker.getFsbFishingTourPage().getViewAvailability();
		fishingBooker.getFsbFishingTourPage().getTripDateBoxCalendarDay();
		fishingBooker.getFsbFishingTourPage().getGroupSize();
		fishingBooker.getFsbFishingTourPage().getGroupSizeAdultsMinusButton();
		fishingBooker.getFsbFishingTourPage().getGroupSizeChildrenPlusButton();
		fishingBooker.getFsbFishingTourPage().getCheckAvailability();		
//		Thread.sleep(2000);
		fishingBooker.getFsbFishingTourPage().getInstantBookHalfDayTripPm();

		
		fishingBooker.getHalfDayTripBookingDetailsPage().getFirstNameField();
		fishingBooker.getHalfDayTripBookingDetailsPage().getLastNameField();
		fishingBooker.getHalfDayTripBookingDetailsPage().getEmailAddressField();
		fishingBooker.getHalfDayTripBookingDetailsPage().getAreaCodeFlagIcon();
		fishingBooker.getHalfDayTripBookingDetailsPage().getSerbiaAreaCode();
		fishingBooker.getHalfDayTripBookingDetailsPage().getMobileNumberField();
		fishingBooker.getHalfDayTripBookingDetailsPage().getMessageBox();
		fishingBooker.getHalfDayTripBookingDetailsPage().getContinueButton();

//		Thread.sleep(2000);
		fishingBooker.getFinalStepCreditCardDetailsPage().getCardNumberField();
		fishingBooker.getFinalStepCreditCardDetailsPage().getExpiryDateField();
		fishingBooker.getFinalStepCreditCardDetailsPage().getSecurityCodeField();	
		fishingBooker.getFinalStepCreditCardDetailsPage().getNameOnCardField();
		fishingBooker.getFinalStepCreditCardDetailsPage().getBillingCountryField();
		fishingBooker.getFinalStepCreditCardDetailsPage().getBillingCountrySerbia();
		fishingBooker.getFinalStepCreditCardDetailsPage().getPostalCodeField();
//		fishingBooker.getFinalStepCreditCardDetailsPage().getConfirmBookingButton();
		Thread.sleep(4000);
	}

}
