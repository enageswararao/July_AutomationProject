package com.hrm.stepdefinitions;

 
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.example.pages.DashBoardPage;
import com.example.pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
  

public class DashBoardStepdefinitions {
	   final static  Logger logger=Logger.getLogger(DashBoardStepdefinitions.class);
	
	WebDriver driver;
	public DashBoardPage dashboardpage=null;
	 public  LoginPage loginpage=null; 
 
	@Before
	public void init() {
		
		System.out.println("open chrome browser and loading HRM url");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ammulu123\\Jan2020\\SeleniumTrainingMay\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		  driver.get("https://opensource-demo.orangehrmlive.com/");
	}

@Given("^user is logged with admin$")
public void user_is_logged_with_admin(){
	 String userdirloction=System.getProperty("user.dir");
	 String log4path=System.getProperty("user.dir")+"/log4j.properties";

	 PropertyConfigurator.configure(log4path);	 
	System.out.println("user dir statement"+userdirloction);
     logger.info("Currrent dir path :"+userdirloction);
	 
	

	loginpage=new LoginPage(driver);
//	dashboardpage=  new DashBoardPage(driver);
	dashboardpage=loginpage.login();
	 logger.info("User is logged successfully");
 }

@When("^Click on Admin  link$")
public void click_on_Admin_link()  {
	dashboardpage.clickAdmin();
}

@When("^Click on PIM  link$")
public void click_on_PIM_link()  {
	dashboardpage.clickPIM();
}

@When("^Click on Leave  link$")
public void click_on_Leave_link()  {
	dashboardpage.clickLeave();
}


@Then("verify the {string} of the page")
public void verify_the_of_the_page(String pageTitle) {
     System.out.println("verify the {string} of the page");
     logger.info("Actual Page Title is --"+pageTitle);
     logger.info("Expected Page Title is --"+dashboardpage.getPageTile(pageTitle));

     Assert.assertEquals(pageTitle,dashboardpage.getPageTile(pageTitle));
    
}


 

@Then("verify the pagecurrent url contains {string}")
public void verify_the_pagecurrent_url_contains(String pageurl) {
     System.out.println("verify the pagecurrent url contains {string}\")");
     
     Assert.assertEquals(pageurl, dashboardpage.getCurrentURLnfo());
}




 @After
 public void teardown() {
	 
	 driver.close();
 }

}
