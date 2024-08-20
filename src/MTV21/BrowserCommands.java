package MTV21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrowserCommands {
	WebDriver driver;

	@Test(priority = 1)
	public void ChromeBrowserLaunch() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String s = driver.getTitle();
		System.out.println("Title: "+s);
		System.out.println("Title Length: "+s.length());
		
		String p = driver.getPageSource();
		System.out.println("PageSource: "+p);
		System.out.println("PageSource: "+p.length());
		driver.quit();
	}

	@Test(priority = 2)
	public void FirefoxBrowserLaunch() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./FirefoxDriverJars/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String s = driver.getTitle();
		System.out.println("Title: "+s);
		System.out.println("Title Length: "+s.length());
		
		String p = driver.getPageSource();
		System.out.println("PageSource: "+p);
		System.out.println("PageSource: "+p.length());
		driver.quit();
	}

	@Test(priority = 3)
	public void EdgeLaunch() throws Exception {
		System.setProperty("webdriver.edge.driver", "./EdgeDriverJars/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("http://automationpractice.com/index.php/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String s = driver.getTitle();
		System.out.println("Title: "+s);
		System.out.println("Title Length: "+s.length());
		
		String p = driver.getPageSource();
		System.out.println("PageSource: "+p);
		System.out.println("PageSource: "+p.length());
		driver.quit();
	}
}
