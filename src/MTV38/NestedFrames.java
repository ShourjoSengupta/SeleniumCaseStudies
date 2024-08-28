package MTV38;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {
	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("file:///C:/Users/Administrator/Downloads/NestedFrames.html");
	WebElement frame1 = driver.findElement(By.name("Selenium"));
	driver.switchTo().frame(frame1);
	System.out.println("Selenium: "+ driver.findElement(By.xpath("/html/body/div/main/section[1]/div/div/div/h1")).getText());
	driver.switchTo().parentFrame();

	driver.switchTo().frame(driver.findElement(By.name("Wiki")));
	System.out.println("Wikipedia: "+ driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/main/div[1]/h1/span")).getText());
	driver.switchTo().parentFrame();

	driver.switchTo().frame(driver.findElement(By.name("dictionary")));
	System.out.println("Dictionary: " + driver.findElement(By.xpath("//*[@id=\"word-of-the-day\"]/div/div[1]/h2")).getText());
	driver.switchTo().parentFrame();

	System.out.println(driver.getCurrentUrl());
	driver.close();
	}
}
