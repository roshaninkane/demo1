package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

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
		Thread.sleep(3000);
		List<WebElement>it=driver.findElements(By.xpath("//ul[@jsname=\"erkvQe\"]//li/descendant::div[@class=\"sbl1\"]"));
		System.out.println(it.size());
		for(int i=0;i<it.size();i++)
		{
			System.out.println(it.get(i).getText());
			if(it.get(i).getText().contains("javatpoint"))
					{
				it.get(i).click();
					}
		}

	}

}
