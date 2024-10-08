package MTV31;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hollandandbarrett.com");
	
	File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("./ScreenShots/hollandandbarrett.png"));
	driver.quit();
	
	}

}
