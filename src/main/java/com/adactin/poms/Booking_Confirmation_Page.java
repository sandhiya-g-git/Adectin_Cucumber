package com.adactin.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirmation_Page {
	private WebDriver driver;

	@FindBy(id = "my_itinerary")
	private WebElement iti_Btn;

	public Booking_Confirmation_Page(WebDriver Adriver) {

		this.driver = Adriver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getiti_Btn() {
		return iti_Btn;
	}

	public WebElement getLogout() {
		return logout_Btn;
	}

	@FindBy(xpath = "//input[@id=\"logout\"]")
	private WebElement logout_Btn;

}
