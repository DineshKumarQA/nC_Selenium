package marketTypes.baseLMM;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LMM_ND_Base {

	// Declarations Of Log4j For This Class
	public static Logger log = Logger.getLogger(LMM_ND_Base.class.getName());	

	
	/**  NEW MODE PURPOSE  **/
	public static void clickAddDeal(WebDriver driver, WebDriverWait wait_E) {
		//driver.navigate().refresh();
		
		//Wait Until Page Completely Loaded, To Avoid Exception		
		handleFields.PageLoad_CircleBar_Handle.is_PageLoaded_Check(driver);
		
		//Check System Prompted Error For 'JBOSS' is Up/Not
		handleFields.AlertMsg.alert_MsgHandle(driver);
		wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.Dashboard_Elements.ADD_Deal_Btn_EL(driver))).click();	
	}

	public static void goToMoney_Market(WebDriver driver, WebDriverWait wait_E) {
		log.info("Proceed to Go to Money_Market_ND Screen");
		wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.Dashboard_Elements.Money_Market_EL(driver))).click();
		log.info("Landed in Money_Market_ND Screen");
	}
	
	public static void goToLoan(WebDriver driver, WebDriverWait wait_E) {
		log.info("Proceed to Go to Loan_ND Screen");
		wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.Dashboard_Elements.Loan_EL(driver))).click();
		log.info("Landed in Loan_ND Screen");
	}

	public static void balSheetClick(WebDriver driver, WebDriverWait wait_E, String Asset_Liabiity) {
		//To Ensure, the Blocking Layer Becomes Hidden/Not
		wait_E.until(ExpectedConditions.invisibilityOfAllElements(frameWorks.pageObjectModel.CommonElements.BalSheetClickBlocker_EL(driver)));
		if(Asset_Liabiity.equalsIgnoreCase("Asset")){
			log.info("Balance Sheet is 'Asset'");
			wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.Loan_ND.Asset_EL(driver))).click();
		}
		else if(Asset_Liabiity.equalsIgnoreCase("Liability")){
			log.info("Balance Sheet is 'Liability'");
			wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.Loan_ND.Liability_EL(driver))).click();
		}
		else{
			log.info("Balance Sheet is Invalid!!");
			log.info("Test Will Not Be Continued. The Browser Will Be Closed!.");
			driver.quit();
		}
	}

	public static void selectBEntity(WebDriver driver, WebDriverWait wait_E, String Business_Entity_I) {
		//Wait Until Page Completely Loaded, To Avoid Exception
		handleFields.PageLoad_CircleBar_Handle.is_PageLoaded_Check(driver);

		log.info("Proceed to Select 'Business_Entity'");
		WebElement Business_Entity_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Business_Entity_EL(driver)));		
		handleFields.DropDowns.dropDownInputsHandle(driver,Business_Entity_EL,Business_Entity_I);
		handleFields.AlertMsg.alert_MsgHandle(driver);	//Check-Is System Prompted Any Warning/Error Message
		log.info("'Business_Entity' Has Been Selected");
	}

	public static void selectCParty(WebDriver driver, WebDriverWait wait_E, String Credit_Risk_I) {
		log.info("Proceed to Select 'Credit_Risk'");
		WebElement Credit_Risk_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Credit_Risk_EL(driver)));		
		handleFields.DropDowns.dropDownInputsHandle(driver,Credit_Risk_EL,Credit_Risk_I);
		handleFields.AlertMsg.alert_MsgHandle(driver);
		log.info("'Credit_Risk' Has Been Selected");
	}

	public static void selectProduct(WebDriver driver, WebDriverWait wait_E, String Product_I) {
		log.info("Proceed to Select 'Product'");
		WebElement Product_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Product_EL(driver)));
		handleFields.DropDowns.dropDownInputsHandle(driver,Product_EL,Product_I);
		handleFields.AlertMsg.alert_MsgHandle(driver);
		log.info("'Product' Has Been Selected");
	}

	public static void selectStrategy(WebDriver driver, WebDriverWait wait_E, String Strategy_I) {
		log.info("Proceed to Select 'Strategy'");
		WebElement Strategy_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Strategy_EL(driver)));
		handleFields.DropDowns.dropDownInputsHandle(driver,Strategy_EL,Strategy_I);
		handleFields.AlertMsg.alert_MsgHandle(driver);
		log.info("'Strategy' Has Been Selected");
	}

	public static void selectDealDate(WebDriver driver, WebDriverWait wait_E, String Deal_Date_I) {
		log.info("Proceed to Select 'Deal_Date'");
		WebElement Deal_Date_Btn_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Deal_Date_Btn_EL(driver)));
		handleFields.DateSelection.dateInputsHandle(driver,Deal_Date_Btn_EL,Deal_Date_I);
		handleFields.AlertBox.alertBoxHandle(driver); 	//Check-Is Given Date Falls on Holiday!
		handleFields.AlertMsg.alert_MsgHandle(driver);	
		log.info("'Deal_Date' Has Been Selected");
	}

	public static void selectValueDate(WebDriver driver, WebDriverWait wait_E, String Value_Date_I) {
		log.info("Proceed to Select 'Value_Date'");
		WebElement Value_Date_Btn_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Value_Date_Btn_EL(driver)));
		handleFields.DateSelection.dateInputsHandle(driver,Value_Date_Btn_EL,Value_Date_I);
		handleFields.AlertBox.alertBoxHandle(driver);
		handleFields.AlertMsg.alert_MsgHandle(driver);  
		log.info("'Value_Date' Has Been Selected");
	}

	public static void selectMaturityDate(WebDriver driver, WebDriverWait wait_E,String Maturity_Date_I) {
		log.info("Proceed to Select 'Maturity_Date'");
		WebElement Maturity_Date_Btn_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Maturity_Date_Btn_EL(driver)));	
		handleFields.DateSelection.dateInputsHandle(driver,Maturity_Date_Btn_EL,Maturity_Date_I);
		handleFields.AlertBox.alertBoxHandle(driver);
		handleFields.AlertMsg.alert_MsgHandle(driver);
		log.info("'Maturity_Date' Has Been Selected");
	}

	public static String retrieveTenor(WebDriver driver, WebDriverWait wait_E) {
		log.info("Proceed to Retrieve 'Tenor'");
		WebElement Tenor_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Tenor_EL(driver)));
		String Tenor_NV=Tenor_EL.getAttribute("value");
		log.info("'Tenor' Has Been Retrieved");
		return Tenor_NV;
	}

	public static void enterTenor(WebDriver driver, WebDriverWait wait_E, String Tenor_I) {
		log.info("Proceed to Enter 'Tenor'");
		WebElement Tenor_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Tenor_EL(driver)));
		handleFields.TextFields.textFieldsInputsHandle(driver,Tenor_EL,Tenor_I);
		handleFields.AlertMsg.alert_MsgHandle(driver);
		log.info("'Tenor' Has Been Entered");
	}

	public static String retrieveMaturityDate(WebDriver driver, WebDriverWait wait_E) {
		log.info("Proceed to Retrieve 'Maturity Date'");
		WebElement Maturity_Date_txt_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Maturity_Date_txt_EL(driver)));
		String Maturity_Date_NV=Maturity_Date_txt_EL.getAttribute("value");			
		log.info("'Maturity Date' Has Been Retrieved");
		return Maturity_Date_NV;
	}

	public static void enterPrincipal(WebDriver driver, WebDriverWait wait_E, String Principal_I) {
		log.info("Proceed to Enter 'Principal'");
		WebElement Principal_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Principal_EL(driver)));		
		handleFields.TextFields.textFieldsInputsHandle(driver,Principal_EL,Principal_I);
		handleFields.AlertMsg.alert_MsgHandle(driver);
		log.info("'Principal' Has Been Entered");	
	}

	public static void selectFixedRateType(WebDriver driver, WebDriverWait wait_E) {
		log.info("Proceed to Select 'Fixed' RateType");
		WebElement RateType_Fixed_EL=frameWorks.pageObjectModel.Loan_ND.RateType_Fixed_EL(driver);
		RateType_Fixed_EL.click();
		log.info("'Fixed' RateType Has Been Selected");
	}

	public static void selectFloatRateType(WebDriver driver, WebDriverWait wait_E) {
		log.info("Proceed to Select 'Float' RateType");
		WebElement RateType_Float_EL=frameWorks.pageObjectModel.Loan_ND.RateType_Float_EL(driver);
		RateType_Float_EL.click();
		log.info("'Float' RateType Has Been Selected");
	}

	public static void selectReferenceID(WebDriver driver, WebDriverWait wait_E, String Reference_ID_I) {
		log.info("Proceed to Select 'Reference_ID'");
		WebElement Reference_ID_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Reference_ID_EL(driver)));		
		handleFields.DropDowns.dropDownInputsHandle(driver,Reference_ID_EL,Reference_ID_I);
		handleFields.AlertMsg.alert_MsgHandle(driver);
		log.info("'Reference_ID' Has Been Selected");
	}

	public static void selectReferenceTenor(WebDriver driver, WebDriverWait wait_E, String Reference_Tenor_I) {
		log.info("Proceed to Select 'Reference_Tenor'");
		WebElement Reference_Tenor_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Reference_Tenor_EL(driver)));		
		handleFields.DropDowns.dropDownInputsHandle(driver,Reference_Tenor_EL,Reference_Tenor_I);
		handleFields.AlertMsg.alert_MsgHandle(driver);
		log.info("'Reference_Tenor' Has Been Selected");
	}

	public static String retrieveReferenceRate(WebDriver driver, WebDriverWait wait_E) {
		log.info("Proceed to Retrieve 'Reference_Rate'");
		WebElement Reference_Rate_EL=wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.Loan_ND.Reference_Rate_EL(driver)));
		String Reference_Rate_NV=Reference_Rate_EL.getAttribute("value");
		log.info("New Mode-> Reference_Rate% is : "+Reference_Rate_NV+", Where RateType='Float'");
		log.info("'Reference_Rate' Has Been Retrieved");
		return Reference_Rate_NV;
	}

	public static void enterSpread(WebDriver driver, WebDriverWait wait_E, String Spread_I) {
		log.info("Proceed to Enter 'Spread'");
		WebElement Spread_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Spread_EL(driver)));		
		handleFields.TextFields.textFieldsInputsHandle(driver,Spread_EL,Spread_I);
		handleFields.AlertMsg.alert_MsgHandle(driver);
		log.info("'Spread' Has Been Entered");
	}

	public static void enterRate(WebDriver driver, WebDriverWait wait_E, String Rate_I) {
		log.info("Proceed to Enter 'Rate%'");
		WebElement Rate_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Rate_EL(driver)));		
		handleFields.TextFields.textFieldsInputsHandle(driver,Rate_EL,Rate_I);
		handleFields.AlertMsg.alert_MsgHandle(driver);
		log.info("'Rate%' Has Been Entered");
	}

	public static String retrieveRate(WebDriver driver, WebDriverWait wait_E) {
		//For Edit Mode Verification, Since the Rate% is Calculated By System.
		log.info("Proceed to Retrieve 'Rate%'");
		WebElement Rate_EL=wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.Loan_ND.Rate_EL(driver)));
		Rate_EL.click(); //To Load RefRate + Spread. As System Takes 'Spread=0', Even It has Value.
		String Rate_NV=Rate_EL.getAttribute("value");
		log.info("New Mode-> Rate% is : "+Rate_NV);
		log.info("'Rate%' Has Been Retrieved");
		return Rate_NV;
	}

	public static void enterWTax(WebDriver driver, WebDriverWait wait_E, String W_Tax_I) {
		log.info("Proceed to Enter 'W/tax%'");	
		WebElement W_Tax_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.W_Tax_EL(driver)));		

		// To Avoid-"MoveTargetOutOfBoundsException", By Scrolling Down the Page. As 'W/Tax' Located in Bottom of the Page.
		handleFields.ScrollToElement.scrolltoGivenElement(driver,W_Tax_EL); 

		handleFields.TextFields.textFieldsInputsHandle(driver,W_Tax_EL,W_Tax_I);
		handleFields.AlertMsg.alert_MsgHandle(driver);
		log.info("'W/tax%' Has Been Entered");
	}

	public static void enterWeAbsorb(WebDriver driver, WebDriverWait wait_E, String We_Absorb_I) {
		try{
			WebElement We_Absorb_EL=frameWorks.pageObjectModel.Loan_ND.We_Absorb_EL(driver);			
			We_Absorb_EL.click();  // To Enable the 'We Absorb%' Field.
			if(We_Absorb_EL.isEnabled()){
				log.info("Proceed to Enter 'We_Absorb%'");
				handleFields.TextFields.textFieldsInputsHandle(driver,We_Absorb_EL,We_Absorb_I);
				handleFields.AlertMsg.alert_MsgHandle(driver);
				log.info("'We_Absorb%' Has Been Entered");				
			}
		}
		catch(Exception e){		
			log.info("WeAbsorb Input Given Got Exception. Which is : "+e);
		}
	}

	public static void clickInfo(WebDriver driver, WebDriverWait wait_E) {
		wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Info_Icon_Btn_EL(driver))).click();
	}

	public static void selectPrincipalFrequency(WebDriver driver, WebDriverWait wait_E, String Principal_Freq_I) {
		log.info("Proceed to Select 'Principal_Frequency'");
		WebElement Principal_Freq_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Principal_Freq_EL(driver)));		
		handleFields.DropDowns.dropDownInputsHandle(driver,Principal_Freq_EL,Principal_Freq_I);
		handleFields.AlertMsg.alert_MsgHandle(driver);
		log.info("'Principal_Frequency' Has Been Selected");
	}

	public static String retrievePrincipalFrequency(WebDriver driver, WebDriverWait wait_E) {
		log.info("Proceed to Retrieve 'Principal_Frequency'");
		WebElement Principal_Freq_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Principal_Freq_EL(driver)));
		String Principal_Freq_NV=Principal_Freq_EL.getAttribute("value").trim();		//For Edit Mode Verification Purpose
		log.info("'Principal_Frequency' Has Been Retrieved");
		return Principal_Freq_NV;
	}

	public static void selectInterestFrequency(WebDriver driver, WebDriverWait wait_E, String Interest_Freq_I) {
		log.info("Proceed to Select 'Interest_Frequency'");
		WebElement Interest_Freq_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Interest_Freq_EL(driver)));		
		handleFields.DropDowns.dropDownInputsHandle(driver,Interest_Freq_EL,Interest_Freq_I);
		handleFields.AlertMsg.alert_MsgHandle(driver);
		log.info("'Interest_Frequency' Has Been Selected");
	}

	public static String retrieveInterestFrequency(WebDriver driver, WebDriverWait wait_E) {
		log.info("Proceed to Retrieve 'Interest_Frequency'");
		WebElement Interest_Freq_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Interest_Freq_EL(driver)));
		String Interest_Freq_NV = Interest_Freq_EL.getAttribute("value").trim();			//For Edit Mode Verification Purpose
		log.info("'Interest_Frequency' Has Been Retrieved");
		return Interest_Freq_NV;
	}

	public static void selectDayCountBasis(WebDriver driver, WebDriverWait wait_E, String Day_Count_Basis_I) {
		log.info("Proceed to Select 'Day_Count_Basis'");
		WebElement Day_Count_Basis_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Day_Count_Basis_EL(driver)));		
		handleFields.DropDowns.dropDownInputsHandle(driver,Day_Count_Basis_EL,Day_Count_Basis_I);
		handleFields.AlertMsg.alert_MsgHandle(driver);
		log.info("'Day_Count_Basis' Has Been Selected");	
	}

	public static String retrieveDayCountBasis(WebDriver driver, WebDriverWait wait_E) {
		log.info("Proceed to Retrieve 'Day_Count_Basis'");
		WebElement Day_Count_Basis_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Day_Count_Basis_EL(driver)));
		String Day_Count_Basis_NV=Day_Count_Basis_EL.getAttribute("value").trim();			//For Edit Mode Verification Purpose
		log.info("'Day_Count_Basis' Has Been Retrieved");
		return Day_Count_Basis_NV;
	}

	public static void selectDateConvention(WebDriver driver, WebDriverWait wait_E, String Date_Convention_I) {
		log.info("Proceed to Select 'Date_Convention'");
		WebElement Date_Convention_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Date_Convention_EL(driver)));		
		handleFields.DropDowns.dropDownInputsHandle(driver,Date_Convention_EL,Date_Convention_I);
		handleFields.AlertMsg.alert_MsgHandle(driver);
		log.info("'Date_Convention' Has Been Selected");
	}

	public static String retrieveDateConvention(WebDriver driver, WebDriverWait wait_E) {
		log.info("Proceed to Retrieve 'Date_Convention'");
		WebElement Date_Convention_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Date_Convention_EL(driver)));
		String Date_Convention_NV = Date_Convention_EL.getAttribute("value").trim();			//For Edit Mode Verification Purpose
		log.info("'Date_Convention' Has Been Retrieved");
		return Date_Convention_NV;
	}

	public static void selectPeriodEnd(WebDriver driver, WebDriverWait wait_E, String Period_End_I) {
		log.info("Proceed to Select 'Period_End'");
		WebElement Period_End_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Period_End_EL(driver)));		
		handleFields.DropDowns.dropDownInputsHandle(driver,Period_End_EL,Period_End_I);
		handleFields.AlertMsg.alert_MsgHandle(driver);
		log.info("'Period_End' Has Been Selected");
	}

	public static String retrievePeriodEnd(WebDriver driver, WebDriverWait wait_E) {
		log.info("Proceed to Retrieve 'Period_End'");
		WebElement Period_End_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Period_End_EL(driver)));
		String Period_End_NV = Period_End_EL.getAttribute("value").trim();			//For Edit Mode Verification Purpose		
		log.info("'Period_End' Has Been Retrieved");
		return Period_End_NV;
	}

	public static void selectContact(WebDriver driver, WebDriverWait wait_E, String Contact_I) {
		log.info("Proceed to Select 'Contact'");
		WebElement Contact_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Contact_EL(driver)));		
		handleFields.DropDowns.dropDownInputsHandle(driver,Contact_EL,Contact_I);
		handleFields.AlertMsg.alert_MsgHandle(driver);
		log.info("'Contact' Has Been Selected");
	}

	public static void selectDepartment(WebDriver driver, WebDriverWait wait_E, String Department_I) {
		log.info("Proceed to Select 'Department'");
		WebElement Department_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Department_EL(driver)));		
		handleFields.DropDowns.dropDownInputsHandle(driver,Department_EL,Department_I);
		handleFields.AlertMsg.alert_MsgHandle(driver);
		log.info("'Department' Has Been Selected");
	}

	public static void selectBroker(WebDriver driver, WebDriverWait wait_E, String Broker_I) {
		log.info("Proceed to Select 'Broker'");
		WebElement Broker_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Broker_EL(driver)));		
		handleFields.DropDowns.dropDownInputsHandle(driver,Broker_EL,Broker_I);
		handleFields.AlertMsg.alert_MsgHandle(driver);
		log.info("'Broker' Has Been Selected");
	}

	public static void enterCPartyRef(WebDriver driver, WebDriverWait wait_E, String C_PartyRef_I) {
		log.info("Proceed to Enter 'C_PartyRef'");
		WebElement C_PartyRef_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.C_PartyRef_EL(driver)));				
		handleFields.TextFields.textFieldsInputsHandle(driver,C_PartyRef_EL,C_PartyRef_I);		
		log.info("'C_PartyRef' Has Been Entered");
	}

	public static void enterDealRef(WebDriver driver, WebDriverWait wait_E, String Deal_Ref_I) {
		log.info("Proceed to Enter 'Deal_Ref'");
		WebElement Deal_Ref_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Deal_Ref_EL(driver)));				
		handleFields.TextFields.textFieldsInputsHandle(driver,Deal_Ref_EL,Deal_Ref_I);
		log.info("'Deal_Ref' Has Been Entered");
	}

	public static void enterCertificateNo(WebDriver driver, WebDriverWait wait_E, String Certificate_No_I) {
		log.info("Proceed to Enter 'Certificate_No'");
		WebElement Certificate_No_EL=wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Certificate_No_EL(driver)));
		handleFields.TextFields.textFieldsInputsHandle(driver,Certificate_No_EL,Certificate_No_I);
		log.info("'Certificate_No' Has Been Entered");		
	}

	public static void selectConfirmationMode(WebDriver driver, WebDriverWait wait_E, String Confirmation_Mode_I) {
		log.info("Proceed to Select 'Confirmation_Mode'");
		WebElement Confirmation_Mode_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Confirmation_Mode_EL(driver)));		
		handleFields.DropDowns.dropDownInputsHandle(driver,Confirmation_Mode_EL,Confirmation_Mode_I);
		log.info("'Confirmation_Mode' Has Been Selected");
	}

	public static void selectSubType(WebDriver driver, WebDriverWait wait_E, String Sub_Type_NI) {
		log.info("Proceed to Select 'Sub_Type'");
		WebElement Sub_Type_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Sub_Type_EL(driver)));		
		handleFields.DropDowns.dropDownInputsHandle(driver,Sub_Type_EL,Sub_Type_NI);
		log.info("'Sub_Type' Has Been Selected");
	}

	public static void enterInfoRemark(WebDriver driver, WebDriverWait wait_E, String INFO_Remarks_I) {
		log.info("Proceed to Enter 'Info_Remarks'");
		WebElement INFO_Remarks_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.INFO_Remarks_EL(driver)));		
		handleFields.TextFields.textFieldsInputsHandle(driver,INFO_Remarks_EL,INFO_Remarks_I);
		log.info("'Info_Remarks' Has Been Entered");
	}

	public static void closeInfo(WebDriver driver, WebDriverWait wait_E) {
		wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.INFO_Close_Btn_E(driver))).click();
	}

	public static void clickBankDetails(WebDriver driver, WebDriverWait wait_E) {
		wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Bank_Details_Icon_Btn_EL(driver))).click();
	}


	public static void verifyBankTotalSettlement(WebDriver driver, WebDriverWait wait_E, String Total_Settlement_I) {
		log.info("Proceed to Verify 'Total_Settlement'");
		WebElement Total_Settlement_EL=wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.Loan_ND.Total_Settlement_EL(driver)));
		String Total_Settlement_NV=Total_Settlement_EL.getText().replaceAll(",", "").trim();
		String Total_Settlement_NI=Total_Settlement_I.replaceAll(",", "");
		if (Total_Settlement_NV.equals(Total_Settlement_NI)) {
			log.info("Total_Settlement Verification - QA PASSED!");
		} else {
			log.info("Total_Settlement Verification - QA FAILED!!");
			log.info("Input Value is : "+Total_Settlement_NI+", Retrieved Value is : "+Total_Settlement_NV);
		}
		log.info("'Total_Settlement' Has Been Verified");
	}

	public static void verifyBankSettlementBalance(WebDriver driver, WebDriverWait wait_E) {
		log.info("Proceed to Verify 'Settlement_Balance'");
		WebElement Settlement_Balance_EL=wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.Loan_ND.Settlement_Balance_EL(driver)));
		String Settlement_Balance_NV=Settlement_Balance_EL.getText().replaceAll(",", "").trim();
		String default_Stlmt_Bal="0.00";

		if (Settlement_Balance_NV.equals(default_Stlmt_Bal)) {
			log.info("Settlement_Balance Verification - QA PASSED!");
		} else {
			log.info("Settlement_Balance Verification - QA FAILED!!");
			log.info("Input Value is : "+default_Stlmt_Bal+", Retrieved Value is : "+Settlement_Balance_NV);
		}
		log.info("'Settlement_Balance' Has Been Verified");
	}

	public static void closeBankDetails(WebDriver driver, WebDriverWait wait_E) {
		wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Bank_Close_Btn_EL(driver))).click();
	}

	public static void clickCashFlow(WebDriver driver, WebDriverWait wait_E) {
		wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Cash_Flow_Icon_Btn_EL(driver))).click();
		handleFields.AlertMsg.alert_MsgHandle(driver);
	}

	public static void closeCashFlow(WebDriver driver, WebDriverWait wait_E) {
		wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Cash_Flow_Close_Btn_EL(driver))).click();
	}

	public static void clickDealSave(WebDriver driver, WebDriverWait wait_E) {
		wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Deal_Save_Btn_EL(driver))).click();
	}

	public static void verifyDealSavedOrNot(WebDriver driver, WebDriverWait wait_E) {
		handleFields.AlertBox.alertBoxHandle(driver); //For Deal Save Confirmation

		//Getting Response of Deal Save Click.
		/**  'visibilityOfElementLocated' is Used To Avoid "NoSuchElementException"  **/
		WebElement Deal_Save_Status_EL=wait_E.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(frameWorks.pageObjectModel.Loan_ND.Deal_Save_Status_X)));
		String Deal_Status = Deal_Save_Status_EL.getText();	

		if(Deal_Status.equalsIgnoreCase(frameWorks.pageObjectModel.Loan_ND.Deal_Saved_VE)){		
			log.info("Deal Saved Successfully!! - QA PASSED");
		}
		else{
			log.error("There is Some Issue on Deal Save! - QA FAILED");
			log.info("System Prompted Response : "+Deal_Status);
		}
	}

	public static String retrieveDealID(WebDriver driver, WebDriverWait wait_E) {
		String DealID_NV = null;
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
		return DealID_NV;
	}

	public static void closeDealSavePage(WebDriver driver, WebDriverWait wait_E) {
		//Try Close the Deal Save Page, To Go Dashboard.
		wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Page_Close_After_Deal_Saved_EL(driver))).click();
	}


	/**  EDIT MODE PURPOSE  **/
	public static void verifyBEntity(WebDriver driver, WebDriverWait wait_E, String Business_Entity_I) {
		//Wait Until Page Completely Loaded, To Avoid Exception
		handleFields.PageLoad_CircleBar_Handle.is_PageLoaded_Check(driver);		

		log.info("Proceed to Verify 'Business_Entity'");			
		WebElement Business_Entity_EL = frameWorks.pageObjectModel.Loan_ND.Business_Entity_EL(driver);		
		String Business_Entity_RV = Business_Entity_EL.getAttribute("value").trim();  			// Variable Name Ends With '_RV' Mean 'Retrieved Value'					
		handleFields.EditMode_Fields_Verify.retrievedValueVerify(Business_Entity_RV, Business_Entity_I);	
		handleFields.EditMode_Fields_Verify.isFieldDisabled(Business_Entity_EL);						
		log.info("'Business_Entity' Has Been Verified");
	}

	public static void verifyCParty(WebDriver driver, WebDriverWait wait_E, String Credit_Risk_I) {
		log.info("Proceed to Verify 'Credit_Risk'");		
		WebElement Credit_Risk_EL = wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.Loan_ND.Credit_Risk_EL(driver)));
		String Credit_Risk_RV= Credit_Risk_EL.getAttribute("Value").trim();				
		handleFields.EditMode_Fields_Verify.retrievedValueVerify(Credit_Risk_RV, Credit_Risk_I);			
		handleFields.EditMode_Fields_Verify.isFieldDisabled(Credit_Risk_EL);
		log.info("'Credit_Risk' Has Been Verified");
	}

	public static void verifyProduct(WebDriver driver, WebDriverWait wait_E, String Product_I) {
		log.info("Proceed to Verify 'Product'");			
		WebElement Product_EL = wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.Loan_ND.Product_EL(driver)));
		String Product_RV= Product_EL.getAttribute("Value").trim();				
		handleFields.EditMode_Fields_Verify.retrievedValueVerify(Product_RV, Product_I);			
		handleFields.EditMode_Fields_Verify.isFieldDisabled(Product_EL);		
		log.info("'Product' Has Been Verified");
	}

	public static void verifyStrategy(WebDriver driver, WebDriverWait wait_E, String Strategy_I) {
		log.info("Proceed to Verify 'Strategy'");			
		WebElement Strategy_EL = wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.Loan_ND.Strategy_EL(driver)));
		String Strategy_RV= Strategy_EL.getAttribute("Value").trim();				
		handleFields.EditMode_Fields_Verify.retrievedValueVerify(Strategy_RV, Strategy_I);			
		handleFields.EditMode_Fields_Verify.isFieldDisabled(Strategy_EL);
		log.info("'Strategy' Has Been Verified");
	}

	public static void verifyDealDate(WebDriver driver, WebDriverWait wait_E, String Deal_Date_I) {
		log.info("Proceed to Verify 'Deal_Date'");	
		WebElement Deal_Date_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Deal_Date_txt_EL(driver)));
		String Deal_Date_RV=Deal_Date_EL.getAttribute("value").replaceAll("-", "/");
		Deal_Date_I = Deal_Date_I.replaceAll("-", "/");
		handleFields.EditMode_Fields_Verify.retrievedValueVerify(Deal_Date_RV, Deal_Date_I);
		log.info("'Deal_Date' Has Been Verified");
	}

	public static void verifyValueDate(WebDriver driver, WebDriverWait wait_E, String Value_Date_I) {
		log.info("Proceed to Verify 'Value_Date'");
		WebElement Value_Date_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Value_Date_txt_EL(driver)));
		String Value_Date_RV=Value_Date_EL.getAttribute("value").replaceAll("-", "/");		
		Value_Date_I = Value_Date_I.replaceAll("-", "/");
		handleFields.EditMode_Fields_Verify.retrievedValueVerify(Value_Date_RV, Value_Date_I);
		log.info("'Value_Date' Has Been Verified");
	}

	public static void verifyMaturityDate(WebDriver driver, WebDriverWait wait_E, String Maturity_Date_I) {
		log.info("Proceed to Verify 'Maturity_Date'");
		WebElement Maturity_Date_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Maturity_Date_txt_EL(driver)));	
		String Maturity_Date_RV=Maturity_Date_EL.getAttribute("value").replaceAll("-", "/");		
		handleFields.EditMode_Fields_Verify.retrievedValueVerify(Maturity_Date_RV, Maturity_Date_I);
		log.info("'Maturity_Date' Has Been Verified");
	}

	public static void verifyTenor(WebDriver driver, WebDriverWait wait_E, String Tenor_I) {
		log.info("Proceed to Verify 'Tenor'");
		WebElement Tenor_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Tenor_EL(driver)));
		String Tenor_RV= Tenor_EL.getAttribute("Value").trim();		
		handleFields.EditMode_Fields_Verify.retrievedValueVerify(Tenor_RV, Tenor_I);	
		log.info("'Tenor' Has Been Verified");
	}

	public static void verifyPrincipal(WebDriver driver, WebDriverWait wait_E, String Principal_I) {
		log.info("Proceed to Verify 'Principal'");
		WebElement Principal_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Principal_EL(driver)));
		String Principal_RV= Principal_EL.getAttribute("Value").trim().replaceAll(",", "");				
		Principal_I = Principal_I.trim().replaceAll(",", "");
		handleFields.EditMode_Fields_Verify.retrievedValueVerify(Principal_RV, Principal_I);
		log.info("'Principal' Has Been Verified");
	}

	public static void verifyFixedRateType(WebDriver driver, WebDriverWait wait_E) {
		log.info("Proceed to Verify 'Fixed' RateType");
		WebElement RateType_Fixed_EL = frameWorks.pageObjectModel.Loan_ND.RateType_Fixed_EL(driver);
		handleFields.EditMode_Fields_Verify.isRadioBtnSelected(RateType_Fixed_EL);
		log.info("'Fixed' RateType Has Been Verify");
	}

	public static void verifyFloatRateType(WebDriver driver, WebDriverWait wait_E) {
		log.info("Proceed to Verify 'Float' RateType");
		WebElement RateType_Float_EL = frameWorks.pageObjectModel.Loan_ND.RateType_Float_EL(driver);
		handleFields.EditMode_Fields_Verify.isRadioBtnSelected(RateType_Float_EL);
		log.info("'Float' RateType Has Been Verify");
	}

	public static void verifyReferenceID(WebDriver driver, WebDriverWait wait_E, String Reference_ID_I) {
		log.info("Proceed to Verify 'Reference_ID'");
		WebElement Reference_ID_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Reference_ID_EL(driver)));
		String Reference_ID_RV = Reference_ID_EL.getAttribute("value").trim();					
		handleFields.EditMode_Fields_Verify.retrievedValueVerify(Reference_ID_RV, Reference_ID_I);
		log.info("'Reference_ID' Has Been Verified");
	}

	public static void verifyReferenceTenor(WebDriver driver, WebDriverWait wait_E, String Reference_Tenor_I) {
		log.info("Proceed to Verify 'Reference_Tenor'");
		WebElement Reference_Tenor_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Reference_Tenor_EL(driver)));
		String Reference_Tenor_RV=Reference_Tenor_EL.getAttribute("value");					
		handleFields.EditMode_Fields_Verify.retrievedValueVerify(Reference_Tenor_RV, Reference_Tenor_I);
		log.info("'Reference_Tenor' Has Been Verified");
	}

	public static void verifyReferenceRate(WebDriver driver, WebDriverWait wait_E, String Reference_Rate_I) {
		log.info("Proceed to Verify 'Reference_Rate%'");
		WebElement Reference_Rate_EL = wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.Loan_ND.Reference_Rate_EL(driver)));
		String Reference_Rate_RV=Reference_Rate_EL.getAttribute("value");		
		handleFields.EditMode_Fields_Verify.retrievedValueVerify(Reference_Rate_RV, Reference_Rate_I);
		log.info("'Reference_Rate%' Has Been Verified");
	}

	public static void verifySpread(WebDriver driver, WebDriverWait wait_E, String Spread_I) {
		log.info("Proceed to Verify 'Spread'");
		WebElement Spread_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Spread_EL(driver)));
		String Spread_RV=Spread_EL.getAttribute("value").replaceAll("%", "");					
		Spread_I = Spread_I.replaceAll("%", "");
		handleFields.EditMode_Fields_Verify.retrievedValueVerify(Spread_RV, Spread_I);
		log.info("'Spread' Has Been Verified");
	}

	public static void verifyRate(WebDriver driver, WebDriverWait wait_E, String Rate_I) {
		log.info("Proceed to Verify 'Rate%', Where RateType='Float'");
		WebElement Rate_EL = wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.Loan_ND.Rate_EL(driver)));
		String Rate_RV=Rate_EL.getAttribute("value").replaceAll("%", "");		
		Rate_I = Rate_I.replaceAll("%", "");
		handleFields.EditMode_Fields_Verify.retrievedValueVerify(Rate_RV, Rate_I);			
		handleFields.EditMode_Fields_Verify.isFieldDisabled(Rate_EL);
		log.info("'Rate%' Has Been Verified, Where RateType='Float'");
	}

	public static void verifyWTax(WebDriver driver, WebDriverWait wait_E, String W_Tax_I) {
		log.info("Proceed to Verify 'W/Tax%'");
		WebElement W_Tax_EL = wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.Loan_ND.W_Tax_EL(driver)));
		String W_Tax_RV=W_Tax_EL.getAttribute("value").replaceAll("%", "");
		W_Tax_I = W_Tax_I.replaceAll("%", "");
		handleFields.EditMode_Fields_Verify.retrievedValueVerify(W_Tax_RV, W_Tax_I);
		log.info("'W/Tax%' Has Been Verified");
	}

	public static void verifyWeAbsorb(WebDriver driver, WebDriverWait wait_E, String We_Absorb_I) {
		log.info("Proceed to Verify 'We Absorb%'");
		WebElement We_Absorb_EL = frameWorks.pageObjectModel.Loan_ND.We_Absorb_EL(driver);
		String We_Absorb_RV=We_Absorb_EL.getAttribute("value").replaceAll("%", "");
		We_Absorb_I = We_Absorb_I.replaceAll("%", "");	
		handleFields.EditMode_Fields_Verify.retrievedValueVerify(We_Absorb_RV, We_Absorb_I);
		log.info("'We Absorb%' Has Been Verified");
	}

	public static void verifyPrincipalFrequency(WebDriver driver, WebDriverWait wait_E, String Principal_Freq_I, String Principal_Freq_DV) {
		log.info("Proceed to Verify 'Principal_Frequency'");
		WebElement Principal_Freq_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Principal_Freq_EL(driver)));
		String Principal_Freq_RV=Principal_Freq_EL.getAttribute("value").trim();				
		handleFields.EditMode_Fields_Verify.forAutoDefaultedFields_ValueVerification(Principal_Freq_RV, Principal_Freq_I, Principal_Freq_DV);
		log.info("'Principal_Frequency' Has Been Verified");
	}
	public static void verifyInterestFrequency(WebDriver driver, WebDriverWait wait_E, String Interest_Freq_I, String Interest_Freq_DV) {
		log.info("Proceed to Verify 'Interest_Frequency'");
		WebElement Interest_Freq_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Interest_Freq_EL(driver)));	
		String Interest_Freq_RV=Interest_Freq_EL.getAttribute("value").trim();				
		handleFields.EditMode_Fields_Verify.forAutoDefaultedFields_ValueVerification(Interest_Freq_RV, Interest_Freq_I, Interest_Freq_DV);
		log.info("'Interest_Frequency' Has Been Verified");
	}

	public static void verifyDayCountBasis(WebDriver driver, WebDriverWait wait_E, String Day_Count_Basis_I, String Day_Count_Basis_DV) {
		log.info("Proceed to Verify 'Day_Count_Basis'");		
		WebElement Day_Count_Basis_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Day_Count_Basis_EL(driver)));
		String Day_Count_Basis_RV=Day_Count_Basis_EL.getAttribute("value").trim();				
		handleFields.EditMode_Fields_Verify.forAutoDefaultedFields_ValueVerification(Day_Count_Basis_RV, Day_Count_Basis_I, Day_Count_Basis_DV);
		log.info("'Day_Count_Basis' Has Been Verified");
	}

	public static void verifyDateConvention(WebDriver driver, WebDriverWait wait_E, String Date_Convention_I, String Date_Convention_DV) {
		log.info("Proceed to Verify 'Date_Convention'");		
		WebElement Date_Convention_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Date_Convention_EL(driver)));
		String Date_Convention_RV=Date_Convention_EL.getAttribute("value").trim();				
		handleFields.EditMode_Fields_Verify.forAutoDefaultedFields_ValueVerification(Date_Convention_RV, Date_Convention_I, Date_Convention_DV);
		log.info("'Date_Convention' Has Been Verified");
	}

	public static void verifyPeriodEnd(WebDriver driver, WebDriverWait wait_E, String Period_End_I, String Period_End_DV) {
		log.info("Proceed to Verify 'Period_End'");		
		WebElement Period_End_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Period_End_EL(driver)));
		String Period_End_RV=Period_End_EL.getAttribute("value").trim();				
		handleFields.EditMode_Fields_Verify.forAutoDefaultedFields_ValueVerification(Period_End_RV, Period_End_I, Period_End_DV);
		log.info("'Period_End' Has Been Verified");
	}

	public static void verifyContact(WebDriver driver, WebDriverWait wait_E, String Contact_I) {
		log.info("Proceed to Verify 'Contact'");
		WebElement Contact_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Contact_EL(driver)));
		String Contact_RV=Contact_EL.getAttribute("value").trim();				
		handleFields.EditMode_Fields_Verify.forOptionalFields_ValueVerification(Contact_RV, Contact_I);		
		log.info("'Contact' Has Been Verified");
	}

	public static void verifyDepartment(WebDriver driver, WebDriverWait wait_E, String Department_I) {
		log.info("Proceed to Verify 'Department'");
		WebElement Department_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Department_EL(driver)));
		String Department_RV=Department_EL.getAttribute("value").trim();

		handleFields.EditMode_Fields_Verify.forOptionalFields_ValueVerification(Department_RV, Department_I);
		log.info("'Department' Has Been Verified");
	}

	public static void verifyBroker(WebDriver driver, WebDriverWait wait_E, String Broker_I) {
		log.info("Proceed to Verify 'Broker'");
		WebElement Broker_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Broker_EL(driver)));
		String Broker_RV=Broker_EL.getAttribute("value").trim();

		handleFields.EditMode_Fields_Verify.forOptionalFields_ValueVerification(Broker_RV, Broker_I);
		log.info("'Broker' Has Been Verified");
	}

	public static void verifyCPartyRef(WebDriver driver, WebDriverWait wait_E, String C_PartyRef_I) {
		log.info("Proceed to Verify 'C_PartyRef'");
		WebElement C_PartyRef_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.C_PartyRef_EL(driver)));
		String C_PartyRef_RV=C_PartyRef_EL.getAttribute("value").trim();

		handleFields.EditMode_Fields_Verify.forOptionalFields_ValueVerification(C_PartyRef_RV, C_PartyRef_I);
		log.info("'C_PartyRef' Has Been Verified");
	}

	public static void verifyDealRef(WebDriver driver, WebDriverWait wait_E, String Deal_Ref_I) {
		log.info("Proceed to Verify 'Deal_Ref'");
		WebElement Deal_Ref_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Deal_Ref_EL(driver)));
		String Deal_Ref_RV=Deal_Ref_EL.getAttribute("value").trim();				
		handleFields.EditMode_Fields_Verify.forOptionalFields_ValueVerification(Deal_Ref_RV, Deal_Ref_I);
		log.info("'Deal_Ref' Has Been Verified");
	}

	public static void verifyCertificateNo(WebDriver driver, WebDriverWait wait_E, String Certificate_No_I) {
		log.info("Proceed to Verify 'Certificate_No'");
		WebElement Certificate_No_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Certificate_No_EL(driver)));
		String Certificate_No_RV=Certificate_No_EL.getAttribute("value").trim();

		handleFields.EditMode_Fields_Verify.forOptionalFields_ValueVerification(Certificate_No_RV, Certificate_No_I);
		log.info("'Certificate_No' Has Been Verified");
	}

	public static void verifyConfirmationMode(WebDriver driver, WebDriverWait wait_E, String Confirmation_Mode_I) {
		log.info("Proceed to Verify 'Confirmation_Mode'");
		WebElement Confirmation_Mode_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Confirmation_Mode_EL(driver)));
		String Confirmation_Mode_RV=Confirmation_Mode_EL.getAttribute("value").trim();		
		handleFields.EditMode_Fields_Verify.forOptionalFields_ValueVerification(Confirmation_Mode_RV, Confirmation_Mode_I);
		log.info("'Confirmation_Mode' Has Been Verified");
	}

	public static void verifySubType(WebDriver driver, WebDriverWait wait_E, String Sub_Type_I) {
		log.info("Proceed to Verify 'Sub_Type'");
		WebElement Sub_Type_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Sub_Type_EL(driver)));
		String Sub_Type_RV=Sub_Type_EL.getAttribute("value").trim();		
		handleFields.EditMode_Fields_Verify.forOptionalFields_ValueVerification(Sub_Type_RV, Sub_Type_I);
		log.info("'Sub_Type' Has Been Verified");
	}

	public static void verifyInfoRemarks(WebDriver driver, WebDriverWait wait_E, String INFO_Remarks_I) {
		log.info("Proceed to Verify 'Info_Remarks'");
		WebElement INFO_Remarks_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.INFO_Remarks_EL(driver)));
		String INFO_Remarks_RV=INFO_Remarks_EL.getAttribute("value").trim();		
		handleFields.EditMode_Fields_Verify.forOptionalFields_ValueVerification(INFO_Remarks_RV, INFO_Remarks_I);
		log.info("'Info_Remarks' Has Been Verified");
	}

}
