package com.ScreenFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericFunctions;
import com.thoughtworks.selenium.webdriven.commands.GetText;

public class Forgot_Password extends GenericFunctions {

	// **Sign in object identification***//

	@FindBy(how = How.XPATH, using = "//div[@id='page']//a[normalize-space(text())='Sign in']")
	public static WebElement lnk_Sign_in;

	// **Forgot your Password link***//

	@FindBy(how = How.XPATH, using = "//h1[text()='Authentication']//parent::div//form//a[@title='Recover your forgotten password']")

	public static WebElement Forgotpwd_Link;

	// **Forgot Your Password Header**//

	@FindBy(how = How.XPATH, using = "//div[@id='slider_row']/following-sibling::div//h1[text()='Forgot your password?']")

	public static WebElement Forgotpwd_Page_Header;

	// **Text in Forgot your password section**//

	@FindBy(how = How.XPATH, using = "//div[@id='center_column']//p[normalize-space(text())='Please enter the email address you used to register. We will then send you a new password.']")
	public static WebElement Text_in_Forgotpwd_section;
	// String str_Text = "Please enter the email address you used to register."
	// We will then send you a new password.";

	// **Email ID label in Forgot your password section**//

	@FindBy(how = How.XPATH, using = "//div[@id='center_column']//form//label[normalize-space(text())='Email address']")
	public static WebElement Forgotpwd_section_EmailID_Label;
	// String str_label = "Email address";

	// **Email ID Text box label in Forgot your password section**//

	@FindBy(how = How.XPATH, using = "//div[@id='center_column']//form//input[@id='email']")
	public static WebElement Forgotpwd_emalId_Textbox;
	// String str_Edit = Forgotpwd_emalId_Textbox.getText();

	// **Retrieve Password button text in Forgot your password section**//

	@FindBy(how = How.XPATH, using = "//span[text()='Retrieve Password']")
	public static WebElement Forgotpwd_Button_text;

	// **Retrieve Password button in Forgot your password section**//

	@FindBy(how = How.XPATH, using = "//span[text()='Retrieve Password']//parent::button")
	public static WebElement Forgotpwd_Button;
	// String str_button_name = "Retrieve Password";

	// **BackTo button text in Forgot your password section**//

	@FindBy(how = How.XPATH, using = "//div[@id='center_column']//ul//li//a[@title='Back to Login']")
	public static WebElement forgotpws_backto_button;

	// **BackTo button in Forgot your password section**//

	@FindBy(how = How.XPATH, using = "//div[@id='center_column']//ul//li//a[@title='Back to Login']//span")
	public static WebElement forgotpws_backto_button_text;
	// String str_BackButton = "Back to Login";

	// **bread crumb in Forgot your password section**//

	@FindBy(how = How.XPATH, using = "//div[@class='breadcrumb clearfix']//a[@title='Authentication']/following-sibling::span")
	public static WebElement Forgotpwd_breadcrumb;
	// String str_breadcrumb = "Forgot your password";
	
	@FindBy(how = How.XPATH, using ="//div[@id='center_column']//div[@class='alert alert-danger']/p[1]")
	public static WebElement Error1;
	//Error Text1
	
	@FindBy(how = How.XPATH, using ="//div[@id='center_column']//div[@class='alert alert-danger']/ol[1]/li")
	public static WebElement Error2;
	//Error Text1
	
	/*************************************************
	 * 
	 * 
	 * Function Name:forgotyourpassword_section_fields
	 * 
	 * Purpose:-This Function is used to Verify all the fields in Forgot Your
	 * password page
	 * 
	 * Input Parameters:-NA
	 * 
	 * Output Parameters:-This method will return a boolean value stating
	 * whether the fields are available or not
	 * 
	 * Author:-Pavan Pegallapati
	 * 
	 * Creation date:-06/11/2018
	 * 
	 * 
	 **************************************************/

	public boolean forgotyourpassword_section_fields()

	{
		Boolean status = true;

		try {

			Forgotpwd_Link.click();

			String str_Header = getdata("Fieldinfo", "Header2", 1);
			status = page_navigation_is_successful(Forgotpwd_Page_Header, str_Header);

			// If Forgot Your Password Page is opened We can proceed//

				if (status) 
				{
					logEvent("Pass", "Forgot your password? section is available");
					
					String str_text = getdata("Fieldinfo", "Text1", 1);
					status = page_navigation_is_successful(Forgotpwd_Page_Header, str_text);
		
					if (status) {
						logEvent("Pass", str_text + "  is available in Forgot Your password page");
					} else {
						logEvent("Fail", str_text + "  is not available in Forgot Your password page");
					}
					
					str_text = getdata("Fieldinfo", "Text2", 1);	
					status = page_navigation_is_successful(forgotpws_backto_button_text, str_text);
		
					if (status) {
						logEvent("Pass", str_text + "  is available in Forgot Your password page");
					} else {
						logEvent("Fail", str_text + "  is not available in Forgot Your password page");
					}
										
					String str_email_data=getdata("Fieldinfo", "Email", 1);
					setData(Forgotpwd_emalId_Textbox, str_email_data);
					hoverAndClick(Forgotpwd_Button);
					
					String str_Error1 = getdata("Fieldinfo", "Error1", 1);
					String str_Error2 = getdata("Fieldinfo", "Error2", 1);
					
					status = page_navigation_is_successful(Error1, str_Error1);
					if (status) {
						logEvent("Pass", status + "  Error is displayed in Forgot Your password Page ");
						
					status = page_navigation_is_successful(Error2, str_Error2);
					if (status) {
						logEvent("Pass", status + "  Error is displayed in Forgot Your password Page ");
					}
					} else {
						logEvent("Fail", status + "   Error is not displayed in Forgot Your password Page");
					}
						
					} 
				else 
				{
					logEvent("Fail", "Forgot your password? section is not available");
				}
				 
				
					
			
					} catch (Exception e) {
						status = false;
					}
					return status;

	}

}
