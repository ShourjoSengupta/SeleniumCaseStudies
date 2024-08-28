package MTV33;

import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import au.com.bytecode.opencsv.CSVReader;

public class ParameterisationUsingApachePoi {
	String path = "./CSV File/CSV.csv";
	WebDriver driver;
	
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
	}
	
	@Test
	public void Example() throws Exception{
		Assert.assertEquals("Your Store", driver.getTitle());
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		Assert.assertEquals("Register Account",driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText());
		
//		File src = new File("C:\\Users\\Administrator\\Desktop\\Files\\Shourjo.xlsx");
//		FileInputStream fis = new FileInputStream(src);
//		
//		XSSFWorkbook wb = new XSSFWorkbook(fis);
//		XSSFSheet sheet1 = wb.getSheetAt(0);
//		}
//		reader.close();
		
		driver.close();
	}
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
