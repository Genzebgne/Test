package com.Alf.qa.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Alf.qa.Base.TestBaseClass;

public class RepositoryPage extends TestBaseClass {

	@FindBy(xpath="//span[@id='HEADER_REPOSITORY_text']")
	WebElement repository;

	      public RepositoryPage() {
		  PageFactory.initElements(driver, this);
	         }
	public String repositoryTile() {
		repository.click();
		System.out.println("==Repository Page Title =" + driver.getTitle());
		return driver.getTitle();
	}
}
