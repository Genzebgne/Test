package com.Alf.qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Alf.qa.Base.TestBaseClass;
import com.Alf.qa.Page.HomePage;
import com.Alf.qa.Page.LoginPage;

public class HomePageTest extends TestBaseClass {
	LoginPage log;
	HomePage home;
	public HomePageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		log = new LoginPage();
		home =log.login(com.getProperty("user"), com.getProperty("pass"));
	}
	
	@Test(priority =1)
	public void HomePageTestMethod() {
		home.Clickhomebutton();
		home.ListPageSubTitles();
		home.HomePageObjects();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
}
