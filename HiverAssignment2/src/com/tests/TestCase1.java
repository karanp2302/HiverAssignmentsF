package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import com.pages.GetIPhonePriceInAmazon;
import com.pages.GetIPhonePriceInFlipkart;
import com.pages.OpenAmazon;
import com.pages.OpenFilpkart;
import com.pages.SearchIPhone7InAmazon;
import com.pages.SearchIPhone7InFlipkart;
import com.pages.SelectIPhoneInAmazon;
import com.pages.SelectIPhoneInFlipkart;
import com.utility.ConfigReader;
import org.testng.annotations.Test;

public class TestCase1 {

	ConfigReader conf = new ConfigReader();
	WebDriver driver;

	OpenAmazon oa;
	SearchIPhone7InAmazon sa;
	SelectIPhoneInAmazon sela;
	GetIPhonePriceInAmazon ga;
	OpenFilpkart of;
	SearchIPhone7InFlipkart sf;
	SelectIPhoneInFlipkart self;
	GetIPhonePriceInFlipkart gf;

	@Test
	public void StartTest() {

		System.setProperty("webdriver.chrome.driver", "D:/workspace/chromedriver.exe");
		try {
			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();

			Thread.sleep(3000);
			oa = new OpenAmazon(driver);

			oa.openURL();

			sa = new SearchIPhone7InAmazon(driver);
			sa.SearchPhone();

			sela = new SelectIPhoneInAmazon(driver);
			sela.SelectPhone();

			String old_window = driver.getWindowHandle();
			System.out.println(old_window);

			ga = new GetIPhonePriceInAmazon(driver);
			ga.GetPriceInAmazon();

			driver.switchTo().window(old_window);

			of = new OpenFilpkart(driver);
			of.openURL();

			sf = new SearchIPhone7InFlipkart(driver);
			sf.SearchPhone();

			self = new SelectIPhoneInFlipkart(driver);
			self.SelectPhone();

			gf = new GetIPhonePriceInFlipkart(driver);
			gf.GetPriceInFlipkart();
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
