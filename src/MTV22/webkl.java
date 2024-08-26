package MTV22;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class webkl {
	@Test
	public void example() throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://store.webkul.com");
		driver.manage().window().maximize();
		String s = driver.getTitle();
		System.out.println("Title: " + s);

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("./ScreenShots/google.png"));
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links = " + links.size());

		for (int i = 0; i < links.size(); i++) {
			System.out.println("links: " + links.get(i).getAttribute("href"));
			System.out.println("link texts: " + links.get(i).getText());
		}
		
		File sr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sr,new File("./ScreenShots/ss.png"));

		driver.close();

	}
}
