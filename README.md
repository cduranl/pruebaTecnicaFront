# Prueba Ingreso Front (Selenium + Rest Assured)

 #### Project structure:

- The structure of the project is based on maven, which is developed using JAVA implementing selenium and TestNG with their 
respective basic Listeners (ITestListeners), and finally with a reporting tool, where there are 5 test cases each with their 
formatted name, 'TestCase00X', (X = 1 to 5), these test cases are in a test suite under the name 'AllTestSuite'. Each test 
case has its corresponding ID which is identified in the design and analysis document.

    1. TestCase001 (CP_001): Validate that the login form is displayed.
    2. TestCase002 (CP_002): Validate that the register form is displayed.
    3. TestCase003 (CP_003): Validate entering an empty string to the search bar.
    4. TestCase004 (CP_004): Validate searching for a certain product using the search bar.
    5. TestCase005 (CP_005): Validate adding a product to the shpping cart.

This project allows us to run 5 automated test cases using Chrome Driver and the website of:

- https://www.falabella.com/falabella-cl

**Tools & Requierments to have installed to execute properly:**
1. git
2. maven
3. allure

You can install this project by cloning the repository:

- $ git clone https://github.com/cduranl/pruebaTecnicaFront/

_Please note: You must be in the project directory where it was cloned to execute each command._

After cloning the project you can use the following commands within the terminal to run the tests:

1. To run the complete test suite (includes the 5 auotmated test cases):

    mvn -P AllTestSuite test
  
2. To run each test individually use the following command:

    mvn -Dtest=test.TestCase00'n'
  
  *Important: Replace each 'n' with a number inbetween 1 and 5, depending on which test case you want to run.
  
  
#### Allure Report:

1. To run the Allure Report use the following command:
    
    allure serve '[directory-path-of-project]/allure-results'
  
  
    
 **_Possible bugs & errors:_**
 
   1. Upon entering the data of an account to validate a login test case through an automated web browser the system would 
      return an error which denied access to the account of the website.
      - _Update: These 2 test cases were deleted and replaced with differnt test case situations._
   
   2. Upon running the test suite, the first test case would pass but the next test cases would fail, but running each test case 
      individually they pass their validations.
      - _Error indicated: NoSuchSessionException  invalid session id_
