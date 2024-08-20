package MTV21;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./EdgeDriverJars/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.hollandandbarrett.com/u/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.quit();
		}

}
