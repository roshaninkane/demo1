import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleJavaSearch {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("java");
		Thread.sleep(2000);
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class=\"erkvQe\"]/li"));
		for(WebElement page:list)
		{
			System.out.println(page.getText());
		}
		driver.findElement(By.xpath("//li[@data-view-type=\"1\"]//div[@class=\"sbl1\"]//b[contains(.,'script')]")).click();
	}
}
	
