package com.adactin.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	private WebDriver driver;

	@FindBy(id="username")
	private WebElement username;

	public Login_Page(WebDriver Adriver) {

		this.driver = Adriver;
		PageFactory.initElements(driver, this);

	}
	public WebElement getUsername() {
		return username;

	}

	public WebElement getPassword() {
		return Password;

	}

	public WebElement getSignin_Btn() {
		return Signin_Btn;

	}

	@FindBy(id="password")
	private WebElement Password;

	@FindBy(id="login")
	private WebElement Signin_Btn;

}



