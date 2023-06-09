package frameWorks.pageObjectModel;

import java.util.HashMap;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard_Elements {

	// Declarations Of Log4j For This Class
	public static Logger log = Logger.getLogger(Dashboard_Elements.class.getName());

	public static String ADD_Deal_Btn_X;
	public static String Money_Market_X;
	public static String Loan_X;
	
	public static String Menu_Btn_X;
	public static String Pending_Deal_Menu_X;

	public static String Pending_Deal_Icon_X;
	public static String ApprovalDropDown_X;
	
	public static String Pending_Limit_Approval_Menu_V;
	public static String Deal_Approval_Menu_V;
	public static String CE_Approval_Menu_V;
	public static String Security_Settlement_Menu_V;
	public static String Pending_Settlement_Menu_V;
	public static String Cashflow_ReSchedule_Menu_V;
	public static String Additional_Principal_Menu_V;
	public static String Settled_Deals_Menu_V;

	public static String Three_Dots_Btn_X;
	public static String Deal_Edit_X;
	public static String Deal_Delete_X;

	public static String Next_Page_Btn_X;

	public static void configureValues(HashMap<String, String> Dashboard_Elements_Sheet_MapDatas) {

		log.info("*************** <Dashboard_Elements > configureValues() Initiate Started> ***************");

		ADD_Deal_Btn_X = Dashboard_Elements_Sheet_MapDatas.get("ADD_DEAL_Btn");
		Money_Market_X = Dashboard_Elements_Sheet_MapDatas.get("Money_Market");
		Loan_X = Dashboard_Elements_Sheet_MapDatas.get("Loan");
		
		Menu_Btn_X = Dashboard_Elements_Sheet_MapDatas.get("Menu_Btn");
		Pending_Deal_Menu_X = Dashboard_Elements_Sheet_MapDatas.get("Pending_Deal_Menu");

		Pending_Deal_Icon_X = Dashboard_Elements_Sheet_MapDatas.get("Pending_Deal_Icon");

		ApprovalDropDown_X = Dashboard_Elements_Sheet_MapDatas.get("ApprovalDropDown");
		
		Pending_Limit_Approval_Menu_V = Dashboard_Elements_Sheet_MapDatas.get("Pending_Limit_Approval_Menu");
		Deal_Approval_Menu_V = Dashboard_Elements_Sheet_MapDatas.get("Deal_Approval_Menu");
		CE_Approval_Menu_V = Dashboard_Elements_Sheet_MapDatas.get("CE_Approval_Menu");
		Security_Settlement_Menu_V = Dashboard_Elements_Sheet_MapDatas.get("Security_Settlement_Menu");
		Pending_Settlement_Menu_V = Dashboard_Elements_Sheet_MapDatas.get("Pending_Settlement_Menu");
		Cashflow_ReSchedule_Menu_V = Dashboard_Elements_Sheet_MapDatas.get("Cashflow_ReSchedule_Menu");
		Additional_Principal_Menu_V = Dashboard_Elements_Sheet_MapDatas.get("Additional_Principal_Menu");
		Settled_Deals_Menu_V = Dashboard_Elements_Sheet_MapDatas.get("Settled_Deals_Menu");

		Three_Dots_Btn_X = Dashboard_Elements_Sheet_MapDatas.get("Three_Dots_Btn");
		Deal_Edit_X = Dashboard_Elements_Sheet_MapDatas.get("Deal_Edit");
		Deal_Delete_X = Dashboard_Elements_Sheet_MapDatas.get("Deal_Delete");

		Next_Page_Btn_X = Dashboard_Elements_Sheet_MapDatas.get("Next_Page_Btn");

		log.info("--------------- <Dashboard_Elements > configureValues() Initiate Completed> ---------------");
	}

	public static WebElement ADD_Deal_Btn_EL(WebDriver driver) {
		return driver.findElement(By.xpath(ADD_Deal_Btn_X));
	}

	public static WebElement Money_Market_EL(WebDriver driver) {
		return driver.findElement(By.xpath(Money_Market_X));
	}
	
	public static WebElement Loan_EL(WebDriver driver) {
		return driver.findElement(By.xpath(Loan_X));
	}
	
	public static WebElement Menu_Btn_EL(WebDriver driver) {
		return driver.findElement(By.xpath(Menu_Btn_X));
	}	
	
	public static WebElement Pending_Deal_Menu_EL(WebDriver driver) {
		return driver.findElement(By.xpath(Pending_Deal_Menu_X));
	}

	public static WebElement Pending_Deal_Icon_EL(WebDriver driver) {
		return driver.findElement(By.xpath(Pending_Deal_Icon_X));
	}

	public static WebElement ApprovalDropDown_EL(WebDriver driver) {
		return driver.findElement(By.xpath(ApprovalDropDown_X));
	}

	public static WebElement Three_Dots_Btn_EL(WebDriver driver) {
		return driver.findElement(By.xpath(Three_Dots_Btn_X));
	}

	public static WebElement Deal_Edit_EL(WebDriver driver) {
		return driver.findElement(By.xpath(Deal_Edit_X));
	}

	public static WebElement Deal_Delete_EL(WebDriver driver) {
		return driver.findElement(By.xpath(Deal_Delete_X));
	}

	public static WebElement Next_Page_Btn_EL(WebDriver driver) {
		return driver.findElement(By.xpath(Next_Page_Btn_X));
	}

}
