package com.omrbranch.baseClass;


	

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
	import java.util.List;
	import java.util.Set;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebDriver.Navigation;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class Baseclass {
	public static	WebDriver driver;
		
		public void browserLaunch() {
			driver = new ChromeDriver();

		}
				
		public void getAppUrl(String url) {
			driver.get(url);

		}
		public void maximizeWindow() {
			driver.manage().window().maximize();

		}
		public void sendKeys(WebElement ele , String data) {
			ele.sendKeys(data);
			
			
		}
		public void elementClick(WebElement ele) {
			ele.click();
			

		}
		public void okInAlert() {
			Alert alert = driver.switchTo().alert();
			alert.accept();
			

		}
		public void cancelAlert() {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
			

		}
		
		public String getTextFromWebPage(WebElement element) {
			String text = element.getText();
			return text;
			

		}
		
		public String getInsertedvalue(WebElement element,String att) {
			String attribute = element.getAttribute(att);
			return attribute;
			

		}
		public void closeAllWindow() {
			driver.quit();
			

		}
		private void closeCurrentWindow() {

			driver.close();

		}
		public String getTitle() {
			String title = driver.getTitle();
			return title;
			}
		public String getCurrentUrl() {
				String currentUrl = driver.getCurrentUrl();
				return currentUrl;
				
			
		}
		public void selectDropDownByText(WebElement ele ,String text) {
			Select s = new Select(ele);
			s.selectByVisibleText(text);
			
			}
		
		public void selectDropDownOptionByAttribute(WebElement ele,String data) {
			Select s = new Select(ele);
			s.selectByValue(data);

			}
		public void selectDropDownByindex(WebElement ele,int num) {
			Select s = new Select(ele);
			s.selectByIndex(num);
			
			}
		public WebElement findLocatorById(String attributevalue) {
			WebElement e = driver.findElement(By.id(attributevalue));
			return e;
			
			}
		public WebElement findLocatorByName(String names) {
			WebElement element = driver.findElement(By.name(names));
			return element;

		}
		public void switchTOFrame() {
			driver.switchTo().frame(0);

		}
		public void switchframebyFrameId(String f1) {
			driver.switchTo().frame(f1);

		}
		public WebElement locatorByClassName(String name) {
			WebElement element = driver.findElement(By.className(name));
			return element;
			
			}
		public WebElement locatorByXpath(String suma) {
			WebElement element = driver.findElement(By.xpath(suma));
			return element;
			

		}
		public List<WebElement> getAllOptionFromDropDown(Select s) {
			List<WebElement> options = s.getOptions();
			return options;
			

		}
		public String getFirstSelectedOptionsInDropDown(Select s) {
			WebElement firstSelectedOption = s.getFirstSelectedOption();
			String text = firstSelectedOption.getText();
			return text;
			

		}
		public boolean verifyMultipleSelectOption(Select s) {
			boolean multiple = s.isMultiple();
			return multiple;
			

		}
		public boolean isDisplayedornot(WebElement ele) {
			boolean displayed = ele.isDisplayed();
			return displayed;

		}
		
		public boolean isEnabled(WebElement ele) {
			boolean enabled = ele.isEnabled();
			return enabled;

		}
		public  boolean isSelectedd(WebElement ele) {
			boolean selected = ele.isSelected();
			return selected;
		}
		
		public void dragAndDrop(WebElement ele,WebElement xle) {
			Actions action = new Actions(driver);
			action.dragAndDrop(ele, xle);

		}
		
		public void rightClick(WebElement ele) {
		  Actions a = new Actions(driver);
		  a.contextClick(ele).perform();

		}
		
		public void doubleClick(WebElement elebtn) {
			Actions a = new Actions(driver);
			a.doubleClick(elebtn).perform();

		}
		
		public void refreshPage() {
			Navigation navigate = driver.navigate();
			driver.navigate().refresh();

		}
		
		public void deSelectByIndex(WebElement ele,int index) {
			Select select = new Select(ele);
			select.selectByIndex(index);
			select.deselectByIndex(index);

		}
		
		public void deSelectAll(WebElement ele,int index) {
			Select s = new Select(ele);
			s.selectByIndex(index);
			s.deselectAll();
					
		}
		public void deSelectByText(WebElement ele,String may) {  //may = may
			Select s = new Select(ele);
			s.deselectByVisibleText(may);
		}
		public void deSelectByAttribute(WebElement ele,String ap) {   //april=ap
			Select s = new Select(ele);
			s.selectByValue(ap);
			s.deselectByValue(ap);
		}
		
		public String parentWindow() {
			String windowHandle = driver.getWindowHandle();
			return windowHandle;

		}
		
		
		public Set<String> allWindowId() {
			Set<String> windowHandles = driver.getWindowHandles();
			return windowHandles;

		}
		public void enterkey() throws AWTException {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			

		}
		public void mouseOverActionForSingleOption(WebElement a, WebElement b) {
			Actions x= new Actions(driver);
			x.moveToElement(a).perform();
			x.moveToElement(b).perform();
		}
//		public void insertValueInTextBoxAndEnter(WebElement ele,String harikaran) {
//			ele.sendKeys(harikaran);//to check
//		}
		
		public void implicitWait() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		}
		
		//or
		
		public void implicitWit(int seconds) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
		}
		
		public static void getDriver(String browsertype) {
			 
			switch (browsertype) {
			case "chrome":
				driver = new ChromeDriver();
				
				break;
			case "firefox":
				driver = new FirefoxDriver();
				
				break;
			case "edge":
				driver = new EdgeDriver();
				
				break;
			

			default:
				break;
			}
		}

}
