package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thanos {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("thanos",Keys.ENTER);
	WebElement q=	driver.findElement(By.xpath("//div[@id=\"resultStats\"]"));
	System.out.println(q.getText());
	driver.findElement(By.xpath("//canvas[@jsname=\"wvK4k\"]")).click();
	WebElement q1=driver.findElement(By.xpath("//div[@id=\"resultStats\"]"));
	Thread.sleep(2000);
	System.out.println(q1.getText());
	
	


	}

}
