package com.omrbranch.stepdef;

import com.omrbranch.object.ObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC5_ChangeBookingStep {
	ObjectManager ob = new ObjectManager();
	
	

	@When("User should navigate into the my booking page")
	public void user_should_navigate_into_the_my_booking_page() {
		ob.getChangeHotelPage().myBookingPage();
	   
	}
	@Then("User should verify the {string} is present or not")
	public void user_should_verify_the_is_present_or_not(String string) {
		ob.getChangeHotelPage().checkBookingisPresent();
	    
	}
	@When("User should search the {string}")
	public void user_should_search_the(String string) {
	   
	}
	

	@Then("User should verify the respective order id,hotel name and hotel price is present or not")
	public void user_should_verify_the_respective_order_id_hotel_name_and_hotel_price_is_present_or_not() {
	    
	}



	
	
	
	
	@Then("User edit the checkin date")
	public void user_edit_the_checkin_date() {
		ob.getChangeHotelPage().editCheckIn();
	  
	}
	@When("User should verify the booking success message of {string}")
	public void user_should_verify_the_booking_success_message_of(String string) {
		ob.getChangeHotelPage().updateSuccess();
	    
	}
	
	
	
	
	@When("User should navigate into the my Account page")
	public void user_should_navigate_into_the_my_account_page() {
		ob.getChangeHotelPage().existingOrder();
	
	}
	
	@When("User edit the existing orderid checkin date")
	public void user_edit_the_existing_orderid_checkin_date() {
		ob.getChangeHotelPage().existingEdit();
	   
	}


	
	
	@When("User edit the first displayed orderid and checkin date")
	public void user_edit_the_first_displayed_orderid_and_checkin_date() {
	    
		ob.getChangeHotelPage().firstEdit();
	}




	
	

	@When("User should navigate into them booking page")
	public void user_should_navigate_into_them_booking_page() {
	    
	}
	@When("User should enter the existing {string}")
	public void user_should_enter_the_existing(String string) {
	   
	}
	@Then("User should verify the existing order id is present or not")
	public void user_should_verify_the_existing_order_id_is_present_or_not() {
	    
	}
	
	@When("User should click the first {string} and edit the checkin date")
	public void user_should_click_the_first_and_edit_the_checkin_date(String string) {
	  
	}









}
