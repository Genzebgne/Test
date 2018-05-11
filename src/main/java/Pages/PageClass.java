		package Pages;
		
		import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
		
		public class PageClass 
		{
			static WebDriver driver;
		
			public static void openUrl() 
			{
				//System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\driver\\geckodriver.exe");
				driver= new FirefoxDriver();
				driver.get("http://10.216.8.41:8080/share/page");
				System.out.println("=====Title beforelogin " +driver.getTitle());
			}
		}
