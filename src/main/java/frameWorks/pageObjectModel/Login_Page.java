package frameWorks.pageObjectModel;

import java.util.HashMap;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page {
	
	// Declarations Of Log4j For This Class
			public static Logger log = Logger.getLogger(Login_Page.class.getName());
	
			public static String UserNameTextBox_X ;	// Variable Name Ends With "_X" Means 'XPATH'-Inputs.
			public static String PassWordTextBox_X ;
			public static String LoginBtn_X ;
	
	
	public static void configureValues(HashMap<String, String> login_Page_Sheet_MapDatas){
		
		log.info("*************** <Login_Page > configureValues() Initiate Started> ***************");
		
		UserNameTextBox_X = login_Page_Sheet_MapDatas.get("Username_TextBox");
		PassWordTextBox_X = login_Page_Sheet_MapDatas.get("Password_TextBox");
		LoginBtn_X = login_Page_Sheet_MapDatas.get("Login_Button");
		
		log.info("--------------- <Login_Page > configureValues() Initiate Completed> ---------------");
	}
	
	
	public static WebElement userNameTextBox_EL(WebDriver driver){
		return driver.findElement(By.xpath(UserNameTextBox_X));
	}
	
	
	public static WebElement passWordTextBox_EL(WebDriver driver){
		return driver.findElement(By.xpath(PassWordTextBox_X));
	}
	
	
	public static WebElement loginBtn_EL(WebDriver driver){
		return driver.findElement(By.xpath(LoginBtn_X));
	}

}
