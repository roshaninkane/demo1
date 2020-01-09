import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.naukri.com/");
		System.out.println("loading url");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(driver.getTitle());
		//driver.close();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> wins = driver.getWindowHandles();
		System.out.println(wins.getClass());
		wins.remove(parent);
		for(String win : wins)
		{
			System.out.println(win);
			driver.switchTo().window(win);
			driver.close();
		}
	}
}