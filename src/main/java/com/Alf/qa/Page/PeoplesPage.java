package com.Alf.qa.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Alf.qa.Base.TestBaseClass;

public class PeoplesPage extends TestBaseClass {

	@FindBy(xpath="//span[@id='HEADER_PEOPLE_text']")
	WebElement people;
	
	public PeoplesPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String PeoplePage() {
		people.click();
		System.out.println("====Title of People Page==" + driver.getTitle());
		return driver.getTitle();
	}
}
