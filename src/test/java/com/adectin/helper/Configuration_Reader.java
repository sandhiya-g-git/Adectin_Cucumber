package com.adectin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {

	private static Properties p;

	public Configuration_Reader() throws Throwable {
		File f = new File(
				"E:\\automation eng\\.metadata\\.metadata\\.metadata\\adectin_cucumber\\src\\test\\java\\com\\adectin\\propertires\\configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();

		// load
		p.load(fis);
	}

	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;

	}

	public String getUrl() {
		String url = p.getProperty("url");
		return url;

	}

	public String getdb_Creditno() {
		String db_Creditno = p.getProperty("db_Creditno");
		return db_Creditno;

	}

	public String getdb_Creditexpirymonth() {
		String db_Creditexpirymonth = p.getProperty("db_Creditexpirymonth");
		return db_Creditexpirymonth;

	}

	public String getdb_Creditexpiryyear() {
		String db_Creditexpiryyear = p.getProperty("db_Creditexpiryyear");
		return db_Creditexpiryyear;

	}

	public String getdb_Creditcvvno() {
		String db_Creditcvvno = p.getProperty("db_Creditcvvno");
		return db_Creditcvvno;

	}

}
