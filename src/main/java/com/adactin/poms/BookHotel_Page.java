package com.adactin.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel_Page {
	private WebDriver driver;

	@FindBy(id = "first_name")
	private WebElement First_Name;

	public BookHotel_Page(WebDriver Adriver) {

		this.driver = Adriver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getFirst_Name() {
		return First_Name;
	}

	public WebElement getLast_Name() {
		return Last_Name;
	}

	@FindBy(id = "last_name")
	private WebElement Last_Name;

	@FindBy(id = "address")
	private WebElement bill_Address;

	public WebElement getbill_Address() {
		return bill_Address;
	}

	@FindBy(id = "cc_num")
	private WebElement cc_num;

	public WebElement getcc_num() {
		return cc_num;
	}

	@FindBy(id = "cc_type")
	private WebElement cc_type;

	public WebElement getcc_type() {
		return cc_type;
	}

	@FindBy(id = "cc_exp_month")
	private WebElement cc_exp_month;

	public WebElement getcc_exp_month() {
		return cc_exp_month;
	}

	@FindBy(id="cc_exp_year")
	private WebElement cc_exp_year;

	public WebElement getcc_exp_year() {
		return cc_exp_year;
	}

	@FindBy(id = "cc_cvv")
	private WebElement cc_cvv;

	public WebElement getcc_cvv() {
		return cc_cvv;
	}

	@FindBy(id="book_now")
	private WebElement book_btn;

	public WebElement getBook_Btn() {
		return book_btn;

	}



}
