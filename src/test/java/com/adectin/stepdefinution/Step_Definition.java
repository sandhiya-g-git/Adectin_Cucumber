package com.adectin.stepdefinution;

import com.adactin.Basecls.Base_Class2;
import com.adectin.helper.FileReaderManager;
import com.adectin.helper.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class2 {
	public static PageObjectManager pom = new PageObjectManager(driver);

	/*
	 * public static WebDriver driver = Test_Runner.driver;
	 * 
	 * public static Login_Page login = new Login_Page(driver);
	 * 
	 * public static SearchHotel_Page searchhotel_page = new
	 * SearchHotel_Page(driver);
	 * 
	 * public static SelectHotel_Page selecthotel_page = new
	 * SelectHotel_Page(driver);
	 * 
	 * public static BookHotel_Page bookhotel_page = new BookHotel_Page(driver);
	 * 
	 * public static Booking_Confirmation_Page booking_page = new
	 * Booking_Confirmation_Page(driver);
	 */
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		String url = FileReaderManager.getInstance().getInstanceCR().getUrl();
		getUrl(url);
	}

	@When("^user Enter The \"([^\"]*)\" In Username Fiels$")
	public void user_Enter_The_Username_In_Username_Fiels(String username) throws Throwable {
		inputvalue(pom.getInstanceLogin().getUsername(), username);
	}

	@When("^user Enter The \"([^\"]*)\" In Password Fiels$")
	public void user_Enter_The_Password_In_Password_Fiels(String password) throws Throwable {
		inputvalue(pom.getInstanceLogin().getPassword(), password);

	}

	@Then("^user Click on The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_on_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
		clickoneleme(pom.getInstanceLogin().getSignin_Btn());

	}

	@When("^user Select The Location In Select Location Fiels$")
	public void user_Select_The_Location_In_Select_Location_Fiels() throws Throwable {
		clickoneleme(pom.getInstanceSearchhotel_page().getLocation());
		dropdownSelect(pom.getInstanceSearchhotel_page().getLocation(), "byVisibileText", "London");
	}

	@Then("^user Click On The Seatch Button And It Navigates To The Select Hotel Page$")
	public void user_Click_On_The_Seatch_Button_And_It_Navigates_To_The_Select_Hotel_Page() throws Throwable {
		clickoneleme(pom.getInstanceSearchhotel_page().getSearch_Btn());
	}

	@When("^user Select The Hotels In Select Hotel Fiels$")
	public void user_Select_The_Hotels_In_Select_Hotel_Fiels() throws Throwable {
		clickoneleme(pom.getInstanceSelectHotel_Page().getSelect_Btn());

	}

	@Then("^user Click On The Continue Button And It Navigates To The Booking Hotel Page$")
	public void user_Click_On_The_Continue_Button_And_It_Navigates_To_The_Booking_Hotel_Page() throws Throwable {
		clickoneleme(pom.getInstanceSelectHotel_Page().getContinue_Btn());
	}

	@When("^user Enter The First Name In First Name Fiels$")
	public void user_Enter_The_First_Name_In_First_Name_Fiels() throws Throwable {
		inputvalue(pom.getInstanceBookHotel_Page().getFirst_Name(), "sandhiya");

	}

	@When("^user Enter The Last Name in Last Name Fiels$")
	public void user_Enter_The_Last_Name_in_Last_Name_Fiels() throws Throwable {
		inputvalue(pom.getInstanceBookHotel_Page().getLast_Name(), "g");
	}

	@When("^user Enter The Billing Address In Billing Address Fiels$")
	public void user_Enter_The_Billing_Address_In_Billing_Address_Fiels() throws Throwable {
		inputvalue(pom.getInstanceBookHotel_Page().getbill_Address(),
				"no8/9 thirunagar 6th street,vadapalani,chennai-26");
	}

	@When("^user Enter The Credit Card No In Credit Card No Fiels$")
	public void user_Enter_The_Credit_Card_No_In_Credit_Card_No_Fiels() throws Throwable {
		inputvalue(pom.getInstanceBookHotel_Page().getcc_num(), "1234567890123456");
	}

	@When("^user Select The Credit Card Type In Credit Card Type Fiels$")
	public void user_Select_The_Credit_Card_Type_In_Credit_Card_Type_Fiels() throws Throwable {
		clickoneleme(pom.getInstanceBookHotel_Page().getcc_type());
		dropdownSelect(pom.getInstanceBookHotel_Page().getcc_type(), "byVisibileText", "VISA");
	}

	@When("^user Select The Expiry Month In The Expiry Month Fiels$")
	public void user_Select_The_Expiry_Month_In_The_Expiry_Month_Fiels() throws Throwable {
		clickoneleme(pom.getInstanceBookHotel_Page().getcc_exp_month());
		dropdownSelect(pom.getInstanceBookHotel_Page().getcc_exp_month(), "byVisibileText", "September");
	}

	@When("^user Select The Expiry Year In The Expriry Year Fiels$")
	public void user_Select_The_Expiry_Year_In_The_Expriry_Year_Fiels() throws Throwable {
		clickoneleme(pom.getInstanceBookHotel_Page().getcc_exp_year());
		dropdownSelect(pom.getInstanceBookHotel_Page().getcc_exp_year(), "byValue", "2021");
	}

	@When("^user Enter The Cvv Number In Cvv Number Fiels$")
	public void user_Enter_The_Cvv_Number_In_Cvv_Number_Fiels() throws Throwable {
		inputvalue(pom.getInstanceBookHotel_Page().getcc_cvv(), "123");
	}

	@Then("^user Click Book Now Button And it Will Naviget To Booking Confirmation Page$")
	public void user_Click_Book_Now_Button_And_it_Will_Naviget_To_Booking_Confirmation_Page() throws Throwable {
		clickoneleme(pom.getInstanceBookHotel_Page().getBook_Btn());
		sleep(7000);
	}

	@When("^user Click My Itinerary Button$")
	public void user_Click_My_Itinerary_Button() throws Throwable {
		clickoneleme(pom.getInstanceBooking_Confirmation_Pag().getiti_Btn());
		sleep(7000);
	}

	@Then("^user Click The Log Out Button$")
	public void user_Click_The_Log_Out_Button() throws Throwable {
		clickoneleme(pom.getInstanceBooking_Confirmation_Pag().getLogout());
	}

}
