package MTV22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InMotionHosting {
	@Test
	public void example()throws Exception {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","./ChromeDriverJars/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	String s = driver.getTitle();
	System.out.println("Title: " + s);
	System.out.println("Title Length: " + s.length());
	
	String url = driver.getCurrentUrl();
	System.out.println("Url= "+ url);

	String p = driver.getPageSource();
	System.out.println("PageSource: " + p);
	System.out.println("PageSource: " + p.length());
	
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("Total links = "+ links.size());
	
	for(int i=0;i<links.size();i++) {
		System.out.println("links: " + links.get(i).getAttribute("href"));
		System.out.println("link texts: " + links.get(i).getText());
	}
	
	driver.close();

}
	}
