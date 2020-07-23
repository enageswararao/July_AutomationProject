package com.hrm.stepdefinitions;

 
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.example.pages.DashBoardPage;
import com.example.pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdefintions      {

	 
	  public WebDriver driver; 
	  LoginPage loginpage; 
	  DashBoardPage dashboarpage;
 
		/*
		 * @Before public void init() {
		 * 
		 * System.out.println("open chrome browser and loading HRM url");
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\ammulu123\\Jan2020\\SeleniumTrainingMay\\drivers\\chromedriver.exe"
		 * ); driver = new ChromeDriver(); driver.manage().window().maximize(); //
		 * driver.get("https://opensource-demo.orangehrmlive.com/"); }
		 */
	   @Given("^open chrome browser and loading HRM url$") 
	   public void open_chrome_browser_and_loading_HRM_uRL() {
			
		 
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  }
	 
	  @When("^Enter Admin in Username textbox$") 
	  public void  enter_in_Username_textbox() {
	  System.out.println("^Enter  Admin in User Textbox");
 
	  loginpage = new LoginPage(driver); loginpage.enterUsername();
	  }
	 
	  @When("^Enter Password in Password Textbox$") 
	  public void  enter_Password_in_Password_Textbox() {
	   System.out.println("^Enter  Password in Password Textbox");
	  
	  loginpage.enterPassword();
  
  }
 
	   @When("^Click on Login Button in the login page$") 
	   public void 	 click_on_Login_Button_in_the_login_page() {
	  System.out.println("Click on Login Button in the login page");
	  
	  dashboarpage = loginpage.ClickOnLogin(); }
	  
	  @SuppressWarnings("deprecation")
	  
	  @Then("^Verify text Admin on profile$") public void
	  verify_the_message_in_HomePage() {
 
	 System.out.println("Verify text Admin on profile");
	   
	  String actualtextvalue = dashboarpage.getTextWelcomeText();
	  System.out.println("Dashpage text value -----" + actualtextvalue); String
	  splitArray[] = actualtextvalue.split(" ");
	   
	   if(splitArray[1].equals("Admin1234")) { System.out.println("Passed"); }else {
	   System.out.println("Failed"); }
	   
	   Assert.assertEquals("Admin", splitArray[1]);
	   
	  }
	  
	   @Given("^open \"([^\"]*)\" browser and loading HRM \"([^\"]*)\"$") 
	   public   void open_browser_and_loading_HRM(String browser, String baseurl) {
	   
	  System.out.println("open chrome browser and loading HRM url");
	   
	   if (browser.equals("chrome")) 	   {
		  // System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammulu123\\Jan2020\\SeleniumTrainingMay\\drivers\\chromedriver.exe"   ); 
		 // driver = new ChromeDriver(); 
		   }
	   else if (browser.equals("firefox")) {
	 
				/*
				 * driver.manage().window().maximize(); driver.get(baseurl);
				 */
	   
	   }
	   driver.manage().window().maximize();
		  driver.get(baseurl);
	   }
  
	  @When("^Enter \"([^\"]*)\" in Username textbox$")
	  public void  enter_in_Username_textbox(String username) { 
		  loginpage = new 	 LoginPage(driver); 
	  loginpage.enterUsername(username);
	  
	   }
	  
	  @When("^Enter \"([^\"]*)\" in Password Textbox$")
	  public void  enter_in_Password_Textbox(String password) {
	  
	   loginpage.enterPassword(password);
	  
	  }
	   
	   @Then("^Verify text \"([^\"]*)\" on profile$") 
	   public void  verify_text_on_profile(String Admintext) {
	   
	   System.out.println("Verify text Admin on profile");
	   
	   String actualtextvalue=dashboarpage.getTextWelcomeText();
	   System.out.println("Dashpage text value -----"+actualtextvalue); String
	   splitArray[]= actualtextvalue.split(" ");
	   
	   if(splitArray[1].equals("Admin1234")) { System.out.println("Passed"); }else {
	   System.out.println("Failed"); }
	   
	   Assert.assertEquals(Admintext, splitArray[1]);
 	   
	   }
	   
		/*
		 * @After public void teardown() { driver.close(); }
		 */
	  
}
