package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
	
	public WebDriver driver;

	public SigninPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}//end of SigninPage() method
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	public WebElement signin;
	public void getsignin() {
		signin.click();
	}//end of getsignin()
	
	@FindBy(xpath="//input[@id='ap_email']")
	public WebElement username;
	public void getusername() {
		username.sendKeys("username@email.com");
	}//end of getusername()

}//end of class
