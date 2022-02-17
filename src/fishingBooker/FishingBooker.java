package fishingBooker;

import pages.FinalStepCreditCardDetailsPage;
import pages.FsbFishingTourPage;
import pages.HalfDayTripBookingDetailsPage;

public class FishingBooker {

	private FsbFishingTourPage fsbFishingTourPage;
	private HalfDayTripBookingDetailsPage halfDayTripBookingDetailsPage;
	private FinalStepCreditCardDetailsPage finalStepCreditCardDetailsPage;

	public FsbFishingTourPage getFsbFishingTourPage() {
		if (fsbFishingTourPage == null) {
			fsbFishingTourPage = new FsbFishingTourPage();
		}
		return fsbFishingTourPage;

	}

	public HalfDayTripBookingDetailsPage getHalfDayTripBookingDetailsPage() {
		if (halfDayTripBookingDetailsPage == null) {
			halfDayTripBookingDetailsPage = new HalfDayTripBookingDetailsPage();
		}
		return halfDayTripBookingDetailsPage;

	}
	
	public FinalStepCreditCardDetailsPage getFinalStepCreditCardDetailsPage() {
		if (finalStepCreditCardDetailsPage == null) {
			finalStepCreditCardDetailsPage = new FinalStepCreditCardDetailsPage();
		}
		return finalStepCreditCardDetailsPage;

	}

}
