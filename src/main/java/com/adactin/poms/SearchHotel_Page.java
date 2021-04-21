package com.adactin.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel_Page {
	private WebDriver driver;

	@FindBy(id = "location")
	private WebElement Location;

	public SearchHotel_Page(WebDriver Adriver) {

		this.driver = Adriver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getLocation() {
		return Location;

	}

	public WebElement getSearch_Btn() {
		return Search_Btn;

	}

	@FindBy(id = "Submit")
	private WebElement Search_Btn;
}
