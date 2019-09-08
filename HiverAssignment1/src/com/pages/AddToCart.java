package com.pages;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utility.ConfigReader;

public class AddToCart {

	ConfigReader conf = new ConfigReader();

	WebDriver driver;

	public AddToCart(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void addToCart() {
		try {
			Actions act = new Actions(driver);
			String old_window = driver.getWindowHandle();
			System.out.println(old_window);
			ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
			System.out.println(newTab.size());
			driver.switchTo().window(newTab.get(1));

			WebElement elmn3 = driver.findElement(By.xpath(conf.addCart()));

			act.moveToElement(elmn3).click(elmn3).build().perform();

			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void incrementByOne() {

		driver.findElement(By.xpath(conf.incrementByone())).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

}
