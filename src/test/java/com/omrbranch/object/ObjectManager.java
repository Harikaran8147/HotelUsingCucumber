package com.omrbranch.object;

import com.omrbranch.pages.BookHotelPage;
import com.omrbranch.pages.CancelHotelPage;
import com.omrbranch.pages.ChangeHotelPage;
import com.omrbranch.pages.Loginpage;
import com.omrbranch.pages.SearchHotelPage;
import com.omrbranch.pages.SelectHotelPage;

public class ObjectManager {
	private Loginpage loginpage;
	private SearchHotelPage searchHotelPage;
	private SelectHotelPage selectHotelPage;
	private BookHotelPage bookHotelPage;
	private ChangeHotelPage changeHotelPage;
	private CancelHotelPage cancelHotelPage;
	public Loginpage getLoginpage() {
		return (loginpage==null)? loginpage = new Loginpage():loginpage;
	}
	public SearchHotelPage getSearchHotelPage() {
		return (searchHotelPage==null)? searchHotelPage = new SearchHotelPage():searchHotelPage;
	}
	public SelectHotelPage getSelectHotelPage() { 
		return (selectHotelPage==null)? selectHotelPage = new SelectHotelPage():selectHotelPage;
	}
	public BookHotelPage getBookHotelPage() {
		return (bookHotelPage==null)? bookHotelPage = new BookHotelPage():bookHotelPage;
	}
	public ChangeHotelPage getChangeHotelPage() {
		return (changeHotelPage==null)? changeHotelPage = new ChangeHotelPage():changeHotelPage;
	}
	public CancelHotelPage getCancelHotelPage() {
		return (cancelHotelPage==null)? cancelHotelPage = new CancelHotelPage():cancelHotelPage;
	}
	
	
	

}
