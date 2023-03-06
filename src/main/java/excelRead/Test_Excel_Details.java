package excelRead;

import java.util.HashMap;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Test_Excel_Details {

	// Declarations Of Log4j For This Class.
	public static Logger log = Logger.getLogger(Test_Excel_Details.class.getName());

	/**** EXCEL FILE PATHs ****/
	// "Test_Details"
	public static String Test_Details_Excel_Path_I = System.getProperty("user.dir")+"//TestExcels//Test_Details.xlsx";

	// "Elements"
	public static String nC_Elements_Excel_Path_I = System.getProperty("user.dir")+"//TestExcels//Elements//nC_Elements.xlsx";

	// "Test_Inputs"
	public static String LMM_TestInputs_Excel_Path_I = System.getProperty("user.dir")+"//TestExcels//TestInputs//Markets//LMM_TestInputs.xlsx";

	/**** EXCEL SHEET NAMES ****/
	public static String Test_Info_Sheet_Name = "Test_Info";
	// ELEMENTS
	public static String Login_Page_Sheet_Name = "Login_Page";
	public static String Dashboard_Elements_Sheet_Name = "Dashboard_Elements";
	public static String Common_Elements_Sheet_Name = "Common_Elements";
	//-- MARKET --//
	public static String Loan_ND_Elements_Sheet_Name = "Loan_ND_Elements";
	//-- SETUP --//
	public static String Prod_Strgy_Name = "Prod_Strgy";
	
	// TEST_INPUTS
	public static String Loan_ND_New_Inputs_Sheet_Name = "Loan_ND_New_Inputs";
	public static String Loan_ND_Edit_Inputs_Sheet_Name = "Loan_ND_Edit_Inputs";
	// ---- DECLARE SHEET NAMES HERE, INCREMENTLY ---- //

	/**** HASHMAPs FOR STORING EXCEL READ VALUES ****/
	public static HashMap<String, String> Test_Info_Sheet_MapDatas = new HashMap<String, String>();
	// HASHMAP FOR 'ELEMENTS'
	public static HashMap<String, String> login_Page_Sheet_MapDatas = new HashMap<String, String>();
	public static HashMap<String, String> Dashboard_Elements_Sheet_MapDatas = new HashMap<String, String>();
	public static HashMap<String, String> Common_Elements_Sheet_MapDatas = new HashMap<String, String>();
	public static HashMap<String, String> Loan_ND_Elements_Sheet_MapDatas = new HashMap<String, String>();
	// HASHMAP FOR 'TEST_INPUTS'
	public static HashMap<String, String> Loan_ND_New_Inputs_Sheet_MapDatas = new HashMap<String, String>();
	public static HashMap<String, String> Loan_ND_Edit_Inputs_Sheet_MapDatas = new HashMap<String, String>();
	// ---- DECLARE HASHMAP HERE FOR DATA STORE FROM SHEET, INCREMENTLY ---- //


	public static void test_Info_SheetRead() {
		/** CONFIGURING LOG4J FILE TO TEST FOR ONCE **/
		PropertyConfigurator.configure("log4j_CW.properties"); // Calling log4j Properties File.

		log.info("*************** <'" + Test_Info_Sheet_Name + "' Sheet_Read Initiated> ***************");

		excelRead.ExcelRead.excelSheetRead(Test_Details_Excel_Path_I, Test_Info_Sheet_Name);
		Test_Info_Sheet_MapDatas.putAll(excelRead.ExcelRead.Temp_hashMapDatas_FromSheetRead);
		frameWorks.dataDrivenModel.Test_Info.configureValues(Test_Info_Sheet_MapDatas);

		log.info("--------------- <'" + Test_Info_Sheet_Name + "' Sheet_Read Completed> ---------------");
	}

	// ELEMENTS-EXCEL_READ
	public static void login_Page_SheetRead() {
		log.info("*************** <'" + Login_Page_Sheet_Name + "' Sheet_Read Initiated> ***************");

		excelRead.ExcelRead.excelSheetRead(nC_Elements_Excel_Path_I, Login_Page_Sheet_Name);
		login_Page_Sheet_MapDatas.putAll(excelRead.ExcelRead.Temp_hashMapDatas_FromSheetRead);
		frameWorks.pageObjectModel.Login_Page.configureValues(login_Page_Sheet_MapDatas);

		log.info("--------------- <'" + Login_Page_Sheet_Name + "' Sheet_Read Completed> ---------------");
	}

	public static void Dashboard_Elements_SheetRead() {
		log.info("*************** <'" + Dashboard_Elements_Sheet_Name + "' Sheet_Read Initiated> ***************");

		// Ensure Correct Excel Path(i.e, "Element" / "Test_Inputs") - From Given Path in 'Test_Info' Sheet & Its Exact "Sheet_Name".		
		excelRead.ExcelRead.excelSheetRead(nC_Elements_Excel_Path_I, Dashboard_Elements_Sheet_Name);
		Dashboard_Elements_Sheet_MapDatas.putAll(excelRead.ExcelRead.Temp_hashMapDatas_FromSheetRead);
		frameWorks.pageObjectModel.Dashboard_Elements.configureValues(Dashboard_Elements_Sheet_MapDatas);

		log.info("--------------- <'" + Dashboard_Elements_Sheet_Name + "' Sheet_Read Completed> ---------------");
	}

	public static void common_Elements_SheetRead() {
		log.info("*************** <'" + Common_Elements_Sheet_Name + "' Sheet_Read Initiated> ***************");

		excelRead.ExcelRead.excelSheetRead(nC_Elements_Excel_Path_I, Common_Elements_Sheet_Name);
		Common_Elements_Sheet_MapDatas.putAll(excelRead.ExcelRead.Temp_hashMapDatas_FromSheetRead);
		frameWorks.pageObjectModel.CommonElements.configureValues(Common_Elements_Sheet_MapDatas);

		log.info("--------------- <'" + Common_Elements_Sheet_Name + "' Sheet_Read Completed> ---------------");
	}

	public static void loan_ND_Elements_SheetRead() {
		log.info("*************** <'" + Loan_ND_Elements_Sheet_Name + "' Sheet_Read Initiated> ***************");

		excelRead.ExcelRead.excelSheetRead(nC_Elements_Excel_Path_I, Loan_ND_Elements_Sheet_Name);
		Loan_ND_Elements_Sheet_MapDatas.putAll(excelRead.ExcelRead.Temp_hashMapDatas_FromSheetRead);
		frameWorks.pageObjectModel.Loan_ND.configureValues(Loan_ND_Elements_Sheet_MapDatas);

		log.info("--------------- <'" + Loan_ND_Elements_Sheet_Name + "' Sheet_Read Completed> ---------------");
	}

	// TEST_INPUT-EXCEL_READ
	public static void loan_ND_New_Inputs_SheetRead() {
		log.info("*************** <'" + Loan_ND_New_Inputs_Sheet_Name + "' Sheet_Read Initiated> ***************");

		excelRead.ExcelRead.excelSheetRead(LMM_TestInputs_Excel_Path_I, Loan_ND_New_Inputs_Sheet_Name);
		Loan_ND_New_Inputs_Sheet_MapDatas.putAll(excelRead.ExcelRead.Temp_hashMapDatas_FromSheetRead);
		frameWorks.dataDrivenModel.Loan_ND_New_TestInputs.configureValues(Loan_ND_New_Inputs_Sheet_MapDatas);

		log.info("--------------- <'" + Loan_ND_New_Inputs_Sheet_Name + "' Sheet_Read Completed> ---------------");
	}

	public static void loan_ND_Edit_Inputs_SheetRead() {
		log.info("*************** <'" + Loan_ND_Edit_Inputs_Sheet_Name + "' Sheet_Read Initiated> ***************");

		excelRead.ExcelRead.excelSheetRead(LMM_TestInputs_Excel_Path_I, Loan_ND_Edit_Inputs_Sheet_Name);
		Loan_ND_Edit_Inputs_Sheet_MapDatas.putAll(excelRead.ExcelRead.Temp_hashMapDatas_FromSheetRead);
		frameWorks.dataDrivenModel.Loan_ND_Edit_TestInputs.configureValues(Loan_ND_Edit_Inputs_Sheet_MapDatas);

		log.info("--------------- <'" + Loan_ND_Edit_Inputs_Sheet_Name + "' Sheet_Read Completed> ---------------");
	}

}
