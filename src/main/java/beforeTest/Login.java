package beforeTest;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	// Declarations Of Log4j For This Class
	public static Logger log = Logger.getLogger(Login.class.getName());

	public static WebDriver driver;
	public static WebDriverWait wait_E;

	public static void login() {

		log.info("*************** <Login Initiated> ***************");

		driver = DriverConfig.driver;
		wait_E = DriverConfig.wait_E;

		// Getting Login-Credentials From Excel Read.
		String nC_URL_I = frameWorks.dataDrivenModel.Test_Info.nC_URL_I;
		String UserName_I = frameWorks.dataDrivenModel.Test_Info.UserName_I;
		String PassWord_I = frameWorks.dataDrivenModel.Test_Info.PassWord_I;

		// Check Is URL Has Any Data
		if (nC_URL_I.isEmpty()) {
			log.error("The URL is Empty. Test Will Not Be Continued. Please Give Valid URL & Try Again");
		} else {
			try {
				driver.get(nC_URL_I);
				log.info("The URL is Loaded");
			} catch (Exception e) {
				log.error("The URL is Not Loaded.");
				log.warn("Kindly Ensure the Followings. 1.Internet Connection is UP. 2.Try With VPN UP. 3. Ensure the URL 'PORT'");
				log.warn("Browser Will Be Closed. Please Try Again");
				log.error("Issue Caused By : " + e);
				driver.close();
			}
		}

		// To Maximize the Browser Window
		driver.manage().window().maximize();

		// Initialize 'Implicit' wait
		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		// Check Is UserName Has Any Data
		if (UserName_I.isEmpty()) {
			log.error("The Username is Empty. Test Will Not Be Continued. Please Give Valid URL & Try Again");
			driver.close();
		} else {
			wait_E.until(ExpectedConditions
					.elementToBeClickable(frameWorks.pageObjectModel.Login_Page.userNameTextBox_EL(driver)))
			        .sendKeys(UserName_I);
			log.info("Username is Entered");
		}

		// Check Is Password Has Any Data
		if (PassWord_I.isEmpty()) {
			log.info("Password is Empty. So Proceed to Click Login Button For Case 'ADMIN' Level Login");
			if (UserName_I.equalsIgnoreCase("SYSMGR")) {
				log.info("Admin Lvl Login, Initiated");
			}
		} else {
			wait_E.until(ExpectedConditions
				  .elementToBeClickable(frameWorks.pageObjectModel.Login_Page.passWordTextBox_EL(driver)))
			      .sendKeys(PassWord_I);
			log.info("Password is Entered");
		}

		//Wait Until Page Completely Loaded, To Avoid Exception
		handleFields.PageLoad_CircleBar_Handle.is_PageLoaded_Check(driver);
		
		wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Login_Page.loginBtn_EL(driver)))
		.click();
		log.info("Login Button is Clickable & Clicked");

		handleFields.AlertMsg.alert_MsgHandle(driver);

		log.info("--------------- <Login Completed> ---------------");

	}
}
