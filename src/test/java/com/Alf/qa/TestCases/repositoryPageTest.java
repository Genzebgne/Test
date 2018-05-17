package com.Alf.qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Alf.qa.Base.TestBaseClass;
import com.Alf.qa.Page.LoginPage;
import com.Alf.qa.Page.RepositoryPage;

public class repositoryPageTest extends TestBaseClass {
	LoginPage log;
	RepositoryPage repoPage;
	
	public repositoryPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
	initialization();
	log = new LoginPage();
	log.login(com.getProperty("user"), com.getProperty("pass"));
	}

	@Test
	public void VerifyRepositoryPage() throws Exception {
		 repoPage = new RepositoryPage();
		 repoPage.repositoryTile();
		 repoPage.RepositoryFolder();
		 repoPage.DownloadFile();
		 Thread.sleep(5000);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
}
