package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utility.ConfigReader;

public class SelectIPhoneInFlipkart {

	ConfigReader conf = new ConfigReader();

	WebDriver driver;

	public SelectIPhoneInFlipkart(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void SelectPhone() {
		Actions act = new Actions(driver);
		WebElement elmn2 = driver.findElement(By.xpath(conf.SelectProductInFlipkart()));
		act.moveToElement(elmn2).click(elmn2).build().perform();

	}
}
