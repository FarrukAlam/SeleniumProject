package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.Base;
import com.pageobjectmodel.SigninPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignIn extends Base{
	SigninPage sp;

	@Given("^user is able to go to home page$")
	public void user_is_able_to_go_to_home_page() throws Throwable {
		getdriver();
		
		sp=PageFactory.initElements(driver, SigninPage.class);
	}

	@When("^user can enter e-mail$")
	public void user_can_enter_e_mail() throws Throwable {
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ummul@gmail.com");
	   //driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
	   //driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("username@email.com");
	   //driver.findElement(By.xpath("//input[@id='continue']")).click();
		sp.getsignin();
		sp.getusername();
	}

	@When("^user can enter password$")
	public void user_can_enter_password() throws Throwable {
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123abc");
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("123abc");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	}

	@When("^user can click on log-in button$")
	public void user_can_click_on_log_in_button() throws Throwable {
	    //driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
	}

	@Then("^login should be successful$")
	public void login_should_be_successful() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
		System.out.println(driver.getTitle());
	   
	}
	
}
