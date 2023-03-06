package marketTypesTest.LMM;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Loan_ND_EditMode_InputsVerify extends Loan_ND_EditMode_Inputs {	
	
	// Declarations Of Log4j For This Class
	public static Logger log = Logger.getLogger(Loan_ND_EditMode_InputsVerify.class.getName());
	
	// Declarations Of Driver Components For This Class
	public static WebDriver driver;
	public static WebDriverWait wait_E;			//WAIT -> Ends With '_E' Mean 'Explicit Wait'.
	public static Wait<WebDriver> wait_F;		//WAIT -> Ends With '_F' Mean 'Fluent Wait'.
		
		
	@Test(priority=0)
	public static void bfr_Loan_ND_EditMode_InputsVerify() throws InterruptedException{
		
		log.info("*************** <Bfr_Loan_ND_EditMode_InputsVerify Method Started> ***************");
		
		Loan_ND_EditMode_Inputs.dealSave_Using_EditMode_Inputs();
		
		driver = beforeTest.DriverConfig.driver;
		wait_E = beforeTest.DriverConfig.wait_E;
		wait_F = beforeTest.DriverConfig.wait_F;		
			
		handleFields.FindDeal_Edit_Delete.findDeal(driver, Loan_ND_NewMode_Inputs.DealID_NV);
				
		log.info("--------------- <Bfr_Loan_ND_EditMode_InputsVerify Method Completed> ---------------");
	}
		
			
	@Test(dependsOnMethods="bfr_Loan_ND_EditMode_InputsVerify")
	public static void frontPage_EditMode_Inputs_Verification() {
		
		log.info("*************** <FrontPage_EditMode_Inputs_Verification Started> ***************");
		
		//Wait Until Page Completely Loaded, To Avoid Exception
		handleFields.PageLoad_CircleBar_Handle.is_PageLoaded_Check(driver);
		
		/**  NOTE : FROM BENTITY to PRODUCT - Verification, Used the New_Mode_Inputs  **/
		log.info("Proceed to Verify 'Business_Entity' Using Edit_Mode_Inputs");			
		WebElement Business_Entity_EL = frameWorks.pageObjectModel.Loan_ND.Business_Entity_EL(driver);		
		String Business_Entity_RV = Business_Entity_EL.getAttribute("value").trim();  			// Variable Name Ends With '_RV' Mean 'Retrieved Value'
		String Business_Entity_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Business_Entity_NI;			
		handleFields.EditMode_Fields_Verify.retrievedValueVerify(Business_Entity_RV, Business_Entity_NI);			
		handleFields.EditMode_Fields_Verify.isFieldDisabled(Business_Entity_EL);						
		log.info("'Business_Entity' Has Been Verified Using Edit_Mode_Inputs");			
			
			
		log.info("Proceed to Verify 'Credit_Risk' Using Edit_Mode_Inputs");		
		WebElement Credit_Risk_EL = wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.Loan_ND.Credit_Risk_EL(driver)));
		String Credit_Risk_RV= Credit_Risk_EL.getAttribute("Value").trim();
		String Credit_Risk_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Credit_Risk_NI;		
		handleFields.EditMode_Fields_Verify.retrievedValueVerify(Credit_Risk_RV, Credit_Risk_NI);			
		handleFields.EditMode_Fields_Verify.isFieldDisabled(Credit_Risk_EL);
		log.info("'Credit_Risk' Has Been Verified Using Edit_Mode_Inputs");
		
		
		log.info("Proceed to Verify 'Product' Using Edit_Mode_Inputs");			
		WebElement Product_EL = wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.Loan_ND.Product_EL(driver)));
		String Product_RV= Product_EL.getAttribute("Value").trim();
		String Product_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Product_NI;		
		handleFields.EditMode_Fields_Verify.retrievedValueVerify(Product_RV, Product_NI);			
		handleFields.EditMode_Fields_Verify.isFieldDisabled(Product_EL);		
		log.info("'Product' Has Been Verified Using Edit_Mode_Inputs");
		
		
		log.info("Proceed to Verify 'Strategy' Using Edit_Mode_Inputs");			
		WebElement Strategy_EL = wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.Loan_ND.Strategy_EL(driver)));
		String Strategy_RV= Strategy_EL.getAttribute("Value").trim();
		String Strategy_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Strategy_NI;
		handleFields.EditMode_Fields_Verify.retrievedValueVerify(Strategy_RV, Strategy_NI);		
		handleFields.EditMode_Fields_Verify.isFieldDisabled(Strategy_EL);
		log.info("'Strategy' Has Been Verified Using Edit_Mode_Inputs");
			
		
		log.info("Proceed to Verify 'Deal_Date' Using Edit_Mode_Inputs");	
		WebElement Deal_Date_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Deal_Date_txt_EL(driver)));
		String Deal_Date_RV=Deal_Date_EL.getAttribute("value").replaceAll("-", "/");
		String Deal_Date_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Deal_Date_EI.replaceAll("-", "/");
		handleFields.EditMode_Fields_Verify.retrievedValueVerify(Deal_Date_RV, Deal_Date_EI);
		log.info("'Deal_Date' Has Been Verified Using Edit_Mode_Inputs");
		
		
		log.info("Proceed to Verify 'Value_Date' Using Edit_Mode_Inputs");
		WebElement Value_Date_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Value_Date_txt_EL(driver)));
		String Value_Date_RV=Value_Date_EL.getAttribute("value").replaceAll("-", "/");
		String Value_Date_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Value_Date_EI.replaceAll("-", "/");
		handleFields.EditMode_Fields_Verify.retrievedValueVerify(Value_Date_RV, Value_Date_EI);
		log.info("'Value_Date' Has Been Verified Using Edit_Mode_Inputs");
		
		
		//Check the New Mode -> Maturity Selection Is Based on Tenor OR Maturity date!!
		String Maturity_Date_Based_On_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Maturity_Date_Based_On_EI;		
		log.info("The New Mode -> Maturity Date Selection is Based on : "+Maturity_Date_Based_On_EI);
			
		if(Maturity_Date_Based_On_EI.equalsIgnoreCase("Tenor")){
			
			log.info("Proceed to Verify 'Tenor' Using Edit_Mode_Inputs");
			WebElement Tenor_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Tenor_EL(driver)));
			String Tenor_RV= Tenor_EL.getAttribute("Value").trim();
			String Tenor_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Tenor_EI;
			handleFields.EditMode_Fields_Verify.retrievedValueVerify(Tenor_RV, Tenor_EI);	
			log.info("'Tenor' Has Been Verified Using Edit_Mode_Inputs");
			
			
			log.info("Proceed to Verify 'Maturity_Date' Using Edit_Mode_Inputs");
			WebElement Maturity_Date_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Maturity_Date_txt_EL(driver)));	
			String Maturity_Date_RV=Maturity_Date_EL.getAttribute("value").replaceAll("-", "/");
			String Maturity_Date_EV=Loan_ND_EditMode_Inputs.Maturity_Date_EV;
			handleFields.EditMode_Fields_Verify.retrievedValueVerify(Maturity_Date_RV, Maturity_Date_EV);
			log.info("'Maturity_Date' Has Been Verified Using Edit_Mode_Inputs");
			
		}else{
			
			log.info("Proceed to Verify 'Maturity_Date' Using Edit_Mode_Inputs");
			WebElement Maturity_Date_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Maturity_Date_txt_EL(driver)));	
			String Maturity_Date_RV=Maturity_Date_EL.getAttribute("value").replaceAll("-", "/");
			String Maturity_Date_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Maturity_Date_EI.replaceAll("-", "/");
			handleFields.EditMode_Fields_Verify.retrievedValueVerify(Maturity_Date_RV, Maturity_Date_EI);
			log.info("'Maturity_Date' Has Been Verified Using Edit_Mode_Inputs");
			
			log.info("Proceed to Verify 'Tenor' Using Edit_Mode_Inputs");
			WebElement Tenor_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Tenor_EL(driver)));
			String Tenor_RV= Tenor_EL.getAttribute("Value").trim();
			String Tenor_EV=Loan_ND_EditMode_Inputs.Tenor_EV;
			handleFields.EditMode_Fields_Verify.retrievedValueVerify(Tenor_RV, Tenor_EV);	
			log.info("'Tenor' Has Been Verified Using Edit_Mode_Inputs");			
			
		}		
		
		
		log.info("Proceed to Verify 'Principal' Using Edit_Mode_Inputs");
		WebElement Principal_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Principal_EL(driver)));
		String Principal_RV= Principal_EL.getAttribute("Value").trim().replaceAll(",", "");
		String Principal_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Principal_EI.trim().replaceAll(",", "");		
		handleFields.EditMode_Fields_Verify.retrievedValueVerify(Principal_RV, Principal_EI);
		log.info("'Principal' Has Been Verified Using Edit_Mode_Inputs");
		
			
		//[DK- 'Rate Type' & Its Respective Fields]
		WebElement RateType_Fixed_EL = frameWorks.pageObjectModel.Loan_ND.RateType_Fixed_EL(driver);
		WebElement RateType_Float_EL = frameWorks.pageObjectModel.Loan_ND.RateType_Float_EL(driver);		
		String RateType_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.RateType_EI;		
		
		
		//[DK - Checking the 'Fixed' Rate_Type -> Radio_Button]
		if(RateType_EI.equalsIgnoreCase("Fixed")){
			log.info("Rate_Type Input in New_Mode is 'Fixed'");
			
			
			log.info("Proceed to Verify 'Fixed-RateType' Using Edit_Mode_Inputs");
			handleFields.EditMode_Fields_Verify.isRadioBtnSelected(RateType_Fixed_EL);
			log.info("'Fixed-RateType' Has Been Verified Using Edit_Mode_Inputs");
			
			
			log.info("Proceed to Verify 'Rate%', Where RateType='Fixed' Using Edit_Mode_Inputs");
			WebElement Rate_EL = wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.Loan_ND.Rate_EL(driver)));
			String Rate_RV=Rate_EL.getAttribute("value").replaceAll("%", "");
			String Rate_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Rate_EI.replaceAll("%", "");			
			handleFields.EditMode_Fields_Verify.retrievedValueVerify(Rate_RV, Rate_EI);			
			handleFields.EditMode_Fields_Verify.isFieldEnabled(Rate_EL);
			log.info("'Rate%' Has Been Verified, Where RateType='Fixed' Using Edit_Mode_Inputs");			
		}
		
		
		else if(RateType_EI.equalsIgnoreCase("Float")){
			log.info("Rate_Type Input in New_Mode is 'Float'");
			
			
			log.info("Proceed to Verify 'Float-RateType' Using Edit_Mode_Inputs");
			handleFields.EditMode_Fields_Verify.isRadioBtnSelected(RateType_Float_EL);
			log.info("'Float-RateType' Has Been Verified Using Edit_Mode_Inputs");
		
			
			log.info("Proceed to Verify 'Reference_ID' Using Edit_Mode_Inputs");
			WebElement Reference_ID_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Reference_ID_EL(driver)));
			String Reference_ID_RV = Reference_ID_EL.getAttribute("value").trim(); 
			String Reference_ID_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Reference_ID_EI;			
			handleFields.EditMode_Fields_Verify.retrievedValueVerify(Reference_ID_RV, Reference_ID_EI);
			log.info("'Reference_ID' Has Been Verified Using Edit_Mode_Inputs");
			
			
			log.info("Proceed to Verify 'Reference_Tenor' Using Edit_Mode_Inputs");
			WebElement Reference_Tenor_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Reference_Tenor_EL(driver)));
			String Reference_Tenor_RV=Reference_Tenor_EL.getAttribute("value");
			String Reference_Tenor_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Reference_Tenor_EI;			
			handleFields.EditMode_Fields_Verify.retrievedValueVerify(Reference_Tenor_RV, Reference_Tenor_EI);
			log.info("'Reference_Tenor' Has Been Verified Using Edit_Mode_Inputs");
			
			
			log.info("Proceed to Verify 'Reference_Rate%' Using Edit_Mode_Inputs");
			WebElement Reference_Rate_EL = wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.Loan_ND.Reference_Rate_EL(driver)));
			String Reference_Rate_RV=Reference_Rate_EL.getAttribute("value");
			String Reference_Rate_EV=Loan_ND_EditMode_Inputs.Reference_Rate_EV;
			handleFields.EditMode_Fields_Verify.retrievedValueVerify(Reference_Rate_RV, Reference_Rate_EV);
			log.info("'Reference_Rate%' Has Been Verified Using Edit_Mode_Inputs");
			
			
			log.info("Proceed to Verify 'Spread' Using Edit_Mode_Inputs");
			WebElement Spread_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Spread_EL(driver)));
			String Spread_RV=Spread_EL.getAttribute("value").replaceAll("%", "");
			String Spread_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Spread_EI.replaceAll("%", "");			
			handleFields.EditMode_Fields_Verify.retrievedValueVerify(Spread_RV, Spread_EI);
			log.info("'Spread' Has Been Verified Using Edit_Mode_Inputs");
			
			
			log.info("Proceed to Verify 'Rate%', Where RateType='Float' Using Edit_Mode_Inputs");
			WebElement Rate_EL = wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.Loan_ND.Rate_EL(driver)));
			String Rate_RV=Rate_EL.getAttribute("value").replaceAll("%", "");
			String Rate_EV=Loan_ND_EditMode_Inputs.Rate_EV.replaceAll("%", "");
			handleFields.EditMode_Fields_Verify.retrievedValueVerify(Rate_RV, Rate_EV);			
			handleFields.EditMode_Fields_Verify.isFieldDisabled(Rate_EL);
			log.info("'Rate%' Has Been Verified, Where RateType='Float' Using Edit_Mode_Inputs");			
		}		
			
			
			log.info("Proceed to Verify 'W/Tax%' Using Edit_Mode_Inputs");
			WebElement W_Tax_EL = wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.Loan_ND.W_Tax_EL(driver)));
			String W_Tax_RV=W_Tax_EL.getAttribute("value").replaceAll("%", "");
			String W_Tax_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.W_Tax_EI.replaceAll("%", "");
		
		if(!W_Tax_EI.isEmpty()){
			handleFields.EditMode_Fields_Verify.retrievedValueVerify(W_Tax_RV, W_Tax_EI);
			log.info("'W/Tax%' Has Been Verified Using Edit_Mode_Inputs");
			
			
			log.info("Proceed to Verify 'We Absorb%' Using Edit_Mode_Inputs");
			WebElement We_Absorb_EL = frameWorks.pageObjectModel.Loan_ND.We_Absorb_EL(driver);
			String We_Absorb_RV=We_Absorb_EL.getAttribute("value").replaceAll("%", "");
			String We_Absorb_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.We_Absorb_EI.replaceAll("%", "");			
			handleFields.EditMode_Fields_Verify.retrievedValueVerify(We_Absorb_RV, We_Absorb_EI);
			log.info("'We Absorb%' Has Been Verified Using Edit_Mode_Inputs");
		}
		else{
			log.info("W/Tax And We Absorb Verification is Skipped!, Since Both Inputs is Zero in New Mode Itself");
		}
		
		log.info("--------------- <FrontPage_EditMode_Inputs_Verification Completed> ---------------");
	}	
	
	
	@Test(dependsOnMethods="frontPage_EditMode_Inputs_Verification")
	public static void infoPage_EditMode_Inputs_Verification() {
	
		log.info("*************** <InfoPage_EditMode_Inputs_Verification Started> ***************");
		
		wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Info_Icon_Btn_EL(driver))).click();
		
		
		log.info("Proceed to Verify 'Principal_Frequency' Using Edit_Mode_Inputs");
		WebElement Principal_Freq_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Principal_Freq_EL(driver)));
		String Principal_Freq_RV=Principal_Freq_EL.getAttribute("value").trim();
		String Principal_Freq_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Principal_Freq_EI;
		String Principal_Freq_EV=Loan_ND_EditMode_Inputs.Principal_Freq_EV;		
		handleFields.EditMode_Fields_Verify.forAutoDefaultedFields_ValueVerification(Principal_Freq_RV, Principal_Freq_EI, Principal_Freq_EV);
		log.info("'Principal_Frequency' Has Been Verified Using Edit_Mode_Inputs");
		
		
		log.info("Proceed to Verify 'Interest_Frequency' Using Edit_Mode_Inputs");
		WebElement Interest_Freq_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Interest_Freq_EL(driver)));	
		String Interest_Freq_RV=Interest_Freq_EL.getAttribute("value").trim();
		String Interest_Freq_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Interest_Freq_EI;
		String Interest_Freq_EV=Loan_ND_EditMode_Inputs.Interest_Freq_EV;		
		handleFields.EditMode_Fields_Verify.forAutoDefaultedFields_ValueVerification(Interest_Freq_RV, Interest_Freq_EI, Interest_Freq_EV);
		log.info("'Interest_Frequency' Has Been Verified Using Edit_Mode_Inputs");
		
		
		log.info("Proceed to Verify 'Day_Count_Basis' Using Edit_Mode_Inputs");		
		WebElement Day_Count_Basis_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Day_Count_Basis_EL(driver)));
		String Day_Count_Basis_RV=Day_Count_Basis_EL.getAttribute("value").trim();
		String Day_Count_Basis_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Day_Count_Basis_EI;
		String Day_Count_Basis_EV=Loan_ND_EditMode_Inputs.Day_Count_Basis_EV;		
		handleFields.EditMode_Fields_Verify.forAutoDefaultedFields_ValueVerification(Day_Count_Basis_RV, Day_Count_Basis_EI, Day_Count_Basis_EV);
		log.info("'Day_Count_Basis' Has Been Verified Using Edit_Mode_Inputs");
		
		
		log.info("Proceed to Verify 'Date_Convention' Using Edit_Mode_Inputs");		
		WebElement Date_Convention_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Date_Convention_EL(driver)));
		String Date_Convention_RV=Date_Convention_EL.getAttribute("value").trim();
		String Date_Convention_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Date_Convention_EI;
		String Date_Convention_EV=Loan_ND_EditMode_Inputs.Date_Convention_EV;		
		handleFields.EditMode_Fields_Verify.forAutoDefaultedFields_ValueVerification(Date_Convention_RV, Date_Convention_EI, Date_Convention_EV);
		log.info("'Date_Convention' Has Been Verified Using Edit_Mode_Inputs");
		
		
		log.info("Proceed to Verify 'Period_End' Using Edit_Mode_Inputs");		
		WebElement Period_End_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Period_End_EL(driver)));
		String Period_End_RV=Period_End_EL.getAttribute("value").trim();
		String Period_End_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Period_End_EI;
		String Period_End_EV=Loan_ND_EditMode_Inputs.Period_End_EV;		
		handleFields.EditMode_Fields_Verify.forAutoDefaultedFields_ValueVerification(Period_End_RV, Period_End_EI, Period_End_EV);
		log.info("'Period_End' Has Been Verified Using Edit_Mode_Inputs");
		
		
		log.info("Proceed to Verify 'Contact' Using Edit_Mode_Inputs");
		WebElement Contact_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Contact_EL(driver)));
		String Contact_RV=Contact_EL.getAttribute("value").trim();
		String Contact_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Contact_EI;		
		handleFields.EditMode_Fields_Verify.forOptionalFields_ValueVerification(Contact_RV, Contact_EI);		
		log.info("'Contact' Has Been Verified Using Edit_Mode_Inputs");
		
		
		log.info("Proceed to Verify 'Department' Using Edit_Mode_Inputs");
		WebElement Department_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Department_EL(driver)));
		String Department_RV=Department_EL.getAttribute("value").trim();
		String Department_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Department_EI;		
		handleFields.EditMode_Fields_Verify.forOptionalFields_ValueVerification(Department_RV, Department_EI);
		log.info("'Department' Has Been Verified Using Edit_Mode_Inputs");
		
		
		log.info("Proceed to Verify 'Broker' Using Edit_Mode_Inputs");
		WebElement Broker_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Broker_EL(driver)));
		String Broker_RV=Broker_EL.getAttribute("value").trim();
		String Broker_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Broker_EI;		
		handleFields.EditMode_Fields_Verify.forOptionalFields_ValueVerification(Broker_RV, Broker_EI);
		log.info("'Broker' Has Been Verified Using Edit_Mode_Inputs");
		
		
		log.info("Proceed to Verify 'C_PartyRef' Using Edit_Mode_Inputs");
		WebElement C_PartyRef_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.C_PartyRef_EL(driver)));
		String C_PartyRef_RV=C_PartyRef_EL.getAttribute("value").trim();
		String C_PartyRef_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.C_PartyRef_EI;		
		handleFields.EditMode_Fields_Verify.forOptionalFields_ValueVerification(C_PartyRef_RV, C_PartyRef_EI);
		log.info("'C_PartyRef' Has Been Verified Using Edit_Mode_Inputs");
		
		
		log.info("Proceed to Verify 'Deal_Ref' Using Edit_Mode_Inputs");
		WebElement Deal_Ref_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Deal_Ref_EL(driver)));
		String Deal_Ref_RV=Deal_Ref_EL.getAttribute("value").trim();
		String Deal_Ref_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Deal_Ref_EI;		
		handleFields.EditMode_Fields_Verify.forOptionalFields_ValueVerification(Deal_Ref_RV, Deal_Ref_EI);
		log.info("'Deal_Ref' Has Been Verified Using Edit_Mode_Inputs");
		
		
		log.info("Proceed to Verify 'Certificate_No' Using Edit_Mode_Inputs");
		WebElement Certificate_No_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Certificate_No_EL(driver)));
		String Certificate_No_RV=Certificate_No_EL.getAttribute("value").trim();
		String Certificate_No_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Certificate_No_EI;
		handleFields.EditMode_Fields_Verify.forOptionalFields_ValueVerification(Certificate_No_RV, Certificate_No_EI);
		log.info("'Certificate_No' Has Been Verified Using Edit_Mode_Inputs");
		
		
		log.info("Proceed to Verify 'Confirmation_Mode' Using Edit_Mode_Inputs");
		WebElement Confirmation_Mode_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Confirmation_Mode_EL(driver)));
		String Confirmation_Mode_RV=Confirmation_Mode_EL.getAttribute("value").trim();
		String Confirmation_Mode_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Confirmation_Mode_EI;
		handleFields.EditMode_Fields_Verify.forOptionalFields_ValueVerification(Confirmation_Mode_RV, Confirmation_Mode_EI);
		log.info("'Confirmation_Mode' Has Been Verified Using Edit_Mode_Inputs");
		
		
		log.info("Proceed to Verify 'Sub_Type' Using Edit_Mode_Inputs");
		WebElement Sub_Type_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Sub_Type_EL(driver)));
		String Sub_Type_RV=Sub_Type_EL.getAttribute("value").trim();
		String Sub_Type_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Sub_Type_EI;
		handleFields.EditMode_Fields_Verify.forOptionalFields_ValueVerification(Sub_Type_RV, Sub_Type_EI);
		log.info("'Sub_Type' Has Been Verified Using Edit_Mode_Inputs");
		
		
		log.info("Proceed to Verify 'INFO_Remarks' Using Edit_Mode_Inputs");
		WebElement INFO_Remarks_EL = wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.INFO_Remarks_EL(driver)));
		String INFO_Remarks_RV=INFO_Remarks_EL.getAttribute("value").trim();
		String INFO_Remarks_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.INFO_Remarks_EI;
		handleFields.EditMode_Fields_Verify.forOptionalFields_ValueVerification(INFO_Remarks_RV, INFO_Remarks_EI);
		log.info("'INFO_Remarks' Has Been Verified Using Edit_Mode_Inputs");
		
		
		wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.INFO_Close_Btn_E(driver))).click();
		
		
		log.info("--------------- <InfoPage_EditMode_Inputs_Verification Completed> ---------------");
				
	}
	
	@Test(dependsOnMethods="infoPage_EditMode_Inputs_Verification")
	public static void bankDetails_EditMode_Inputs_Verification() {
	
		log.info("*************** <BankDetails_EditMode_Inputs_Verification Started> ***************");	
		
		log.info("::::::::::'Bank Details' Not Handled, Yet::::::::::");
		wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Bank_Details_Icon_Btn_EL(driver))).click();
		
		
		log.info("Proceed to Verify 'Total_Settlement' in Edit_Mode_Inputs_Verify");
		WebElement Total_Settlement_EL=wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.Loan_ND.Total_Settlement_EL(driver)));
		String Total_Settlement_RV=Total_Settlement_EL.getText().replaceAll(",", "").trim();
		String Total_Settlement_EV=Loan_ND_EditMode_Inputs.Total_Settlement_EV;
		
			if (Total_Settlement_RV.equals(Total_Settlement_EV)) {
				log.info("Total_Settlement Verification - QA PASSED!");
			} else {
				log.info("Total_Settlement Verification - QA FAILED!!");
				log.info("Input Value is : "+Total_Settlement_EV+", Retrieved Value is : "+Total_Settlement_RV);
			}
		log.info("'Total_Settlement' Has Been Verified in Edit_Mode_Inputs_Verify");
		
		
		log.info("Proceed to Verify 'Settlement_Balance' in Edit_Mode_Inputs_Verify");
		WebElement Settlement_Balance_EL=wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.Loan_ND.Settlement_Balance_EL(driver)));
		String Settlement_Balance_RV=Settlement_Balance_EL.getText().replaceAll(",", "").trim();
		String Settlement_Balance_EV=Loan_ND_EditMode_Inputs.Settlement_Balance_EV;
		
			if (Settlement_Balance_RV.equals(Settlement_Balance_EV)) {
				log.info("Settlement_Balance Verification - QA PASSED!");
			} else {
				log.info("Settlement_Balance Verification - QA FAILED!!");
				log.info("Input Value is : "+Settlement_Balance_EV+", Retrieved Value is : "+Settlement_Balance_RV);
			}
		log.info("'Settlement_Balance' Has Been Verified in Edit_Mode_Inputs_Verify");
		
		
		wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Bank_Close_Btn_EL(driver))).click();
			
		log.info("--------------- <BankDetails_EditMode_Inputs_Verification Completed> ---------------");
		
	}
	
	@Test(dependsOnMethods="bankDetails_EditMode_Inputs_Verification")
	public static void cashFlow_EditMode_Verification() {
		
		log.info("*************** <CashFlow_EditMode_Verification Initiated> ***************");
		
		log.info("::::::::::'Cash Flow' Not Handled, Yet::::::::::");
		wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Cash_Flow_Icon_Btn_EL(driver))).click();
		
		handleFields.AlertMsg.alert_MsgHandle(driver);
		
		wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Loan_ND.Cash_Flow_Close_Btn_EL(driver))).click();

		log.info("--------------- <CashFlow_EditMode_Verification Completed> ---------------");
		
	}

}
