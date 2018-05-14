package com.Alf.qa.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Alf.qa.Base.TestBaseClass;

public class MyFilePage extends TestBaseClass {
	
	@FindBy(xpath="//div[@id='HEADER_MY_FILES']")
	WebElement myFile;
	
//	@FindBy(xpath="//span[@class='alfresco-header-Title__text has-max-width']")
//	WebElement MyfileTitle;
//
//	@FindBy(xpath="//ul[@style='display: block;']")
//	WebElement FolderList;
	
	
	public MyFilePage() {
		PageFactory.initElements(driver, this);
	}
		public String clickMyFilePage() {
			myFile.click();
			System.out.println("====home page clicked====" + driver.getTitle());
			return driver.getTitle();
	}
}
