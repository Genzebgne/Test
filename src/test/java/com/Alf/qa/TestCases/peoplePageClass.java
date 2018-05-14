package com.Alf.qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Alf.qa.Base.TestBaseClass;
import com.Alf.qa.Page.LoginPage;
import com.Alf.qa.Page.PeoplesPage;

public class peoplePageClass extends TestBaseClass {
  LoginPage log;
  PeoplesPage peoplepage;
  
  public peoplePageClass() {
	  super();
  }
  
  @BeforeMethod
  public void seUp() {
	  initialization();
	  log = new LoginPage();
	  log.login(com.getProperty("user"), com.getProperty("pass"));
  }
  
  @Test
  public void peoleMethod() {
	  peoplepage = new PeoplesPage();
	  peoplepage.PeoplePage();
  }
  
  @AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
}
