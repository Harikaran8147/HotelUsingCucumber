package com.omrbranch.pages;

import java.awt.AWTException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseClass.Baseclass;

import lombok.Data;

@Data
public class Loginpage extends Baseclass {

	public Loginpage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id = "email")
	private WebElement textmail;
	
	@FindBy(id = "pass")
	private WebElement textpass;
	
	@FindBy(xpath = "//button[@value='login']")
	private WebElement loginbtn;
	
	@FindBy(xpath = "//b[contains(text(),'or')]")
	private WebElement textloginerrormsg;
	
	@FindBy(xpath = "//a[@data-testid='username']")
	private WebElement welcomemsg;
	
	public void login(String giveemail,String givepass) {
		sendKeys(textmail, giveemail);
		sendKeys(textpass, givepass);
		elementClick(loginbtn);
		implicitWait();
		//getTextFromWebPage(welcomemsg);
		
		
	}
	public String loginSuccessText() {
		 return getTextFromWebPage(welcomemsg);
		
	}
	public void loginwithKeyEnter(String giveemail,String givepass) throws AWTException {
		sendKeys(textmail, giveemail);
		sendKeys(textpass, givepass);
		enterkey();
		implicitWait();
		//getTextFromWebPage(welcomemsg);
	}
	
	public void invalidCredentials(String giveemail,String givepass) {
		sendKeys(textmail, giveemail);
		sendKeys(textpass, givepass);
		elementClick(loginbtn);
		implicitWait();
		//getTextFromWebPage(textloginerrormsg);
		
	
		}
	public String errorMsg() {
		return getTextFromWebPage(textloginerrormsg);
	}
	
	
}
