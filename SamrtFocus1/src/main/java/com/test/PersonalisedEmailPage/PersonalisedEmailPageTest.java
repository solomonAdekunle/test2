package com.test.PersonalisedEmailPage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Connector.WebConnector;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PersonalisedEmailPageTest {
	
	Connector.WebConnector selenium= Connector.WebConnector.getInstance();
	
	
	@Given("^I navigate to \"([^\"]*)\" on \"([^\"]*)\"$")
	public void I_navigate_to_google(String URL, String browser){
	System.out.println("I navigate to" +URL+ "on"+ browser);
	selenium.openBrowser(browser);
	selenium.navigate(URL);
		}
	
	@When("^I enter  \"([^\"]*)\" as \"([^\"]*)\"$")
	public void I_enter_as(String object, String text) throws Throwable {
	    System.out.println("Entering "+object+ "value" +text);
		//Thread.sleep(2000L);
		selenium.type(text,object);
		
		}
	
	@And("^I click \"([^\"]*)\"$")
	public void I_click(String object) throws Throwable {
		System.out.println("clicking on"+object);
		selenium.click(object);
	
	}


	@When("^I click on the \"([^\"]*)\"$")
	public void I_click_on_the(String object) throws Throwable {
	System.out.println("clicking on"+object);
	selenium.click(object);
	}
	@Then("^I navigate to  the \"([^\"]*)\"$")
	public void I_navigate_to_the(String object) throws Throwable {
		System.out.println(" I navigate to" +object);
		Assert.assertTrue("Object not Found"+object,selenium.isElementPresent(object));
		
		
	}
	@And("^I hover on \"([^\"]*)\"$")
	public void I_hover_on(String webElementName) throws Throwable {
		System.out.println("move to "+webElementName);
	    WebElement e = selenium.PageElement2(webElementName);
		WebConnector.move(e);
		//selenium.click(webElementName);
	}
	@And("^I   click on the \"([^\"]*)\"$")
	public void I_click_on_(String object) throws Throwable {
		System.out.println("clicking on"+object);
		selenium.click(object);
	}
	
	@Then("^I  \"([^\"]*)\" element should be present$")
	public void I_element_should_be_present(String object) throws Throwable {
    	 Assert.assertTrue("Object not Found"+object,selenium.isElementPresent(object));
    	 
     }
}



