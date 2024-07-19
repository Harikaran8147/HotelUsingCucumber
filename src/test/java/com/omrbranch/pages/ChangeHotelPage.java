package com.omrbranch.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseClass.Baseclass;

import lombok.Data;


@Data
public class ChangeHotelPage extends Baseclass {
	public ChangeHotelPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//h3[contains(text(),'Hotel')]")
	private WebElement clickHotelpage;
	
	@FindBy(xpath = "//a[@data-testid=\"username\"]")
	private WebElement clickUsername;
	
	@FindBy(xpath = "//a[contains(text(),'My Account')]")
	private WebElement clickMyAcc;
	
	
	
	 @FindBy(xpath = "//*[contains(text(),' Booking is Confirmed ')]")
	    private WebElement bookingconfirm;
	 
	 @FindBy(xpath = "//*[contains(text(),'My Booking')]")
		private WebElement clkmybooking;
		
		@FindBy(xpath = "//h4[contains(text(),'Booking')]")
		private WebElement verifybooking;

	    
	    @FindBy(xpath = "//strong[contains(text(),'#')]")
	    private WebElement orderid;
	    
	    @FindBy(xpath = "//p[contains(text(),'Hotel ')]")
	    private WebElement finalhotelname;
	    
	    @FindBy(xpath = "//h5[contains(text(),'Select Hotel')]")
		private WebElement hotelsuccessmsg;
	    
	    @FindBy(xpath = "(//span[contains(text(),'#')])[2]")
	    private WebElement firstorderid;
	    
	    @FindBy(xpath = "(//span[contains(text(),'#')])[5]")
	    private WebElement existingorderid;
	    
	    @FindBy(xpath = "(//h5[contains(text(),' ')])[2]")
	    private WebElement firstHotelName;
	    
	    @FindBy(xpath = "(//strong[contains(text(),'$')])[1]")
	    private WebElement firstHotelPrice;
	    
	    @FindBy(xpath = "(//button[contains(text(),'Edit')])[1]")
	    private WebElement firstedit;
	    
	    @FindBy(xpath = "(//button[contains(text(),'Edit')])[3]")
	    private WebElement existingedit;
	    
	    
	    @FindBy(xpath = "//*[@name='check_in']")
	    private WebElement editcheckin;
	    
	    @FindBy(xpath = "(//a[@class='ui-state-default'])[1]")
	    private WebElement date;
	    
	    @FindBy(xpath = "(//button[@type='submit'])[1]")
	    private WebElement editsubmit;
	    
	    @FindBy(xpath = "//li[contains(text(),'Booking updated successfully')]")
	    private WebElement updatesuccessmdg;

	    
	    
	    
	    
	    public void myBookingPage() {
	    	implicitWait();
			elementClick(clkmybooking);

		}
	    
	   public void getOrderIds() {
		   String one = getTextFromWebPage(orderid);
		   System.out.println(one);
	}
	    
	    public void checkBookingisPresent() {
	    	implicitWait();
			String printBooking = getTextFromWebPage(verifybooking);
			System.out.println(printBooking);
			
		}
	    
	    public void verifyFirstOrderId() {
	    	getOrderIds();
	    	String foi = getTextFromWebPage(firstorderid);
	    	System.out.println(foi);
	    	

		}
	    
	    public void editCheckIn() {
			elementClick(firstedit);
			elementClick(editcheckin);
			elementClick(date);
			elementClick(editsubmit);

		}
	    
	    public void updateSuccess() {
			String upsuccess = getTextFromWebPage(updatesuccessmdg);
			System.out.println(upsuccess);
			Assert.assertEquals(upsuccess,"Booking updated successfully");

		}
	    
	    public void existingOrder() {
	    	elementClick(clickHotelpage);
	    	elementClick(clickUsername);
	    	elementClick(clickMyAcc);
		}
	    
	    public void existingEdit() {
	    	elementClick(existingedit);
	    	elementClick(editcheckin);
			elementClick(date);
			elementClick(editsubmit);

		}
	    
	    public void firstEdit() {
	    	elementClick(firstedit);
	    	elementClick(editcheckin);
			elementClick(date);
			elementClick(editsubmit);
	    	

		}
	    
	    
	    
	    
	    
	    
	    
	    
	
}
