package com.example.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashBoardPage {
    final static  Logger logger=Logger.getLogger(DashBoardPage.class);
	public WebDriver driver=null;
	//locator
	
	By welcomeelement=By.id("welcome");
	
	By adminlink=By.id("menu_admin_viewAdminModule");
	By pimlink=By.id("menu_pim_viewPimModule");
	By leavelink=By.id("menu_leave_viewLeaveModule");


	
	By adminpagetitle=By.xpath("//div[@id='systemUser-information']/div/h1");
	
	By pimpagetitle=By.xpath("//div[@id='employee-information']/div/h1");
	By leavepagetitle=By.xpath("//div[@id='leave-list-search']/div/h1");
	
	//constructor
	
	public  DashBoardPage(WebDriver driver) {
		this.driver=driver;
	}
	

	public By username=By.id("txtUsername");
	
	public By password=By.name("txtPassword");
	public By loginBtn=By.xpath("//input[@type='submit']");
	
	
	
	//actions
	
	public String getTextWelcomeText() {
		
		/*
		 * String msg=driver.findElement(welcomeelement).getText(); 
		 * return msg;
		 */
		
		return driver.findElement(welcomeelement).getText();
	}
	
	public void clickAdmin() {
		
		driver.findElement(adminlink).click();
		
	}
	
	public void clickPIM() {
		
		driver.findElement(pimlink).click();
		
	}
	public void clickLeave() {
		
		driver.findElement(leavelink).click();
		
	}
public void login() {
		
	    driver.findElement(username).sendKeys("Admin");
	    driver.findElement(password).sendKeys("admin123");
	    driver.findElement(loginBtn).click();
	    
		 
	}
	
public String getPageTile(String Pagename) {
	String pagetitle;
	
	if(Pagename.equals("System Users")) {
		pagetitle=  driver.findElement(adminpagetitle).getText();
	}
	else if(Pagename.equals("Leave List") ){
		pagetitle=driver.findElement(leavepagetitle).getText();
	}else if(Pagename.equals("Employee Information")){
		
		WebElement pimElement=  driver.findElement(pimpagetitle);
		String pimtitle=pimElement.getText();
		pagetitle=pimtitle;
	}
	return Pagename;
	
}
	

 public String getCurrentURLnfo() {
	 String getCurrentUrl= driver.getCurrentUrl(); 
	String value= getCurrentUrl.split("/")[5];
	 return value;
	 
 }
	
	
}
