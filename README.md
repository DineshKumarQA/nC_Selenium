# nC_Selenium
This Repository is to Develop Selenium Automation Scripts For My 'nCompass' Project

Entry Point : 
1. excelRead [Read Excel & Store Values]
2. frameworks [The Stored Values from 'MAP' is Organized Here]
Notes : 
	a. beforeTest.DriverConfig AND beforeTest.Login Will be in Order, While Test Execution.
	b. To Achieve this, We Created New Class Called "beforeTest.Bfr_Any_Test"

Test Case Preparations :
3. marketTypes -> 
	"marketTypes.baseXXX" [For DealInput Functions And]
	"marketTypes.testXXX" [For 'Actual Test Cases']
	
3.1. "handleFields"
	a. This Package is Like "Utilities' Kind.
	b. The Common & Repetitive Functions Like 'Dropdown Value Select', 'TextInput', 'DateSelection',Etc Were Handled Here.
	C. Purpose : To Reduce the Repetitive Codes, By Calling these Functions

Test Case Execution :
4. TestNGSuite.LMMSuite.xml  [This is the Test Execution File. Right Click Run As 'TestNG Suite']

Other Notes : 
Excel : 
5. Placed in Project Directory Itself, For Easy Usage & Rectify Excel Missing.
	5.a. Location : CompassWeb.TestExcels.Elements (OR) TestInputs (OR) Test_Details
	5.b. Both Xpaths & Test Inputs Can Given Via Excels.
	5.c. Purpose : If Any Values Change Required / Xpath Changes, Can Given From Outside Codes Using Excels(As It is Easy & Widely Used)
	5.d **MaxAllowable Characters Defined in Excels Itself**
	
Logs : 
6. Placed in Project Directory Itself, For Easy Usage.
	6.a. Location : CompassWeb.log.nC_Test_Log
	6.b. The log Format Can be Altered Via 'log4j_CW.properties'
	
Driver : Chrome / Firefox / Edge
7. Instead Get Drivers Manually & Placed in Any Directories, We've Used "WebDriverManager". [Maven Dependencies]
	7.a. Location : CompassWeb.pom.xml
	7.b. Since This Dependencies Gave the Widely Used Browser Drivers, No Need Of Manual Drivers
	
Variables Naming Conventions : 
8. We've Following The Below Naming Conventions to Classify the Inputs by Name Ends With "_I"(Underscore followed by Short Characters).
	8.a WebDriver	=> Always 'driver'
	8.b Explicit_WebDriver_Wait => Ends With '_E'		
	8.c Fluent_WebDriver_Wait 	=> Ends With '_F'	
			
	8.d Other_Inputs 	=> Ends With '_I'	
			
	8.e Xpath Inputs	=> Ends With '_X'	
	8.f Element_Value 	=> Ends With '_EL'	
			
	8.g New_Mode-Inputs 	=> Ends With '_NI'	
	8.h New_Mode-RetrievedFieldValues 	=> Ends With '_NV'	
			
	8.i Edit_Mode-Inputs 		=> Ends With '_EI'
	8.j Edit_Mode-FieldValues 		=> Ends With '_EV'
	
	8.k Retrieved-FieldValues 		=> Ends With '_RV'

