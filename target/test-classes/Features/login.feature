Feature: Login Orange HRM application
 As a test engeneer to validate login functionality of the Orange HRM application with all the combinations
  
@test
Scenario: Login Orange HRM application with Valid cradentials

	Given open chrome browser and loading HRM url
	When Enter Admin in Username textbox     
	And Enter Password in Password Textbox
	And Click on Login Button in the login page
   Then Verify text Admin on profile 
   
   
   
   
   @test
Scenario: Login Orange HRM application with inputs feature file cradentials

	Given open "chrome" browser and loading HRM "https://opensource-demo.orangehrmlive.com"
	When Enter "Admin" in Username textbox     
	And Enter "admin123" in Password Textbox
	And Click on Login Button in the login page
   Then Verify text "Admin" on profile 
   
   
    
  Scenario Outline: Login Orange HRM application with inputs feature file cradentials
	Given open "<browser>" browser and loading HRM "<baseurl>"
	When Enter "<username>" in Username textbox     
	And Enter "<password>" in Password Textbox
	And Click on Login Button in the login page
   Then Verify text "<VeryMsg>" on profile 
   Examples:
   |browser|baseurl                                  |username|password|veryMsg|
   |chrome |https://opensource-demo.orangehrmlive.com|Admin   |admin123|Admin  |
   |chrome |https://opensource-demo.orangehrmlive.com|Admin   |admin123|Admin  |
   |chrome |https://opensource-demo.orangehrmlive.com|Admin   |admin123|Admin  |
   |chrome |https://opensource-demo.orangehrmlive.com|Admin   |admin123|Admin  |
    