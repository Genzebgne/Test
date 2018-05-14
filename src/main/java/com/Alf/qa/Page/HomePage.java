package com.Alf.qa.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Alf.qa.Base.TestBaseClass;

public class HomePage extends TestBaseClass {

		@FindBy(xpath = "//a[@href='/share/page/..']")
		WebElement HomeBtn;
	
		@FindBy(xpath = "//div[@class='title']")
		WebElement subtitles;
	
		@FindBy(xpath = "")
		WebElement loginBtn;
	
		@FindBy(xpath="")
		WebElement AlfrescoLogo;
	
	    public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public String VerifyHomePageTitle() {
		HomeBtn.click();
		System.out.println("====home page clicked====" + driver.getTitle());
		return driver.getTitle();
		
	}
	public String ListPageSubTitles() {
		String taggs =subtitles.getText();
		System.out.println("===titles are ==" + taggs);
		return subtitles.getText();
		
	}

}
