package com.omrbranch.pages;

import java.awt.AWTException;

import com.omrbranch.baseClass.Baseclass;

public class Exe extends Baseclass {
	public void tc1() throws AWTException, InterruptedException {
		
		browserLaunch();
		getAppUrl("https://www.omrbranch.com/");
		maximizeWindow();
		Loginpage log = new Loginpage();
		log.login("harikaransrinivasan172000@gmail.com", "Greens@1234");
		SearchHotelPage shp = new SearchHotelPage();
		//shp.searchHotel("Andhra Pradesh", "Tirupati", "Deluxe", "2024-05-14", "2024-05-15", "1-One", "1-One", "2");
		//shp.enterOnlyMandatory("Andhra Pradesh", "Tirupati", "1-One", "1-One");
		//shp.errorMessage();
		//shp.verifyallhotelnameEndWithRoomType("Andhra Pradesh", "Tirupati", "Deluxe", "2024-05-14", "2024-05-15", "1-One", "1-One", "2");
		//shp.verifyallhotelnameEndWithAllRoomTypes("Andhra Pradesh", "Tirupati", "Standard","Deluxe","Suite","Luxury","Studio", "2024-05-14", "2024-05-15", "1-One", "1-One", "2");
		//shp.priceLowToHigh("Andhra Pradesh", "Tirupati", "Deluxe", "2024-05-14", "2024-05-15", "1-One", "1-One", "2");
		//shp.priceHightoLow("Andhra Pradesh", "Tirupati", "Deluxe", "2024-05-14", "2024-05-15", "1-One", "1-One", "2");
		//shp.ascendingHotel("Andhra Pradesh", "Tirupati", "Deluxe", "2024-05-14", "2024-05-15", "1-One", "1-One", "2");
		//shp.descendingHotel("Andhra Pradesh", "Tirupati", "Deluxe", "2024-05-14", "2024-05-15", "1-One", "1-One", "2");
		SelectHotelPage hp = new SelectHotelPage();
		hp.continueToAccep();
		//hp.continueToDismiss();
		BookHotelPage bhp= new BookHotelPage();
		//bhp.guestDetails(1, "Harikaran", "Srinivasan", "9080277916", "harikaransrinivasan172000@gmail.com", "9043592058", "Greens Tech OMR Branch", "Thoraipakkam", "Need a big car parkiing",1,1,"5555555555552222","vels",6,7,"789" );                          
		                                                                                      
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		Exe ex = new Exe();
		ex.tc1();
		
		
	}
	 
		
	}
	


