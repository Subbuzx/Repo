package com.hrms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	WebDriver driver;
	@Given("OpenApplication")
	public void open_application() {
	   driver = new ChromeDriver();
	   WebDriverManager.chromedriver().setup();
	}

	@When("openLinks")
	public void open_links() {
	    driver.get("https://www.google.com/");
	    
	}

	@And("VerifyTitle")
	public void verify_title() {
	    System.out.println(driver.getTitle());
	}

	@Then("CloseApplication")
	public void close_application() {
	   driver.close();
	}


}
