package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	Properties prop;

	public ConfigReader() {
		try {
			File src = new File("./src/com.utility.resources/Config.property");
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getDriverPath() {
		String path = prop.getProperty("driver_path");
		return path;

	}

	public String getDriverValue() {
		String value = prop.getProperty("driver_value");
		return value;
	}

	public String getAmazonURL() {
		return prop.getProperty("urlAmazon");
	}

	public String AmazonSearchBox() {
		return prop.getProperty("amazon_search_box");
	}

	public String SearchProductInAmazon() {
		return prop.getProperty("search_product_in_amazon");
	}

	public String AmazonVisibleElement() {
		return prop.getProperty("amazon_visible_element");
	}

	public String SelectProductInAmazon() {
		return prop.getProperty("select_phone_in_amazon");
	}

	public String GetAmazonPrice() {
		return prop.getProperty("get_amazon_price");
	}

	public String GetFlipkartURL() {
		return prop.getProperty("urlFlipkart");
	}

	public String CancelLogin() {
		return prop.getProperty("cancel_login");
	}

	public String FlipkartSearchBox() {
		return prop.getProperty("flipkart_search_box");
	}

	public String SearchProductInFlipkart() {
		return prop.getProperty("search_product_in_flipkart");
	}

	public String FlipkartVisibleElement1() {
		return prop.getProperty("flipkart_visible_element1");
	}

	public String SelectProductInFlipkart() {
		return prop.getProperty("select_phone_in_flipkart");
	}

	public String FlipkartVisibleElement2() {
		return prop.getProperty("flipkart_visible_element2");
	}

	public String GetFlipkartPrice() {
		return prop.getProperty("get_flipkart_price");
	}

}
