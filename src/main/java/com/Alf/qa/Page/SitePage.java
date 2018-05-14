package com.Alf.qa.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Alf.qa.Base.TestBaseClass;

public class SitePage extends TestBaseClass {
	
	@FindBy(xpath="//span[@id='HEADER_SITES_MENU_text']")
	WebElement sitePage;
	
	public SitePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String SitePageMethod() {
		sitePage.click();
		System.out.println("====Title of site==" + driver.getTitle());
		return driver.getTitle();
	}

}
