package com.Alf.qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Alf.qa.Base.TestBaseClass;
import com.Alf.qa.Page.FileDownload;
import com.Alf.qa.Page.LoginPage;
import com.Alf.qa.Page.SharedFilePage;

public class downloadTest extends TestBaseClass {

	LoginPage log;
	SharedFilePage shared;
	FileDownload load;
	
	public downloadTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		log = new LoginPage();
		log.login(com.getProperty("user"), com.getProperty("pass"));
	
	}
	@Test
	public void downloadMethod() throws Exception {
		load = new FileDownload();
		shared = new SharedFilePage();
		shared.VerifySharedFolderTitle();
		load.downloadFile();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	}
