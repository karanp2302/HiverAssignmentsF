package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.ConfigReader;

public class OpenFilpkart {
	ConfigReader conf = new ConfigReader();

	WebDriver driver;

	public OpenFilpkart(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void openURL() {

		try {
			driver.navigate().to(conf.GetFlipkartURL());
			driver.manage().window().maximize();
			driver.findElement(By.xpath(conf.CancelLogin())).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
