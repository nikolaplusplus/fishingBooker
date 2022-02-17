package browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	private static ChromeDriver browser;
	
	public static ChromeDriver getBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium-driver\\chromedriver.exe");
		if (browser == null) {
			browser = new ChromeDriver();
		}
		return browser;
	}

}
