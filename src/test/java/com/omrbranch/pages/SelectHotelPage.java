package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseClass.Baseclass;
import com.omrbranch.object.ObjectManager;

import lombok.Data;

@Data
public class SelectHotelPage extends Baseclass {
	
	
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//*[contains(text(),'Continue')])[1]")
	private WebElement hightocontinue;

	 @FindBy(xpath = "(//h5[contains(text(),' ')])[2]")
	    private WebElement firstHotelName;
	 
	 @FindBy(xpath = "(//strong[contains(text(),'$')])[1]")
	    private WebElement firstHotelPrice;
	
	public void continueToAccep() {
		//elementClick(hightocontinue);
		okInAlert();
	}
	
	public void continueToDismiss() {
      //  elementClick(hightocontinue);
		cancelAlert();
	}
	
	public void continueClick() {
		elementClick(hightocontinue);

	}
	public void nameAndPrice() {
    	String fhn = getTextFromWebPage(firstHotelName);
    	System.out.println(fhn);
    	String fhp = getTextFromWebPage(firstHotelPrice);
    	System.out.println(fhp);
    	
		

	}
	
	
	
}
