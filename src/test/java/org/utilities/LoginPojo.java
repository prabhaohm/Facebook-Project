package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	
	//1.Default constructor
	public LoginPojo() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="email")
	private WebElement txtuser;
	
	@FindBy(id="pass")
	private WebElement txtpass;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement btnLogin;

	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	
	
	
	

}
