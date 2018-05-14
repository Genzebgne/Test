package com.Alf.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Alf.qa.Base.TestBaseClass;
import com.Alf.qa.Page.LoginPage;

public class LoginPageTest extends TestBaseClass {
	 LoginPage log ;
	public LoginPageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		 log = new LoginPage();
	}
	
	@Test(priority=1)
	public void LoginPageTitleTest() {
    log.validateLoginPageTitle();
    Assert.assertEquals(driver.getTitle(), "Alfresco » Login");
	}
	
	@Test(priority=2)
	public void AlfrescoLogoTest() {
		boolean flag = log.ValidateLogo();
		Assert.assertTrue(flag);
		
	}
	@Test(priority=3)
	public void LoginTest() {
		log.login(com.getProperty("user"), com.getProperty("pass"));
		System.out.println("Title After login" + driver.getTitle());
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
