package com.adectin.Runner;

import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.Basecls.Base_Class2;
import com.adectin.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src//test//java//com//adectin//featurefile", 
		glue = "com.adectin.stepdefinution", 
		monochrome = true,
		dryRun = false, 
		strict = true,
		tags = ("@Smoketest,@Sanitytest"), 
		plugin = {
		"html:Report/HTML_Report", "pretty", "json:Report/jsonReport,json",
		"com.cucumber.listener.ExtentCucumberFormatter:Report/Extentreport.html"

})

public class Test_Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void set_up() throws Throwable {
		String browser = FileReaderManager.getInstance().getInstanceCR().getBrowser();

		driver = Base_Class2.getBrowser(browser);
	}

	@AfterClass
	public static void tear_Down() {
		driver.close();
	}

}
