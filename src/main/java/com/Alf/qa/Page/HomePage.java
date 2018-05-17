package com.Alf.qa.Page;
import org.openqa.selenium.By;
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
	public String Clickhomebutton() {
		HomeBtn.click();
		System.out.println("==== I click home button and go to home page ====" );
		return driver.getTitle(); 	    }
	
	public String ListPageSubTitles() {
		java.util.List<WebElement> element = driver.findElements(By.xpath("//div[@class='title']"));
		for(WebElement elem:element) {
			String innername = elem.getText();
			System.out.println(innername);
		}

		return subtitles.getText();

	}
	public void HomePageObjects() {
		java.util.List<WebElement> homeElem =driver.findElements(By.xpath("//span[@class='first-child']"));
		for(WebElement Elem:homeElem) {
			String elemm = Elem.getText();
			System.out.println(elemm);
			
		
	}

}
}
