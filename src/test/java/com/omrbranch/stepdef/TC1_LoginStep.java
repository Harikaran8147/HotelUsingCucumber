package com.omrbranch.stepdef;



import java.awt.AWTException;

import org.junit.Assert;

import com.omrbranch.baseClass.Baseclass;
import com.omrbranch.object.ObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class TC1_LoginStep  extends Baseclass{
	ObjectManager obm = new ObjectManager();
	

	@Given("User is on OMR login page")
	public void user_is_on_omr_login_page() {
		browserLaunch();
		getAppUrl("https://www.omrbranch.com/");
		maximizeWindow();
	}
	@When("User Login with valid {string} and {string}")
	public void user_login_with_and(String string, String string2) {
		obm.getLoginpage().login(string, string2);
	   
	}
	@Then("User should verify the after Login {string}")
	public void user_should_verify_the_after_login(String ExploginSuccessText) {
		String logSuccessText = obm.getLoginpage().loginSuccessText();
		System.out.println(logSuccessText);
		Assert.assertEquals("verify login success text", ExploginSuccessText,logSuccessText);
	   
	}

	
	@When("User Login with {string} and {string} using the Enter key")
	public void user_login_with_and_using_the_enter_key(String string, String string2) throws AWTException {
	   obm.getLoginpage().loginwithKeyEnter(string, string2);
	}
	
//
//	@Then("User should verify the after Login Error message {string}")
//	public void user_should_verify_the_after_login_error_message(String Experrmsg) {
//		obm.getLoginpage().invalidCredentials(string, string);
//		String errorMsg = obm.getLoginpage().errorMsg();
//		System.out.println(errorMsg);
//		Assert.assertEquals("verify error mdg", errorMsg);
//		boolean contains = errorMsg.contains(string);
//		Assert.assertEquals("verify error mdg",contains);
//		
//		String msg = obm.getLoginpage().errorMsg();
//		System.out.println(msg);
//		Assert.assertEquals("verify error msg",Experrmsg,msg);
//	}


	@When("User Login with invalid {string} and {string}")
	public void user_login_with_invalid_and(String string, String string2) {
		obm.getLoginpage().invalidCredentials(string, string2);
		
		
	}
	


	@Then("User should verify the after Login Error message {string}")
	public void user_should_verify_the_after_login_error_message(String Experrmsg) {
		String msg = obm.getLoginpage().errorMsg();
		System.out.println(msg);
		Assert.assertEquals("verify error msg",Experrmsg,msg);
	    
	   
	}












	


}
