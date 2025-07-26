package com.tka.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	public static String readConfig(String key) throws Exception {
		FileInputStream fileInputStream = new FileInputStream(
				"S:\\Project\\RegistrationFuncationality\\src\\main\\resources\\Config.properties");
		Properties properties = new Properties();
		properties.load(fileInputStream);
		return properties.getProperty(key);
	}
}
