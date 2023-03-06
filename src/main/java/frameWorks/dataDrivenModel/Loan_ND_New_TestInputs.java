package frameWorks.dataDrivenModel;

import java.util.HashMap;

import org.apache.log4j.Logger;

public class Loan_ND_New_TestInputs {

	// Declarations Of Log4j For This Class
	public static Logger log = Logger.getLogger(Loan_ND_New_TestInputs.class.getName());

	public static String MoneyMarketORLoan_NI; 	// Variable Name Ends With "_NI" Means 'NewMode Inputs'.
	public static String Asset_Liabiity_NI;
	public static String Business_Entity_NI;
	public static String Credit_Risk_NI;
	public static String Product_NI;
	public static String Strategy_NI;
	public static String Deal_Date_NI;
	public static String Value_Date_NI;
	public static String Maturity_Date_NI;

	public static String Tenor_NI;
	public static String Maturity_Date_Based_On_NI;
	public static String Principal_NI;
	public static String RateType_NI;
	public static String Reference_ID_NI;
	public static String Reference_Tenor_NI;
	public static String Spread_NI;
	public static String Rate_NI;
	public static String W_Tax_NI;
	public static String We_Absorb_NI;

	// INFO
	public static String Principal_Freq_NI;
	public static String Interest_Freq_NI;
	public static String Day_Count_Basis_NI;
	public static String Date_Convention_NI;
	public static String Period_End_NI;
	public static String Contact_NI;
	public static String Department_NI;
	public static String Broker_NI;
	public static String C_PartyRef_NI;
	public static String Deal_Ref_NI;
	public static String Certificate_No_NI;
	public static String Confirmation_Mode_NI;
	public static String Sub_Type_NI;
	public static String INFO_Remarks_NI;

	// BANK DETAILS
	// FIRST ROW
	public static String Want_Override_FIRST_ROW_NI;
	public static String Our_Bank_Row1_NI;
	public static String Their_Bank_Row1_NI;
	public static String Amount_Row1_NI;
	public static String Mode_Row1_NI;
	public static String BANK_Remarks_Row1_NI;
	// SECOND ROW
	public static String Want_ADD_SECOND_ROW_NI;
	public static String Our_Bank_Row2_NI;
	public static String Their_Bank_Row2_NI;
	public static String Amount_Row2_NI;
	public static String Mode_Row2_NI;
	public static String BANK_Remarks_Row2_NI;

	public static void configureValues(HashMap<String, String> Loan_ND_New_Inputs_Sheet_MapDatas) {

		log.info("*************** <Loan_ND_New > configureValues() Initiate Started> ***************");

		MoneyMarketORLoan_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("MoneyMarketORLoan");
		// FRONT PAGE
		Asset_Liabiity_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("Asset_Liabiity");
		Business_Entity_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("Business_Entity");
		Credit_Risk_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("Credit_Risk");
		Product_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("Product");
		Strategy_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("Strategy");
		Deal_Date_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("Deal_Date");
		Value_Date_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("Value_Date");
		Maturity_Date_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("Maturity_Date");

		Tenor_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("Tenor");
		Maturity_Date_Based_On_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("Maturity_Date_Based_On");
		Principal_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("Principal");
		RateType_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("RateType");
		Reference_ID_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("Reference_ID");
		Reference_Tenor_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("Reference_Tenor");
		Spread_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("Spread");
		Rate_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("Rate%");
		W_Tax_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("W_Tax");
		We_Absorb_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("We_Absorb");

		// INFO
		Principal_Freq_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("Principal_Freq");
		Interest_Freq_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("Interest_Freq");
		Day_Count_Basis_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("Day_Count_Basis");
		Date_Convention_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("Date_Convention");
		Period_End_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("Period_End");
		Contact_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("Contact");
		Department_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("Department");
		Broker_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("Broker");
		C_PartyRef_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("C_PartyRef");
		Deal_Ref_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("Deal_Ref");
		Certificate_No_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("Certificate_No");
		Confirmation_Mode_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("Confirmation_Mode");
		Sub_Type_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("Sub_Type");
		INFO_Remarks_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("INFO_Remarks");

		// BANK DETAILS
		// FIRST ROW
		Want_Override_FIRST_ROW_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("Want_Override_FIRST_ROW");
		Our_Bank_Row1_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("Our_Bank_Row1");
		Their_Bank_Row1_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("Their_Bank_Row1");
		Amount_Row1_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("Amount_Row1");
		Mode_Row1_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("Mode_Row1");
		BANK_Remarks_Row1_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("BANK_Remarks_Row1");
		// SECOND ROW
		Want_ADD_SECOND_ROW_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("Want_ADD_SECOND_ROW");
		Our_Bank_Row2_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("Our_Bank_Row2");
		Their_Bank_Row2_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("Their_Bank_Row2");
		Amount_Row2_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("Amount_Row2");
		Mode_Row2_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("Mode_Row2");
		BANK_Remarks_Row2_NI = Loan_ND_New_Inputs_Sheet_MapDatas.get("BANK_Remarks_Row2");

		log.info("--------------- <Loan_ND_New > configureValues() Initiate Completed> ---------------");
	}

}
