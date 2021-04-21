package com.adactin.Basecls;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class2 {

	public static WebDriver driver;

	public static WebDriver getBrowser(String Type) {

		// Using browser launch

		if (Type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

			driver = new ChromeDriver();

		}

		else if (Type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\driver\\geckodriver.exe");

			driver = new FirefoxDriver();

		}

		else if (Type.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\driver\\IEDriverServer.exe");

			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();

		return driver;
	}
	// using click()

	public static void clickoneleme(WebElement element) {
		element.click();

	}

	// using sendkeys

	public static void inputvalue(WebElement element, String value) {
		element.sendKeys(value);

	}

	// using get

	public static void getUrl(String Url) {
		driver.get(Url);
	}

	// using close()

	public static void close() {
		driver.close();

	}

	public static void quit() {
		driver.quit();

	}

	// using isenabled

	public static void isEnabled(WebElement element) {

		boolean enabled = element.isEnabled();
		System.out.println(enabled);

	}

	// Robot
	public static void robotClass(String type) throws Exception {
		Robot r = new Robot();
		if (type.equalsIgnoreCase("up")) {
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
		} else if (type.equalsIgnoreCase("down")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		} else if (type.equalsIgnoreCase("left")) {
			r.keyPress(KeyEvent.VK_LEFT);
			r.keyRelease(KeyEvent.VK_LEFT);
		} else if (type.equalsIgnoreCase("right")) {
			r.keyPress(KeyEvent.VK_RIGHT);
			r.keyRelease(KeyEvent.VK_RIGHT);
		} else if (type.equalsIgnoreCase("enter")) {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}

	}

	// using sleep

	public static void sleep(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	// using navigations
	public static void navigate_to(String Url) {
		driver.navigate().to(Url);

	}

	public static void navigate_back() {
		driver.navigate().back();

	}

	public static void navigate_forword() {
		driver.navigate().forward();

	}

	public static void navigate_refresh() {
		driver.navigate().refresh();

	}

	// using frames
	public static void get_back() {
		driver.switchTo().defaultContent();
	}

	// using id or name
	public static void fName() {
		driver.switchTo().frame(0);

	}

	public static void fId(int value) {
		driver.switchTo().frame(value);

	}

	// using webelement
	public static void fwebelem() {
		driver.switchTo().activeElement();

	}
	/*
	 * public static void screenshot(String path) throws Exception {
	 * 
	 * TakesScreenshot ts = (TakesScreenshot) driver; File source =
	 * ts.getScreenshotAs(OutputType.FILE); File destination = new File(path);
	 * FileHandler.class(source, destination);
	 * 
	 * }
	 */

	// Window Handles
	public static void Windows_Handles(String actionName, WebElement element) {

	}

	// action

	public static void actionsclass(String actionName, WebElement element) {
		try {
			Actions a = new Actions(driver);
			if (actionName.equalsIgnoreCase("moveto")) {
				a.moveToElement(element).build().perform();
			} else if (actionName.equalsIgnoreCase("clickon")) {
				a.click(element).build().perform();
			} else if (actionName.equalsIgnoreCase("doubleClick")) {
				a.contextClick(element).build().perform();
			} else if (actionName.equalsIgnoreCase("clickon")) {
				a.click(element).build().perform();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// dropdown select&deselect

	public static void dropdownSelect(WebElement element, String type, String value) {

		Select s = new Select(element);
		if (type.equalsIgnoreCase("byvalue")) {
			s.selectByValue(value);
		} else if (type.equalsIgnoreCase("byVisibileText")) {
			s.selectByVisibleText(value);
		} else if (type.equalsIgnoreCase("byIndex")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		}
	}

	public static void dropdownDeselect(WebElement element, String type, String value) {

		Select s = new Select(element);
		if (type.equalsIgnoreCase("byvalue")) {
			s.deselectByValue(value);
		} else if (type.equalsIgnoreCase("byVisibileText")) {
			s.deselectByVisibleText(value);
		} else if (type.equalsIgnoreCase("byIndex")) {
			int index = Integer.parseInt(value);
			s.deselectByIndex(index);
		}
	}

}