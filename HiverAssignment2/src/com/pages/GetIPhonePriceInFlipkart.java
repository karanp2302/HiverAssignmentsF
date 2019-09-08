package com.pages;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utility.ConfigReader;

public class GetIPhonePriceInFlipkart {

	ConfigReader conf = new ConfigReader();

	WebDriver driver;

	public GetIPhonePriceInFlipkart(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void GetPriceInFlipkart() {
		ArrayList<String> childTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(childTab.get(1));
		WebDriverWait wait = new WebDriverWait(driver, 500);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(conf.FlipkartVisibleElement2())));
		String price1 = driver.findElement(By.xpath(conf.GetFlipkartPrice())).getText();
		System.out.println("Flipkart Price for iPhone 7 32 gb(black) =" + price1);
	}
}
