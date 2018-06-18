package com.ScreenFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericFunctions;

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
	//String str_button_name = "Retrieve Password";

	// **BackTo button text in Forgot your password section**//

	@FindBy(how = How.XPATH, using = "//div[@id='center_column']//ul//li//a[@title='Back to Login']")
	public static WebElement forgotpws_backto_button;

	// **BackTo button in Forgot your password section**//

	@FindBy(how = How.XPATH, using = "//div[@id='center_column']//ul//li//a[@title='Back to Login']//span")
	public static WebElement forgotpws_backto_button_text;
	//String str_BackButton = "Back to Login";

	// **bread crumb in Forgot your password section**//

	@FindBy(how = How.XPATH, using = "//div[@class='breadcrumb clearfix']//a[@title='Authentication']/following-sibling::span")
	public static WebElement Forgotpwd_breadcrumb;
	//String str_breadcrumb = "Forgot your password";

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
	 * whether the fields area vauilable or not
	 * 
	 * Author:-Pavan Pegallapati
	 * 
	 * Creationn date:-06/11/2018
	 * 
	 * 
	 **************************************************/

	public boolean forgotyourpassword_section_fields()

	{
		Boolean status = true;

		try {

			Forgotpwd_Link.click();

			status = page_navigation_is_successful(Forgotpwd_Page_Header, "Forgot your password? Header");

			// If Forgot Your Password Page is opened We can proceed

			if (status) {
				logEvent("Pass", "Forgot your password? section is available");
			} else {
				logEvent("Fail", "Forgot your password? section is not available");
			}

//			status = page_navigation_is_successful(Text_in_Forgotpwd_section, str_Text);
//
//			if (status) {
//				logEvent("Pass", str_Text + "  Text is available in Forgot Your password page");
//			} else {
//				logEvent("Fail", str_Text + "  Text is not available in Forgot Your password page");
//			}
//
//			status = page_navigation_is_successful(Forgotpwd_section_EmailID_Label, str_label);
//
//			if (status) {
//				logEvent("Pass", str_label + "  label is available in Forgot Your password page");
//			} else {
//				logEvent("Fail", str_label + "  label is not available in Forgot Your password page");
//			}
//
//			status = page_navigation_is_successful(Forgotpwd_Button_text, str_button_name);
//
//			if (status) {
//				logEvent("Pass", str_button_name + "  is available in Forgot Your password page");
//			} else {
//				logEvent("Fail", str_button_name + "  is not available in Forgot Your password page");
//			}
//			status = page_navigation_is_successful(forgotpws_backto_button_text, str_BackButton);
//
//			if (status) {
//				logEvent("Pass", str_BackButton + "  is available in Forgot Your password page");
//			} else {
//				logEvent("Fail", str_BackButton + "  is not available in Forgot Your password page");
//			}
//			status = page_navigation_is_successful(Forgotpwd_breadcrumb, str_breadcrumb);
//
//			if (status) {
//				logEvent("Pass", str_breadcrumb + "  is available in Forgot Your password Breadcrumb ");
//			} else {
//				logEvent("Fail", str_breadcrumb + "  is not available in Forgot Your password Breadcrumb");
//			}

		} catch (Exception e) {
			status = false;
		}
		return status;

	}

}
