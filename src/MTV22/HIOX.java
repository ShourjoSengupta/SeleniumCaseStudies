package MTV22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class HIOX {
	
	@Test
	public void example()throws Exception {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","./ChromeDriverJars/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.login.hiox.com/register?referrer=easycalculation.com");
	driver.manage().window().maximize();
	String s = driver.getTitle();
	System.out.println("Title: " + s);
	System.out.println("Title Length: " + s.length());

	String p = driver.getPageSource();
	System.out.println("PageSource: " + p);
	System.out.println("PageSource: " + p.length());
	
	driver.close();
	
	}

}
