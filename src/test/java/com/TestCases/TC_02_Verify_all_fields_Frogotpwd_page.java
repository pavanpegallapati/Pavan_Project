package com.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericFunctions;
import com.ScreenFunctions.Authentication_Page;
import com.ScreenFunctions.Forgot_Password;
import com.ScreenFunctions.HomePage;

public class TC_02_Verify_all_fields_Frogotpwd_page extends GenericFunctions {

	/*************************************************
	 * 
	 * 
	 * Function Name:auth_page_forgotpwd_lnk
	 * 
	 * Purpose:-This Function is used to Verify forgot your password link is
	 * available or not
	 * 
	 * Input Parameters:-NA
	 * 
	 * Output Parameters:-This method will return a boolean value stating
	 * whether the fields area vauilable or not
	 * 
	 * Author:-Pavan Pegallapati
	 * 
	 * Creationn date:-06/11/2018
	 * 
	 * 
	 **************************************************/
	@Test
	public static void verify_all_fields() {

		boolean status;
		status = launchApplication("Firefox");
		if (status) {
			logEvent("Pass", "Application is laucnhed");
		} else {
			logEvent("Fail", "Application is not launched");
		}
		HomePage Sign_in = PageFactory.initElements(driver, HomePage.class);
		Sign_in.signin();
		
		Authentication_Page ap=PageFactory.initElements(driver, Authentication_Page.class);
		ap.auth_page_forgotpwd_lnk();
		Forgot_Password fp=PageFactory.initElements(driver, Forgot_Password.class);
		fp.forgotyourpassword_section_fields();
	}
}
