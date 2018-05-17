package com.Alf.qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Alf.qa.Base.TestBaseClass;
import com.Alf.qa.Page.LoginPage;
import com.Alf.qa.Page.SharedFilePage;

	public class SharedFolderTest extends TestBaseClass {
		LoginPage log;
		SharedFilePage shared;
		public SharedFolderTest() {
			super();
		}
	
		@BeforeMethod
		public void setUp() throws Exception {
			initialization();
			log = new LoginPage();
			log.login(com.getProperty("user"), com.getProperty("pass"));
			Thread.sleep(4000);
		}
		@Test(priority=1)
		public void SharedTest() throws Exception {
			shared= new SharedFilePage();
			shared.VerifySharedFolderTitle();
			shared.topTitles();
			shared.SideDropdown();
			Thread.sleep(4000);
			shared.searchFileMethod();
			Thread.sleep(4000);
		}
	
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
	}
