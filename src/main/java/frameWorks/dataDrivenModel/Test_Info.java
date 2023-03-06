package frameWorks.dataDrivenModel;

import java.util.HashMap;

import org.apache.log4j.Logger;

public class Test_Info {
	
	// Declarations Of Log4j For This Class
	public static Logger log = Logger.getLogger(Test_Info.class.getName());	
			
		public static String TestBrowser_I;
		public static String nC_URL_I;
		public static String UserName_I;
		public static String PassWord_I;				
		
		public static void configureValues(HashMap<String, String> Test_Info_Sheet_MapDatas){
			
			log.info("*************** <Test_Info > configureValues() Initiated> ***************");
			
			TestBrowser_I = Test_Info_Sheet_MapDatas.get("Test_Browser");
			nC_URL_I = Test_Info_Sheet_MapDatas.get("nC_URL");
			UserName_I = Test_Info_Sheet_MapDatas.get("Username");
			PassWord_I = Test_Info_Sheet_MapDatas.get("Password");
			
			log.info("--------------- <Test_Info > configureValues() Completed> ---------------");
		}
}