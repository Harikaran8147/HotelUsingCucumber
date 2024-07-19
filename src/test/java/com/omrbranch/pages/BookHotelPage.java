package com.omrbranch.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseClass.Baseclass;

import lombok.Data;

@Data
public class BookHotelPage extends Baseclass {
	
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//h2[contains(text(),'Book Hotel')])[1]")
	private WebElement book;
	
    @FindBy(id = "own")
	private WebElement clkMyself;
    
    @FindBy(id = "user_title")
    private WebElement usertitle;
    
    @FindBy(id = "first_name")
	private WebElement firstname;
    
    @FindBy(id = "last_name")
    private WebElement lastname;
    
    @FindBy(id = "user_phone")
    private WebElement phoeno;
    
    @FindBy(id ="user_email")
    private WebElement email;
    
    @FindBy(id = "gst")
    private WebElement gst;
    
    @FindBy(id = "gst_registration")
    private WebElement gstno;
    
    @FindBy(id = "company_name")
    private WebElement companyname;
    
    @FindBy(id = "company_address")
    private WebElement companyadd;
    
    @FindBy(id = "step1next")
    private WebElement guestdetailsconbtn;
    
    
    @FindBy(id = "late")
    private WebElement clklatecheckin;
    
    @FindBy(id = "other_request")
    private WebElement otherreq;
    
    
    @FindBy(id = "step2next")
    private WebElement specialreqconbtn;
    
    
    @FindBy(xpath = "//*[contains(text(),'Credit/Debit/ATM Card')]")
    private WebElement paymentopbtn;
    
    @FindBy(id = "payment_type")
    private WebElement credebtype;
    
    @FindBy(id = "card_type")
    private WebElement selcardtype;
    
    @FindBy(id = "card_no")
    private WebElement entercardno;
    
    @FindBy(id = "card_name")
    private WebElement entercardname;
    
    @FindBy(id = "card_month")
    private WebElement selcardmonth;
    
    @FindBy(id = "card_year")
    private WebElement selcardyear;
    
    @FindBy(id = "cvv")
    private WebElement entercvv;
    
    @FindBy(id = "submitBtn")
    private WebElement paymentbubmitbtn;
    
    
    //error for payment
    @FindBy(id = "invalid-payment_type")
    private WebElement invalidcredeb;
    
    @FindBy(id = "invalid-card_type")
    private WebElement invalidcardtype;
    
    @FindBy(id = "invalid-card_no")
    private WebElement invalidcardno;
    
    @FindBy(id = "invalid-card_name")
    private WebElement invalidcardname;
    
    @FindBy(id = "invalid-card_month")
    private WebElement invalidcardmonth;
    
    @FindBy(id = "invalid-cvv")
    private WebElement invalidcvv;
    
    
    //
    @FindBy(xpath = "//h2[contains(text(),' Booking is Confirmed ')]")
    private WebElement bookingconfirm;
    
    @FindBy(xpath = "//strong[contains(text(),'#')]")
    private WebElement orderid;
    
    @FindBy(xpath = "//p[contains(text(),'Hotel ')]")
    private WebElement finalhotelname;
    
    @FindBy(xpath = "//h5[contains(text(),'Select Hotel')]")
	private WebElement hotelsuccessmsg;
    
//    @FindBy(xpath = "(//h5[contains(text(),' ')])[2]")
//    private WebElement firstHotelName;
//    
//    @FindBy(xpath = "(//strong[contains(text(),'$')])[1]")
//    private WebElement firstHotelPrice;
    
    public void guestDetails(String num,String fName,String lName,String phno,String mail) throws InterruptedException {
    	//implicitWait();
    	Thread.sleep(3000);
    	elementClick(clkMyself);
    	selectDropDownByText(usertitle, num);
    	sendKeys(firstname, fName); 
    	sendKeys(lastname, lName);
    	sendKeys(phoeno, phno);
    	sendKeys(email, mail);
//    	elementClick(gst);
//    	sendKeys(gstno, gsno);
//    	sendKeys(companyname, cname);
//    	sendKeys(companyadd, cadd);
//    	elementClick(guestdetailsconbtn);
//    	elementClick(clklatecheckin);
//    	sendKeys(otherreq, req);
    	//elementClick(specialreqconbtn);
//    	elementClick(paymentopbtn);
//    	selectDropDownByindex(credebtype, cred);
//    	selectDropDownByindex(selcardtype, vis);
//    	sendKeys(entercardno, cno);
//    	sendKeys(entercardname, cardn);
//    	selectDropDownByindex(selcardmonth, cmon);
//    	selectDropDownByindex(selcardyear, cyear);
//    	sendKeys(entercvv, cvvno);
//    	elementClick(paymentbubmitbtn);
    	
    	

	}
    public void bookHotelSuccess() {
		String bk = getTextFromWebPage(book);
		System.out.println(bk);

	}
    public void addGST(String gsno,String cname,String cadd) {
    	elementClick(gst);
    	sendKeys(gstno, gsno);
    	sendKeys(companyname, cname);
    	sendKeys(companyadd, cadd);
	
	}
    public void specialReq(String req) {
    	elementClick(guestdetailsconbtn);
    	elementClick(clklatecheckin);
    	sendKeys(otherreq, req);
    	elementClick(specialreqconbtn);

	}
    public void cardDetails(String cred,String vis,String cno ,String cardn,String cmon,String cyear,String cvvno) throws InterruptedException {
    	elementClick(paymentopbtn);
    	
    	selectDropDownByText(selcardtype, vis);
    	selectDropDownByText(credebtype, cred);
    	sendKeys(entercardno, cno);
    	sendKeys(entercardname, cardn);
    	selectDropDownByText(selcardmonth, cmon);
    	selectDropDownByText(selcardyear, cyear);
    	sendKeys(entercvv, cvvno);
    	Thread.sleep(3000);
    	elementClick(paymentbubmitbtn);
    	
	}
    
    public void CreditCa(String cred,String vis,String cno ,String cardn,String cmon,String cyear,String cvvno) throws InterruptedException {
    	 {
    	elementClick(paymentopbtn);
    	selectDropDownByText(selcardtype, vis);
    	selectDropDownByText(credebtype, cred);
    	sendKeys(entercardno, cno);
    	sendKeys(entercardname, cardn);
    	selectDropDownByText(selcardmonth, cmon);
    	selectDropDownByText(selcardyear, cyear);
    	sendKeys(entercvv, cvvno);
    	Thread.sleep(3000);
    	elementClick(paymentbubmitbtn);
    	
	}
    
    
    }
    public void nextbtn() {
		elementClick(guestdetailsconbtn);
		elementClick(specialreqconbtn);

	}
    
    public void paymentSubmitButton() {
    	
    	elementClick(paymentopbtn);

	}
    
    public void errorMsg() {
		elementClick(paymentbubmitbtn); 
		String errcard = getTextFromWebPage(invalidcredeb);
		System.out.println(errcard);
		//Assert.assertEquals(errcard, 0);
		String errno = getTextFromWebPage(invalidcardno);
		System.out.println(errno);
		String errtype = getTextFromWebPage(invalidcardtype);
		System.out.println(errtype);
		 String errmon = getTextFromWebPage(invalidcardmonth);
		 System.out.println(errmon);
		String errname = getTextFromWebPage(invalidcardname);
		System.out.println(errname);
		String errcvv = getTextFromWebPage(invalidcvv);
		System.out.println(errcvv);
		
		

	}
    public void verifyBooking() {
		String confirmmsg = getTextFromWebPage(bookingconfirm);
		//Assert.assertEquals(bookingconfirm, confirmmsg);
		System.out.println(confirmmsg);
		
		String order = getTextFromWebPage(orderid);
		//Assert.assertEquals(orderid, order);
		System.out.println(order);

	}
    
    
    
    
    
    
}
