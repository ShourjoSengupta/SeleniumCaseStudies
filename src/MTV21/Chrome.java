package MTV21;
import org.openqa.selenium.chrome.ChromeDriver;
public class Chrome {
	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.hollandandbarrett.com/u/login");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.manage().window().minimize();
	Thread.sleep(2000);
	driver.quit();
	}
}
