package MTV24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dropDownBox {
	WebDriver driver;
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void example() throws Exception{
		driver.navigate().to("https://www.facebook.com/campaign/landing.php?");
		WebElement day_dropdown  =driver.findElement(By.id("day"));
		Select day = new Select(day_dropdown);
		
		day.selectByIndex(12);
		WebElement option = day.getFirstSelectedOption();
		String dayindex = option.getText();
		System.out.println(dayindex);
		
		Thread.sleep(5000);
		day.selectByValue("12");
		option = day.getFirstSelectedOption();
		dayindex = option.getText();
		System.out.println(dayindex);
		Thread.sleep(5000);
		
		day.selectByVisibleText("13");
	    option = day.getFirstSelectedOption();
		dayindex = option.getText();
		System.out.println(dayindex);
		
		
		WebElement year_dropdown  =driver.findElement(By.id("year"));
		Select year = new Select(year_dropdown);
		
		year.selectByIndex(12);
		option = year.getFirstSelectedOption();
		String yearindex = option.getText();
		System.out.println(yearindex);
		
		Thread.sleep(5000);
		year.selectByValue("2002");
		option = year.getFirstSelectedOption();
		yearindex = option.getText();
		System.out.println(yearindex);
		Thread.sleep(5000);
		
		year.selectByVisibleText("2024");
	    option = year.getFirstSelectedOption();
		yearindex = option.getText();
		System.out.println(yearindex);
		
		List<WebElement> dayList = day.getOptions();
		System.out.println("Total Elements in the day: "+ dayList.size());
		for(WebElement i:dayList) {
			System.out.println(i.getText());
		}
		
		List<WebElement> yearList = year.getOptions();
		System.out.println("Total Elements in the day: "+ yearList.size());
		for(WebElement i:yearList) {
			System.out.println(i.getText());
		}
		
		
		
		driver.quit();
		
		
		
		}
}


