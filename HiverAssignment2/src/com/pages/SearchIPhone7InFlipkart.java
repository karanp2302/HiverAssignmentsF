package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utility.ConfigReader;

public class SearchIPhone7InFlipkart {

	ConfigReader conf = new ConfigReader();

	WebDriver driver;

	public SearchIPhone7InFlipkart(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void SearchPhone() {

		WebElement searchbox2 = driver.findElement(By.xpath(conf.FlipkartSearchBox()));
		searchbox2.sendKeys(conf.SearchProductInFlipkart());
		WebDriverWait wait = new WebDriverWait(driver, 500);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(conf.FlipkartVisibleElement1())));
	}
}
