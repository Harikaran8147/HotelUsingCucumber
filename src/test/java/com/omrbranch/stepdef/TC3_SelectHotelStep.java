package com.omrbranch.stepdef;

import com.omrbranch.object.ObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC3_SelectHotelStep {
	ObjectManager ob = new ObjectManager();
	
	

	@Then("User should save the first Hotel Name and Hotel Price")
	public void user_should_save_the_first_hotel_name_and_hotel_price() {
	    ob.getSelectHotelPage().nameAndPrice();
	}



	
	@When("User should Click the continue button")
	public void user_should_click_the_continue_button() {
		ob.getSelectHotelPage().continueClick();
		
	   
	}
	

	@Then("User after click the continue alert pop up is display and click on cancel button")
	public void user_after_click_the_continue_alert_pop_up_is_display_and_click_on_cancel_button() {
		ob.getSelectHotelPage().continueToDismiss();
	   
	}
	
	@Then("User after click the continue alert pop up is display and click on ok button")
	public void user_after_click_the_continue_alert_pop_up_is_display_and_click_on_ok_button() {
		ob.getSelectHotelPage().continueToAccep();
	   
	}






}
