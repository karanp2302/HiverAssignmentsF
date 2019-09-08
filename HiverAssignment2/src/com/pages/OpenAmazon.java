package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.ConfigReader;

public class OpenAmazon {

	ConfigReader conf = new ConfigReader();

	WebDriver driver;

	public OpenAmazon(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void openURL() {

		try {
			driver.navigate().to(conf.getAmazonURL());
			driver.manage().window().maximize();

			Thread.sleep(4000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
