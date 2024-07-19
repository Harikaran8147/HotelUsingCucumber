package com.omrbranch.stepdef;

import org.junit.Assert;

import com.omrbranch.baseClass.Baseclass;
import com.omrbranch.object.ObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class TC2_SearchHotelStep extends Baseclass{
	ObjectManager ob = new ObjectManager();
	
	
	@When("User should pass all the fields {string} , {string} , {string} , {string} , {string} , {string} , {string} and {string}")
	public void user_should_pass_all_the_fields_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	   ob.getSearchHotelPage().searchHotel(string, string2, string3, string4, string5, string6, string7, string8);
		
		
	}
	@Then("User should verify after click the search and success message as {string}")
	public void user_should_verify_after_click_the_search_and_success_message_as(String exphotsuccess) {
		String out = ob.getSearchHotelPage().hotelsuccess();
		System.out.println(out);
		Assert.assertEquals("verify hotel success msg", exphotsuccess,out);
	  
	}

	
	@When("User should pass only the mandatory fields {string} , {string} , {string} , {string} , {string} and {string}")
	public void user_should_pass_only_the_mandatory_fields_and(String string, String string2, String string3, String string4, String string5, String string6) {
	    ob.getSearchHotelPage().enterOnlyMandatory(string, string2, string3, string4, string5, string6);
		
	}
	
	@Then("User should verify the all error message as {string} , {string} , {string} , {string} , {string} and {string}")
	public void user_should_verify_the_all_error_message_as_and(String string, String string2, String string3, String string4, String string5, String string6) {
		ob.getSearchHotelPage().errorMessage();
		
		
	}

	
	@Then("User should verify all hotel name ends with respective room type {string}")
	public void user_should_verify_all_hotel_name_ends_with_respective_room_type(String string) {
		ob.getSearchHotelPage().verifyallhotelnameEndWithRoomType();
	  
	}
	


	@When("User should click all room types in the fields {string} , {string} , {string} , {string} , {string} , {string} , {string} and {string}")
	public void user_should_click_all_room_types_in_the_fields_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	   
		ob.getSearchHotelPage().verifyallhotelnameEndWithAllRoomTypes(string, string2, string3, string4, string5, string6, string7, string8);
	}




	

	@Then("User should verify all room types {string}")
	public void user_should_verify_all_room_types(String string) {
		ob.getSearchHotelPage().allRoomSucMsg();
		
	    
	}
	
	
	@When("User to click the price low to high Check Box")
	public void user_to_click_the_price_low_to_high_check_box() throws InterruptedException {
		ob.getSearchHotelPage().lowtohigh();
	   
	}
	@Then("User should verify the all prices will be on {string}")
	public void user_should_verify_the_all_prices_will_be_on(String string) throws InterruptedException {
		ob.getSearchHotelPage().priceLowToHigh();
	   
	}
	

	@When("User to click the price high to low Check Bok")
	public void user_to_click_the_price_high_to_low_check_bok() {
		ob.getSearchHotelPage().hightolow();
	   
	}
	@Then("User should verify the all prices will be descending to ascending order {string}")
	public void user_should_verify_the_all_prices_will_be_descending_to_ascending_order(String string) throws InterruptedException {
		ob.getSearchHotelPage().priceHightoLow();
	 
	}



	@When("User to click the Ascending Check Bok")
	public void user_to_click_the_ascending_check_bok() {
		ob.getSearchHotelPage().ascClick();
	   
	}
	@Then("User should verify the all hotel name will be on ascending order\"Ascending\"")
	public void user_should_verify_the_all_hotel_name_will_be_on_ascending_order_ascending() throws InterruptedException {
		ob.getSearchHotelPage().ascendingHotel();
	   
	}
	
	

	@When("User to click the Descending Check Bok")
	public void user_to_click_the_descending_check_bok() {
		ob.getSearchHotelPage().desClick();
	    
	}
	@Then("User should verify the all hotel name will be on descending order {string}")
	public void user_should_verify_the_all_hotel_name_will_be_on_descending_order(String string) throws InterruptedException {
		ob.getSearchHotelPage().descendingHotel();
	    
	}






















	







}
