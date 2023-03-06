package frameWorks.dataDrivenModel;

import java.util.HashMap;

import org.apache.log4j.Logger;

public class Loan_ND_Edit_TestInputs {

	// Declarations Of Log4j For This Class
	public static Logger log = Logger.getLogger(Loan_ND_Edit_TestInputs.class.getName());

	public static String Deal_Date_EI;		// Variable Name Ends With "_EI" Means 'EditMode Inputs'.
	public static String Value_Date_EI;
	public static String Maturity_Date_EI;
	public static String Tenor_EI;
	public static String Maturity_Date_Based_On_EI;
	
	public static String Principal_EI;
	public static String RateType_EI;
	public static String Reference_ID_EI;
	public static String Reference_Tenor_EI;
	public static String Spread_EI;
	public static String Rate_EI;
	public static String W_Tax_EI;
	public static String We_Absorb_EI;

	// INFO
	public static String Principal_Freq_EI;
	public static String Interest_Freq_EI;
	public static String Day_Count_Basis_EI;
	public static String Date_Convention_EI;
	public static String Period_End_EI;
	public static String Contact_EI;
	public static String Department_EI;
	public static String Broker_EI;
	public static String C_PartyRef_EI;
	public static String Deal_Ref_EI;
	public static String Certificate_No_EI;
	public static String Confirmation_Mode_EI;
	public static String Sub_Type_EI;
	public static String INFO_Remarks_EI;

	// BANK DETAILS
	// FIRST ROW
	public static String Want_Override_FIRST_ROW_EI;
	public static String Our_Bank_Row1_EI;
	public static String Their_Bank_Row1_EI;
	public static String Amount_Row1_EI;
	public static String Mode_Row1_EI;
	public static String BANK_Remarks_Row1_EI;
	// SECOND ROW
	public static String Want_ADD_SECOND_ROW_EI;
	public static String Our_Bank_Row2_EI;
	public static String Their_Bank_Row2_EI;
	public static String Amount_Row2_EI;
	public static String Mode_Row2_EI;
	public static String BANK_Remarks_Row2_EI;

	public static void configureValues(HashMap<String, String> Loan_ND_Edit_Inputs_Sheet_MapDatas) {

		log.info("*************** <Loan_ND_Edit > configureValues() Initiate Started> ***************");

		// FRONT PAGE
		Deal_Date_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("Deal_Date");
		Value_Date_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("Value_Date");
		Maturity_Date_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("Maturity_Date");

		Tenor_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("Tenor");
		Maturity_Date_Based_On_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("Maturity_Date_Based_On");
		Principal_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("Principal");
		RateType_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("RateType");
		Reference_ID_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("Reference_ID");
		Reference_Tenor_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("Reference_Tenor");
		Spread_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("Spread");
		Rate_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("Rate%");
		W_Tax_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("W_Tax");
		We_Absorb_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("We_Absorb");

		// INFO
		Principal_Freq_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("Principal_Freq");
		Interest_Freq_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("Interest_Freq");
		Day_Count_Basis_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("Day_Count_Basis");
		Date_Convention_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("Date_Convention");
		Period_End_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("Period_End");
		Contact_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("Contact");
		Department_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("Department");
		Broker_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("Broker");
		C_PartyRef_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("C_PartyRef");
		Deal_Ref_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("Deal_Ref");
		Certificate_No_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("Certificate_No");
		Confirmation_Mode_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("Confirmation_Mode");
		Sub_Type_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("Sub_Type");
		INFO_Remarks_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("INFO_Remarks");

		// BANK DETAILS
		// FIRST ROW
		Want_Override_FIRST_ROW_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("Want_Override_FIRST_ROW");
		Our_Bank_Row1_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("Our_Bank_Row1");
		Their_Bank_Row1_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("Their_Bank_Row1");
		Amount_Row1_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("Amount_Row1");
		Mode_Row1_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("Mode_Row1");
		BANK_Remarks_Row1_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("BANK_Remarks_Row1");
		// SECOND ROW
		Want_ADD_SECOND_ROW_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("Want_ADD_SECOND_ROW");
		Our_Bank_Row2_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("Our_Bank_Row2");
		Their_Bank_Row2_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("Their_Bank_Row2");
		Amount_Row2_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("Amount_Row2");
		Mode_Row2_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("Mode_Row2");
		BANK_Remarks_Row2_EI = Loan_ND_Edit_Inputs_Sheet_MapDatas.get("BANK_Remarks_Row2");

		log.info("--------------- <Loan_ND_Edit > configureValues() Initiate Completed> ---------------");
	}

}

