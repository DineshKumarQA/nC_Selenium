package marketTypes.testLMM;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import marketTypes.baseLMM.LMM_ND_Base;

public class LMM_ND_Test_Save_Edit {

	// Declarations Of Log4j For This Class
	public static Logger log = Logger.getLogger(LMM_ND_Test_Save_Edit.class.getName());

	// Declarations Of Driver Components For This Class
	public static WebDriver driver;
	public static WebDriverWait wait_E;			//WAIT -> Ends With '_E' Mean 'Explicit Wait'.
	public static Wait<WebDriver> wait_F;		//WAIT -> Ends With '_F' Mean 'Fluent Wait'.	

	public static String MoneyMarketORLoan_NI;
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

	public static String DealID_NV;


	public static String DealID_EV;

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


	@Test
	public static void newModeInputs() {

		driver = beforeTest.DriverConfig.driver;
		wait_E = beforeTest.DriverConfig.wait_E;
		wait_F = beforeTest.DriverConfig.wait_F;

		//ClickAddDeal
		LMM_ND_Base.clickAddDeal(driver, wait_E);

		//Open LMM Screen
		MoneyMarketORLoan_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.MoneyMarketORLoan_NI;
		if(MoneyMarketORLoan_NI.equalsIgnoreCase("Money Market")) {
			LMM_ND_Base.goToMoney_Market(driver,wait_E);
		}else {
			LMM_ND_Base.goToLoan(driver, wait_E);
		}

		//BalanceSheet
		String Asset_Liabiity_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Asset_Liabiity_NI; 	// Variable Name Ends With '_NI' Means 'New_Mode-Inputs'.
		LMM_ND_Base.balSheetClick(driver, wait_E, Asset_Liabiity_NI);

		//SelectBEntity
		String Business_Entity_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Business_Entity_NI;
		LMM_ND_Base.selectBEntity(driver, wait_E, Business_Entity_NI);

		//SelectCParty
		String Credit_Risk_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Credit_Risk_NI;
		LMM_ND_Base.selectCParty(driver, wait_E, Credit_Risk_NI);

		//SelectProduct
		String Product_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Product_NI;
		LMM_ND_Base.selectProduct(driver, wait_E, Product_NI);

		//SelectStrategy
		String Strategy_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Strategy_NI;
		LMM_ND_Base.selectStrategy(driver, wait_E, Strategy_NI);

		//SelectDealDate
		String Deal_Date_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Deal_Date_NI;
		LMM_ND_Base.selectDealDate(driver, wait_E, Deal_Date_NI);

		//SelectValueDate
		String Value_Date_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Value_Date_NI;
		LMM_ND_Base.selectValueDate(driver, wait_E, Value_Date_NI);

		//Check the Maturity Selection is Based on Tenor Or Maturity date!!
		String Maturity_Date_Based_On_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Maturity_Date_Based_On_NI;		
		log.info("Maturity Date Selection Using New_Mode_Inputs, is Based on : "+Maturity_Date_Based_On_NI);

		if(Maturity_Date_Based_On_NI.equalsIgnoreCase("Tenor")){
			//EnterTenor
			String Tenor_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Tenor_NI;
			LMM_ND_Base.enterTenor(driver, wait_E, Tenor_NI);	
			//Retrieve MaturityDate
			Maturity_Date_NV = LMM_ND_Base.retrieveMaturityDate(driver, wait_E);
		}else {
			//SelectMaturityDate
			String Maturity_Date_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Maturity_Date_NI;
			LMM_ND_Base.selectMaturityDate(driver, wait_E, Maturity_Date_NI);
			//Retrieve Tenor
			Tenor_NV = LMM_ND_Base.retrieveTenor(driver, wait_E);
		}

		//EnterPrincipal
		String Principal_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Principal_NI;
		LMM_ND_Base.enterPrincipal(driver, wait_E, Principal_NI);

		//SelectRateType
		String RateType_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.RateType_NI;
		if(RateType_NI.equalsIgnoreCase("Fixed")){
			if(!(MoneyMarketORLoan_NI.equalsIgnoreCase("Money Market"))) {
				LMM_ND_Base.selectFixedRateType(driver, wait_E);
			}
			//EnterRate
			String Rate_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Rate_NI;
			LMM_ND_Base.enterRate(driver, wait_E, Rate_NI);

		}else{
			LMM_ND_Base.selectFloatRateType(driver, wait_E);

			//SelectReferenceID
			String Reference_ID_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Reference_ID_NI;
			LMM_ND_Base.selectReferenceID(driver, wait_E, Reference_ID_NI);

			//SelectReferenceTenor
			String Reference_Tenor_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Reference_Tenor_NI;
			LMM_ND_Base.selectReferenceTenor(driver, wait_E, Reference_Tenor_NI);

			//Retrieve ReferenceRate
			Reference_Rate_NV = LMM_ND_Base.retrieveReferenceRate(driver, wait_E);

			//EnterSpread
			String Spread_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Spread_NI;
			LMM_ND_Base.enterSpread(driver, wait_E, Spread_NI);

			//Retrieve Rate
			Rate_NV = LMM_ND_Base.retrieveRate(driver, wait_E);
		}

		//EnterWTax
		String W_Tax_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.W_Tax_NI;
		if(!(W_Tax_NI.isEmpty())){
			LMM_ND_Base.enterWTax(driver, wait_E, W_Tax_NI);

			//EnterWeAbsorb
			String We_Absorb_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.We_Absorb_NI;
			LMM_ND_Base.enterWeAbsorb(driver, wait_E, We_Absorb_NI);
		}

		//Info Button Click
		LMM_ND_Base.clickInfo(driver, wait_E);

		//SelectPrincipalFrequency
		String Principal_Freq_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Principal_Freq_NI;
		if(!(Principal_Freq_NI.isEmpty())){
			LMM_ND_Base.selectPrincipalFrequency(driver, wait_E, Principal_Freq_NI);
		}else {
			Principal_Freq_NV = LMM_ND_Base.retrievePrincipalFrequency(driver, wait_E);
		}

		//SelectInterestFrequency
		String Interest_Freq_NI = frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Interest_Freq_NI;
		if(!(Interest_Freq_NI.isEmpty())){
			LMM_ND_Base.selectInterestFrequency(driver, wait_E, Interest_Freq_NI);
		}else {
			Interest_Freq_NV = LMM_ND_Base.retrieveInterestFrequency(driver, wait_E);
		}

		//SelectDayCountBasis
		String Day_Count_Basis_NI = frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Day_Count_Basis_NI;
		if(!(Day_Count_Basis_NI.isEmpty())){
			LMM_ND_Base.selectDayCountBasis(driver, wait_E, Day_Count_Basis_NI);
		}else {
			Day_Count_Basis_NV = LMM_ND_Base.retrieveDayCountBasis(driver, wait_E);
		}

		//SelectDateConvention
		String Date_Convention_NI = frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Date_Convention_NI;
		if(!(Date_Convention_NI.isEmpty())){
			LMM_ND_Base.selectDateConvention(driver, wait_E, Date_Convention_NI);
		}else {
			Date_Convention_NV = LMM_ND_Base.retrieveDateConvention(driver, wait_E);
		}

		//SelectPeriodEnd
		String Period_End_NI = frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Period_End_NI;
		if(!(Period_End_NI.isEmpty())){
			LMM_ND_Base.selectPeriodEnd(driver, wait_E, Period_End_NI);
		}else {
			Period_End_NV = LMM_ND_Base.retrievePeriodEnd(driver, wait_E);
		}

		//SelectContact
		String Contact_NI = frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Contact_NI;
		if(!(Contact_NI.isEmpty())){
			LMM_ND_Base.selectContact(driver, wait_E, Contact_NI);
		}else{
			log.info("'Contact' Input is Empty. So Skipped This!");
		}

		//SelectDepartment
		String Department_NI = frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Department_NI;
		if(!(Department_NI.isEmpty())){
			LMM_ND_Base.selectDepartment(driver, wait_E, Department_NI);
		}else{
			log.info("'Department' Input is Empty. So Skipped This!");
		}

		//SelectBroker
		String Broker_NI = frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Broker_NI;
		if(!(Broker_NI.isEmpty())){
			LMM_ND_Base.selectBroker(driver, wait_E, Broker_NI);
		}else{
			log.info("'Broker' Input is Empty. So Skipped This!");
		}

		//EnterC_PartyRef
		String C_PartyRef_NI = frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.C_PartyRef_NI;
		if(!(C_PartyRef_NI.isEmpty())){
			LMM_ND_Base.enterCPartyRef(driver, wait_E, C_PartyRef_NI);
		}else{
			log.info("'C_PartyRef' Input is Empty. So Skipped This!");
		}

		//EnterDeal_Ref
		String Deal_Ref_NI = frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Deal_Ref_NI;
		if(!(Deal_Ref_NI.isEmpty())){
			LMM_ND_Base.enterDealRef(driver, wait_E, Deal_Ref_NI);
		}else{
			log.info("'Deal_Ref' Input is Empty. So Skipped This!");
		}	

		//EnterCertificate_No
		String Certificate_No_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Certificate_No_NI;
		if(!(Certificate_No_NI.isEmpty())){
			LMM_ND_Base.enterCertificateNo(driver, wait_E, Certificate_No_NI);
		}else{
			log.info("'Certificate_No' Input is Empty. So Skipped This!");
		}

		//SelectConfirmation_Mode
		String Confirmation_Mode_NI = frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Confirmation_Mode_NI;
		LMM_ND_Base.selectConfirmationMode(driver, wait_E, Confirmation_Mode_NI);

		//SelectSub_Type
		String Sub_Type_NI = frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Sub_Type_NI;
		if(!(Sub_Type_NI.isEmpty())){
			LMM_ND_Base.selectSubType(driver, wait_E, Sub_Type_NI);
		}else{
			log.info("'Sub_Type' Input is Empty. So Skipped This!");
		}

		//EnterINFO_Remarks
		String INFO_Remarks_NI = frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.INFO_Remarks_NI;
		if(!(INFO_Remarks_NI.isEmpty())){
			LMM_ND_Base.enterInfoRemark(driver, wait_E, INFO_Remarks_NI);
		}else{
			log.info("'INFO_Remarks' Input is Empty. So Skipped This!");
		}

		//Info Page Close
		LMM_ND_Base.closeInfo(driver, wait_E);


		//clickBankDetails
		LMM_ND_Base.clickBankDetails(driver, wait_E);

		//verifyBankTotalSettlement
		LMM_ND_Base.verifyBankTotalSettlement(driver, wait_E, Principal_NI);		

		//verifyBankSettlementBalance
		LMM_ND_Base.verifyBankSettlementBalance(driver, wait_E);		

		//closeBankDetails
		LMM_ND_Base.closeBankDetails(driver, wait_E);

		//clickCashFlow
		LMM_ND_Base.clickCashFlow(driver, wait_E);

		//closeCashFlow
		LMM_ND_Base.closeCashFlow(driver, wait_E);

		//clickDealSave
		LMM_ND_Base.clickDealSave(driver, wait_E);

		//verifyDealSavedOrNot
		LMM_ND_Base.verifyDealSavedOrNot(driver, wait_E);

		//retrieveDealID
		DealID_NV = LMM_ND_Base.retrieveDealID(driver, wait_E);

		//closeDealSavePage
		LMM_ND_Base.closeDealSavePage(driver, wait_E);
	}

	@Test(dependsOnMethods = "newModeInputs")
	public static void newModeInputsVerify() throws InterruptedException {
		
		//Click on "Pending Deal_Icon" From Menu
		handleFields.FindDeal_Edit_Delete.clickOnPendingDealIconViaMenu(driver, wait_E);
		
		//Click on "DealApprovalDrpdwn" From 'Pending Deals' DashBoard]
		handleFields.FindDeal_Edit_Delete.clickOnDealApprovalDrpdwn(driver, wait_E);
		
		//Under "DealApprovalDrpdwn" List, Click on Required Menu like 'DealApproval'
		String Deal_Approval_Menu_V = frameWorks.pageObjectModel.Dashboard_Elements.Deal_Approval_Menu_V;
		handleFields.FindDeal_Edit_Delete.selectDealApprovalDrpdwnList(driver, wait_E, Deal_Approval_Menu_V);
		
		//FindDealByDealID
		handleFields.FindDeal_Edit_Delete.findDeal(driver, wait_E, DealID_NV);
		
		//Goto_EditMode
		handleFields.FindDeal_Edit_Delete.editDeal(driver, wait_E);

		//verifyBEntity
		String Business_Entity_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Business_Entity_NI;
		LMM_ND_Base.verifyBEntity(driver, wait_E, Business_Entity_NI);

		//verifyCredit_Risk
		String Credit_Risk_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Credit_Risk_NI;
		LMM_ND_Base.verifyCParty(driver, wait_E, Credit_Risk_NI);

		//verifyProduct
		String Product_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Product_NI;
		LMM_ND_Base.verifyProduct(driver, wait_E, Product_NI);

		//verifyStrategy
		String Strategy_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Strategy_NI;
		LMM_ND_Base.verifyStrategy(driver, wait_E, Strategy_NI);

		//verifyDeal_Date
		String Deal_Date_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Deal_Date_NI;
		LMM_ND_Base.verifyDealDate(driver, wait_E, Deal_Date_NI);

		//verifyValue_Date
		String Value_Date_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Value_Date_NI;
		LMM_ND_Base.verifyValueDate(driver, wait_E, Value_Date_NI);

		//verify Maturity
		//Check the New Mode -> Maturity Selection is Based on Tenor OR Maturity date!!
		String Maturity_Date_Based_On_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Maturity_Date_Based_On_NI;		
		log.info("The New Mode -> Maturity Date Selection is Based on : "+Maturity_Date_Based_On_NI);

		if(Maturity_Date_Based_On_NI.equalsIgnoreCase("Tenor")){
			//verify Tenor Using Input
			String Tenor_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Tenor_NI;
			LMM_ND_Base.verifyTenor(driver, wait_E, Tenor_NI);			
			//verify Maturity Date Using SystemDefined Value
			LMM_ND_Base.verifyMaturityDate(driver, wait_E, Maturity_Date_NV);
		}else{
			//verify Maturity Date Using Input
			String Maturity_Date_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Maturity_Date_NI;
			LMM_ND_Base.verifyMaturityDate(driver, wait_E, Maturity_Date_NI);
			//verify Tenor Using SystemDefined Value
			LMM_ND_Base.verifyTenor(driver, wait_E, Tenor_NV);
		}

		//verify Principal
		String Principal_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Principal_NI;
		LMM_ND_Base.verifyPrincipal(driver, wait_E, Principal_NI);

		//verify RateType
		String RateType_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.RateType_NI;
		if(RateType_NI.equalsIgnoreCase("Fixed")){
			if(!(MoneyMarketORLoan_NI.equalsIgnoreCase("Money Market"))) {
				//verify FixedRateType
				LMM_ND_Base.verifyFixedRateType(driver, wait_E);
			}
			//verify Rate Using Input
			String Rate_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Rate_NI;
			LMM_ND_Base.verifyRate(driver, wait_E, Rate_NI);
		}else {
			//verify FloatRateType
			LMM_ND_Base.verifyFloatRateType(driver, wait_E);

			//verify Reference_ID
			String Reference_ID_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Reference_ID_NI;
			LMM_ND_Base.verifyReferenceID(driver, wait_E, Reference_ID_NI);

			//verify Reference_Tenor
			String Reference_Tenor_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Reference_Tenor_NI;
			LMM_ND_Base.verifyReferenceTenor(driver, wait_E, Reference_Tenor_NI);

			//verify ReferenceRate Using SystemDefined Value
			LMM_ND_Base.verifyReferenceRate(driver, wait_E, Reference_Rate_NV);

			//verify Spread
			String Spread_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Spread_NI;
			LMM_ND_Base.verifySpread(driver, wait_E, Spread_NI);

			//verify Rate% Using SystemDefined Value
			LMM_ND_Base.verifyRate(driver, wait_E, Rate_NV);
		}

		//verify W_Tax
		String W_Tax_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.W_Tax_NI;
		if(!W_Tax_NI.isEmpty()){
			LMM_ND_Base.verifyWTax(driver, wait_E, W_Tax_NI);

			//verify 
			String We_Absorb_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.We_Absorb_NI;
			LMM_ND_Base.verifyWeAbsorb(driver, wait_E, We_Absorb_NI);
		}
		
		//Info Button Click
		LMM_ND_Base.clickInfo(driver, wait_E);

		//verify Principal_Freq By Input & Defaulted Value
		String Principal_Freq_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Principal_Freq_NI;
		LMM_ND_Base.verifyPrincipalFrequency(driver, wait_E, Principal_Freq_NI, Principal_Freq_NV);

		//verify By Input & Defaulted Value
		String Interest_Freq_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Interest_Freq_NI;
		LMM_ND_Base.verifyInterestFrequency(driver, wait_E, Interest_Freq_NI, Interest_Freq_NV);

		//verify By Input & Defaulted Value
		String Day_Count_Basis_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Day_Count_Basis_NI;
		LMM_ND_Base.verifyDayCountBasis(driver, wait_E, Day_Count_Basis_NI, Day_Count_Basis_NV);

		//verify By Input & Defaulted Value
		String Date_Convention_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Date_Convention_NI;
		LMM_ND_Base.verifyDateConvention(driver, wait_E, Date_Convention_NI, Date_Convention_NV);

		//verify By Input & Defaulted Value
		String Period_End_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Period_End_NI;
		LMM_ND_Base.verifyPeriodEnd(driver, wait_E, Period_End_NI, Period_End_NV);

		//verify Contact
		String Contact_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Contact_NI;
		if(!(Contact_NI.isEmpty())){
			LMM_ND_Base.verifyContact(driver, wait_E, Contact_NI);
		}else{
			log.info("'Contact' Input is Empty. So Skipped This!");
		}		

		//verify Department
		String Department_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Department_NI;
		if(!(Department_NI.isEmpty())){
			LMM_ND_Base.verifyDepartment(driver, wait_E, Department_NI);
		}else{
			log.info("'Department' Input is Empty. So Skipped This!");
		}

		//verify Broker
		String Broker_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Broker_NI;
		if(!(Broker_NI.isEmpty())){
			LMM_ND_Base.verifyBroker(driver, wait_E, Broker_NI);
		}else{
			log.info("'Broker' Input is Empty. So Skipped This!");
		}

		//verify C_PartyRef
		String C_PartyRef_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.C_PartyRef_NI;
		if(!(C_PartyRef_NI.isEmpty())){
			LMM_ND_Base.verifyCPartyRef(driver, wait_E, C_PartyRef_NI);
		}else{
			log.info("'C_PartyRef' Input is Empty. So Skipped This!");
		}

		//verify Deal_Ref
		String Deal_Ref_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Deal_Ref_NI;
		if(!(Deal_Ref_NI.isEmpty())){
			LMM_ND_Base.verifyDealRef(driver, wait_E, Deal_Ref_NI);
		}else{
			log.info("'Deal_Ref' Input is Empty. So Skipped This!");
		}

		//verify Certificate_No
		String Certificate_No_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Certificate_No_NI;
		if(!(Certificate_No_NI.isEmpty())){
			LMM_ND_Base.verifyCertificateNo(driver, wait_E, Certificate_No_NI);
		}else{
			log.info("'Certificate_No' Input is Empty. So Skipped This!");
		}

		//verify Confirmation_Mode
		String Confirmation_Mode_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Confirmation_Mode_NI;
		LMM_ND_Base.verifyConfirmationMode(driver, wait_E, Confirmation_Mode_NI);

		//verify Sub_Type
		String Sub_Type_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Sub_Type_NI;
		if(!(Sub_Type_NI.isEmpty())){
			LMM_ND_Base.verifySubType(driver, wait_E, Sub_Type_NI);
		}else{
			log.info("'Sub_Type' Input is Empty. So Skipped This!");
		}

		//verify INFO_Remarks
		String INFO_Remarks_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.INFO_Remarks_NI;
		if(!(INFO_Remarks_NI.isEmpty())){
			LMM_ND_Base.verifyInfoRemarks(driver, wait_E, INFO_Remarks_NI);
		}else{
			log.info("'INFO_Remarks' Input is Empty. So Skipped This!");
		}

		//Info Page Close
		LMM_ND_Base.closeInfo(driver, wait_E);

		//clickBankDetails
		LMM_ND_Base.clickBankDetails(driver, wait_E);

		//verifyBankTotalSettlement
		LMM_ND_Base.verifyBankTotalSettlement(driver, wait_E, Principal_NI);		

		//verifyBankSettlementBalance
		LMM_ND_Base.verifyBankSettlementBalance(driver, wait_E);

		//closeBankDetails
		LMM_ND_Base.closeBankDetails(driver, wait_E);

		//clickCashFlow
		LMM_ND_Base.clickCashFlow(driver, wait_E);

		//closeCashFlow
		LMM_ND_Base.closeCashFlow(driver, wait_E);
	}

	@Test(dependsOnMethods = "newModeInputsVerify")
	public static void editModeInputs() {

		//verify Deal_Date
		String Deal_Date_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Deal_Date_EI;
		LMM_ND_Base.selectDealDate(driver, wait_E, Deal_Date_EI);

		//verify Value_Date
		String Value_Date_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Value_Date_EI;
		LMM_ND_Base.selectValueDate(driver, wait_E, Value_Date_EI);

		//Check the Maturity Selection Is Based on Tenor OR Maturity date!!
		String Maturity_Date_Based_On_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Maturity_Date_Based_On_EI;		
		log.info("Maturity Date Selection in Edit_Mode, is Based on : "+Maturity_Date_Based_On_EI);

		if(Maturity_Date_Based_On_EI.equalsIgnoreCase("Tenor")){
			//EnterTenor
			String Tenor_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Tenor_EI;
			LMM_ND_Base.enterTenor(driver, wait_E, Tenor_EI);	
			//Retrieve MaturityDate
			Maturity_Date_EV = LMM_ND_Base.retrieveMaturityDate(driver, wait_E);
		}else {
			//SelectMaturityDate
			String Maturity_Date_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Maturity_Date_EI;
			LMM_ND_Base.selectMaturityDate(driver, wait_E, Maturity_Date_EI);
			//Retrieve Tenor
			Tenor_EV = LMM_ND_Base.retrieveTenor(driver, wait_E);
		}

		//EnterPrincipal
		String Principal_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Principal_EI;
		LMM_ND_Base.enterPrincipal(driver, wait_E, Principal_EI);

		//SelectRateType
		String RateType_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.RateType_EI;
		if(RateType_EI.equalsIgnoreCase("Fixed")){
			if(!(MoneyMarketORLoan_NI.equalsIgnoreCase("Money Market"))) {
				LMM_ND_Base.selectFixedRateType(driver, wait_E);
			}
			//EnterRate
			String Rate_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Rate_EI;
			LMM_ND_Base.enterRate(driver, wait_E, Rate_EI);

		}else{
			LMM_ND_Base.selectFloatRateType(driver, wait_E);

			//SelectReferenceID
			String Reference_ID_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Reference_ID_EI;
			LMM_ND_Base.selectReferenceID(driver, wait_E, Reference_ID_EI);

			//SelectReferenceTenor
			String Reference_Tenor_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Reference_Tenor_EI;
			LMM_ND_Base.selectReferenceTenor(driver, wait_E, Reference_Tenor_EI);

			//Retrieve ReferenceRate
			Reference_Rate_EV = LMM_ND_Base.retrieveReferenceRate(driver, wait_E);

			//EnterSpread
			String Spread_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Spread_EI;
			LMM_ND_Base.enterSpread(driver, wait_E, Spread_EI);

			//Retrieve Rate
			Rate_EV = LMM_ND_Base.retrieveRate(driver, wait_E);
		}

		//EnterWTax
		String W_Tax_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.W_Tax_EI;
		if(!(W_Tax_EI.isEmpty())){
			LMM_ND_Base.enterWTax(driver, wait_E, W_Tax_EI);

			//EnterWeAbsorb
			String We_Absorb_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.We_Absorb_EI;
			LMM_ND_Base.enterWeAbsorb(driver, wait_E, We_Absorb_EI);
		}

		//Info Button Click
		LMM_ND_Base.clickInfo(driver, wait_E);

		//SelectPrincipalFrequency
		String Principal_Freq_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Principal_Freq_EI;
		if(!(Principal_Freq_EI.isEmpty())){
			LMM_ND_Base.selectPrincipalFrequency(driver, wait_E, Principal_Freq_EI);
		}else {
			Principal_Freq_EV = LMM_ND_Base.retrievePrincipalFrequency(driver, wait_E);
		}

		//SelectInterestFrequency
		String Interest_Freq_EI = frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Interest_Freq_EI;
		if(!(Interest_Freq_EI.isEmpty())){
			LMM_ND_Base.selectInterestFrequency(driver, wait_E, Interest_Freq_EI);
		}else {
			Interest_Freq_EV = LMM_ND_Base.retrieveInterestFrequency(driver, wait_E);
		}

		//SelectDayCountBasis
		String Day_Count_Basis_EI = frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Day_Count_Basis_EI;
		if(!(Day_Count_Basis_EI.isEmpty())){
			LMM_ND_Base.selectDayCountBasis(driver, wait_E, Day_Count_Basis_EI);
		}else {
			Day_Count_Basis_EV = LMM_ND_Base.retrieveDayCountBasis(driver, wait_E);
		}

		//SelectDateConvention
		String Date_Convention_EI = frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Date_Convention_EI;
		if(!(Date_Convention_EI.isEmpty())){
			LMM_ND_Base.selectDateConvention(driver, wait_E, Date_Convention_EI);
		}else {
			Date_Convention_EV = LMM_ND_Base.retrieveDateConvention(driver, wait_E);
		}

		//SelectPeriodEnd
		String Period_End_EI = frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Period_End_EI;
		if(!(Period_End_EI.isEmpty())){
			LMM_ND_Base.selectPeriodEnd(driver, wait_E, Period_End_EI);
		}else {
			Period_End_EV = LMM_ND_Base.retrievePeriodEnd(driver, wait_E);
		}

		//SelectContact
		String Contact_EI = frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Contact_EI;
		if(!(Contact_EI.isEmpty())){
			LMM_ND_Base.selectContact(driver, wait_E, Contact_EI);
		}else{
			log.info("'Contact' Input is Empty. So Skipped This!");
		}

		//SelectDepartment
		String Department_EI = frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Department_EI;
		if(!(Department_EI.isEmpty())){
			LMM_ND_Base.selectDepartment(driver, wait_E, Department_EI);
		}else{
			log.info("'Department' Input is Empty. So Skipped This!");
		}

		//SelectBroker
		String Broker_EI = frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Broker_EI;
		if(!(Broker_EI.isEmpty())){
			LMM_ND_Base.selectBroker(driver, wait_E, Broker_EI);
		}else{
			log.info("'Broker' Input is Empty. So Skipped This!");
		}

		//EnterC_PartyRef
		String C_PartyRef_EI = frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.C_PartyRef_EI;
		if(!(C_PartyRef_EI.isEmpty())){
			LMM_ND_Base.enterCPartyRef(driver, wait_E, C_PartyRef_EI);
		}else{
			log.info("'C_PartyRef' Input is Empty. So Skipped This!");
		}

		//EnterDeal_Ref
		String Deal_Ref_EI = frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Deal_Ref_EI;
		if(!(Deal_Ref_EI.isEmpty())){
			LMM_ND_Base.enterDealRef(driver, wait_E, Deal_Ref_EI);
		}else{
			log.info("'Deal_Ref' Input is Empty. So Skipped This!");
		}	

		//EnterCertificate_No
		String Certificate_No_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Certificate_No_EI;
		if(!(Certificate_No_EI.isEmpty())){
			LMM_ND_Base.enterCertificateNo(driver, wait_E, Certificate_No_EI);
		}else{
			log.info("'Certificate_No' Input is Empty. So Skipped This!");
		}

		//SelectConfirmation_Mode
		String Confirmation_Mode_EI = frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Confirmation_Mode_EI;
		LMM_ND_Base.selectConfirmationMode(driver, wait_E, Confirmation_Mode_EI);

		//SelectSub_Type
		String Sub_Type_EI = frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Sub_Type_EI;
		if(!(Sub_Type_EI.isEmpty())){
			LMM_ND_Base.selectSubType(driver, wait_E, Sub_Type_EI);
		}else{
			log.info("'Sub_Type' Input is Empty. So Skipped This!");
		}

		//EnterINFO_Remarks
		String INFO_Remarks_EI = frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.INFO_Remarks_EI;
		if(!(INFO_Remarks_EI.isEmpty())){
			LMM_ND_Base.enterInfoRemark(driver, wait_E, INFO_Remarks_EI);
		}else{
			log.info("'INFO_Remarks' Input is Empty. So Skipped This!");
		}

		//Info Page Close
		LMM_ND_Base.closeInfo(driver, wait_E);


		//clickBankDetails
		LMM_ND_Base.clickBankDetails(driver, wait_E);

		//verifyBankTotalSettlement
		LMM_ND_Base.verifyBankTotalSettlement(driver, wait_E, Principal_EI);		

		//verifyBankSettlementBalance
		LMM_ND_Base.verifyBankSettlementBalance(driver, wait_E);

		//closeBankDetails
		LMM_ND_Base.closeBankDetails(driver, wait_E);


		//clickCashFlow
		LMM_ND_Base.clickCashFlow(driver, wait_E);

		//closeCashFlow
		LMM_ND_Base.closeCashFlow(driver, wait_E);


		//clickDealSave
		LMM_ND_Base.clickDealSave(driver, wait_E);

		//verifyDealSavedOrNot
		LMM_ND_Base.verifyDealSavedOrNot(driver, wait_E);

		//retrieveDealID
		DealID_EV = LMM_ND_Base.retrieveDealID(driver, wait_E);

		//closeDealSavePage
		LMM_ND_Base.closeDealSavePage(driver, wait_E);

	}

	@Test(dependsOnMethods = "editModeInputs")
	public static void editModeInputsVerify() throws InterruptedException {
		
		//Click on "Pending Deal_Icon" From  Menu
		handleFields.FindDeal_Edit_Delete.clickOnPendingDealIconViaMenu(driver, wait_E);

		//Click on "DealApprovalDrpdwn" From 'Pending Deals' DashBoard]
		handleFields.FindDeal_Edit_Delete.clickOnDealApprovalDrpdwn(driver, wait_E);

		//Under "DealApprovalDrpdwn" List, Click on Required Menu like 'DealApproval'
		String Deal_Approval_Menu_V = frameWorks.pageObjectModel.Dashboard_Elements.Deal_Approval_Menu_V;
		handleFields.FindDeal_Edit_Delete.selectDealApprovalDrpdwnList(driver, wait_E, Deal_Approval_Menu_V);
		
		//FindDealByDealID
		handleFields.FindDeal_Edit_Delete.findDeal(driver, wait_E, DealID_EV);

		//Goto_EditMode
		handleFields.FindDeal_Edit_Delete.editDeal(driver, wait_E);

		//verifyBEntity
		String Business_Entity_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Business_Entity_NI;
		LMM_ND_Base.verifyBEntity(driver, wait_E, Business_Entity_NI);

		//verifyCredit_Risk
		String Credit_Risk_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Credit_Risk_NI;
		LMM_ND_Base.verifyCParty(driver, wait_E, Credit_Risk_NI);

		//verifyProduct
		String Product_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Product_NI;
		LMM_ND_Base.verifyProduct(driver, wait_E, Product_NI);

		//verifyStrategy
		String Strategy_NI=frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.Strategy_NI;
		LMM_ND_Base.verifyStrategy(driver, wait_E, Strategy_NI);

		//verifyDeal_Date
		String Deal_Date_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Deal_Date_EI;
		LMM_ND_Base.verifyDealDate(driver, wait_E, Deal_Date_EI);

		//verifyValue_Date
		String Value_Date_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Value_Date_EI;
		LMM_ND_Base.verifyValueDate(driver, wait_E, Value_Date_EI);

		//verify Maturity
		//Check the Edit Mode -> Maturity Selection is Based on Tenor OR Maturity date!!
		String Maturity_Date_Based_On_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Maturity_Date_Based_On_EI;		
		log.info("The Edit Mode -> Maturity Date Selection is Based on : "+Maturity_Date_Based_On_EI);

		if(Maturity_Date_Based_On_EI.equalsIgnoreCase("Tenor")){
			//verify Tenor Using Input
			String Tenor_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Tenor_EI;
			LMM_ND_Base.verifyTenor(driver, wait_E, Tenor_EI);			
			//verify Maturity Date Using SystemDefined Value
			LMM_ND_Base.verifyMaturityDate(driver, wait_E, Maturity_Date_EV);
		}else{
			//verify Maturity Date Using Input
			String Maturity_Date_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Maturity_Date_EI;
			LMM_ND_Base.verifyMaturityDate(driver, wait_E, Maturity_Date_EI);
			//verify Tenor Using SystemDefined Value
			LMM_ND_Base.verifyTenor(driver, wait_E, Tenor_EV);
		}

		//verify Principal
		String Principal_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Principal_EI;
		LMM_ND_Base.verifyPrincipal(driver, wait_E, Principal_EI);

		//verify RateType
		String RateType_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.RateType_EI;
		if(RateType_EI.equalsIgnoreCase("Fixed")){
			if(!(MoneyMarketORLoan_NI.equalsIgnoreCase("Money Market"))) {
				//verify FixedRateType
				LMM_ND_Base.verifyFixedRateType(driver, wait_E);
			}
			//verify Rate Using Input
			String Rate_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Rate_EI;
			LMM_ND_Base.verifyRate(driver, wait_E, Rate_EI);
		}else {
			//verify FloatRateType
			LMM_ND_Base.verifyFloatRateType(driver, wait_E);

			//verify Reference_ID
			String Reference_ID_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Reference_ID_EI;
			LMM_ND_Base.verifyReferenceID(driver, wait_E, Reference_ID_EI);

			//verify Reference_Tenor
			String Reference_Tenor_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Reference_Tenor_EI;
			LMM_ND_Base.verifyReferenceTenor(driver, wait_E, Reference_Tenor_EI);

			//verify ReferenceRate Using SystemDefined Value
			LMM_ND_Base.verifyReferenceRate(driver, wait_E, Reference_Rate_EV);

			//verify Spread
			String Spread_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Spread_EI;
			LMM_ND_Base.verifySpread(driver, wait_E, Spread_EI);

			//verify Rate% Using SystemDefined Value
			LMM_ND_Base.verifyRate(driver, wait_E, Rate_EV);
		}

		//verify W_Tax
		String W_Tax_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.W_Tax_EI;
		if(!W_Tax_EI.isEmpty()){
			LMM_ND_Base.verifyWTax(driver, wait_E, W_Tax_EI);

			//verify 
			String We_Absorb_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.We_Absorb_EI;
			LMM_ND_Base.verifyWeAbsorb(driver, wait_E, We_Absorb_EI);
		}
		
		//Info Button Click
		LMM_ND_Base.clickInfo(driver, wait_E);

		//verify Principal_Freq By Input & Defaulted Value
		String Principal_Freq_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Principal_Freq_EI;
		LMM_ND_Base.verifyPrincipalFrequency(driver, wait_E, Principal_Freq_EI, Principal_Freq_EV);

		//verify By Input & Defaulted Value
		String Interest_Freq_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Interest_Freq_EI;
		LMM_ND_Base.verifyInterestFrequency(driver, wait_E, Interest_Freq_EI, Interest_Freq_EV);

		//verify By Input & Defaulted Value
		String Day_Count_Basis_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Day_Count_Basis_EI;
		LMM_ND_Base.verifyDayCountBasis(driver, wait_E, Day_Count_Basis_EI, Day_Count_Basis_EV);

		//verify By Input & Defaulted Value
		String Date_Convention_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Date_Convention_EI;
		LMM_ND_Base.verifyDateConvention(driver, wait_E, Date_Convention_EI, Date_Convention_EV);

		//verify By Input & Defaulted Value
		String Period_End_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Period_End_EI;
		LMM_ND_Base.verifyPeriodEnd(driver, wait_E, Period_End_EI, Period_End_EV);

		//verify Contact
		String Contact_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Contact_EI;
		if(!(Contact_EI.isEmpty())){
			LMM_ND_Base.verifyContact(driver, wait_E, Contact_EI);
		}else{
			log.info("'Contact' Input is Empty. So Skipped This!");
		}		

		//verify Department
		String Department_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Department_EI;
		if(!(Department_EI.isEmpty())){
			LMM_ND_Base.verifyDepartment(driver, wait_E, Department_EI);
		}else{
			log.info("'Department' Input is Empty. So Skipped This!");
		}

		//verify Broker
		String Broker_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Broker_EI;
		if(!(Broker_EI.isEmpty())){
			LMM_ND_Base.verifyBroker(driver, wait_E, Broker_EI);
		}else{
			log.info("'Broker' Input is Empty. So Skipped This!");
		}

		//verify C_PartyRef
		String C_PartyRef_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.C_PartyRef_EI;
		if(!(C_PartyRef_EI.isEmpty())){
			LMM_ND_Base.verifyCPartyRef(driver, wait_E, C_PartyRef_EI);
		}else{
			log.info("'C_PartyRef' Input is Empty. So Skipped This!");
		}

		//verify Deal_Ref
		String Deal_Ref_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Deal_Ref_EI;
		if(!(Deal_Ref_EI.isEmpty())){
			LMM_ND_Base.verifyDealRef(driver, wait_E, Deal_Ref_EI);
		}else{
			log.info("'Deal_Ref' Input is Empty. So Skipped This!");
		}

		//verify Certificate_No
		String Certificate_No_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Certificate_No_EI;
		if(!(Certificate_No_EI.isEmpty())){
			LMM_ND_Base.verifyCertificateNo(driver, wait_E, Certificate_No_EI);
		}else{
			log.info("'Certificate_No' Input is Empty. So Skipped This!");
		}

		//verify Confirmation_Mode
		String Confirmation_Mode_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Confirmation_Mode_EI;
		LMM_ND_Base.verifyConfirmationMode(driver, wait_E, Confirmation_Mode_EI);

		//verify Sub_Type
		String Sub_Type_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.Sub_Type_EI;
		if(!(Sub_Type_EI.isEmpty())){
			LMM_ND_Base.verifySubType(driver, wait_E, Sub_Type_EI);
		}else{
			log.info("'Sub_Type' Input is Empty. So Skipped This!");
		}

		//verify INFO_Remarks
		String INFO_Remarks_EI=frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.INFO_Remarks_EI;
		if(!(INFO_Remarks_EI.isEmpty())){
			LMM_ND_Base.verifyInfoRemarks(driver, wait_E, INFO_Remarks_EI);
		}else{
			log.info("'INFO_Remarks' Input is Empty. So Skipped This!");
		}

		//Info Page Close
		LMM_ND_Base.closeInfo(driver, wait_E);

		//clickBankDetails
		LMM_ND_Base.clickBankDetails(driver, wait_E);

		//verifyBankTotalSettlement
		LMM_ND_Base.verifyBankTotalSettlement(driver, wait_E, Principal_EI);		

		//verifyBankSettlementBalance
		LMM_ND_Base.verifyBankSettlementBalance(driver, wait_E);

		//closeBankDetails
		LMM_ND_Base.closeBankDetails(driver, wait_E);

		//clickCashFlow
		LMM_ND_Base.clickCashFlow(driver, wait_E);

		//closeCashFlow
		LMM_ND_Base.closeCashFlow(driver, wait_E);
	}

}
