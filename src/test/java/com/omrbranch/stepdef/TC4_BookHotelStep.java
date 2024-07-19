package com.omrbranch.stepdef;



import java.util.List;
import java.util.Map;

import com.omrbranch.object.ObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC4_BookHotelStep {
	ObjectManager ob = new ObjectManager();

	
	@Then("User should verify the success message of {string}")
	public void user_should_verify_the_success_message_of(String string) {
		ob.getBookHotelPage().bookHotelSuccess();
	    
	}
	@When("User should add the Guest details {string},{string},{string},{string} and {string}")
	public void user_should_add_the_guest_details_and(String string, String string2, String string3, String string4, String string5) throws InterruptedException {
		ob.getBookHotelPage().guestDetails(string, string2, string3, string4, string5);
	    
	}
	
	@When("User should add the GST details {string},{string} and {string}")
	public void user_should_add_the_gst_details_and(String string, String string2, String string3) {
		ob.getBookHotelPage().addGST(string, string2, string3);
	    
	}



	@When("User should add the Special Request for {string}")
	public void user_should_add_the_special_request_for(String string) {
		ob.getBookHotelPage().specialReq(string);
	   
	}
	@When("User should add the Debit Card details for Payment with card type {string}")
	public void user_should_add_the_debit_card_details_for_payment_with_card_type(String string, io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> asMaps = dataTable.asMaps();
		Map<String, String> map = asMaps.get(0);
		String string2 = map.get("selectcard");
		String string3 = map.get("cardnum");
		String string4 = map.get("cardname");
		String string5 = map.get("month");
		String string6 = map.get("year");
		String string7 = map.get("cvv");
		ob.getBookHotelPage().cardDetails(string, string2, string3, string4, string5, string6, string7);

		
	    
	}
	@When("User should verify the hotel confirmation {string} and save order id")
	public void user_should_verify_the_hotel_confirmation_and_save_order_id(String string) {
		ob.getBookHotelPage().verifyBooking();
		
	   
	}
	@When("User should verify the selected hotel is booked or not")
	public void user_should_verify_the_selected_hotel_is_booked_or_not() {
	   
	}
	
	

	@When("User should add the Credit Card details for Payment with card type {string}")
	public void user_should_add_the_credit_card_details_for_payment_with_card_type(String string, io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> asMaps = dataTable.asMaps();
		Map<String, String> map = asMaps.get(0);
		String string2 = map.get("selectcard");
		String string3 = map.get("cardnum");
		String string4 = map.get("cardname");
		String string5 = map.get("month");
		String string6 = map.get("year");
		String string7 = map.get("cvv");
		ob.getBookHotelPage().cardDetails(string, string2, string3, string4, string5, string6, string7);
		
	}
	

	@Then("User should click the guest details next button and click special request submit button without passing a data")
	public void user_should_click_the_guest_details_next_button_and_click_special_request_submit_button_without_passing_a_data() {
	    ob.getBookHotelPage().nextbtn();
		
	}



	

	@When("User should click the submit button without entering a card details")
	public void user_should_click_the_submit_button_without_entering_a_card_details() {
		ob.getBookHotelPage().paymentSubmitButton();
	   
	}
	@Then("User should verify the all error message\"Please select your card type\",{string},{string},{string},{string} and {string}")
	public void user_should_verify_the_all_error_message_please_select_your_card_type_and(String string, String string2, String string3, String string4, String string5) {
	 ob.getBookHotelPage().errorMsg();
	}










}
