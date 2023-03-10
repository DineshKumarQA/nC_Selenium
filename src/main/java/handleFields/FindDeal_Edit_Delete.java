package handleFields;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindDeal_Edit_Delete {

	// Declarations Of Log4j For This Class
	public static Logger log = Logger.getLogger(FindDeal_Edit_Delete.class.getName());

	static WebElement Next_Page_Btn_EL;
	static WebElement Deal_Approval_Menu_EL;

	static WebElement DealID_Header_EL;
	static WebElement DealID_Row_EL;

	
	// [DK - Click on "Pending Deal_Icon" From 'Main' DashBoard]
	public static void clickOnPendingDealIconViaDashboard(WebDriver driver, WebDriverWait wait_E) {
		log.info("Proceed to Click 'Pending_Deal_Icon'");
		handleFields.AlertMsg.alert_MsgHandle(driver);
		
		wait_E.until(ExpectedConditions.elementToBeClickable
				(frameWorks.pageObjectModel.Dashboard_Elements.Pending_Deal_Icon_EL(driver))).click();
		log.info("'Pending_Deal_Icon' Has Been Clicked");
	}
	
	
	// [DK - Click on "Pending Deal" Via Menu]
	public static void clickOnPendingDealIconViaMenu(WebDriver driver, WebDriverWait wait_E) {
		log.info("Proceed to Click 'Pending_Deal_Menu'");
		handleFields.AlertMsg.alert_MsgHandle(driver);
		
		// Click on Menu
		wait_E.until(ExpectedConditions.elementToBeClickable
				(frameWorks.pageObjectModel.Dashboard_Elements.Menu_Btn_EL(driver))).click();
		// Click on 'PendingDeal'
		wait_E.until(ExpectedConditions.elementToBeClickable
				(frameWorks.pageObjectModel.Dashboard_Elements.Pending_Deal_Menu_EL(driver))).click();
		
		log.info("'Pending_Deal_Menu' Has Been Clicked");
	}
	
	
	// [DK - Click on "DealApprovalDrpdwn" From 'Pending Deals' DashBoard]
	public static void clickOnDealApprovalDrpdwn(WebDriver driver, WebDriverWait wait_E) throws InterruptedException {
		log.info("Proceed to Click 'ApprovalDropDown'");
		// [DK - To Handle Prompted Alert Message, As It Interrupt the Click Action]
		handleFields.AlertMsg.alert_MsgHandle(driver);
		Thread.sleep(3000);
		
		wait_E.until(ExpectedConditions.elementToBeClickable
				(frameWorks.pageObjectModel.Dashboard_Elements.ApprovalDropDown_EL(driver))).click();
		log.info("'ApprovalDropDown' Has Been Clicked");
		/**
		//Sometimes 'Dropdown Click' is Not Effected, Due to Some Layers Blocking the Click. So, Try Click until the DrpDwn Value Shows
		boolean flagApprvDrpDwnClick = true;
		while(flagApprvDrpDwnClick) {
			try {
				//Try Validate 'Deal Approval' from Dropdown Shown / Not
				if(driver.findElement(By.xpath("//li[1]")).isDisplayed()) {
					flagApprvDrpDwnClick = false;
				}
			}catch(Exception e){
				// [DK - Find And Click On Top-Left Corner-DropDown, Which Having 'Deal Approval',' Pending Settlement',Etc]
				wait_E.until(ExpectedConditions.elementToBeClickable
						(frameWorks.pageObjectModel.Dashboard_Elements.ApprovalDropDown_EL(driver))).click();
				log.info("'ApprovalDropDown' Has Been Clicked");
			}
		}
		**/
	}
	
	
	// [DK - Under "DealApprovalDrpdwn" List, Click on Required Menu like 'DealApproval','PendingSettlement',Etc]
	public static void selectDealApprovalDrpdwnList(WebDriver driver, WebDriverWait wait_E, String ExpectedMenuFromList) {
		log.info("Proceed to Find and Click From 'ApprovalDropDown' List");
		/** 
		 * WHAT - To Find the 'Deal Approval', 'Pending Settlement',Etc - Which Mentioned in Excel.
		 * WHY - To Get the DashBoard of 'Approval', 'Settlement'.
		 * FOR - To Perform Further Actions on Deals.
		 **/
		int dealApprv_menuFind = 1;
		boolean dealApprv_menuFind_Flag = true;
		String ActualMenuFromList = null;

		while (dealApprv_menuFind_Flag) {

			Deal_Approval_Menu_EL = wait_E.until(
					ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//li[" + dealApprv_menuFind + "]"))));
			ActualMenuFromList = Deal_Approval_Menu_EL.getText();

			log.info("Approval Dropdown's Current Menu Name : " + ActualMenuFromList);

			// [DK - Comparing Exact DropDown Value(Ex:'Deal Approval') From Excel To UI DropDown Value]
			if (ActualMenuFromList.equalsIgnoreCase(ExpectedMenuFromList)) {
				Deal_Approval_Menu_EL.click();
				dealApprv_menuFind_Flag = false;				
				log.info("From 'ApprovalDropDown' List Expected Menu Has Been Clicked");
				break;
			}else {
				dealApprv_menuFind++;
			}
		}
	}
	
	
	// [DK - To Find the 'Deal ID' Header Position, And Then Find the Actual 'Deal ID' Row]
	public static void findDeal(WebDriver driver, WebDriverWait wait_E, String DealID_I) {

		log.info("Proceed to Find the Deal Using DealID");		

		int dealID_Column_HeaderPosition;
		int dealID_Row_Position = 1;
		boolean dealIDFlag = true;
		String ActualDealID = null;

		for (dealID_Column_HeaderPosition = 1; dealID_Column_HeaderPosition <= 15; dealID_Column_HeaderPosition++) {
			/**
			 * [DK - 
			 * WHAT - To Find the "DealID" Table Header Column Position.
			 * WHY - To Get All DealIDs from Rows & Find Identify the Exact 'DealID'.
			 * FOR - To Perform Click on Deal for 'Edit' / 'Delete']	 
			 **/
			DealID_Header_EL = wait_E.until(ExpectedConditions.visibilityOf(
					driver.findElement(By.xpath("//th[" + dealID_Column_HeaderPosition + "]")))); /** //th[9] **/

			if (DealID_Header_EL.getText().equalsIgnoreCase("Deal ID")) {

				while (dealIDFlag) {

					DealID_Row_EL = wait_E.until(ExpectedConditions
							.visibilityOf(driver.findElement(By.xpath("//tr[" + dealID_Row_Position + "]//td["
									+ dealID_Column_HeaderPosition + "]")))); /** "//tr["+1+"]//td["+9+"]" **/
					ActualDealID = DealID_Row_EL.getText().trim();

					log.info("Actual DealID : " + ActualDealID);
					log.info("Expected DealID : " + DealID_I);
					log.info("Row Count : " + dealID_Row_Position);

					if (ActualDealID.equals(DealID_I)) {
						DealID_Row_EL.click();
						dealIDFlag = false;
					} 
					else if ((dealID_Row_Position %= 5) == 0) {
						wait_E.until(ExpectedConditions
								.elementToBeClickable(frameWorks.pageObjectModel.Dashboard_Elements.Next_Page_Btn_EL(driver)))
						.click();
						log.info("Next_Page Button is Clicked");
						dealID_Row_Position++;
					}
					else {
						dealID_Row_Position++;
					}
				}
			}

			if (dealIDFlag == false) {
				//To Break Main 'for' Loop
				break;
			}

		}
		log.info("Found the Deal Using DealID");
	}
	
	// Edit the Deal
	public static void editDeal(WebDriver driver, WebDriverWait wait_E) {
		// In Deal Information Card, "click on Three Dot Button" in Top Right Corner
		wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Dashboard_Elements.Three_Dots_Btn_EL(driver)))
		.click();

		// Click On 'Edit' Button in Three Dot Button
		wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Dashboard_Elements.Deal_Edit_EL(driver)))
		.click();
	}
	
	// Delete the Deal
	public static void deleteDeal(WebDriver driver, WebDriverWait wait_E) {
		// In Deal Information Card, "click on Three Dot Button" in Top Right Corner
		wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Dashboard_Elements.Three_Dots_Btn_EL(driver)))
		.click();
		
		// Click On 'Delete' Button in Three Dot Button
		wait_E.until(ExpectedConditions.elementToBeClickable(frameWorks.pageObjectModel.Dashboard_Elements.Deal_Delete_EL(driver))).click();
		handleFields.AlertBox.alertBoxHandle(driver);
	}

}
