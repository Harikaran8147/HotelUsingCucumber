package com.omrbranch.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseClass.Baseclass;

import lombok.Data;

@Data
public class SearchHotelPage extends Baseclass {
	
	public SearchHotelPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//h3[contains(text(),'Hotel')]")
	private WebElement clickHotelpage;
	
	@FindBy(xpath = "//a[@data-testid='username']")
	private WebElement welcomemsg;
	
	@FindBy(id = "state")
	private WebElement state;
	
	@FindBy(id = "city")
	private WebElement city;
	
	@FindBy(id = "room_type")
	private WebElement selroomtype;
	
	@FindBy(xpath = "//h3[text()='Hotel Booking']")
	private WebElement clkhotel;
	
	@FindBy(xpath = "(//div[@class='inout-control col-md-3'])[1]")
	private WebElement checkin;
	
	@FindBy(xpath = "(//a[@class='ui-state-default'])[1]")
	private WebElement checkindate;
	
	@FindBy(xpath = "(//div[@class='inout-control col-md-3'])[2]")
	private WebElement checkout;
	
	//@FindBy(xpath = "(//a[@class='ui-state-default'])[1]")
	//private WebElement checkoutdate;
	@FindBy(xpath = "//a[text()='30']")
	private WebElement checkoutdate;
	
	
	
	@FindBy(id = "no_rooms")
	private WebElement room;
	
	@FindBy(id = "no_adults")
	private WebElement adults;
	
	@FindBy(id = "no_child")
	private WebElement nochild;
	
	@FindBy(xpath = "//button[@class='btn filter_btn']")
	private WebElement clksearchbtn;
	
	@FindBy(id = "invalid-state")
	private WebElement invalidstate;
	
	@FindBy(id = "invalid-city")
	private WebElement invalidcity;
	
	@FindBy(id = "invalid-check_in")
	private WebElement invalidcheckin;
	
	@FindBy(id = "invalid-check_out")
	private WebElement invalidcheckout;
	
	@FindBy(id = "invalid-no_rooms")
	private WebElement invalidroom;
	
	@FindBy(id = "invalid-no_adults")
	private WebElement invalidadults;
	
	@FindBy(xpath = "//h5[contains(text(),'Deluxe')]")
	private WebElement delxue;
	
	@FindBy(xpath = "//h5[contains(text(),'Select Hotel')]")
	private WebElement hotelsuccessmsg;
	
//	@FindBy(xpath = "(//*[contains(text(),'Price low to high')])[2]")
//	private WebElement lowtohigh;
//	
//	@FindBy(xpath = "(//*[contains(text(),'Price High to low')])[1]")
//	private WebElement hightolow;
	
	@FindBy(xpath = "//h5[contains(text(),'Deluxe')]")
	private List<WebElement> deluxe;
	
	@FindBy(xpath = "//a[contains(text(),'Standard/Deluxe/Suite/Luxury/Studio')]")
	private WebElement allroomtypes;
	
	@FindBy(xpath = "//label[contains(text(),'Price low to high')]")
	private WebElement clicklowtohigh;
	
	@FindBy(xpath = "//label[contains(text(),'Price High to low')]")
	private WebElement clickhightolow;
	
	@FindBy(xpath = "//label[contains(text(),'Name Ascending')]")
	private WebElement clickAsc;
	
	@FindBy(xpath  = "//h5[contains(text(),' ')]//ancestor::div[@class='col-md-5 hotel-suites']")
	private List<WebElement> hotelnames;
	
	@FindBy(xpath = "//label[contains(text(),'Name Descending')]")
	private WebElement clickDes;
	
	
	@FindBy(xpath = "//strong[contains(text(),'$')]")
	private List<WebElement> price;
	
	public String hotelsuccess() {
		   //implicitWait();
		   String hsm = getTextFromWebPage(hotelsuccessmsg);
		   return hsm;
		   

		}
	
	
	public String getLoginSuccesMsg() {
		String welcome = getTextFromWebPage(welcomemsg);
		return welcome;
		
		
	}
	
	public void searchHotel(String statename,String cityname,String roomtype,String CheckInDate,String CheckOutDate,
			String noofrooms,String adultcount,String child) {
		implicitWait();
		elementClick(clkhotel);
		implicitWait();
		//elementClick(state);
		//getLoginSuccesMsg();
		selectDropDownByText(state, statename);
		selectDropDownByText(city, cityname);
		selectDropDownByText(selroomtype, roomtype);
		elementClick(checkin);
		elementClick(checkindate);
		elementClick(checkout);
		elementClick(checkoutdate);
		selectDropDownByText(room, noofrooms);
		selectDropDownByText(adults, adultcount);
		sendKeys(nochild, child);
		switchTOFrame();
		elementClick(clksearchbtn);
		driver.switchTo().defaultContent();
		//implicitWait();
		//hotelsuccess();
		
	}
	
	
	public void enterOnlyMandatory(String statename,String cityname,String CheckInDate,String CheckOutDate,String noofrooms,String adultcount) {
		implicitWait();
		elementClick(clkhotel);
		implicitWait();
		getLoginSuccesMsg();
		selectDropDownByText(state, statename);
		selectDropDownByText(city, cityname);
		elementClick(checkin);
		elementClick(checkindate);
		elementClick(checkout);
		elementClick(checkoutdate);
		selectDropDownByText(room, noofrooms);
		selectDropDownByText(adults, adultcount);
		switchTOFrame();
		elementClick(clksearchbtn);
		driver.switchTo().defaultContent();
//		implicitWait();
//		hotelsuccess();
		
	}
	
	public void errorMessage() {
		implicitWait();
		elementClick(clkhotel);
		getLoginSuccesMsg();
		switchTOFrame();
		elementClick(clksearchbtn);
		driver.switchTo().defaultContent();
		getTextFromWebPage(invalidstate);
		getTextFromWebPage(invalidcity);
		getTextFromWebPage(invalidcheckin);
		getTextFromWebPage(invalidcheckout);
		getTextFromWebPage(invalidroom);
		getTextFromWebPage(invalidadults);	
		
		
	}
	public void verifyallhotelnameEndWithRoomType()//delxue
	{
//		implicitWait();
//		elementClick(clkhotel);
//		implicitWait();
//		getLoginSuccesMsg();
//		//elementClick(state);
//		selectDropDownByText(state, statename);
//		selectDropDownByText(city, cityname);
//		selectDropDownByText(selroomtype, roomtype);
//		elementClick(checkin);
//		elementClick(checkindate);
//		elementClick(checkout);
//		elementClick(checkoutdate);
//		selectDropDownByText(room, noofrooms);
//		selectDropDownByText(adults, adultcount);
//		sendKeys(nochild, child);
//		switchTOFrame();
//		elementClick(clksearchbtn);
//		implicitWait();
//		hotelsuccess();
		String type ="Deluxe";
		for (WebElement RoomTy : deluxe) {
			String endswithdel = RoomTy.getText();
			System.out.println(endswithdel);
			boolean with = endswithdel.endsWith(type);
			System.out.println(with);	
			
		}
		

	}
	
	public void verifyallhotelnameEndWithAllRoomTypes(String statename,String cityname,String r1,String CheckInDate,String CheckOutDate,
			String noofrooms,String adultcount,String child) {
		implicitWait();
		elementClick(clkhotel);
		implicitWait();
		getLoginSuccesMsg();
		selectDropDownByText(state, statename);
		selectDropDownByText(city, cityname);
		
		selectDropDownByText(selroomtype, r1);
		selectDropDownByText(selroomtype, r1);
		selectDropDownByText(selroomtype, r1);
		selectDropDownByText(selroomtype, r1);
		selectDropDownByText(selroomtype, r1);
		elementClick(checkin);
		elementClick(checkindate);
		elementClick(checkout);
		elementClick(checkoutdate);
		selectDropDownByText(room, noofrooms);
		selectDropDownByText(adults, adultcount);
		sendKeys(nochild, child);
		switchTOFrame();
		elementClick(clksearchbtn);
//		implicitWait();
//		hotelsuccess();
//
//		String allroom = getTextFromWebPage(allroomtypes);
//		System.out.println(allroom);
		
	
	}
	public void allRoomSucMsg() {
		implicitWait();
		hotelsuccess();

		String allroom = getTextFromWebPage(allroomtypes);
		System.out.println(allroom);

	}
	
	public void priceLowToHigh() throws InterruptedException {
		Thread.sleep(3000);
		List<String> dev = new ArrayList<String>();
		List<String> qa = new ArrayList<String>();
		for (WebElement lowtohigh : price) {
			String low = lowtohigh.getText();
			System.out.println(low);
			dev.add(low);
		}
		qa.addAll(dev);
		System.out.println("dev" + dev);
		System.out.println("qa" + qa);
		Collections.sort(qa);
		boolean equals = dev.equals(qa);
		if (equals) {
			System.out.println("The price is low to high sorting order");
		}else {
			System.out.println("The price is not a sorting order");
		}
	}
	
	public void lowtohigh() {
		elementClick(clicklowtohigh);

	}
	
	public void priceHightoLow() throws InterruptedException {
		//elementClick(clickhightolow);
		Thread.sleep(5000);
		List<String> dev = new ArrayList<String>();
		List<String> qaa = new ArrayList<String>();
		for (WebElement hightolow : price) {
			String high = hightolow.getText();
			System.out.println(high);
			dev.add(high);
		}
		qaa.addAll(dev);
		Collections.sort(qaa);
		Collections.reverse(qaa);
		System.out.println("dev" + dev);
		System.out.println("qaa" + qaa);
		
		boolean equals = dev.equals(qaa);
		if (equals) {
			System.out.println("The price is high to low");
		}else {
			System.out.println("The price is not a sorting order");
		}
		
		
	}
	
	public void hightolow() {
		elementClick(clickhightolow);

	}
	
	public void ascendingHotel() throws InterruptedException {

		Thread.sleep(3000);
		List<String> dev = new ArrayList<String>();
		List<String> qa = new ArrayList<String>();
		for (WebElement names: hotelnames) {
			String text = names.getText();
			System.out.println(text);
			dev.add(text);
		}
		qa.addAll(dev);
		System.out.println("dev" + dev);
		System.out.println("qa" + qa);
		Collections.sort(qa);
		System.out.println("qa" + qa);
		boolean equals = dev.equals(qa);
		if (equals) {
			System.out.println("The Hotel name is ascending order");
		}else {
			System.out.println("The Hotel name is not a order");
		}

		
	}
	public void ascClick() {
		elementClick(clickAsc);

	}

	public void descendingHotel() throws InterruptedException {
	
	//	elementClick(clickDes);
		Thread.sleep(3000);
		List<String> dev = new ArrayList<String>();
		List<String> qa = new ArrayList<String>();
		for (WebElement names: hotelnames) {
			String text = names.getText();
			System.out.println(text);
			dev.add(text);
		}
		qa.addAll(dev);
		System.out.println("dev" + dev);
		System.out.println("qa" + qa);
		Collections.sort(qa);
		Collections.reverse(qa);
		boolean equals = dev.equals(qa);
		if (equals) {
			System.out.println("The Hotel name is descending order");
		}else {
			System.out.println("The Hotel name is not a order");
		}

		
	}
	public void desClick() {
		elementClick(clickDes);

	}
	
}