package com.Alf.qa.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.Alf.qa.Base.TestBaseClass;

public class FileDownload  extends TestBaseClass {
	
	public void downloadFile() throws Exception {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='HEADER_SEARCHBOX_FORM_FIELD']")).sendKeys("rr.txt");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='HEADER_SEARCHBOX_FORM_FIELD']")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@id='workspace://SpacesStore/0dd81275-7a72-4f50-9475-38bf54dcf563']")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//span[@id='PdfJs_DOWNLOAD_MENU_text']")).click();
	}

}
