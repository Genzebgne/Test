package com.Alf.qa.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Alf.qa.Base.TestBaseClass;

public class SharedFilePage extends TestBaseClass {
	
	@FindBy(xpath="//span[@id='HEADER_SHARED_FILES_text']")
	WebElement SharedFolder;
	
	@FindBy(xpath="//input[@id='HEADER_SEARCHBOX_FORM_FIELD']")
	WebElement search;
	
	@FindBy(xpath="//button[@id='template_x002e_documentlist_v2_x002e_sharedfiles_x0023_default-fileUpload-button-button']")
	WebElement upload;
	
	
	
	public SharedFilePage() {
		PageFactory.initElements(driver, this);
	}
	public String VerifySharedFolderTitle() {
		SharedFolder.click();
		System.out.println("==Title of Shared Folder==" + driver.getTitle());
		return driver.getTitle();
		
	}
	public void topTitles() {
		java.util.List<WebElement> homeElem =driver.findElements(By.xpath("//div[@class='header-bar flat-button theme-bg-2']"));
		for(WebElement Elem:homeElem) {
			String ele = Elem.getText();
			System.out.println(ele);
		}
		
	
	}
	public void SideDropdown() {
		
		java.util.List<WebElement> homeElem =driver.findElements(By.xpath("//div[@class='yui-b yui-resize']"));
		for(WebElement Elem:homeElem) {
			String ele = Elem.getText();
			System.out.println(ele);
		}
		
		
	}
	public void searchFileMethod() throws Exception {
		search.sendKeys("testfile");
		Thread.sleep(3000);
		search.sendKeys(Keys.ENTER);
	}

}
