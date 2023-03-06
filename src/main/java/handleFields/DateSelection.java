package handleFields;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DateSelection {	
	
		// Declarations Of Log4j For This Class
		public static Logger log = Logger.getLogger(DateSelection.class.getName());
		
		public static HashMap<String, Integer> EnumMonths;
		
		static WebDriverWait wait_E;
			
		public static SimpleDateFormat sdf;
		
		
	public static void dateInputsHandle(WebDriver driver,WebElement dateElement,String Date_Input) {
		
		wait_E=beforeTest.DriverConfig.wait_E;
		
		
		log.info("The Given Input Date is : "+Date_Input);
		
		//Parsing the Date From 'String' to 'Date' Format, For "FORMATTING" Purpose.
		Date tempDate = null;
		
		if(Date_Input.contains("/")){
			log.info("The Given Input Date Format Contains '/'");
			sdf=new SimpleDateFormat("d/M/yyyy");
		}else if(Date_Input.contains("-")){
			log.info("The Given Input Date Format Contains '-'");
			sdf=new SimpleDateFormat("d-M-yyyy");
		}
		
		
		try {
			tempDate = sdf.parse(Date_Input);
			log.info("Tried Parsing the Input Date");
		} catch (ParseException e) {			
			e.printStackTrace();
			log.warn("Error in Parsing Date From Excel!!");
		}
		
		
		//Convert The Input Date Format into 'sdf' Format, For Eliminating the Front Zero(i.e, '03' into '3' ) 
		String FormattedDate=sdf.format(tempDate);
		log.info("The Formatted Input Date is : "+FormattedDate);
		
		//Split the Given Date, To Get 'Day', 'Month', 'Year' Separately.
		String[] DateArray = null;
		if(FormattedDate.contains("/")){
			log.info("Formatted Date Splitted By '/'");
			DateArray=FormattedDate.split("/");
		}else if (FormattedDate.contains("-")){
			log.info("Formatted Date Splitted By '-'");
			DateArray=FormattedDate.split("-");
		}
		
		
		String Day=DateArray[0];
		log.info("Given Day : "+Day);
		
		String Month=DateArray[1];
		log.info("Given Month : "+Month);
		
		String Year=DateArray[2];
		log.info("Given Year : "+Year);
	
	/**  -------------------------------Click On Calendar Button--------------------------------------------  **/	
		if(handleFields.PageLoad_CircleBar_Handle.is_PageLoaded_Check(driver)){
			dateElement.click();
		}
		
		
		/**  -------------------------------FIND YEAR & CLICK ON IT--------------------------------------------  **/
		// Click on 'Year' Link, Which Displayed Top Left Corner, For Viewing the List of Years. 
		wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.CommonElements.Year_Link_EL(driver))).click();
		
		// Storing the List of 'Years'-Elements into List. So, We Can Iterate & Find the Input Year.
		//List<WebElement> list_of_Year_Search_EL=wait_E.until(ExpectedConditions.visibilityOfAllElements(pageObjectModel.CommonElements.Year_Search_EL(driver)));
		List<WebElement> list_of_Year_Search_EL=frameWorks.pageObjectModel.CommonElements.Year_Search_EL(driver);
		
		for(WebElement Find_Input_Year : list_of_Year_Search_EL){
			if(Find_Input_Year.getText().equals(Year)){				
				Find_Input_Year.click();	
				log.info("Given Year is Selected!");
				break;
			}
		}
		
		
		//To Cater Holiday Check Box "On_Year_Change" Itself..
		handleFields.AlertBox.alertBoxHandle(driver);
		
	/**  ---------------------------------------------------------------------------------------------  **/	
		
		/**  FIND MONTH & CLICK ON IT  **/
		//For UI_Date(i.e, String Like "July") Comparison to Input Month(i.e, Integer "07")
				EnumMonths = new HashMap<String, Integer>();	
				EnumMonths.put("January",	1);
				EnumMonths.put("February",	2);
				EnumMonths.put("March",		3);
				EnumMonths.put("April",		4);
				EnumMonths.put("May",		5);
				EnumMonths.put("June",		6);
				EnumMonths.put("July",		7);
				EnumMonths.put("August",	8);
				EnumMonths.put("September",	9); 
				EnumMonths.put("October",	10);
				EnumMonths.put("November",	11);
				EnumMonths.put("December",	12);
				
				//Get Center Text From Date, To Identify the Month. (i.e, "July 2020" in the Center Aligned)
				WebElement Month_Identify_EL=wait_E.until(ExpectedConditions.visibilityOf(frameWorks.pageObjectModel.CommonElements.Month_Identify_EL(driver)));			
				String Month_Year=Month_Identify_EL.getText();
				
				//To Get the 'Month' Only, From "July 2020".
				String[] Ui_Month=Month_Year.split(" ");
				
				String Actual_Month_temp =Ui_Month[0];
				
				//Compare the String Month(i.e "July"), to the HashMap to Get the Month in Number(ie, July As '7'-For Comparing Purpose) 
				int Actual_UI_Month= EnumMonths.get(Actual_Month_temp);
				//Month From Input Excel & Converting the String to Integer.
				int Expected_Month=Integer.parseInt(Month);
				
				int Target_Month=0;
				
				//Proceed to Check "is Month Button to Be Clicked?"
				if(Actual_UI_Month == Expected_Month){
					log.info("Both 'Input Month' And 'Auto-Defaulted Month' in UI is Same. So, Month Selection Will Be Ignored!");
				}
				
				//Proceed to Click the "Next" Month Button To Get Expected Month
				else if(Actual_UI_Month < Expected_Month){
					Target_Month=Expected_Month-Actual_UI_Month;
					log.info("Target_Month Will Be Get By '"+Target_Month+"' Times Forward Click");
					
						for(int i=1;	i<=Target_Month;	i++){
							wait_E.until(ExpectedConditions.elementToBeClickable
									(frameWorks.pageObjectModel.CommonElements.Month_Search_Next_Buttons_EL(driver))).click();
							log.info("Month_Search_Next_Button Clicked : "+i+" Times");
						}					
				}
				
				//Proceed to Click the "Previous" Month Button To Get Expected Month
				else if(Actual_UI_Month > Expected_Month){
					Target_Month=Actual_UI_Month-Expected_Month;
					log.info("Target_Month Will Be Get By '"+Target_Month+"' Times Backward Click");
					
						for(int i=1;	i<=Target_Month;	i++){
							wait_E.until(ExpectedConditions.elementToBeClickable
									(frameWorks.pageObjectModel.CommonElements.Month_Search_Prev_Buttons_EL(driver))).click();
							log.info("Month_Search_Prev_Button Clicked : "+i+" Times");
						}	
				}
		
	/**  ---------------------------------------------------------------------------------------------  **/			
				
		/**  FIND DAY & CLICK ON IT  **/
				List<WebElement> Date_Search_EL=wait_E.until(ExpectedConditions.presenceOfAllElementsLocatedBy
						(By.xpath(frameWorks.pageObjectModel.CommonElements.Date_Search_X)));
				
				for(WebElement Find_Input_Date : Date_Search_EL){
					if(Find_Input_Date.getText().equals(Day)){
						
						wait_E.until(ExpectedConditions.elementToBeClickable(Find_Input_Date)).click();							
						log.info("Given Date is Clicked");					
						break;
					}
				}
			
	/**  ---------------------------------------------------------------------------------------------  **/	
		
	}
	
	
}
