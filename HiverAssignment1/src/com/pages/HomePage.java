package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utility.ConfigReader;

public class HomePage {
	ConfigReader conf = new ConfigReader();

	WebDriver driver;

	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void hoverElectronics() {
		try {

			driver.findElement(By.xpath(conf.hoverElectronics())).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void selectPixel3a() {
		try {
			Actions act = new Actions(driver);
			WebElement elmn2 = driver.findElement(By.xpath(conf.selectPix3a()));
			act.moveToElement(elmn2).click(elmn2).build().perform();
			Thread.sleep(4000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
