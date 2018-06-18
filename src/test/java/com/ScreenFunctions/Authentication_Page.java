package com.ScreenFunctions;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericFunctions;

public class Authentication_Page extends GenericFunctions {

	// **Sign in object identification***//

		@FindBy(how = How.XPATH, using = "//div[@id='page']//a[normalize-space(text())='Sign in']")
		public static WebElement lnk_Sign_in;
	
	//**Authentication page header***//

	@FindBy(how = How.XPATH, using = "//h1[text()='Authentication']")

	public static WebElement Authentication_page_Header;

	// **Forgot your Password link***//

			@FindBy(how = How.XPATH, using = "//h1[text()='Authentication']//parent::div//form//a[text()='Forgot your password?']")

			public static WebElement Forgotpwd_Link;
			

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
	
	public boolean auth_page_forgotpwd_lnk() {
		Boolean status;

		try {
			
			//**click on Sign in button in Home Page**//
			
			status = hoverAndClick(lnk_Sign_in);

			if (status) 
			{
				logEvent("Pass", "Sign in Link is clicked");				
				status = page_navigation_is_successful(Authentication_page_Header, "Authentication");
				
				if(status)
				{
									
				logEvent("Pass", "Auth Header is available");
				
				status = page_navigation_is_successful(Forgotpwd_Link, "Forgot your password?");
					if(status)
					{
						logEvent("Pass", "Forogt your password link is available");
					
					}				
					 else 
					{
						logEvent("Fail", "Forgot password link is not available");
					}
											
				}
				else
				{
					logEvent("Fail", "Auth Header is not available");
				}
			}
				else
				{
					logEvent("Pass", "Sign in Link is not available");
				}
				

					
			
			
		} catch (Exception e) {
			status = false;
		}
return status;
	}

	

}
