Feature: Login Orange HRM application
 As a test engeneer to validate login functionality of the Orange HRM application with all the combinations
  

  Background:
    Given user is logged with admin 
     
@test
   Scenario: Login Orange HRM application and navigate admin page 
    When Click on Admin  link 
    Then verify the "System Users123" of the page
    Then verify the pagecurrent url contains "viewSystemUsers"
    
    @test
   Scenario: Login Orange HRM application and navigate PIM page 
    When Click on PIM  link 
    Then verify the "Employee Information" of the page
    Then verify the pagecurrent url contains "viewEmployeeList"
    
        @test
   Scenario: Login Orange HRM application and navigate Leave page 
    When Click on Leave  link 
    Then verify the "Leave List" of the page
    Then verify the pagecurrent url contains "viewLeaveList"
