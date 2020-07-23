package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;// null
 //************************************************************
 // Properties //WebElement // Locator 
 //************************************************************
 
	public By username=By.id("txtUsername");
	
	public By password=By.name("txtPassword");
	public By loginBtn=By.xpath("//input[@type='submit']");
	
	
	 //************************************************************
	 // Constructor of LoginPage class
	 //************************************************************
	
	public LoginPage(WebDriver driver){
		
		this.driver=driver;
	}
	
	
	
 //************************************************************
 // Method // Action 
 //************************************************************	
	
	
	public void enterUsername() {
		
	    driver.findElement(username).sendKeys("Admin");
	}
	
	public void enterUsername(String usernameinput) {
		
	    driver.findElement(username).sendKeys(usernameinput);
	}
	
	
	public void enterPassword() {
		
	    driver.findElement(password).sendKeys("admin123");
	}
	
	public void enterPassword(String passwordinput) {
		
	    driver.findElement(password).sendKeys(passwordinput);
	}
	public DashBoardPage ClickOnLogin() {
		
	    driver.findElement(loginBtn).click();
	    
	    return new DashBoardPage(driver);
	}
	
	
	
	public void invalidPage() {
		// user
		//invalid
		//click 
		
	}
	
	public DashBoardPage loginsuccess() {
		
		
		//click sign..
		
		return new DashBoardPage(driver);
		
	}
	
	public DashBoardPage login() {
		
	    driver.findElement(username).sendKeys("Admin");
	    driver.findElement(password).sendKeys("admin123");
	    driver.findElement(loginBtn).click();
	    
		return new DashBoardPage(driver);
	}
	

}
