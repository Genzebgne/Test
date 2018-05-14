package com.Alf.qa.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.Alf.qa.Util.TestUtil;

public class TestBaseClass {
	public static WebDriver driver;
	public static Properties com=null;
	public static FileInputStream src =null;

	public TestBaseClass() {
				
			com = new Properties();
			try {
			
			String filePath = "."+File.separator+"src"+File.separator+"main"+File.separator+"java"+File.separator+"com"+File.separator+"Alf"+File.separator+"qa"+File.separator+"config"+File.separator+"config.properties";
			src = new FileInputStream(System.getProperty("user", filePath));
			com.load(src);     

				}catch(FileNotFoundException e) {
				System.out.println("File not Found here ");
			}	catch (Exception e) {
				System.out.println("File not exist");		}
				}

	public static void initialization() {
				String browserName = com.getProperty("browser");
				if(browserName.equals("chrome")) {
					System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
					driver = new ChromeDriver();
				}else if (browserName.equals("Firefox")) {
					System.setProperty("webdriver.gecko.driver", "driver\\geckodriver.exe");
					driver = new FirefoxDriver();
				} else
				{
					System.setProperty("webdriver.gecko.driver","driver\\geckodriver.exe");
					FirefoxBinary firefoxBinary = new FirefoxBinary();
					firefoxBinary.addCommandLineOptions("--headless");
					FirefoxOptions firefoxOptions = new FirefoxOptions();
					firefoxOptions.setBinary(firefoxBinary);
					driver = new FirefoxDriver(firefoxOptions);
				}
				
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				//driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
				//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
				driver.get(com.getProperty("url"));


	}


}