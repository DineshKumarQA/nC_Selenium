package handleFields;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertBox {
	
	// Declarations Of Log4j For This Class
	public static Logger log = Logger.getLogger(AlertBox.class.getName());
			
	public static WebDriverWait wait_E;
			
	@SuppressWarnings("deprecation")
	public static void alertBoxHandle(WebDriver driver){
			
		//wait_E=beforeTest.DriverConfig.wait_E;
		wait_E=new WebDriverWait(driver,4);
		
		/**  HOLIDAY CHECK & DEAL SAVE - Confirmation Handle  **/
		
		try{
			
			if(handleFields.PageLoad_CircleBar_Handle.is_PageLoaded_Check(driver)){
			
			//Try Store Alert Box Element, If Shown.
			WebElement AlertHeader=wait_E.until(ExpectedConditions.presenceOfElementLocated
					(By.xpath(frameWorks.pageObjectModel.CommonElements.AlertBox_Header_X)));
								
				if(AlertHeader.isDisplayed()){
					String AlertHeaderMsg=AlertHeader.getText().trim();
					log.info("System Prompted An Alert Box, Which is : '"+AlertHeaderMsg+"'"); 
					
					//Try Store Alert Box -> 'Description' Element.
					WebElement AlertDescription=wait_E.until(ExpectedConditions.visibilityOf(
							(driver.findElement(By.xpath(frameWorks.pageObjectModel.CommonElements.AlertBox_Description_X)))));
					
					String AlertDescriptionMsg=AlertDescription.getText().trim();
					log.info("The Alert Msg is : '"+AlertDescriptionMsg+"'");
											
					wait_E.until(ExpectedConditions.elementToBeClickable(
							(frameWorks.pageObjectModel.CommonElements.AlertBox_Yes_Btn_EL(driver)))).click();
					log.info("Clicked 'Yes' On Alert Box");
				}
			}				
		}
		
		catch(Exception e){
			log.info("System Will Proceed Further, As There is No 'Alert Box' Prompted!");
		}
	}
}
