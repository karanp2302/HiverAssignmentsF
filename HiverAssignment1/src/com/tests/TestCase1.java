package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

import com.pages.AddToCart;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.MobilePage;
import com.pages.VerifyPrice;
import com.utility.ConfigReader;

public class TestCase1 {

	ConfigReader conf = new ConfigReader();
	WebDriver driver;
	LoginPage lp;
	HomePage hp;
	MobilePage mp;
	AddToCart ac;
	VerifyPrice vp;

	@Test
	public void StartTest() {

		FirefoxProfile profile = new FirefoxProfile();

		profile.setEnableNativeEvents(true);

		driver = new FirefoxDriver(profile);
		hp = new HomePage(driver);

		lp = new LoginPage(driver);
		mp = new MobilePage(driver);
		ac = new AddToCart(driver);
		vp = new VerifyPrice(driver);

		lp.openURL();

		hp.hoverElectronics();
		hp.selectPixel3a();
		mp.selectMobile();
		ac.addToCart();
		ac.incrementByOne();
		vp.verify();

	}

}
