package com.Alf.qa.Page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Alf.qa.Base.TestBaseClass;

public class RepositoryPage extends TestBaseClass {

	@FindBy(xpath="//span[@id='HEADER_REPOSITORY_text']")
	WebElement repository;
	
	@FindBy(xpath="//div[@class='file-upload']")
    WebElement selecBtn;
	      public RepositoryPage() {
		  PageFactory.initElements(driver, this);
	         }
	public String repositoryTile() {
		repository.click();
		System.out.println("==Repository Page Title =" + driver.getTitle());
		return driver.getTitle();
		
		
	}
	
	public void RepositoryFolder() {
		java.util.List<WebElement> homeElem =driver.findElements(By.xpath("//div[@class='ygtvitem selected']"));
		for(WebElement Elem:homeElem) {
			String ele = Elem.getText();
			System.out.println(ele);
		}
	}
	public void DownloadFile() throws Exception {
		Robot robot = new Robot();
		selecBtn.click();
		
		WebElement elem = driver.findElement(By.xpath("//input[@class='dnd-file-selection-button']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", elem);
		
		
		robot.setAutoDelay(2000);

		StringSelection  stringselection = new StringSelection( "C:\\AllTest\\AutoTest\\src\\main\\java\\com\\Alf\\qa\\TestData\\test.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, stringselection);
		robot.setAutoDelay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		System.out.println("file upload succesfully");
		
	}
}
