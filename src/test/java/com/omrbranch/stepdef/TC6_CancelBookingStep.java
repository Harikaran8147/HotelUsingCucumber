package com.omrbranch.stepdef;

import com.omrbranch.object.ObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC6_CancelBookingStep {
	ObjectManager ob = new ObjectManager();
	
	@When("User should search the cancel id {string}")
	public void user_should_search_the_cancel_id(String string) {
	    
	}
	@Then("User should verify the respective cancel order id is present or not")
	public void user_should_verify_the_respective_cancel_order_id_is_present_or_not() {
	   
	}
	@Then("User should verify the respective cancel hotel name is present or not")
	public void user_should_verify_the_respective_cancel_hotel_name_is_present_or_not() {
	    
	}
	@Then("User should verify the respective cancel hotel price is present or not")
	public void user_should_verify_the_respective_cancel_hotel_price_is_present_or_not() {
	  
	}
	@Then("User should verify cancel message {string}")
	public void user_should_verify_cancel_message(String string) {
	    
	}


	@When("User should search the existing orderid {string}")
	public void user_should_search_the_existing_orderid(String string) {
	    
	}
	@Then("User should cancel the booking")
	public void user_should_cancel_the_booking() {
	    
	}
	@Then("User should verify the cancel message {string}")
	public void user_should_verify_the_cancel_message(String string) {
		ob.getCancelHotelPage().cancelMsg();
	   
	}

	


	@When("User should cancel the firstorder id")
	public void user_should_cancel_the_firstorder_id() {
		ob.getCancelHotelPage().firstcancel();
	    
	}

	
	
	
	@When("User should cancel the Existing id")
	public void user_should_cancel_the_existing_id() {
	   ob.getCancelHotelPage().unknowncancel();
	}









	
	

	






}
