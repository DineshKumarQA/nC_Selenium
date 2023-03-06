package handleFields;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

public class EditMode_Fields_Verify {
	
	// Declarations Of Log4j For This Class
	public static Logger log = Logger.getLogger(EditMode_Fields_Verify.class.getName());
	
	
	//Check, is Edit_Mode Retrieved Value And New_Mode Input is Same / Not!!
	public static void retrievedValueVerify(String RetrievedValue, String InputValue){
		
		if(RetrievedValue.equals(InputValue)){
			log.info("Field Verification in Edit Mode is QA PASSED!");
		}
		else{
			log.error("Field Verification in Edit Mode is QA FAILED!!");
			log.info("Input in New_Mode is : "+InputValue+", Retrieved in Edit_Mode is : "+RetrievedValue);
		}		
		
	}
	
	
	//Check the Auto-Defaulted Field Has Any Input in New Mode, to Proceed Further Verify.
	public static void forAutoDefaultedFields_ValueVerification(String RetrievedValue, String InputValue, String NewMode_Defaulted_Value){
		
		if(InputValue.isEmpty()){
			log.info("Proceed to Verify by Defaulted Value, Since the Excel Input is Empty!");			
			handleFields.EditMode_Fields_Verify.retrievedValueVerify(RetrievedValue, NewMode_Defaulted_Value);
		}
		else{
			log.info("Proceed to Verify by Excel Input!!");
			handleFields.EditMode_Fields_Verify.retrievedValueVerify(RetrievedValue, InputValue);
		}
		
	}
	
	
	//Check the Optional Field Has Any Input in New Mode, to Proceed Further Verify.
	public static void forOptionalFields_ValueVerification(String RetrievedValue, String InputValue){
		
		if(!InputValue.isEmpty()) {
			handleFields.EditMode_Fields_Verify.retrievedValueVerify(RetrievedValue, InputValue);
		}
		else{
			log.info("Since, The New Mode Input is Empty, This Field Check Has Been Skipped!");
		}
		
	}
	
	
	//Check, is the Field is Disabled / Not..
	public static void isFieldDisabled(WebElement Element){
		if(!(Element.isEnabled())){
			log.info("Field Should Be Disabled - QA PASSED!");			
			}
		else{
			log.warn("Field Should Be Disabled - QA FAILED!!");
		}
		
	}
	
	
	//Check, is the Field is Enabled / Not..
	public static void isFieldEnabled(WebElement Element){
		if(Element.isEnabled()){
			log.info("Field Should Be Enabled - QA PASSED!");			
			}
		else{
			log.warn("Field Should Be Enabled - QA FAILED!!");
		}
		
	}	
	
	
	//Check, is the Radio_Button is Selected / Not..
	public static void isRadioBtnSelected(WebElement Element){
		if(Element.isSelected()){
			log.info("The Radio Button Should Be Selected - QA PASSED!");			
		}else{
			log.error("The Radio Button Should Be Selected - QA FAILED!!");
		}
		
	}

}
