package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

import com.utility.ConfigReader;

public class LoginPage {

	ConfigReader conf = new ConfigReader();

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void openURL() {

		try {
			driver.navigate().to("https://www.flipkart.com/");
			driver.manage().window().maximize();

			driver.findElement(By.xpath(conf.cancelLogin())).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
