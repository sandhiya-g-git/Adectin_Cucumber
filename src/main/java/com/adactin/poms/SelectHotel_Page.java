package com.adactin.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel_Page {

	private WebDriver driver;

	@FindBy(id = "radiobutton_1")
	private WebElement Select_Btn;

	public SelectHotel_Page(WebDriver Adriver) {

		this.driver = Adriver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getSelect_Btn() {
		return Select_Btn;
	}

	@FindBy(id = "continue")
	private WebElement Continue_Btn;

	public WebElement getContinue_Btn() {
		return Continue_Btn;

	}

}
