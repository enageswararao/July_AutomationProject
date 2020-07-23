package com.hrm.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public WebDriver driver=null;
	
 
	
	public WebDriver getDriver(String browserType) {
		
 
		
		System.out.println("open chrome browser and loading HRM url");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ammulu123\\Jan2020\\SeleniumTrainingMay\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		this.driver=driver;
	 return driver;
	}
	

}
