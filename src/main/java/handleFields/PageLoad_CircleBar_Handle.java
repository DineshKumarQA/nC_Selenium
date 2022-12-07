package handleFields;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageLoad_CircleBar_Handle {
	
	// Declarations Of Log4j For This Class
	public static Logger log = Logger.getLogger(PageLoad_CircleBar_Handle.class.getName());
		
	public static WebDriverWait wait_E;
	
	public static boolean is_PageLoaded_Check(WebDriver driver){
		
		boolean is_PageLoaded = false;
		
		wait_E=beforeTest.DriverConfig.wait_E;
		
		if( wait_E.until(ExpectedConditions.invisibilityOfAllElements(frameWorks.pageObjectModel.CommonElements.Page_Load_BackDrop_EL(driver))) &&
				wait_E.until(ExpectedConditions.invisibilityOfAllElements(frameWorks.pageObjectModel.CommonElements.Page_Load_Circle_EL(driver))) ){
			
			log.info("Page Loaded!");
			is_PageLoaded=true;
			
			}
		else{
			log.warn("Page_Load takes too Long than Defined Timout!!");
		}
		return is_PageLoaded;
	}

}
