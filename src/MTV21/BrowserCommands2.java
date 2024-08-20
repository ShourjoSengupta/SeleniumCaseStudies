package MTV21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrowserCommands2 {
	WebDriver driver;

	@Test(priority = 1)
	public void ChromeBrowserLaunch() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String s = driver.getTitle();
		System.out.println("Title: " + s);
		System.out.println("Title Length: " + s.length());

		String p = driver.getPageSource();
		System.out.println("PageSource: " + p);
		System.out.println("PageSource: " + p.length());
		
		driver.navigate().to("https://demo.opencart.com/");
		s = driver.getTitle();
		System.out.println("Title: " + s);
		System.out.println("Title Length: " + s.length());
		p = driver.getPageSource();
		System.out.println("PageSource: " + p);
		System.out.println("PageSource: " + p.length());
		
		driver.navigate().to("http://www.bing.com");
		s = driver.getTitle();
		System.out.println("Title: " + s);
		System.out.println("Title Length: " + s.length());
		p = driver.getPageSource();
		System.out.println("PageSource: " + p);
		System.out.println("PageSource: " + p.length());
		
		driver.navigate().to("https://www.freecrm.com/");
		s = driver.getTitle();
		System.out.println("Title: " + s);
		System.out.println("Title Length: " + s.length());
		p = driver.getPageSource();
		System.out.println("PageSource: " + p);
		System.out.println("PageSource: " + p.length());
		
		driver.navigate().to("http://www.half.ebay.com");
		s = driver.getTitle();
		System.out.println("Title: " + s);
		System.out.println("Title Length: " + s.length());
		p = driver.getPageSource();
		System.out.println("PageSource: " + p);
		System.out.println("PageSource: " + p.length());
		
		driver.quit();
	}

	@Test(priority = 2)
	public void FirefoxBrowserLaunch() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./FirefoxDriverJars/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String s = driver.getTitle();
		System.out.println("Title: " + s);
		System.out.println("Title Length: " + s.length());

		String p = driver.getPageSource();
		System.out.println("PageSource: " + p);
		System.out.println("PageSource: " + p.length());
		
		driver.navigate().to("https://demo.opencart.com/");
		s = driver.getTitle();
		System.out.println("Title: " + s);
		System.out.println("Title Length: " + s.length());
		p = driver.getPageSource();
		System.out.println("PageSource: " + p);
		System.out.println("PageSource: " + p.length());
		
		driver.navigate().to("http://www.bing.com");
		s = driver.getTitle();
		System.out.println("Title: " + s);
		System.out.println("Title Length: " + s.length());
		p = driver.getPageSource();
		System.out.println("PageSource: " + p);
		System.out.println("PageSource: " + p.length());
		
		driver.navigate().to("https://www.freecrm.com/");
		s = driver.getTitle();
		System.out.println("Title: " + s);
		System.out.println("Title Length: " + s.length());
		p = driver.getPageSource();
		System.out.println("PageSource: " + p);
		System.out.println("PageSource: " + p.length());
		
		driver.navigate().to("http://www.half.ebay.com");
		s = driver.getTitle();
		System.out.println("Title: " + s);
		System.out.println("Title Length: " + s.length());
		p = driver.getPageSource();
		System.out.println("PageSource: " + p);
		System.out.println("PageSource: " + p.length());
		
		driver.quit();
	}

	@Test(priority = 3)
	public void EdgeLaunch() throws Exception {
		System.setProperty("webdriver.edge.driver", "./EdgeDriverJars/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String s = driver.getTitle();
		System.out.println("Title: " + s);
		System.out.println("Title Length: " + s.length());

		String p = driver.getPageSource();
		System.out.println("PageSource: " + p);
		System.out.println("PageSource Length: " + p.length());
		
		driver.navigate().to("https://demo.opencart.com/");
		s = driver.getTitle();
		System.out.println("Title: " + s);
		System.out.println("Title Length: " + s.length());
		p = driver.getPageSource();
		System.out.println("PageSource: " + p);
		System.out.println("PageSource Length: " + p.length());
		
		driver.navigate().to("http://www.bing.com");
		s = driver.getTitle();
		System.out.println("Title: " + s);
		System.out.println("Title Length: " + s.length());
		p = driver.getPageSource();
		System.out.println("PageSource: " + p);
		System.out.println("PageSource Length: " + p.length());
		
		driver.navigate().to("https://www.freecrm.com/");
		s = driver.getTitle();
		System.out.println("Title: " + s);
		System.out.println("Title Length: " + s.length());
		p = driver.getPageSource();
		System.out.println("PageSource: " + p);
		System.out.println("PageSource Length: " + p.length());
		
		driver.navigate().to("http://www.half.ebay.com");
		s = driver.getTitle();
		System.out.println("Title: " + s);
		System.out.println("Title Length: " + s.length());
		p = driver.getPageSource();
		System.out.println("PageSource: " + p);
		System.out.println("PageSource Length: " + p.length());
		
		driver.quit();
	}

}
