package handleFields;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertMsg {

	// Declarations Of Log4j For This Class
	public static Logger log = Logger.getLogger(AlertMsg.class.getName());

	static WebDriverWait wait_E;

	@SuppressWarnings("deprecation")
	public static void alert_MsgHandle(WebDriver driver) {

		//wait_E = beforeTest.DriverConfig.wait_E;
		wait_E = new WebDriverWait(driver,5);

		if (handleFields.PageLoad_CircleBar_Handle.is_PageLoaded_Check(driver)) {

			try {
				if (frameWorks.pageObjectModel.CommonElements.Alert_Msg_Success_EL(driver).isDisplayed()) {
					log.info("System Prompted An 'Success' Alert Message!");

					String Alert_Msg = frameWorks.pageObjectModel.CommonElements.Alert_Msg_EL(driver).getText();
					log.info("The Alert Message is : '" + Alert_Msg + "'");

					frameWorks.pageObjectModel.CommonElements.Alert_Close_Btn_EL(driver).click();
				}
				else if(frameWorks.pageObjectModel.CommonElements.Alert_Msg_Warning_EL(driver).isDisplayed()){
					log.info("System Prompted An 'Warning' Alert Message!");

					String Alert_Msg = frameWorks.pageObjectModel.CommonElements.Alert_Msg_EL(driver).getText();
					log.info("The Alert Message is : '" + Alert_Msg + "'");

					frameWorks.pageObjectModel.CommonElements.Alert_Close_Btn_EL(driver).click();
				}
				else if(frameWorks.pageObjectModel.CommonElements.Alert_Msg_Error_EL(driver).isDisplayed()){
					log.error("System Prompted An 'Error/Exception' Alert Message!");

					String Alert_Msg = frameWorks.pageObjectModel.CommonElements.Alert_Msg_EL(driver).getText();
					log.warn("The Alert Message is : '" + Alert_Msg + "'");

					frameWorks.pageObjectModel.CommonElements.Alert_Close_Btn_EL(driver).click();
					/**
					log.error("The Test Will Not Continue, As It is 'Error/Exception' Msg.");
					log.error("Please Refer Log For More Details & Seek the Technical Assistance!");
					log.warn("The Browser Will Be Closed!!");
					driver.quit();
					 **/
				}

			} catch (Exception e) {
				log.info("System Does Not Prompted Any Alert Message! So, Proceed Further.");
			}

		}
	}
}
