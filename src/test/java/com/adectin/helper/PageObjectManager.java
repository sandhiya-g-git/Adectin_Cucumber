package com.adectin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.poms.BookHotel_Page;
import com.adactin.poms.Booking_Confirmation_Page;
import com.adactin.poms.Login_Page;
import com.adactin.poms.SearchHotel_Page;
import com.adactin.poms.SelectHotel_Page;

public class PageObjectManager {
	public WebDriver driver;

	private Login_Page login;

	private SearchHotel_Page searchhotel_page;

	private SelectHotel_Page selecthotel_page;

	private BookHotel_Page bookhotel_page;

	private Booking_Confirmation_Page booking_confirmation_page;

	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

	public Login_Page getInstanceLogin() {
		login = new Login_Page(driver);
		return login;

	}

	public SearchHotel_Page getInstanceSearchhotel_page() {
		searchhotel_page = new SearchHotel_Page(driver);
		return searchhotel_page;

	}

	public SelectHotel_Page getInstanceSelectHotel_Page() {
		selecthotel_page = new SelectHotel_Page(driver);
		return selecthotel_page;

	}

	public BookHotel_Page getInstanceBookHotel_Page() {
		bookhotel_page = new BookHotel_Page(driver);
		return bookhotel_page;

	}

	public Booking_Confirmation_Page getInstanceBooking_Confirmation_Pag() {
		booking_confirmation_page = new Booking_Confirmation_Page(driver);
		return booking_confirmation_page;

	}

}
