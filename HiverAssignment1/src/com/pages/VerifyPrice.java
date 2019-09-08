package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import com.utility.ConfigReader;

public class VerifyPrice {
	ConfigReader conf = new ConfigReader();

	WebDriver driver;

	public VerifyPrice(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void verify() {
		String ExpectedPrice = "₹79,998";
		String ActualPrice = driver.findElement(By.xpath(conf.actualPrice())).getText();

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(ActualPrice, ExpectedPrice);
		System.out.println("continue");
		sa.assertAll();
		System.out.println("Price of the phone" + ActualPrice);
	}
}
