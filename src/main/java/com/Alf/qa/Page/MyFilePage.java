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

public class MyFilePage extends TestBaseClass {

	@FindBy(xpath="//div[@id='HEADER_MY_FILES']")
	WebElement myFile;


	@FindBy(xpath="//button[@id='template_x002e_documentlist_v2_x002e_myfiles_x0023_default-fileUpload-button-button']")
	WebElement fileupload;
	

	public MyFilePage() {
		PageFactory.initElements(driver, this);
	}
	public String clickMyFilePage() {
		     myFile.click();
		     System.out.println("====Here is My File Page ====" + driver.getTitle());
		     return driver.getTitle();
	}
	public void verifyElements() {
		    java.util.List<WebElement> homeElem =driver.findElements(By.xpath("//div[@class='yui-b yui-resize']"));
		    for(WebElement Elem:homeElem) {
			String ele = Elem.getText();
			System.out.println(ele);
		}
	}
	
	public void VerifyFileFolder() {
		    java.util.List<WebElement> homeElem = driver.findElements(By.xpath("//div[@class='treeview filter']"));
		    for(WebElement Folder:homeElem) {
			String eme = Folder.getText();
			System.out.println(eme);		}
	}
		
	public void upload() throws Exception {
			Robot robot = new Robot();
			fileupload.click();
			WebElement elem = driver.findElement(By.xpath("//input[@class='dnd-file-selection-button']"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", elem);
			
			robot.setAutoDelay(2000);
	
			StringSelection  stringselection = new StringSelection( "."+File.separator+"driver"+File.separator+"test.txt");
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
