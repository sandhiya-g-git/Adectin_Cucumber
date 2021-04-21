package com.adactin.poms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.adactin.Basecls.Base_Class2;
import com.sun.xml.internal.bind.v2.runtime.Location;

public class Adactin_Main extends Base_Class2 {

	public static void main(String[] args) {
		driver = getBrowser("Chrome");
		
		getUrl("http://adactinhotelapp.com/");

		Login_Page login = new Login_Page(driver);
		

		inputvalue(login.getUsername(), "firewall");
		sleep(4000);
		inputvalue(login.getPassword(), "B9Y7HQ");
		
		clickoneleme(login.getSignin_Btn());
		sleep(4000);

		SearchHotel_Page srhtl = new SearchHotel_Page(driver);
		
		//dropdownSelect(srhtl.getLocation(), Location, "byVisibileText", London);
		

		SelectHotel_Page slhtl = new SelectHotel_Page(driver);

		BookHotel_Page bhtl = new BookHotel_Page(driver);

		Booking_Confirmation_Page bcnfm = new Booking_Confirmation_Page(driver);
	}

}
