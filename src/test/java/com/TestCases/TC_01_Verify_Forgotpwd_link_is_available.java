package com.TestCases;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import com.GenericFunctions.GenericFunctions;
//import com.ScreenFunctions.Authentication_Page;
import com.ScreenFunctions.HomePage;

public class TC_01_Verify_Forgotpwd_link_is_available extends GenericFunctions {

	/*************************************************
	 * 
	 * 
	 * Function Name:auth_page_forgotpwd_lnk
	 * 
	 * Purpose:-This Function is used to Verify forgot your password link is available or not
	 * 
	 * Input Parameters:-NA
	 * 
	 * Output Parameters:-This method will return a boolean value stating whether the fields area vauilable or not
	 * 
	 * Author:-Pavan Pegallapati
	 * 
	 * Creationn date:-06/11/2018
	 * 
	 * 
	 **************************************************/
	@Test
	public static void verify_forgotpwd_link() {
		
		boolean status;
					
		status=launchApplication("Firefox");
		if(status)
		{
			logEvent("Pass", "Application is launched");
		}
		else
		{
			logEvent("Fail", "Application is not launched");
		}
		HomePage Sign_in = PageFactory.initElements(driver, HomePage.class);
		Sign_in.signin();
		
		
	}
	

}
