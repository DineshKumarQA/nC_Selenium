package handleFields;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DropDowns {
	
	// Declarations Of Log4j For This Class
	public static Logger log = Logger.getLogger(DropDowns.class.getName());
	
	static Actions action;
	
	
	public static void dropDownInputsHandle(WebDriver driver,WebElement Element,String Input) {		
		
		action = new Actions(driver);
		
		Boolean Flag=true;
		String default_Values = null;
		
		int given_Input_Length=Input.length();
		int get_Input_Length;
		
		int loop_Count=0;		
		
		while(Flag){			
				
			default_Values=Element.getAttribute("Value").trim();
			log.info("Defaulted Value is : '"+default_Values+"'");
			
			get_Input_Length=default_Values.length();
			//log.info("Excel_Input Length : "+given_Input_Length+" Vs UI-Field Value Length : " +get_Input_Length);
			
			if(default_Values.equals(Input)){
				log.info("'Excel_Input Value' : "+Input+" Vs 'UI-Field Value' : " +default_Values);
				log.info("Since, Both 'Excel_Input Value' AND 'UI-Field Value' is Same. So, Proceed to Next Field");
				Flag=false;
			}
		
			else{
				
				if(handleFields.PageLoad_CircleBar_Handle.is_PageLoaded_Check(driver)){
					
					action.moveToElement(Element)
					.click(Element)
					.keyDown(Keys.CONTROL)
					.sendKeys("a")
					.keyUp(Keys.CONTROL)
					.sendKeys(Keys.BACK_SPACE)
					.sendKeys(Element, Input)
					.sendKeys(Element, Keys.ARROW_DOWN)
					.sendKeys(Element, Keys.ENTER)	
					//.pause(500)
					.build()
					.perform();
				
					}
				}
						
			loop_Count++;
			
			if(loop_Count==10){
				log.info("Tried 10 Times To Give the Input. But That Didn't Worked!");
				log.info("Please Seek Technical Assistance!!");
				log.info("Browser Will Be Closed!!");
				driver.quit();
				//return;
				break;	
				
			}
		}
	}
	
}
