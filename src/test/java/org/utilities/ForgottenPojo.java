package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgottenPojo extends BaseClass{
	public ForgottenPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement frgtPass;
	
	@FindBy(xpath="//input[@id='identify_email']")
	private WebElement inputMob;
	
	@FindBy(xpath="//button[@name='did_submit']")
	private WebElement clckSrch;

	public WebElement getFrgtPass() {
		return frgtPass;
	}

	public WebElement getInputMob() {
		return inputMob;
	}

	public WebElement getClckSrch() {
		return clckSrch;
	}
	
	
	

}
