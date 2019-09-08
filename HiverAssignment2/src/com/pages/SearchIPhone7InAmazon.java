package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utility.ConfigReader;

public class SearchIPhone7InAmazon {

	ConfigReader conf = new ConfigReader();

	WebDriver driver;

	public SearchIPhone7InAmazon(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void SearchPhone() {

		WebElement searchbox = driver.findElement(By.xpath(conf.AmazonSearchBox()));
		searchbox.sendKeys(conf.SearchProductInAmazon());
		WebDriverWait wait = new WebDriverWait(driver, 500);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(conf.AmazonVisibleElement())));
	}
}
