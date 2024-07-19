package com.omrbranch.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseClass.Baseclass;

import lombok.Data;

@Data
public class CancelHotelPage extends Baseclass{
	
	public CancelHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[contains(text(),'Cancel')])[1]")
	private WebElement firstidCancel;
	
	@FindBy(xpath = "(//a[contains(text(),'Cancel')])[8]")
	private WebElement unknownidCancel;
	
	
	@FindBy(xpath = "//li[contains(text(),'Your booking cancelled successfully')]")
	private WebElement cancelSuccessMsg;
	
	
	public void firstcancel() {
		elementClick(firstidCancel);
		okInAlert();
		
	}
	
	public void unknowncancel() {
		elementClick(unknownidCancel);
		okInAlert();
		
	}
	
	public void cancelMsg() {
		String cancelMessage = getTextFromWebPage(cancelSuccessMsg);
		System.out.println(cancelMessage);
		Assert.assertEquals(cancelMessage, "Your booking cancelled successfully");
		

	}
	
	
}
