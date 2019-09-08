package com.pages;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.ConfigReader;

public class GetIPhonePriceInAmazon {

	ConfigReader conf = new ConfigReader();

	WebDriver driver;

	public GetIPhonePriceInAmazon(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void GetPriceInAmazon() {
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(newTab.size());
		driver.switchTo().window(newTab.get(1));
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);

		String price = driver.findElement(By.xpath(conf.GetAmazonPrice())).getText();
		// Thread.sleep(4000);
		System.out.println("Amazon Price for iPhone 7 32 gb(black) =" + price);
		driver.close();
		// driver.switchTo().window(old_window);
	}
}
