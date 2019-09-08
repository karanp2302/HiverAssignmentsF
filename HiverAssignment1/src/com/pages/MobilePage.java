package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.ConfigReader;

public class MobilePage {

	ConfigReader conf = new ConfigReader();

	WebDriver driver;

	public MobilePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void selectMobile() {
		try {
			driver.findElement(By.xpath(conf.selectMobile())).click();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
