package frameWorks.pageObjectModel;

import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonElements {
	
	// Declarations Of Log4j For This Class
		public static Logger log = Logger.getLogger(CommonElements.class.getName());
			
		public static String Year_Link_X;
		public static String Year_Search_X;
		public static String Month_Identify_X;
		public static String Month_Search_Prev_Buttons_X;
		public static String Month_Search_Next_Buttons_X;
		public static String Date_Search_X;
		
		public static String AlertBox_Header_X;
		public static String AlertBox_Description_X;
		public static String AlertBox_Yes_Btn_X;
		public static String AlertBox_No_Btn_X;
		
		public static String Alert_Msg_X;
		public static String Alert_Msg_Success_X;
		public static String Alert_Msg_Warning_X;
		public static String Alert_Msg_Error_X;
		public static String Alert_Close_Btn_X;
		
		public static String Page_Load_Circle_X;
		public static String Page_Load_BackDrop_X;
		public static String BalSheetClickBlocker_X;
		
		
		public static void configureValues(HashMap<String, String> Common_Elements_Sheet_MapDatas){
			
		log.info("*************** <CommonElements > configureValues() Initiate Started> ***************");
		
		Year_Link_X=Common_Elements_Sheet_MapDatas.get("Year_Link");
		Year_Search_X=Common_Elements_Sheet_MapDatas.get("Year_Search");
		Month_Identify_X=Common_Elements_Sheet_MapDatas.get("Month_Identify");
		Month_Search_Prev_Buttons_X=Common_Elements_Sheet_MapDatas.get("Month_Search_Prev_Buttons");
		Month_Search_Next_Buttons_X=Common_Elements_Sheet_MapDatas.get("Month_Search_Next_Buttons");
		Date_Search_X=Common_Elements_Sheet_MapDatas.get("Date_Search");
		
		AlertBox_Header_X=Common_Elements_Sheet_MapDatas.get("AlertBox_Header");
		AlertBox_Description_X=Common_Elements_Sheet_MapDatas.get("AlertBox_Description");
		AlertBox_Yes_Btn_X=Common_Elements_Sheet_MapDatas.get("AlertBox_Yes_Btn");
		AlertBox_No_Btn_X=Common_Elements_Sheet_MapDatas.get("AlertBox_No_Btn");
		
		Alert_Msg_X=Common_Elements_Sheet_MapDatas.get("Alert_Msg");
		Alert_Msg_Success_X=Common_Elements_Sheet_MapDatas.get("Alert_Msg_Success");
		Alert_Msg_Warning_X=Common_Elements_Sheet_MapDatas.get("Alert_Msg_Warning");
		Alert_Msg_Error_X=Common_Elements_Sheet_MapDatas.get("Alert_Msg_Error");
		Alert_Close_Btn_X=Common_Elements_Sheet_MapDatas.get("Alert_Close_Btn");
		
		Page_Load_Circle_X=Common_Elements_Sheet_MapDatas.get("Page_Load_Circle");
		Page_Load_BackDrop_X=Common_Elements_Sheet_MapDatas.get("Page_Load_BackDrop");
		BalSheetClickBlocker_X=Common_Elements_Sheet_MapDatas.get("BalSheetClickBlocker");
		
		log.info("--------------- <CommonElements > configureValues() Initiate Completed> ---------------");
		}
		
		
		public static WebElement Year_Link_EL(WebDriver driver){
			return driver.findElement(By.xpath(Year_Link_X));
		}
		
		
		public static List<WebElement> Year_Search_EL(WebDriver driver){
			return driver.findElements(By.xpath(Year_Search_X));
		}
		
		
		public static WebElement Month_Identify_EL(WebDriver driver){
			return driver.findElement(By.xpath(Month_Identify_X));
		}
		
		
		public static WebElement Month_Search_Prev_Buttons_EL(WebDriver driver){
			return driver.findElement(By.xpath(Month_Search_Prev_Buttons_X));
		}
		
		
		public static WebElement Month_Search_Next_Buttons_EL(WebDriver driver){
			return driver.findElement(By.xpath(Month_Search_Next_Buttons_X));
		}
		
		
		public static List<WebElement> Date_Search_EL(WebDriver driver){
			return driver.findElements(By.xpath(Date_Search_X));
		}
				
		
		public static WebElement AlertBox_Yes_Btn_EL(WebDriver driver){
			return driver.findElement(By.xpath(AlertBox_Yes_Btn_X));
		}
		
		
		public static WebElement AlertBox_No_Btn_EL(WebDriver driver){
			return driver.findElement(By.xpath(AlertBox_No_Btn_X));
		}
		
		
		public static WebElement Alert_Msg_EL(WebDriver driver){
			return driver.findElement(By.xpath(Alert_Msg_X));
		}
		
		
		public static WebElement Alert_Msg_Success_EL(WebDriver driver){
			return driver.findElement(By.xpath(Alert_Msg_Success_X));
		}
		
		
		public static WebElement Alert_Msg_Warning_EL(WebDriver driver){
			return driver.findElement(By.xpath(Alert_Msg_Warning_X));
		}
		
		
		public static WebElement Alert_Msg_Error_EL(WebDriver driver){
			return driver.findElement(By.xpath(Alert_Msg_Error_X));
		}
		
		
		public static WebElement Alert_Close_Btn_EL(WebDriver driver){
			return driver.findElement(By.xpath(Alert_Close_Btn_X));
		}
		
		
		public static List<WebElement> Page_Load_Circle_EL(WebDriver driver){
			return driver.findElements(By.xpath(Page_Load_Circle_X));
		}
		
		
		public static List<WebElement> Page_Load_BackDrop_EL(WebDriver driver){
			return driver.findElements(By.xpath(Page_Load_BackDrop_X));
		}
		
		public static List<WebElement> BalSheetClickBlocker_EL(WebDriver driver){
			return driver.findElements(By.xpath(BalSheetClickBlocker_X));
		}
		
		
}
