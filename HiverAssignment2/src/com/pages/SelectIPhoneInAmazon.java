package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utility.ConfigReader;

public class SelectIPhoneInAmazon {

	ConfigReader conf = new ConfigReader();

	WebDriver driver;

	public SelectIPhoneInAmazon(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void SelectPhone() {
		Actions act = new Actions(driver);
		WebElement elmn1 = driver.findElement(By.xpath(conf.SelectProductInAmazon()));
		act.moveToElement(elmn1).click(elmn1).build().perform();

	}
}
