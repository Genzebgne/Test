package com.Alf.qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Alf.qa.Base.TestBaseClass;
import com.Alf.qa.Page.LoginPage;
import com.Alf.qa.Page.MyFilePage;

public class MyFilePageTest extends TestBaseClass {
	LoginPage log;
	MyFilePage myfile;
	
	public MyFilePageTest() {
		super();
	}

	
	@BeforeMethod
	public void setUp() {
		initialization();
		log = new LoginPage();
		log.login(com.getProperty("user"), com.getProperty("pass"));
	
	}
	
	@Test(priority=1)
	public void VerifyHomePageTitleTest() throws Exception {
		myfile = new MyFilePage();
		myfile.clickMyFilePage();
		
		myfile.verifyElements();
		System.out.println("=== The following folders are foun in my file dropdown===");
		myfile.VerifyFileFolder();
		myfile.upload();
	}
	
//	@Test(priority=2)
//	public void ListSubtitles() {
//		
//	}
//	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
}
