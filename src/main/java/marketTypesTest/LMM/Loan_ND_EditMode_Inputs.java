package marketTypesTest.LMM;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Loan_ND_EditMode_Inputs extends Loan_ND_NewMode_InputsVerify {
	
	// Declarations Of Log4j For This Class
	public static Logger log = Logger.getLogger(Loan_ND_EditMode_Inputs.class.getName());
	
	// Declarations Of Driver Components For This Class
	public static WebDriver driver;
	public static WebDriverWait wait_E;			//WAIT -> Ends With '_E' Mean 'Explicit Wait'.
	public static Wait<WebDriver> wait_F;		//WAIT -> Ends With '_F' Mean 'Fluent Wait'.
	
	
	public static String DealID_EV;
	
	// If Given MatDt -> Get 'Tenor'-Value & Vice Versa. 
	public static String Maturity_Date_EV;   // Variable Name Ends With '_EV' Means 'Edit_Mode-Element_Value'.
	public static String Tenor_EV;
	
	public static String Reference_Rate_EV;
	public static String Rate_EV;
	
	public static String Principal_Freq_EV;
	public static String Interest_Freq_EV;
	public static String Day_Count_Basis_EV;
	public static String Date_Convention_EV;
	public static String Period_End_EV;
	
	public static String Total_Settlement_EV;
	public static String Settlement_Balance_EV;
	
	
	@Test(priority=0)
	public static void bfr_Loan_ND_EditMode_Inputs(){
		
		log.info("*************** <bfr_Loan_ND_EditMode_Inputs Method Started> ***************");
		
		Loan_ND_NewMode_InputsVerify.cashFlow_NewMode_Verification();
		
		driver = beforeTest.DriverConfig.driver;
		wait_E = beforeTest.DriverConfig.wait_E;
		wait_F = beforeTest.DriverConfig.wait_F;		
		
				
		log.info("--------------- <bfr_Loan_ND_EditMode_Inputs Method Completed> ---------------");
		
	}
	
	
	@Test(dependsOnMethods="bfr_Loan_ND_EditMode_Inputs")
	public static void frontPage_EditMode_Inputs() {
		
		log.info("*************** <FrontPage_EditMode_Inputs Initiated> ***************");
		
		
		log.info("Proceed to Select 'Deal_Date' Using_Edit_Mode_Inputs");
		WebElement Deal_Date_Btn_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Deal_Date_Btn_EL(driver)));
		String Deal_Date_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Deal_Date_EI;
		handleFields.DateSelection.dateInputsHandle(driver,Deal_Date_Btn_EL,Deal_Date_EI);
		handleFields.AlertBox.alertBoxHandle(driver); 	//Check-Is Given Date Falls on Holiday!
		handleFields.AlertMsg.alert_MsgHandle(driver);	
		log.info("'Deal_Date' Has Been Selected Using_Edit_Mode_Inputs");
		
		
		log.info("Proceed to Select 'Value_Date' Using_Edit_Mode_Inputs");
		WebElement Value_Date_Btn_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Value_Date_Btn_EL(driver)));
		String Value_Date_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Value_Date_EI;
		handleFields.DateSelection.dateInputsHandle(driver,Value_Date_Btn_EL,Value_Date_EI);
		handleFields.AlertBox.alertBoxHandle(driver);
		handleFields.AlertMsg.alert_MsgHandle(driver);  
		log.info("'Value_Date' Has Been Selected Using_Edit_Mode_Inputs");
				
		
		//Check the Maturity Selection Is Based on Tenor OR Maturity date!!
		String Maturity_Date_Based_On_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Maturity_Date_Based_On_EI;		
		log.info("Maturity Date Selection in Edit_Mode, is Based on : "+Maturity_Date_Based_On_EI);
		
		if(Maturity_Date_Based_On_EI.equalsIgnoreCase("Tenor")){
			
			log.info("Proceed to Enter 'Tenor' Using_Edit_Mode_Inputs");
			WebElement Tenor_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Tenor_EL(driver)));
			String Tenor_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Tenor_EI;
			handleFields.TextFields.textFieldsInputsHandle(driver,Tenor_EL,Tenor_EI);
			handleFields.AlertMsg.alert_MsgHandle(driver);
			
			/**  Getting Loaded 'Maturity Date' Value From Given 'Tenor', For Edit Mode Verification  **/
			log.info("Taken 'Maturity Date' Value, Since the Input is 'Tenor' Using_Edit_Mode_Inputs");
			WebElement Maturity_Date_txt_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Maturity_Date_txt_EL(driver)));
			Maturity_Date_EV=Maturity_Date_txt_EL.getAttribute("value");			
			log.info("'Tenor' Has Been Entered Using_Edit_Mode_Inputs");
			
		}
		else{
			
			log.info("Proceed to Select 'Maturity_Date' Using_Edit_Mode_Inputs");
			WebElement Maturity_Date_Btn_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Maturity_Date_Btn_EL(driver)));	
			String Maturity_Date_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Maturity_Date_EI;
			handleFields.DateSelection.dateInputsHandle(driver,Maturity_Date_Btn_EL,Maturity_Date_EI);
			handleFields.AlertBox.alertBoxHandle(driver);
			handleFields.AlertMsg.alert_MsgHandle(driver);
			
			/**  Getting Loaded 'Tenor' Value From Given 'Maturity Date', For Edit Mode Verification  **/
			log.info("Taken 'Tenor' Value, Since the Input is 'Maturity Date' Using_Edit_Mode_Inputs");
			WebElement Tenor_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Tenor_EL(driver)));
			Tenor_EV=Tenor_EL.getAttribute("value");
			log.info("'Maturity_Date' Has Been Selected Using_Edit_Mode_Inputs");
		}
		
			
		log.info("Proceed to Enter 'Principal' Using_Edit_Mode_Inputs");
		WebElement Principal_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Principal_EL(driver)));
		String Principal_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Principal_EI;
		handleFields.TextFields.textFieldsInputsHandle(driver,Principal_EL,Principal_EI);
		handleFields.AlertMsg.alert_MsgHandle(driver);
		log.info("'Principal' Has Been Entered Using_Edit_Mode_Inputs");		
	
		
		//Check the RateType is 'Fixed' / 'Float'..
		String RateType_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.RateType_EI;
		if(RateType_EI.equalsIgnoreCase("Fixed")){
			
			log.info("Rate Type is 'Fixed'. And Proceed to Select It");
			WebElement RateType_Fixed_EL=frameWorks.pageObjectModel.Loan_ND.RateType_Fixed_EL(driver);
			RateType_Fixed_EL.click();
			log.info("'Fixed' Rate Type Has Been Selected!.");
			
			log.info("Proceed to Enter 'Rate%' Using_Edit_Mode_Inputs");
			WebElement Rate_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Rate_EL(driver)));
			String Rate_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Rate_EI;
			handleFields.TextFields.textFieldsInputsHandle(driver,Rate_EL,Rate_EI);
			handleFields.AlertMsg.alert_MsgHandle(driver);
			log.info("'Rate%' Has Been Entered Using_Edit_Mode_Inputs");
			
		}
		else{
			
			log.info("Rate Type is 'Float'. And Proceed to Select It");
			WebElement RateType_Float_EL=frameWorks.pageObjectModel.Loan_ND.RateType_Float_EL(driver);
			RateType_Float_EL.click();
			log.info("'Float' Rate Type Has Been Selected!.");
			
			
			log.info("Proceed to Select 'Reference_ID' Using_Edit_Mode_Inputs");
			WebElement Reference_ID_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Reference_ID_EL(driver)));
			String Reference_ID_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Reference_ID_EI;
			handleFields.DropDowns.dropDownInputsHandle(driver,Reference_ID_EL,Reference_ID_EI);
			handleFields.AlertMsg.alert_MsgHandle(driver);
			log.info("'Reference_ID' Has Been Selected Using_Edit_Mode_Inputs");
					
		
			log.info("Proceed to Select 'Reference_Tenor' Using_Edit_Mode_Inputs");
			WebElement Reference_Tenor_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Reference_Tenor_EL(driver)));
			String Reference_Tenor_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Reference_Tenor_EI;
			handleFields.DropDowns.dropDownInputsHandle(driver,Reference_Tenor_EL,Reference_Tenor_EI);
			handleFields.AlertMsg.alert_MsgHandle(driver);
			log.info("'Reference_Tenor' Has Been Selected Using_Edit_Mode_Inputs");			
			
			
			log.info("Proceed to Take 'Reference_Rate%' Using_Edit_Mode_Inputs_Input For Edit_Mode_Input Verification");
			WebElement Reference_Rate_EL=wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.Loan_ND.Reference_Rate_EL(driver)));
			Reference_Rate_EV=Reference_Rate_EL.getAttribute("value");
			log.info("Edit Mode-> Reference_Rate% is : "+Reference_Rate_EV+", Where RateType='Float'");
			log.info("'Reference_Rate%' Has Been Taken Using_Edit_Mode_Inputs_Input For Edit_Mode_Input Verification");
			
			
			log.info("Proceed to Enter 'Spread' Using_Edit_Mode_Inputs");
			WebElement Spread_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Spread_EL(driver)));
			String Spread_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Spread_EI;
			handleFields.TextFields.textFieldsInputsHandle(driver,Spread_EL,Spread_EI);
			handleFields.AlertMsg.alert_MsgHandle(driver);
			log.info("'Spread' Has Been Entered Using_Edit_Mode_Inputs");
			
			//For Edit Mode Verification, Since the Rate% is Calculated By System.
			log.info("Proceed to Take 'Rate%' Using_Edit_Mode_Inputs_Input For Edit_Mode_Input Verification");
			WebElement Rate_EL=wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.Loan_ND.Rate_EL(driver)));
			Rate_EL.click(); //To Load RefRate + Spread. As System Takes 'Spread=0', Even It has Value.
			Rate_EV=Rate_EL.getAttribute("value");
			log.info("Edit Mode-> Rate% is : "+Rate_EV+", Where RateType='Float'");
			log.info("'Rate%' Has Been Taken Using_Edit_Mode_Inputs_Input For Edit_Mode_Input Verification");
		}
		
		
		String W_Tax_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.W_Tax_EI;
		String We_Absorb_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.We_Absorb_EI;
		
		if(W_Tax_EI.isEmpty()){
			log.info("Input W/Tax is Equals to Zero. So, The Taxation, Ignored!!");
			}
		else{
			//Handling of "W/Tax"
			log.info("Proceed to Enter 'W/tax%' Using_Edit_Mode_Inputs");	
			WebElement W_Tax_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.W_Tax_EL(driver)));
			 
			// To Avoid-"MoveTargetOutOfBoundsException", By Scrolling Down the Page. As 'W/Tax' Located in Bottom of the Page.
			handleFields.ScrollToElement.scrolltoGivenElement(driver,W_Tax_EL); 
			
			handleFields.TextFields.textFieldsInputsHandle(driver,W_Tax_EL,W_Tax_EI);
			handleFields.AlertMsg.alert_MsgHandle(driver);
			log.info("'W/tax%' Has Been Entered Using_Edit_Mode_Inputs");
				
			//Handling of "We Absorb"
			try{	
				WebElement We_Absorb_EL=frameWorks.pageObjectModel.Loan_ND.We_Absorb_EL(driver);
				We_Absorb_EL.click();
					if(We_Absorb_EL.isEnabled()){
						log.info("WeAbsorb is Enabled");
						
						log.info("Proceed to Enter 'We_Absorb%' Using_Edit_Mode_Inputs");
						handleFields.TextFields.textFieldsInputsHandle(driver,We_Absorb_EL,We_Absorb_EI);
						handleFields.AlertMsg.alert_MsgHandle(driver);
						log.info("'We_Absorb%' Has Been Entered Using_Edit_Mode_Inputs");
						
					}
			}
			catch(Exception e){			
				log.info("WeAbsorb Input Given Got Exception. Which is : "+e);
			}
		}		
		log.info("--------------- <FrontPage_EditMode_Inputs Completed> ---------------");
	}	
		
	
	@Test(dependsOnMethods="frontPage_EditMode_Inputs")
	public static void infoPage_EditMode_Inputs() {
		
		log.info("*************** <InfoPage_EditMode_Inputs Initiated> ***************");		
		
		wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Info_Icon_Btn_EL(driver))).click();
			
		
		log.info("Proceed to Select 'Principal_Frequency' Using_Edit_Mode_Inputs");
		WebElement Principal_Freq_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Principal_Freq_EL(driver)));
		String Principal_Freq_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Principal_Freq_EI;
		
		if(Principal_Freq_EI.isEmpty()){
			log.info("'Principal Frequency' Input is Empty. So, Continued With System Defaulted Values");
			Principal_Freq_EV=Principal_Freq_EL.getAttribute("value").trim();		//For Edit Mode Verification Purpose
		}
		else{
			handleFields.DropDowns.dropDownInputsHandle(driver,Principal_Freq_EL,Principal_Freq_EI);
			handleFields.AlertMsg.alert_MsgHandle(driver);
			log.info("'Principal_Frequency' Has Been Selected Using_Edit_Mode_Inputs");
			}
		
		
		log.info("Proceed to Select 'Interest_Frequency' Using_Edit_Mode_Inputs");
		WebElement Interest_Freq_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Interest_Freq_EL(driver)));
		String Interest_Freq_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Interest_Freq_EI;
		
		if(Interest_Freq_EI.isEmpty()){
			log.info("'Interest Frequency' Input is Empty. So, Continued With System Defaulted Values");
			Interest_Freq_EV=Interest_Freq_EL.getAttribute("value").trim();			//For Edit Mode Verification Purpose
		}
		else{
			handleFields.DropDowns.dropDownInputsHandle(driver,Interest_Freq_EL,Interest_Freq_EI);
			handleFields.AlertMsg.alert_MsgHandle(driver);
			log.info("'Interest_Frequency' Has Been Selected Using_Edit_Mode_Inputs");		
			}
		
			
		log.info("Proceed to Select 'Day_Count_Basis' Using_Edit_Mode_Inputs");
		WebElement Day_Count_Basis_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Day_Count_Basis_EL(driver)));
		String Day_Count_Basis_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Day_Count_Basis_EI;
		
		if(Day_Count_Basis_EI.isEmpty()){
			log.info("'Day Count Basis ' Input is Empty. So, Continued With System Defaulted Values");
			Day_Count_Basis_EV=Day_Count_Basis_EL.getAttribute("value").trim();			//For Edit Mode Verification Purpose
		}
		else{
			handleFields.DropDowns.dropDownInputsHandle(driver,Day_Count_Basis_EL,Day_Count_Basis_EI);
			handleFields.AlertMsg.alert_MsgHandle(driver);
			log.info("'Day_Count_Basis' Has Been Selected Using_Edit_Mode_Inputs");
			}
		
		
		log.info("Proceed to Select 'Date_Convention' Using_Edit_Mode_Inputs");
		WebElement Date_Convention_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Date_Convention_EL(driver)));
		String Date_Convention_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Date_Convention_EI;
		
		if(Date_Convention_EI.isEmpty()){
			log.info("'Date Convention' Input is Empty. So, Continued With System Defaulted Values");
			Date_Convention_EV=Date_Convention_EL.getAttribute("value").trim();			//For Edit Mode Verification Purpose
			
		}
		else{
			handleFields.DropDowns.dropDownInputsHandle(driver,Date_Convention_EL,Date_Convention_EI);
			handleFields.AlertMsg.alert_MsgHandle(driver);
			log.info("'Date_Convention' Has Been Selected Using_Edit_Mode_Inputs");
			}
		
		
		log.info("Proceed to Select 'Period_End' Using_Edit_Mode_Inputs");
		WebElement Period_End_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Period_End_EL(driver)));
		String Period_End_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Period_End_EI;
		
		if(Period_End_EI.isEmpty()){
			log.info("'Period End' Input is Empty. So, Continued With System Defaulted Values");
			Period_End_EV=Period_End_EL.getAttribute("value").trim();			//For Edit Mode Verification Purpose
		}
		else{
			handleFields.DropDowns.dropDownInputsHandle(driver,Period_End_EL,Period_End_EI);
			handleFields.AlertMsg.alert_MsgHandle(driver);
			log.info("'Period_End' Has Been Selected Using_Edit_Mode_Inputs");
			}
		
		
		log.info("Proceed to Select 'Contact' Using_Edit_Mode_Inputs");
		WebElement Contact_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Contact_EL(driver)));
		String Contact_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Contact_EI;
		
		if(Contact_EI.isEmpty()){
			log.info("'Contact' Input is Empty. So, Skipped this!");
		}
		else{
			handleFields.DropDowns.dropDownInputsHandle(driver,Contact_EL,Contact_EI);
			handleFields.AlertMsg.alert_MsgHandle(driver);
			log.info("'Contact' Has Been Selected Using_Edit_Mode_Inputs");
			}
		
		
		log.info("Proceed to Select 'Department' Using_Edit_Mode_Inputs");
		WebElement Department_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Department_EL(driver)));
		String Department_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Department_EI;
		
		if(Department_EI.isEmpty()){
			log.info("'Department' Input is Empty. So Skipped This!");
		}
		else{
			handleFields.DropDowns.dropDownInputsHandle(driver,Department_EL,Department_EI);
			handleFields.AlertMsg.alert_MsgHandle(driver);
			log.info("'Department' Has Been Selected Using_Edit_Mode_Inputs");
			}
		
		
		log.info("Proceed to Select 'Broker' Using_Edit_Mode_Inputs");
		WebElement Broker_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Broker_EL(driver)));
		String Broker_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Broker_EI;
		
		if(Broker_EI.isEmpty()){
			log.info("'Broker' Input is Empty. So Skipped This!");
		}
		else{
			handleFields.DropDowns.dropDownInputsHandle(driver,Broker_EL,Broker_EI);
			handleFields.AlertMsg.alert_MsgHandle(driver);
			log.info("'Broker' Has Been Selected Using_Edit_Mode_Inputs");
			}
		
		
		log.info("Proceed to Enter 'C_PartyRef' Using_Edit_Mode_Inputs");
		WebElement C_PartyRef_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.C_PartyRef_EL(driver)));
		String C_PartyRef_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.C_PartyRef_EI;
		
		if(C_PartyRef_EI.isEmpty()){
			log.info("'C_PartyRef' Input is Empty. So Skipped This!");
		}
		else if(C_PartyRef_EI.length()<=10){
			handleFields.TextFields.textFieldsInputsHandle(driver,C_PartyRef_EL,C_PartyRef_EI);
			log.info("'C_PartyRef' Has Been Entered Using_Edit_Mode_Inputs");
			}
		else{
			log.info("'C_PartyRef' Length Should Not Exceed '10'. Try Again With Valid Input!");
			log.info("The Browser Will Be Closed");
			driver.quit();
			}
		
		
		log.info("Proceed to Enter 'Deal_Ref' Using_Edit_Mode_Inputs");
		WebElement Deal_Ref_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Deal_Ref_EL(driver)));
		String Deal_Ref_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Deal_Ref_EI;
		
		if(Deal_Ref_EI.isEmpty()){
			log.info("'Deal_Ref' Input is Empty. So Skipped This!");
		}
		else if(Deal_Ref_EI.length()<=20){
			handleFields.TextFields.textFieldsInputsHandle(driver,Deal_Ref_EL,Deal_Ref_EI);
			log.info("'Deal_Ref' Has Been Entered Using_Edit_Mode_Inputs");
			}
		else{
			log.info("'Deal_Ref' Length Should Not Exceed '20'. Try Again With Valid Input!");
			log.info("The Browser Will Be Closed");
			driver.quit();
			}
		
		
		log.info("Proceed to Enter 'Certificate_No' Using_Edit_Mode_Inputs");
		WebElement Certificate_No_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Certificate_No_EL(driver)));
		String Certificate_No_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Certificate_No_EI;
		
		if(Certificate_No_EI.isEmpty()){
			log.info("'Certificate_No' Input is Empty. So Skipped This!");
		}
		else if(Certificate_No_EI.length()<=20){
			handleFields.TextFields.textFieldsInputsHandle(driver,Certificate_No_EL,Certificate_No_EI);
			log.info("'Certificate_No' Has Been Entered Using_Edit_Mode_Inputs");
			}
		else{
			log.info("'Certificate_No' Length Should Not Exceed '20'. Try Again With Valid Input!");
			log.info("The Browser Will Be Closed");
			driver.quit();
			}
		
		
		log.info("Proceed to Select 'Confirmation_Mode' Using_Edit_Mode_Inputs");
		WebElement Confirmation_Mode_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Confirmation_Mode_EL(driver)));
		String Confirmation_Mode_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Confirmation_Mode_EI;
		
		if(Confirmation_Mode_EI.isEmpty()){
			log.info("'Confirmation_Mode' Input is Empty. So Skipped This!");
		}
		else{
			handleFields.DropDowns.dropDownInputsHandle(driver,Confirmation_Mode_EL,Confirmation_Mode_EI);
			log.info("'Confirmation_Mode' Has Been Selected Using_Edit_Mode_Inputs");
			}
		
		
		log.info("Proceed to Select 'Sub_Type' Using_Edit_Mode_Inputs");
		WebElement Sub_Type_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Sub_Type_EL(driver)));
		String Sub_Type_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Sub_Type_EI;
		
		if(Sub_Type_EI.isEmpty()){
			log.info("'Sub_Type' Input is Empty. So Skipped This!");
		}
		else{
			handleFields.DropDowns.dropDownInputsHandle(driver,Sub_Type_EL,Sub_Type_EI);
			log.info("'Sub_Type' Has Been Selected Using_Edit_Mode_Inputs");
			}
		
		
		log.info("Proceed to Enter 'INFO_Remarks' Using_Edit_Mode_Inputs");
		WebElement INFO_Remarks_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.INFO_Remarks_EL(driver)));
		String INFO_Remarks_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.INFO_Remarks_EI;
		
		if(INFO_Remarks_EI.isEmpty()){
			log.info("'INFO_Remarks' Input is Empty. So Skipped This!");
		}
		else if(INFO_Remarks_EI.length()<=100){
			handleFields.TextFields.textFieldsInputsHandle(driver,INFO_Remarks_EL,INFO_Remarks_EI);
			log.info("'INFO_Remarks' Has Been Entered Using_Edit_Mode_Inputs");
			}
		else{
			log.info("'INFO_Remarks' Length Should Not Exceed '100'. Try Again With Valid Input!");
			log.info("The Browser Will Be Closed");
			driver.quit();
			}
		
		wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.INFO_Close_Btn_E(driver))).click();
		
		
		log.info("--------------- <InfoPage_EditMode_Inputs Completed> ---------------");
	}
	
	
	@Test(dependsOnMethods="infoPage_EditMode_Inputs")
	public static void bankDetails_EditMode_Inputs() {
		
		log.info("*************** <BankDetails_EditMode_Inputs Initiated> ***************");
		
		log.info("::::::::::'Bank Details' Not Handled, Yet::::::::::");
		wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Bank_Details_Icon_Btn_EL(driver))).click();
		
		
		log.info("Proceed to Verify 'Total_Settlement' Using_Edit_Mode_Inputs");
		WebElement Total_Settlement_EL=wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.Loan_ND.Total_Settlement_EL(driver)));
		Total_Settlement_EV=Total_Settlement_EL.getText().replaceAll(",", "").trim();
		String Total_Settlement_EI=(frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Principal_EI).replaceAll(",", "");
		
			if (Total_Settlement_EV.equals(Total_Settlement_EI)) {
				log.info("Total_Settlement Verification - QA PASSED!");
			} else {
				log.info("Total_Settlement Verification - QA FAILED!!");
				log.info("Input Value is : "+Total_Settlement_EI+", Retrieved Value is : "+Total_Settlement_EV);
			}
		log.info("'Total_Settlement' Has Been Verified Using_Edit_Mode_Inputs");
			
		
		log.info("Proceed to Verify 'Settlement_Balance' Using_Edit_Mode_Inputs");
		WebElement Settlement_Balance_EL=wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.Loan_ND.Settlement_Balance_EL(driver)));
		Settlement_Balance_EV=Settlement_Balance_EL.getText().replaceAll(",", "").trim();
		String default_Stlmt_Bal="0.00";
		
			if (Settlement_Balance_EV.equals(default_Stlmt_Bal)) {
				log.info("Settlement_Balance Verification - QA PASSED!");
			} else {
				log.info("Settlement_Balance Verification - QA FAILED!!");
				log.info("Input Value is : "+default_Stlmt_Bal+", Retrieved Value is : "+Settlement_Balance_EV);
			}
		log.info("'Settlement_Balance' Has Been Verified Using_Edit_Mode_Inputs");
		
		
		wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Bank_Close_Btn_EL(driver))).click();
		
		
		log.info("--------------- <BankDetails_EditMode_Inputs Completed> ---------------");
		
	}
	
	@Test(dependsOnMethods="bankDetails_EditMode_Inputs")
	public static void cashFlow_EditMode() {
		log.info("*************** <CashFlow_EditMode Initiated> ***************");
		
		log.info("::::::::::'Cash Flow' Not Handled, Yet::::::::::");
		wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Cash_Flow_Icon_Btn_EL(driver))).click();
		
		handleFields.AlertMsg.alert_MsgHandle(driver);
		
		wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Cash_Flow_Close_Btn_EL(driver))).click();
		
		log.info("--------------- <CashFlow_EditMode Completed> ---------------");
		
	}


	@Test(dependsOnMethods = "cashFlow_EditMode")
	public static void dealSave_Using_EditMode_Inputs() throws InterruptedException {
		
	log.info("*************** <DealSave_Using_EditMode_Inputs Initiated> ***************");
	
	//Click On "Deal Save Button".
	wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Deal_Save_Btn_EL(driver))).click();	
	handleFields.AlertBox.alertBoxHandle(driver); //For Deal Save Confirmation
	
	
	//Getting Response of Deal Save Click.
	/**  'visibilityOfElementLocated' is Used To Avoid "NoSuchElementException"  **/
	WebElement Deal_Save_Status_EL=wait_E.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(frameWorks.pageObjectModel.Loan_ND.Deal_Save_Status_X)));
	String Deal_Status = Deal_Save_Status_EL.getText();	

	if(Deal_Status.equalsIgnoreCase(frameWorks.pageObjectModel.Loan_ND.Deal_Saved_VE)){		
		log.info("Deal Saved Successfully!! Using_Edit_Mode_Inputs - QA PASSED");
	}
	else{
		log.error("There is Some Issue on Deal Save! Using_Edit_Mode_Inputs - QA FAILED");
		log.info("System Prompted Response : "+Deal_Status);
		log.warn("Browser Will Be Closed, Please Seek Technical Assistance!!");
		driver.quit();
	}
		
	
	//Try To Check is "Deal ID" Generated or Not, For Saved Deal.
	try{
		WebElement Deal_ID_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Deal_ID_EL(driver)));
		DealID_EV = Deal_ID_EL.getText();
		if(DealID_EV.equals(Loan_ND_NewMode_Inputs.DealID_NV)){
		log.info("Both Deal IDs of New_Mode & Edit_Mode Should Same - QA PASSED");
		}else{
		log.error("Both Deal IDs of New_Mode & Edit_Mode Should Same - QA FAILED");
		log.info("New_Mode Deal_ID is : '"+Loan_ND_NewMode_Inputs.DealID_NV+"' , Edit_Mode Deal_ID is : '"+DealID_EV+"'");
		}
	}
	catch(Exception e){
		log.error("There Might Be Issue in 'Deal ID' Generation. The Deal May Not Saved. Please Seek Technical Assistance!");
		log.error("The Browser Will Be Closed!");
		driver.quit();		
	}
	
	
	//Try Close the Deal Save Page, To Go Dashboard.
	wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Page_Close_After_Deal_Saved_EL(driver))).click();	

	log.info("--------------- <DealSave_Using_EditMode_Inputs Completed> ---------------");
	
	}

}
