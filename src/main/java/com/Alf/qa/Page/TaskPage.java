package com.Alf.qa.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Alf.qa.Base.TestBaseClass;

public class TaskPage extends TestBaseClass {
	
	@FindBy(xpath="//span[@id='HEADER_TASKS_text']")
	WebElement task;

	public TaskPage() {
		PageFactory.initElements(driver, this);
	}
	
}
