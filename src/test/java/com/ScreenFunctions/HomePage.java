package com.ScreenFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericFunctions;

public class HomePage extends GenericFunctions {

	// **Sign in object identification***//

	@FindBy(how = How.XPATH, using = "//div[@id='page']//a[normalize-space(text())='Sign in']")
	public static WebElement lnk_Sign_in;

	// *** create sign in function to click to check the Sign in link and click
	// on it***//

	public boolean signin() {
		boolean status = true;
		try {

			status = hoverAndClick(lnk_Sign_in);

			if (status) {
				logEvent("Pass", "Sign in Link is clicked successfully");

			} else {
				logEvent("Fail", "Sign in Link is not clicked successfully");
			}

		} catch (Exception e) {
			status = false;
		}
		
		return status;

	}

}
