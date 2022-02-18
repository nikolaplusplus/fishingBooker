package pages;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import browser.Browser;

public class BookingDonePage {

	private String bookingNumber = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[1]/div[2]/strong[1]";
	private String popUpWindowCloseButton = "//span[contains(text(),'×')]";
	
	
	public void getBookingNumberAndCopyToTxtFile() throws IOException {

		String text = Browser.getBrowser().findElement(By.xpath(bookingNumber)).getText();

		File txtFile = new File("C:\\eclipse\\eclipse\\eclipse-workspace\\fishing-booker\\BookingID.txt");
		txtFile.createNewFile();

		FileWriter myWriter = new FileWriter(txtFile);
		myWriter.write(text);
		myWriter.close();
		
		}
	
	public void closePopUpWindow() {
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(10));
		WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(popUpWindowCloseButton)));
		el.click();
	}

}
