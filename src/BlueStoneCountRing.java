import java.io.IOException;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.function.IntConsumer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class BlueStoneCountRing {

	public static void main(String[] args)  throws InterruptedException, IOException
	{
		
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
	int count=0;
		WebDriver driver = new ChromeDriver();
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
	
		WebElement q=driver.findElement(By.xpath("//input[@id=\"search_query_top_elastic_search\"]"));
		
		q.sendKeys("rings",Keys.ENTER);
		String name = null;
		ScreenShotvoidMethod.screenshot(driver, name);
		List<WebElement> ct=driver.findElements(By.xpath("//img[@class=\"hc img-responsive center-block\"]"));
		for(WebElement item:ct)
		{
			count++;
		}
		System.out.println(count);
	}

}
