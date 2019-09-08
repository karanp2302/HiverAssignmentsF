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

	public String getURL() {
		return prop.getProperty("url");
	}

	public String cancelLogin() {
		return prop.getProperty("cancel_login_popup_window_xpath");
	}

	public String hoverElectronics() {
		return prop.getProperty("hoverElectronic");
	}

	public String selectPix3a() {
		return prop.getProperty("select_Pixel_3a");
	}

	public String selectMobile() {
		return prop.getProperty("selectMobile");
	}

	public String addCart() {
		return prop.getProperty("addToCart");
	}

	public String incrementByone() {
		return prop.getProperty("incrementQuantity");
	}

	public String actualPrice() {
		return prop.getProperty("ActualPrice");
	}
}
