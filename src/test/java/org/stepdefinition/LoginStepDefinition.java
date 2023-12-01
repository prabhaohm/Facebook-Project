package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

import io.cucumber.java.en.*;

public class LoginStepDefinition extends BaseClass{
	@Given("User should launch the chrome browser and load the url")
	public void user_should_launch_the_chrome_browser_and_load_the_url() {
		launchChrome();
		loadUrl("https://www.facebook.com");
		winMax();
	    
	}
	@When("User should input invalid username and invalid password in the textbox")
	public void userShouldInputInvalidUsernameAndInvalidPasswordInTheTextbox() {
	  
	
		LoginPojo l = new LoginPojo();
		WebElement txtuser = l.getTxtuser();
		WebElement txtpass = l.getTxtpass();
		fill(txtuser,"Greens");
		fill(txtpass, "Greens@123");
	   
	}

	@When("User should click the login button")
	public void user_should_click_the_login_button() throws InterruptedException {
		LoginPojo l = new LoginPojo();
		WebElement btnLogin = l.getBtnLogin();
		clickjs(btnLogin);
		Thread.sleep(2000);
	}
	@When("User should print current url of my page")
	public void userShouldPrintCurrentUrlOfMyPage() {
	   
	}

	@Then("User should navigate to incorrect credential page")
	public void user_should_navigate_to_incorrect_credential_page() {
		String current = driver.getCurrentUrl();
		Assert.assertTrue("Check Login Page", current.contains("privacy"));
		System.out.println("Test case pass");
		//closeChrome();
	    
	}
	@When("User should print the Title of the page")
	public void user_should_print_the_Title_of_the_page() {
	    printTitle();
	}
	
	@When("User should input valid username and invalid password in the textbox")
	public void userShouldInputValidUsernameAndInvalidPasswordInTheTextbox() {
	    
			LoginPojo l = new LoginPojo();
		WebElement txtuser = l.getTxtuser();
		WebElement txtpass = l.getTxtpass();
		fill(txtuser,"Ajay");
		fill(txtpass, "Greens@123");
	   
	}

	@When("User should print the current url of the page")
	public void userShouldPrintTheCurrentUrlOfThePage() {
	    printCurrentUrl();
	}

	@When("User should input invalid username{string} and valid password{string} in the textbox")
	public void userShouldInputInvalidUsernameAndValidPasswordInTheTextbox(String s1, String s2) {
		
		LoginPojo l = new LoginPojo();
		WebElement txtuser = l.getTxtuser();
		WebElement txtpass = l.getTxtpass();
		fill(txtuser,s1);
		fill(txtpass, s2);
	    
	}
	@When("User should input invalid username and invalid passworD in the textbox")
	public void userShouldInputInvalidUsernameAndInvalidPassworDInTheTextbox(io.cucumber.datatable.DataTable d) throws InterruptedException {
		
		LoginPojo l = new LoginPojo();
		WebElement txtuser = l.getTxtuser();
		WebElement txtpass = l.getTxtpass();
		
		//2D Map with Header
		
		List<Map<String, String>> mp = d.asMaps();
		
		Map<String, String> m = mp.get(2);
		//get(key);
		String userValue = m.get("Colour");
		
		Map<String, String> x = mp.get(0);
		String passValue = x.get("Fruits");
		
		fill(txtuser,userValue); //Red
		fill(txtpass,passValue ); //Apple 
		
		Thread.sleep(2000);
	   
	}
}
