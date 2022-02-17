package test;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import config.Url;
import browser.Browser;
import fishingBooker.FishingBooker;

public class BaseTest {

	protected static FishingBooker fishingBooker;

	@BeforeClass
	public static void setup() {
		fishingBooker = new FishingBooker();
	}

	@AfterClass
	public static void cleanup() {
		Browser.getBrowser().quit();
	}

	@Before
	public void testSetup() {
		Browser.getBrowser().get(Url.getUrl());
		Browser.getBrowser().manage().window().maximize();

	}

}
