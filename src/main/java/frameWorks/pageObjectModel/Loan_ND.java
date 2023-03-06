package frameWorks.pageObjectModel;

import java.util.HashMap;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loan_ND {
	
	// Declarations Of Log4j For This Class
			public static Logger log = Logger.getLogger(Loan_ND.class.getName());
			
			/** LOAN_ND - ELEMENTS READ  **/		
			//FRONT PAGE
			public static String Asset_X;            // Variable Name Ends With "_E", Means 'xpath Input' For Elements Find.
			public static String Liability_X;
			public static String Business_Entity_X;
			public static String Credit_Risk_X;
			public static String Product_X;
			public static String Strategy_X;
			
			public static String Deal_Date_Btn_X;
			public static String Value_Date_Btn_X;
			public static String Maturity_Date_Btn_X;	
			
			public static String Deal_Date_txt_X;
			public static String Value_Date_txt_X;
			public static String Maturity_Date_txt_X;
			
			public static String Tenor_X;
			public static String Currency_X;
			public static String Principal_X;
			public static String RateType_Fixed_X;
			public static String RateType_Float_X;
			public static String Reference_ID_X;
			public static String Reference_Tenor_X;
			public static String Reference_Rate_X;
			public static String Spread_X;
			public static String Rate_X;
			public static String W_Tax_X;
			public static String We_Absorb_X;
			
			//INFO
			public static String Info_Icon_Btn_X;
			public static String DealReference_Exp_X;
			public static String Principal_Freq_X;
			public static String Interest_Freq_X;
			public static String Day_Count_Basis_X;
			public static String Date_Convention_X;
			public static String Period_End_X;
			public static String Contact_X;
			public static String Department_X;
			public static String Broker_X;
			public static String C_PartyRef_X;
			public static String Deal_Ref_X;
			public static String Certificate_No_X;
			public static String Confirmation_Mode_X;
			public static String Sub_Type_X;
			public static String INFO_Remarks_X;
			public static String INFO_Close_Btn_X;
			
			//BANK DETAILS
			public static String Bank_Details_Icon_Btn_X;
			public static String Bank_Entry_ADD_Btn_X;
			public static String FirstRowClick_X;
			public static String Our_Bank_X;
			public static String Their_Bank_X;
			public static String Amount_X;
			public static String Mode_X;
			public static String BANK_Remarks_X;
			public static String SecondRowClick_X;
			public static String Total_Settlement_X;
			public static String Settlement_Balance_X;
			public static String Bank_RowEntry_OK_X;
			public static String Bank_RowEntry_DELETE_X;
			public static String Bank_Close_Btn_X;
			
			//CASH FLOW
			public static String Cash_Flow_Icon_Btn_X;
			public static String Cash_Flow_Close_Btn_X;
			
			//AFTER DEAL SAVED
			public static String Deal_Save_Btn_X;
			public static String Deal_Save_Cancel_Btn_X;
			public static String Deal_Save_Status_X;
			public static String Deal_ID_X;
			public static String Page_Close_After_Deal_Saved_X;
			
			public static String Deal_Saved_VE;			// Variable Name Ends With "_VE" Means Verification Purpose, From Excel Datas.
			public static String Deal_Not_Saved_VE;
			
			
			
			public static void configureValues(HashMap<String, String> Loan_ND_Elements_Sheet_MapDatas){
				
				log.info("*************** <Loan_ND > configureValues() Initiate Started> ***************");
				
				Asset_X=Loan_ND_Elements_Sheet_MapDatas.get("Asset");                           
				Liability_X=Loan_ND_Elements_Sheet_MapDatas.get("Liability");
				Business_Entity_X=Loan_ND_Elements_Sheet_MapDatas.get("Business_Entity");
				Credit_Risk_X=Loan_ND_Elements_Sheet_MapDatas.get("Credit_Risk");
				Product_X=Loan_ND_Elements_Sheet_MapDatas.get("Product");
				Strategy_X=Loan_ND_Elements_Sheet_MapDatas.get("Strategy");
				
				Deal_Date_Btn_X=Loan_ND_Elements_Sheet_MapDatas.get("Deal_Date_Btn");   	// Date -> Ends 'Btn' Means 'Calendar Button'
				Value_Date_Btn_X=Loan_ND_Elements_Sheet_MapDatas.get("Value_Date_Btn");
				Maturity_Date_Btn_X=Loan_ND_Elements_Sheet_MapDatas.get("Maturity_Date_Btn");
				
				Deal_Date_txt_X=Loan_ND_Elements_Sheet_MapDatas.get("Deal_Date_txt");		// Date -> Ends 'txt' Means 'Date Input Text Box'
				Value_Date_txt_X=Loan_ND_Elements_Sheet_MapDatas.get("Value_Date_txt");
				Maturity_Date_txt_X=Loan_ND_Elements_Sheet_MapDatas.get("Maturity_Date_txt");
						
				Tenor_X=Loan_ND_Elements_Sheet_MapDatas.get("Tenor");
				Currency_X=Loan_ND_Elements_Sheet_MapDatas.get("Currency");
				Principal_X=Loan_ND_Elements_Sheet_MapDatas.get("Principal");
				RateType_Fixed_X=Loan_ND_Elements_Sheet_MapDatas.get("RateType_Fixed");
				RateType_Float_X=Loan_ND_Elements_Sheet_MapDatas.get("RateType_Float");
				Reference_ID_X=Loan_ND_Elements_Sheet_MapDatas.get("Reference_ID");
				Reference_Tenor_X=Loan_ND_Elements_Sheet_MapDatas.get("Reference_Tenor");
				Reference_Rate_X=Loan_ND_Elements_Sheet_MapDatas.get("Reference_Rate");
				Spread_X=Loan_ND_Elements_Sheet_MapDatas.get("Spread");
				Rate_X=Loan_ND_Elements_Sheet_MapDatas.get("Rate%");
				W_Tax_X=Loan_ND_Elements_Sheet_MapDatas.get("W_Tax");
				We_Absorb_X=Loan_ND_Elements_Sheet_MapDatas.get("We_Absorb");
				
				//INFO
				Info_Icon_Btn_X=Loan_ND_Elements_Sheet_MapDatas.get("Info_Icon_Btn");
				DealReference_Exp_X=Loan_ND_Elements_Sheet_MapDatas.get("DealReference_Exp");
				Principal_Freq_X=Loan_ND_Elements_Sheet_MapDatas.get("Principal_Freq");
				Interest_Freq_X=Loan_ND_Elements_Sheet_MapDatas.get("Interest_Freq");
				Day_Count_Basis_X=Loan_ND_Elements_Sheet_MapDatas.get("Day_Count_Basis");
				Date_Convention_X=Loan_ND_Elements_Sheet_MapDatas.get("Date_Convention");
				Period_End_X=Loan_ND_Elements_Sheet_MapDatas.get("Period_End");
				Contact_X=Loan_ND_Elements_Sheet_MapDatas.get("Contact");
				Department_X=Loan_ND_Elements_Sheet_MapDatas.get("Department");
				Broker_X=Loan_ND_Elements_Sheet_MapDatas.get("Broker");
				C_PartyRef_X=Loan_ND_Elements_Sheet_MapDatas.get("C_PartyRef");
				Deal_Ref_X=Loan_ND_Elements_Sheet_MapDatas.get("Deal_Ref");
				Certificate_No_X=Loan_ND_Elements_Sheet_MapDatas.get("Certificate_No");
				Confirmation_Mode_X=Loan_ND_Elements_Sheet_MapDatas.get("Confirmation_Mode");
				Sub_Type_X=Loan_ND_Elements_Sheet_MapDatas.get("Sub_Type");
				INFO_Remarks_X=Loan_ND_Elements_Sheet_MapDatas.get("INFO_Remarks");
				INFO_Close_Btn_X=Loan_ND_Elements_Sheet_MapDatas.get("INFO_Close_Btn");
				
				//BANK DETAILS
				Bank_Details_Icon_Btn_X=Loan_ND_Elements_Sheet_MapDatas.get("Bank_Details_Icon_Btn");
				Bank_Entry_ADD_Btn_X=Loan_ND_Elements_Sheet_MapDatas.get("Bank_Entry_ADD_Btn");
				FirstRowClick_X=Loan_ND_Elements_Sheet_MapDatas.get("FirstRowClick");
				Our_Bank_X=Loan_ND_Elements_Sheet_MapDatas.get("Our_Bank");
				Their_Bank_X=Loan_ND_Elements_Sheet_MapDatas.get("Their_Bank");
				Amount_X=Loan_ND_Elements_Sheet_MapDatas.get("Amount");
				Mode_X=Loan_ND_Elements_Sheet_MapDatas.get("Mode");
				BANK_Remarks_X=Loan_ND_Elements_Sheet_MapDatas.get("BANK_Remarks");
				SecondRowClick_X=Loan_ND_Elements_Sheet_MapDatas.get("SecondRowClick");
				Total_Settlement_X=Loan_ND_Elements_Sheet_MapDatas.get("Total_Settlement");
				Settlement_Balance_X=Loan_ND_Elements_Sheet_MapDatas.get("Settlement_Balance");
				Bank_RowEntry_OK_X=Loan_ND_Elements_Sheet_MapDatas.get("Bank_RowEntry_OK");
				Bank_RowEntry_DELETE_X=Loan_ND_Elements_Sheet_MapDatas.get("Bank_RowEntry_DELETE");
				Bank_Close_Btn_X=Loan_ND_Elements_Sheet_MapDatas.get("Bank_Close_Btn");
				
				//CASH FLOW
				Cash_Flow_Icon_Btn_X=Loan_ND_Elements_Sheet_MapDatas.get("Cash_Flow_Icon_Btn");
				Cash_Flow_Close_Btn_X=Loan_ND_Elements_Sheet_MapDatas.get("Cash_Flow_Close_Btn");
				
				//AFTER DEAL SAVED
				Deal_Save_Btn_X=Loan_ND_Elements_Sheet_MapDatas.get("Deal_Save_Btn");
				Deal_Save_Cancel_Btn_X=Loan_ND_Elements_Sheet_MapDatas.get("Deal_Save_Cancel_Btn");
				Deal_Save_Status_X=Loan_ND_Elements_Sheet_MapDatas.get("Deal_Save_Status");
				Deal_ID_X=Loan_ND_Elements_Sheet_MapDatas.get("Deal_ID");
				Page_Close_After_Deal_Saved_X=Loan_ND_Elements_Sheet_MapDatas.get("Page_Close_After_Deal_Saved");
				
				Deal_Saved_VE=Loan_ND_Elements_Sheet_MapDatas.get("Deal_Saved");
				Deal_Not_Saved_VE=Loan_ND_Elements_Sheet_MapDatas.get("Deal_Not_Saved");
				
				log.info("--------------- <Loan_ND > configureValues() Initiate Completed> ---------------");
			}
			
			
			//FRONT PAGE
			public static WebElement Asset_EL(WebDriver driver){    // Variable Name Ends With "_EL", Means  Element.
				return driver.findElement(By.xpath(Asset_X));
			}
			
			
			public static WebElement Liability_EL(WebDriver driver){
				return driver.findElement(By.xpath(Liability_X));
			}
			
			
			public static WebElement Business_Entity_EL(WebDriver driver){
				return driver.findElement(By.xpath(Business_Entity_X));
			}
			
			
			public static WebElement Credit_Risk_EL(WebDriver driver){
				return driver.findElement(By.xpath(Credit_Risk_X));
			}
			
			
			public static WebElement Product_EL(WebDriver driver){
				return driver.findElement(By.xpath(Product_X));
			}
			
			
			public static WebElement Strategy_EL(WebDriver driver){
				return driver.findElement(By.xpath(Strategy_X));
			}
			
			
			public static WebElement Deal_Date_Btn_EL(WebDriver driver){
				return driver.findElement(By.xpath(Deal_Date_Btn_X));
			}
			
			
			public static WebElement Value_Date_Btn_EL(WebDriver driver){
				return driver.findElement(By.xpath(Value_Date_Btn_X));
			}
			
			
			public static WebElement Maturity_Date_Btn_EL(WebDriver driver){
				return driver.findElement(By.xpath(Maturity_Date_Btn_X));
			}
			
			
			public static WebElement Deal_Date_txt_EL(WebDriver driver){
				return driver.findElement(By.xpath(Deal_Date_txt_X));
			}
			
			
			public static WebElement Value_Date_txt_EL(WebDriver driver){
				return driver.findElement(By.xpath(Value_Date_txt_X));
			}
			
			
			public static WebElement Maturity_Date_txt_EL(WebDriver driver){
				return driver.findElement(By.xpath(Maturity_Date_txt_X));
			}
			
			
			public static WebElement Tenor_EL(WebDriver driver){
				return driver.findElement(By.xpath(Tenor_X));
			}
			
			
			public static WebElement Currency_EL(WebDriver driver){
				return driver.findElement(By.xpath(Currency_X));
			}
			
			
			public static WebElement Principal_EL(WebDriver driver){
				return driver.findElement(By.xpath(Principal_X));
			}
			
			
			public static WebElement RateType_Fixed_EL(WebDriver driver){
				return driver.findElement(By.xpath(RateType_Fixed_X));
			}
			
			
			public static WebElement RateType_Float_EL(WebDriver driver){
				return driver.findElement(By.xpath(RateType_Float_X));
			}
			
			
			public static WebElement Reference_ID_EL(WebDriver driver){
				return driver.findElement(By.xpath(Reference_ID_X));
			}
			
			
			public static WebElement Reference_Tenor_EL(WebDriver driver){
				return driver.findElement(By.xpath(Reference_Tenor_X));
			}
			
			
			public static WebElement Reference_Rate_EL(WebDriver driver){
				return driver.findElement(By.xpath(Reference_Rate_X));
			}
			
			
			public static WebElement Spread_EL(WebDriver driver){
				return driver.findElement(By.xpath(Spread_X));
			}
			
			
			public static WebElement Rate_EL(WebDriver driver){
				return driver.findElement(By.xpath(Rate_X));
			}
			
			
			public static WebElement W_Tax_EL(WebDriver driver){
				return driver.findElement(By.xpath(W_Tax_X));
			}
			
			
			public static WebElement We_Absorb_EL(WebDriver driver){
				return driver.findElement(By.xpath(We_Absorb_X));
			}
			
			
			//INFO
			public static WebElement Info_Icon_Btn_EL(WebDriver driver){
				return driver.findElement(By.xpath(Info_Icon_Btn_X));
			}
			
			
			public static WebElement DealReference_Exp_EL(WebDriver driver){
				return driver.findElement(By.xpath(DealReference_Exp_X));
			}
			
			
			public static WebElement Principal_Freq_EL(WebDriver driver){
				return driver.findElement(By.xpath(Principal_Freq_X));
			}
			
			
			public static WebElement Interest_Freq_EL(WebDriver driver){
				return driver.findElement(By.xpath(Interest_Freq_X));
			}
			
			
			public static WebElement Day_Count_Basis_EL(WebDriver driver){
				return driver.findElement(By.xpath(Day_Count_Basis_X));
			}
			
			
			public static WebElement Date_Convention_EL(WebDriver driver){
				return driver.findElement(By.xpath(Date_Convention_X));
			}
			
			
			public static WebElement Period_End_EL(WebDriver driver){
				return driver.findElement(By.xpath(Period_End_X));
			}
			
			
			public static WebElement Contact_EL(WebDriver driver){
				return driver.findElement(By.xpath(Contact_X));
			}
			
			
			public static WebElement Department_EL(WebDriver driver){
				return driver.findElement(By.xpath(Department_X));
			}
			
			
			public static WebElement Broker_EL(WebDriver driver){
				return driver.findElement(By.xpath(Broker_X));
			}
			
			
			public static WebElement C_PartyRef_EL(WebDriver driver){
				return driver.findElement(By.xpath(C_PartyRef_X));
			}
			
			
			public static WebElement Deal_Ref_EL(WebDriver driver){
				return driver.findElement(By.xpath(Deal_Ref_X));
			}
			
			
			public static WebElement Certificate_No_EL(WebDriver driver){
				return driver.findElement(By.xpath(Certificate_No_X));
			}
			
			
			public static WebElement Confirmation_Mode_EL(WebDriver driver){
				return driver.findElement(By.xpath(Confirmation_Mode_X));
			}
			
			
			public static WebElement Sub_Type_EL(WebDriver driver){
				return driver.findElement(By.xpath(Sub_Type_X));
			}
			
			
			public static WebElement INFO_Remarks_EL(WebDriver driver){
				return driver.findElement(By.xpath(INFO_Remarks_X));
			}
			
			
			public static WebElement INFO_Close_Btn_E(WebDriver driver){
				return driver.findElement(By.xpath(INFO_Close_Btn_X));
			}
			
			
			//BANK DETAILS
			public static WebElement Bank_Details_Icon_Btn_EL(WebDriver driver){
				return driver.findElement(By.xpath(Bank_Details_Icon_Btn_X));
			}
			
						
			public static WebElement Bank_Entry_ADD_Btn_EL(WebDriver driver){
				return driver.findElement(By.xpath(Bank_Entry_ADD_Btn_X));
			}
			
			
			public static WebElement FirstRowClick_EL(WebDriver driver){
				return driver.findElement(By.xpath(FirstRowClick_X));
			}
			
			
			public static WebElement Our_Bank_EL(WebDriver driver){
				return driver.findElement(By.xpath(Our_Bank_X));
			}
			
			
			public static WebElement Their_Bank_EL(WebDriver driver){
				return driver.findElement(By.xpath(Their_Bank_X));
			}
			
			
			public static WebElement Amount_EL(WebDriver driver){
				return driver.findElement(By.xpath(Amount_X));
			}
			
			
			public static WebElement Mode_EL(WebDriver driver){
				return driver.findElement(By.xpath(Mode_X));
			}
			
			
			public static WebElement BANK_Remarks_EL(WebDriver driver){
				return driver.findElement(By.xpath(BANK_Remarks_X));
			}
			
			
			public static WebElement SecondRowClick_EL(WebDriver driver){
				return driver.findElement(By.xpath(SecondRowClick_X));
			}
			
			
			public static WebElement Total_Settlement_EL(WebDriver driver){
				return driver.findElement(By.xpath(Total_Settlement_X));
			}
			
			
			public static WebElement Settlement_Balance_EL(WebDriver driver){
				return driver.findElement(By.xpath(Settlement_Balance_X));
			}
			
			
			public static WebElement Bank_RowEntry_OK_EL(WebDriver driver){
				return driver.findElement(By.xpath(Bank_RowEntry_OK_X));
			}
			
			
			public static WebElement Bank_RowEntry_DELETE_EL(WebDriver driver){
				return driver.findElement(By.xpath(Bank_RowEntry_DELETE_X));
			}
			
			
			public static WebElement Bank_Close_Btn_EL(WebDriver driver){
				return driver.findElement(By.xpath(Bank_Close_Btn_X));
			}
			
			
			//CASH FLOW
			public static WebElement Cash_Flow_Icon_Btn_EL(WebDriver driver){
				return driver.findElement(By.xpath(Cash_Flow_Icon_Btn_X));
			}
						
			
			public static WebElement Cash_Flow_Close_Btn_EL(WebDriver driver){
				return driver.findElement(By.xpath(Cash_Flow_Close_Btn_X));
			}
						
			
			//AFTER DEAL SAVED
			public static WebElement Deal_Save_Btn_EL(WebDriver driver){
				return driver.findElement(By.xpath(Deal_Save_Btn_X));
			}			
			
			
			public static WebElement Deal_Save_Cancel_Btn_EL(WebDriver driver){
				return driver.findElement(By.xpath(Deal_Save_Cancel_Btn_X));
			}
			
			
			public static WebElement Deal_Save_Status_EL(WebDriver driver){
				return driver.findElement(By.xpath(Deal_Save_Status_X));
			}
			
			
			public static WebElement Deal_ID_EL(WebDriver driver){
				return driver.findElement(By.xpath(Deal_ID_X));
			}
						
			
			public static WebElement Page_Close_After_Deal_Saved_EL(WebDriver driver){
				return driver.findElement(By.xpath(Page_Close_After_Deal_Saved_X));
			}
			

}
