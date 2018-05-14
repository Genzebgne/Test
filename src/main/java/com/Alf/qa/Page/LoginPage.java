package com.Alf.qa.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Alf.qa.Base.TestBaseClass;

public class LoginPage extends TestBaseClass {
	
	@FindBy(xpath = "//input[@id='page_x002e_components_x002e_slingshot-login_x0023_default-username']")
	 WebElement username;
	
	@FindBy(xpath = "//input[@id='page_x002e_components_x002e_slingshot-login_x0023_default-password']")
	WebElement password;
	
	@FindBy(xpath = "//button[@id='page_x002e_components_x002e_slingshot-login_x0023_default-submit-button']")
	 WebElement loginBtn;
	
	@FindBy(xpath="//div[@class='theme-company-logo']")
	 WebElement AlfrescoLogo;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public  String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public  boolean ValidateLogo() {
		return AlfrescoLogo.isDisplayed();
	}
	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		System.out.println("===== Title after login ======"+ driver.getTitle());
		
		return new HomePage();
		
	}
	
}
