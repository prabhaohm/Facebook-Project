package org.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;
import org.utilities.ForgottenPojo;
import io.cucumber.java.en.*;

public class ForgottenStepDefenition extends BaseClass {

	@Given("User should open chrome browser and load url")
	public void userShouldOpenChromeBrowserAndLoadUrl() {
		launchChrome();
		loadUrl("https://www.facebook.com");
		winMax();

	}

	@When("User should click the forgotten password link")
	public void userShouldClickTheForgottenPasswordLink() {

		ForgottenPojo f = new ForgottenPojo();
		WebElement frgtPass = f.getFrgtPass();
		clickjs(frgtPass);

	}

	@When("User should input invalid mobile number on the textbox")
	public void userShouldInputInvalidMobileNumberOnTheTextbox() {
		ForgottenPojo f = new ForgottenPojo();
		WebElement inputMob = f.getInputMob();
		inputMob.sendKeys("0123456789");

	}

	@When("User should click the search button")
	public void userShouldClickTheSearchButton() {
		ForgottenPojo f = new ForgottenPojo();
		WebElement clckSrch = f.getClckSrch();
		f.clickjs(clckSrch);

	}

	@Then("User should navigate to recover page")
	public void userShouldNavigateToRecoverPage() {
		String current = driver.getCurrentUrl();
		Assert.assertTrue("check forgot", current.contains("Kavin"));
		System.out.println("Forgotten - Pass");

	}
}
