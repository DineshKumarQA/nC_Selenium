package marketTypesTest.LMM;

import java.text.ParseException;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Loan_ND_NewMode_Inputs {

	// Declarations Of Log4j For This Class
	public static Logger log = Logger.getLogger(Loan_ND_NewMode_Inputs.class.getName());

	// Declarations Of Driver Components For This Class
	public static WebDriver driver;
	public static WebDriverWait wait_E;			//WAIT -> Ends With '_E' Mean 'Explicit Wait'.
	public static Wait<WebDriver> wait_F;		//WAIT -> Ends With '_F' Mean 'Fluent Wait'.
	
	public static String DealID_NV;
	
	// If Given MatDt -> Get 'Tenor'-Value & Vice Versa. 
	public static String Maturity_Date_NV;   // Variable Name Ends With '_NV' Means 'New_Mode-Element_Value'.
	public static String Tenor_NV;
	
	public static String Reference_Rate_NV;
	public static String Rate_NV;
	
	public static String Principal_Freq_NV;
	public static String Interest_Freq_NV;
	public static String Day_Count_Basis_NV;
	public static String Date_Convention_NV;
	public static String Period_End_NV;
	
	public static String Total_Settlement_NV;
	public static String Settlement_Balance_NV;

	
	@BeforeSuite	
	public static void beforeTestConfigs() {		
		
	log.info("*************** <Before Suite Started> ***************");
		
		// For Login Purpose
		beforeTest.Bfr_Any_Test.bfr_Any_Test();
		
		// For Configuring Values For LMM Test.
		beforeTest.Bfr_Any_Test.bfr_LMM_Test();

		driver = beforeTest.DriverConfig.driver;
		wait_E = beforeTest.DriverConfig.wait_E;
		wait_F = beforeTest.DriverConfig.wait_F;
		
	log.info("--------------- <Before Suite Completed> ---------------");
	
	}	
		
	
	@Test(priority=0)
	public static void frontPage_NewMode_Inputs() throws InterruptedException, ParseException {
		
	log.info("*************** <FrontPage_NewMode_Inputs Initiated> ***************");		
	
		//driver.navigate().refresh();
	
		//Wait Until Page Completely Loaded, To Avoid Exception
		handleFields.PageLoad_CircleBar_Handle.is_PageLoaded_Check(driver);
		
		wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.Dashboard_Elements.ADD_Deal_Btn_EL(driver))).click();
		wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.Dashboard_Elements.Money_Market_EL(driver))).click();		
		
		
		String Asset_Liabiity_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Asset_Liabiity_NI; 	// Variable Name Ends With '_NI' Means 'New_Mode-Inputs'.
		if(Asset_Liabiity_NI.equalsIgnoreCase("Asset")){
			log.info("Balance Sheet is 'Asset'");
			wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.Loan_ND.Asset_EL(driver))).click();
		}
		else if(Asset_Liabiity_NI.equalsIgnoreCase("Liability")){
			log.info("Balance Sheet is 'Liability'");
			wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.Loan_ND.Liability_EL(driver))).click();
		}
		else{
			log.info("Balance Sheet is Invalid!!");
			log.info("Test Will Not Be Continued. The Browser Will Be Closed!.");
			driver.quit();
		}		
		
		
		//Wait Until Page Completely Loaded, To Avoid Exception
		handleFields.PageLoad_CircleBar_Handle.is_PageLoaded_Check(driver);
		
		log.info("Proceed to Select 'Business_Entity' Using New_Mode_Inputs");
		WebElement Business_Entity_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Business_Entity_EL(driver)));
		String Business_Entity_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Business_Entity_NI;
		handleFields.DropDowns.dropDownInputsHandle(driver,Business_Entity_EL,Business_Entity_NI);
		handleFields.AlertMsg.alert_MsgHandle(driver);	//Check-Is System Prompted Any Warning/Error Message
		log.info("'Business_Entity' Has Been Selected Using New_Mode_Inputs");		
		
		
		log.info("Proceed to Select 'Credit_Risk' Using New_Mode_Inputs");
		WebElement Credit_Risk_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Credit_Risk_EL(driver)));
		String Credit_Risk_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Credit_Risk_NI;
		handleFields.DropDowns.dropDownInputsHandle(driver,Credit_Risk_EL,Credit_Risk_NI);
		handleFields.AlertMsg.alert_MsgHandle(driver);
		log.info("'Credit_Risk' Has Been Selected Using New_Mode_Inputs");
	
		
		log.info("Proceed to Select 'Product' Using New_Mode_Inputs");
		WebElement Product_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Product_EL(driver)));
		String Product_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Product_NI;
		handleFields.DropDowns.dropDownInputsHandle(driver,Product_EL,Product_NI);
		handleFields.AlertMsg.alert_MsgHandle(driver);
		log.info("'Product' Has Been Selected Using New_Mode_Inputs");
		
		
		log.info("Proceed to Select 'Strategy' Using New_Mode_Inputs");
		WebElement Strategy_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Strategy_EL(driver)));
		String Strategy_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Strategy_NI;
		handleFields.DropDowns.dropDownInputsHandle(driver,Strategy_EL,Strategy_NI);
		handleFields.AlertMsg.alert_MsgHandle(driver);
		log.info("'Product' Has Been Selected Using New_Mode_Inputs");
		
		
		log.info("Proceed to Select 'Deal_Date' Using New_Mode_Inputs");
		WebElement Deal_Date_Btn_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Deal_Date_Btn_EL(driver)));
		String Deal_Date_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Deal_Date_NI;
		handleFields.DateSelection.dateInputsHandle(driver,Deal_Date_Btn_EL,Deal_Date_NI);
		handleFields.AlertBox.alertBoxHandle(driver); 	//Check-Is Given Date Falls on Holiday!
		handleFields.AlertMsg.alert_MsgHandle(driver);	
		log.info("'Deal_Date' Has Been Selected Using New_Mode_Inputs");
		
		
		log.info("Proceed to Select 'Value_Date' Using New_Mode_Inputs");
		WebElement Value_Date_Btn_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Value_Date_Btn_EL(driver)));
		String Value_Date_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Value_Date_NI;
		handleFields.DateSelection.dateInputsHandle(driver,Value_Date_Btn_EL,Value_Date_NI);
		handleFields.AlertBox.alertBoxHandle(driver);
		handleFields.AlertMsg.alert_MsgHandle(driver);  
		log.info("'Value_Date' Has Been Selected Using New_Mode_Inputs");
				
		
		//Check the Maturity Selection Is Based on Tenor OR Maturity date!!
		String Maturity_Date_Based_On_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Maturity_Date_Based_On_NI;		
		log.info("Maturity Date Selection Using New_Mode_Inputs, is Based on : "+Maturity_Date_Based_On_NI);
		
		if(Maturity_Date_Based_On_NI.equalsIgnoreCase("Tenor")){
			
			log.info("Proceed to Enter 'Tenor' Using New_Mode_Inputs");
			WebElement Tenor_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Tenor_EL(driver)));
			String Tenor_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Tenor_NI;
			handleFields.TextFields.textFieldsInputsHandle(driver,Tenor_EL,Tenor_NI);
			handleFields.AlertMsg.alert_MsgHandle(driver);
			
			/**  Getting Loaded 'Maturity Date' Value From Given 'Tenor', For Edit Mode Verification  **/
			log.info("Taken 'Maturity Date' Value, Since the Input is 'Tenor'");
			WebElement Maturity_Date_txt_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Maturity_Date_txt_EL(driver)));
			Maturity_Date_NV=Maturity_Date_txt_EL.getAttribute("value");			
			log.info("'Tenor' Has Been Entered Using New_Mode_Inputs");
			
		}
		else{
			
			log.info("Proceed to Select 'Maturity_Date' Using New_Mode_Inputs");
			WebElement Maturity_Date_Btn_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Maturity_Date_Btn_EL(driver)));	
			String Maturity_Date_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Maturity_Date_NI;
			handleFields.DateSelection.dateInputsHandle(driver,Maturity_Date_Btn_EL,Maturity_Date_NI);
			handleFields.AlertBox.alertBoxHandle(driver);
			handleFields.AlertMsg.alert_MsgHandle(driver);
			
			/**  Getting Loaded 'Tenor' Value From Given 'Maturity Date', For Edit Mode Verification  **/
			log.info("Taken 'Tenor' Value, Since the Input is 'Maturity Date'");
			WebElement Tenor_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Tenor_EL(driver)));
			Tenor_NV=Tenor_EL.getAttribute("value");
			log.info("'Maturity_Date' Has Been Selected Using New_Mode_Inputs");
		}
		
			
		log.info("Proceed to Enter 'Principal' Using New_Mode_Inputs");
		WebElement Principal_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Principal_EL(driver)));
		String Principal_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Principal_NI;
		handleFields.TextFields.textFieldsInputsHandle(driver,Principal_EL,Principal_NI);
		handleFields.AlertMsg.alert_MsgHandle(driver);
		log.info("'Principal' Has Been Entered Using New_Mode_Inputs");		
	
		
		//Check the RateType is 'Fixed' / 'Float'..
		String RateType_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.RateType_NI;
		if(RateType_NI.equalsIgnoreCase("Fixed")){
			
			log.info("Rate Type is 'Fixed'. And Proceed to Select It Using New_Mode_Inputs");
			WebElement RateType_Fixed_EL=frameWorks.pageObjectModel.Loan_ND.RateType_Fixed_EL(driver);
			RateType_Fixed_EL.click();
			log.info("'Fixed' Rate Type Has Been Selected, Using New_Mode_Inputs");
			
			log.info("Proceed to Enter 'Rate%' Using New_Mode_Inputs");
			WebElement Rate_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Rate_EL(driver)));
			String Rate_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Rate_NI;
			handleFields.TextFields.textFieldsInputsHandle(driver,Rate_EL,Rate_NI);
			handleFields.AlertMsg.alert_MsgHandle(driver);
			log.info("'Rate%' Has Been Entered Using New_Mode_Inputs");
			
		}
		else{
			
			log.info("Rate Type is 'Float'. And Proceed to Select It Using New_Mode_Inputs");
			WebElement RateType_Float_EL=frameWorks.pageObjectModel.Loan_ND.RateType_Float_EL(driver);
			RateType_Float_EL.click();
			log.info("'Float' Rate Type Has Been Selected Using New_Mode_Inputs");
			
			
			log.info("Proceed to Select 'Reference_ID' Using New_Mode_Inputs");
			WebElement Reference_ID_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Reference_ID_EL(driver)));
			String Reference_ID_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Reference_ID_NI;
			handleFields.DropDowns.dropDownInputsHandle(driver,Reference_ID_EL,Reference_ID_NI);
			handleFields.AlertMsg.alert_MsgHandle(driver);
			log.info("'Reference_ID' Has Been Selected Using New_Mode_Inputs");
					
		
			log.info("Proceed to Select 'Reference_Tenor' Using New_Mode_Inputs");
			WebElement Reference_Tenor_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Reference_Tenor_EL(driver)));
			String Reference_Tenor_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Reference_Tenor_NI;
			handleFields.DropDowns.dropDownInputsHandle(driver,Reference_Tenor_EL,Reference_Tenor_NI);
			handleFields.AlertMsg.alert_MsgHandle(driver);
			log.info("'Reference_Tenor' Has Been Selected Using New_Mode_Inputs");			
			
			
			log.info("Proceed to Take 'Reference_Rate%' Using New_Mode_Inputs For Edit_Mode Verification");
			WebElement Reference_Rate_EL=wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.Loan_ND.Reference_Rate_EL(driver)));
			Reference_Rate_NV=Reference_Rate_EL.getAttribute("value");
			log.info("New Mode-> Reference_Rate% is : "+Reference_Rate_NV+", Where RateType='Float'");
			log.info("'Reference_Rate%' Has Been Taken Using New_Mode_Inputs For Edit_Mode Verification");
			
			
			log.info("Proceed to Enter 'Spread' Using New_Mode_Inputs");
			WebElement Spread_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Spread_EL(driver)));
			String Spread_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Spread_NI;
			handleFields.TextFields.textFieldsInputsHandle(driver,Spread_EL,Spread_NI);
			handleFields.AlertMsg.alert_MsgHandle(driver);
			log.info("'Spread' Has Been Entered Using New_Mode_Inputs");
			
			//For Edit Mode Verification, Since the Rate% is Calculated By System.
			log.info("Proceed to Take 'Rate%' Using New_Mode_Inputs For Edit_Mode Verification");
			WebElement Rate_EL=wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.Loan_ND.Rate_EL(driver)));
			Rate_EL.click(); //To Load RefRate + Spread. As System Takes 'Spread=0', Even It has Value.
			Rate_NV=Rate_EL.getAttribute("value");
			log.info("New Mode-> Rate% is : "+Rate_NV);
			log.info("'Rate%' Has Been Taken Using New_Mode_Inputs For Edit_Mode Verification");
		}
		
		
		String W_Tax_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.W_Tax_NI;
		String We_Absorb_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.We_Absorb_NI;
		
		if(W_Tax_NI.isEmpty()){
			log.info("Input of W/Tax is Equals to Zero Using New_Mode_Inputs. So, The Taxation, Ignored!!");
			}
		else{
			//Handling of "W/Tax"
			log.info("Proceed to Enter 'W/tax%' Using New_Mode_Inputs");	
			WebElement W_Tax_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.W_Tax_EL(driver)));
			 
			// To Avoid-"MoveTargetOutOfBoundsException", By Scrolling Down the Page. As 'W/Tax' Located in Bottom of the Page.
			handleFields.ScrollToElement.scrolltoGivenElement(driver,W_Tax_EL); 
			
			handleFields.TextFields.textFieldsInputsHandle(driver,W_Tax_EL,W_Tax_NI);
			handleFields.AlertMsg.alert_MsgHandle(driver);
			log.info("'W/tax%' Has Been Entered Using New_Mode_Inputs");
				
			//Handling of "We Absorb"
			try{	
				WebElement We_Absorb_EL=frameWorks.pageObjectModel.Loan_ND.We_Absorb_EL(driver);
				We_Absorb_EL.click();  // To Enable the 'We Absorb%' Field.
					if(We_Absorb_EL.isEnabled()){
						log.info("WeAbsorb is Enabled");
						
						log.info("Proceed to Enter 'We_Absorb%' Using New_Mode_Inputs");
						handleFields.TextFields.textFieldsInputsHandle(driver,We_Absorb_EL,We_Absorb_NI);
						handleFields.AlertMsg.alert_MsgHandle(driver);
						log.info("'We_Absorb%' Has Been Entered Using New_Mode_Inputs");
						
					}
			}
			catch(Exception e){			
				log.info("WeAbsorb Input Given Got Exception. Which is : "+e);
			}
		}	

	log.info("--------------- <FrontPage_NewMode_Inputs Completed> ---------------");
	
	}

	@Test(dependsOnMethods = "frontPage_NewMode_Inputs")
	public static void infoPage_NewMode_Inputs() {
	
		log.info("*************** <InfoPage_NewMode_Inputs Initiated> ***************");
		
		wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Info_Icon_Btn_EL(driver))).click();
			
		
		log.info("Proceed to Select 'Principal_Frequency' Using New_Mode_Inputs");
		WebElement Principal_Freq_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Principal_Freq_EL(driver)));
		String Principal_Freq_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Principal_Freq_NI;
		
		if(Principal_Freq_NI.isEmpty()){
			log.info("'Principal Frequency' Input is Empty. So, Continued With System Defaulted Values");
			Principal_Freq_NV=Principal_Freq_EL.getAttribute("value").trim();		//For Edit Mode Verification Purpose
		}
		else{
			handleFields.DropDowns.dropDownInputsHandle(driver,Principal_Freq_EL,Principal_Freq_NI);
			handleFields.AlertMsg.alert_MsgHandle(driver);
			log.info("'Principal_Frequency' Has Been Selected Using New_Mode_Inputs");
			}
		
		
		log.info("Proceed to Select 'Interest_Frequency' Using New_Mode_Inputs");
		WebElement Interest_Freq_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Interest_Freq_EL(driver)));
		String Interest_Freq_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Interest_Freq_NI;
		
		if(Interest_Freq_NI.isEmpty()){
			log.info("'Interest Frequency' Input is Empty. So, Continued With System Defaulted Values");
			Interest_Freq_NV=Interest_Freq_EL.getAttribute("value").trim();			//For Edit Mode Verification Purpose
		}
		else{
			handleFields.DropDowns.dropDownInputsHandle(driver,Interest_Freq_EL,Interest_Freq_NI);
			handleFields.AlertMsg.alert_MsgHandle(driver);
			log.info("'Interest_Frequency' Has Been Selected Using New_Mode_Inputs");		
			}
		
			
		log.info("Proceed to Select 'Day_Count_Basis' Using New_Mode_Inputs");
		WebElement Day_Count_Basis_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Day_Count_Basis_EL(driver)));
		String Day_Count_Basis_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Day_Count_Basis_NI;
		
		if(Day_Count_Basis_NI.isEmpty()){
			log.info("'Day Count Basis ' Input is Empty. So, Continued With System Defaulted Values");
			Day_Count_Basis_NV=Day_Count_Basis_EL.getAttribute("value").trim();			//For Edit Mode Verification Purpose
		}
		else{
			handleFields.DropDowns.dropDownInputsHandle(driver,Day_Count_Basis_EL,Day_Count_Basis_NI);
			handleFields.AlertMsg.alert_MsgHandle(driver);
			log.info("'Day_Count_Basis' Has Been Selected Using New_Mode_Inputs");
			}
		
		
		log.info("Proceed to Select 'Date_Convention' Using New_Mode_Inputs");
		WebElement Date_Convention_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Date_Convention_EL(driver)));
		String Date_Convention_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Date_Convention_NI;
		
		if(Date_Convention_NI.isEmpty()){
			log.info("'Date Convention' Input is Empty. So, Continued With System Defaulted Values");
			Date_Convention_NV=Date_Convention_EL.getAttribute("value").trim();			//For Edit Mode Verification Purpose
			
		}
		else{
			handleFields.DropDowns.dropDownInputsHandle(driver,Date_Convention_EL,Date_Convention_NI);
			handleFields.AlertMsg.alert_MsgHandle(driver);
			log.info("'Date_Convention' Has Been Selected Using New_Mode_Inputs");
			}
		
		
		log.info("Proceed to Select 'Period_End' Using New_Mode_Inputs");
		WebElement Period_End_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Period_End_EL(driver)));
		String Period_End_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Period_End_NI;
		
		if(Period_End_NI.isEmpty()){
			log.info("'Period End' Input is Empty. So, Continued With System Defaulted Values");
			Period_End_NV=Period_End_EL.getAttribute("value").trim();			//For Edit Mode Verification Purpose
		}
		else{
			handleFields.DropDowns.dropDownInputsHandle(driver,Period_End_EL,Period_End_NI);
			handleFields.AlertMsg.alert_MsgHandle(driver);
			log.info("'Period_End' Has Been Selected Using New_Mode_Inputs");
			}
		
		
		log.info("Proceed to Select 'Contact' Using New_Mode_Inputs");
		WebElement Contact_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Contact_EL(driver)));
		String Contact_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Contact_NI;
		
		if(Contact_NI.isEmpty()){
			log.info("'Contact' Input is Empty. So, Skipped this!");
		}
		else{
			handleFields.DropDowns.dropDownInputsHandle(driver,Contact_EL,Contact_NI);
			handleFields.AlertMsg.alert_MsgHandle(driver);
			log.info("'Contact' Has Been Selected Using New_Mode_Inputs");
			}
		
		
		log.info("Proceed to Select 'Department' Using New_Mode_Inputs");
		WebElement Department_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Department_EL(driver)));
		String Department_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Department_NI;
		
		if(Department_NI.isEmpty()){
			log.info("'Department' Input is Empty. So Skipped This!");
		}
		else{
			handleFields.DropDowns.dropDownInputsHandle(driver,Department_EL,Department_NI);
			handleFields.AlertMsg.alert_MsgHandle(driver);
			log.info("'Department' Has Been Selected Using New_Mode_Inputs");
			}
		
		
		log.info("Proceed to Select 'Broker' Using New_Mode_Inputs");
		WebElement Broker_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Broker_EL(driver)));
		String Broker_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Broker_NI;
		
		if(Broker_NI.isEmpty()){
			log.info("'Broker' Input is Empty. So Skipped This!");
		}
		else{
			handleFields.DropDowns.dropDownInputsHandle(driver,Broker_EL,Broker_NI);
			handleFields.AlertMsg.alert_MsgHandle(driver);
			log.info("'Broker' Has Been Selected Using New_Mode_Inputs");
			}
		
		
		log.info("Proceed to Enter 'C_PartyRef' Using New_Mode_Inputs");
		WebElement C_PartyRef_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.C_PartyRef_EL(driver)));
		String C_PartyRef_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.C_PartyRef_NI;
		
		if(C_PartyRef_NI.isEmpty()){
			log.info("'C_PartyRef' Input is Empty. So Skipped This!");
		}
		else if(C_PartyRef_NI.length()<=10){
			handleFields.TextFields.textFieldsInputsHandle(driver,C_PartyRef_EL,C_PartyRef_NI);
			log.info("'C_PartyRef' Has Been Entered Using New_Mode_Inputs");
			}
		else{
			log.info("'C_PartyRef' Length Should Not Exceed '10'. Try Again With Valid Input!");
			log.info("The Browser Will Be Closed");
			driver.quit();
			}
		
		
		log.info("Proceed to Enter 'Deal_Ref' Using New_Mode_Inputs");
		WebElement Deal_Ref_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Deal_Ref_EL(driver)));
		String Deal_Ref_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Deal_Ref_NI;
		
		if(Deal_Ref_NI.isEmpty()){
			log.info("'Deal_Ref' Input is Empty. So Skipped This!");
		}
		else if(Deal_Ref_NI.length()<=20){
			handleFields.TextFields.textFieldsInputsHandle(driver,Deal_Ref_EL,Deal_Ref_NI);
			log.info("'Deal_Ref' Has Been Entered Using New_Mode_Inputs");
			}
		else{
			log.info("'Deal_Ref' Length Should Not Exceed '20'. Try Again With Valid Input!");
			log.info("The Browser Will Be Closed");
			driver.quit();
			}
		
		
		log.info("Proceed to Enter 'Certificate_No' Using New_Mode_Inputs");
		WebElement Certificate_No_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Certificate_No_EL(driver)));
		String Certificate_No_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Certificate_No_NI;
		
		if(Certificate_No_NI.isEmpty()){
			log.info("'Certificate_No' Input is Empty. So Skipped This!");
		}
		else if(Certificate_No_NI.length()<=20){
			handleFields.TextFields.textFieldsInputsHandle(driver,Certificate_No_EL,Certificate_No_NI);
			log.info("'Certificate_No' Has Been Entered Using New_Mode_Inputs");
			}
		else{
			log.info("'Certificate_No' Length Should Not Exceed '20'. Try Again With Valid Input!");
			log.info("The Browser Will Be Closed");
			driver.quit();
			}
		
		
		log.info("Proceed to Select 'Confirmation_Mode' Using New_Mode_Inputs");
		WebElement Confirmation_Mode_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Confirmation_Mode_EL(driver)));
		String Confirmation_Mode_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Confirmation_Mode_NI;
		
		if(Confirmation_Mode_NI.isEmpty()){
			log.info("'Confirmation_Mode' Input is Empty. So Skipped This!");
		}
		else{
			handleFields.DropDowns.dropDownInputsHandle(driver,Confirmation_Mode_EL,Confirmation_Mode_NI);
			log.info("'Confirmation_Mode' Has Been Selected Using New_Mode_Inputs");
			}
		
		
		log.info("Proceed to Select 'Sub_Type' Using New_Mode_Inputs");
		WebElement Sub_Type_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Sub_Type_EL(driver)));
		String Sub_Type_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Sub_Type_NI;
		
		if(Sub_Type_NI.isEmpty()){
			log.info("'Sub_Type' Input is Empty. So Skipped This!");
		}
		else{
			handleFields.DropDowns.dropDownInputsHandle(driver,Sub_Type_EL,Sub_Type_NI);
			log.info("'Sub_Type' Has Been Selected Using New_Mode_Inputs");
			}
		
		
		log.info("Proceed to Enter 'INFO_Remarks' Using New_Mode_Inputs");
		WebElement INFO_Remarks_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.INFO_Remarks_EL(driver)));
		String INFO_Remarks_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.INFO_Remarks_NI;
		
		if(INFO_Remarks_NI.isEmpty()){
			log.info("'INFO_Remarks' Input is Empty. So Skipped This!");
		}
		else if(INFO_Remarks_NI.length()<=100){
			handleFields.TextFields.textFieldsInputsHandle(driver,INFO_Remarks_EL,INFO_Remarks_NI);
			log.info("'INFO_Remarks' Has Been Entered Using New_Mode_Inputs");
			}
		else{
			log.info("'INFO_Remarks' Length Should Not Exceed '100'. Try Again With Valid Input!");
			log.info("The Browser Will Be Closed");
			driver.quit();
			}
		
		wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.INFO_Close_Btn_E(driver))).click();
		
		log.info("--------------- <InfoPage_NewMode_Inputs Completed> ---------------");
	
	}

	@Test(dependsOnMethods = "infoPage_NewMode_Inputs")
	public static void bankDetails_NewMode_Inputs() {
	
	log.info("*************** <BankDetails_NewMode_Inputs Initiated> ***************");	
	
	log.info("::::::::::'Bank Details' Not Handled, Yet::::::::::");
	wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Bank_Details_Icon_Btn_EL(driver))).click();
	
	
	log.info("Proceed to Verify 'Total_Settlement' Using New_Mode_Inputs");
	WebElement Total_Settlement_EL=wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.Loan_ND.Total_Settlement_EL(driver)));
	Total_Settlement_NV=Total_Settlement_EL.getText().replaceAll(",", "").trim();
	String Total_Settlement_NI=(frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Principal_NI).replaceAll(",", "");
	
		if (Total_Settlement_NV.equals(Total_Settlement_NI)) {
			log.info("Total_Settlement Verification - QA PASSED!");
		} else {
			log.info("Total_Settlement Verification - QA FAILED!!");
			log.info("Input Value is : "+Total_Settlement_NI+", Retrieved Value is : "+Total_Settlement_NV);
		}
	log.info("'Total_Settlement' Has Been Verified Using New_Mode_Inputs");
		
	
	log.info("Proceed to Verify 'Settlement_Balance' Using New_Mode_Inputs");
	WebElement Settlement_Balance_EL=wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.Loan_ND.Settlement_Balance_EL(driver)));
	Settlement_Balance_NV=Settlement_Balance_EL.getText().replaceAll(",", "").trim();
	String default_Stlmt_Bal="0.00";
	
		if (Settlement_Balance_NV.equals(default_Stlmt_Bal)) {
			log.info("Settlement_Balance Verification - QA PASSED!");
		} else {
			log.info("Settlement_Balance Verification - QA FAILED!!");
			log.info("Input Value is : "+default_Stlmt_Bal+", Retrieved Value is : "+Settlement_Balance_NV);
		}
	log.info("'Settlement_Balance' Has Been Verified Using New_Mode_Inputs");
	
	
	wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Bank_Close_Btn_EL(driver))).click();
		
	log.info("--------------- <BankDetails_NewMode_Inputs Completed> ---------------");
	
	}

	@Test(dependsOnMethods = "bankDetails_NewMode_Inputs")
	public static void cashFlow_NewMode() {
		
	log.info("*************** <CashFlow_NewMode Initiated> ***************");
	
	log.info("::::::::::'Cash Flow' Not Handled, Yet::::::::::");
	wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Cash_Flow_Icon_Btn_EL(driver))).click();
	
	handleFields.AlertMsg.alert_MsgHandle(driver);
	
	wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Cash_Flow_Close_Btn_EL(driver))).click();

	log.info("--------------- <CashFlow_NewMode Completed> ---------------");
	
	}
	
	@Test(dependsOnMethods = "cashFlow_NewMode")
	public static void dealSave_Using_NewMode_Inputs() throws InterruptedException {
		
	log.info("*************** <DealSave_Using_NewMode_Inputs Initiated> ***************");
	
	//Click On "Deal Save Button".
	wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Deal_Save_Btn_EL(driver))).click();	
	handleFields.AlertBox.alertBoxHandle(driver); //For Deal Save Confirmation
	
	
	//Getting Response of Deal Save Click.
	/**  'visibilityOfElementLocated' is Used To Avoid "NoSuchElementException"  **/
	WebElement Deal_Save_Status_EL=wait_E.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(frameWorks.pageObjectModel.Loan_ND.Deal_Save_Status_X)));
	String Deal_Status = Deal_Save_Status_EL.getText();	

	if(Deal_Status.equalsIgnoreCase(frameWorks.pageObjectModel.Loan_ND.Deal_Saved_VE)){		
		log.info("Deal Saved Successfully!! Using New_Mode_Inputs - QA PASSED");
	}
	else{
		log.error("There is Some Issue on Deal Save! Using New_Mode_Inputs - QA FAILED");
		log.info("System Prompted Response : "+Deal_Status);
		log.warn("Browser Will Be Closed, Please Seek Technical Assistance!!");
		driver.quit();
	}
		
	
	//Try To Check is "Deal ID" Generated or Not, For Saved Deal.
	try{
		WebElement Deal_ID_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Deal_ID_EL(driver)));
		DealID_NV = Deal_ID_EL.getText();
		log.info("The Deal ID is : "+DealID_NV);
	}
	catch(Exception e){
		log.error("There Might Be Issue in 'Deal ID' Generation. The Deal May Not Saved. Please Seek Technical Assistance!");
		log.error("The Browser Will Be Closed!");
		driver.quit();		
	}
	
	
	//Try Close the Deal Save Page, To Go Dashboard.
	wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Page_Close_After_Deal_Saved_EL(driver))).click();	

	log.info("--------------- <DealSave_Using_NewMode_Inputs Completed> ---------------");
	
	}

}
