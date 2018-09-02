package lib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest implements Constants {
	public WebDriver driver;

	@BeforeMethod(alwaysRun=true)
	@Parameters("mBrowser")
	public void launch(String mBrowser) {
		if (mBrowser.equals("chrome")) {
			System.setProperty(CHROME_KEY, CHROME_PATH);
			driver=new ChromeDriver();
		} else {
			System.setProperty(GECKO_KEY, GECKO_PATH);
			driver=new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	@AfterMethod(alwaysRun=true)
	public void closeBrowser() {
		driver.quit();
	}
	
	

}
