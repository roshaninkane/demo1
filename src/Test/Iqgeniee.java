package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iqgeniee {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://iqgenie.org/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class=\"person fas fa-user-circle\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@target=\"_blank\"]")).click();
		String parent=driver.getWindowHandle();
		for(String child : driver.getWindowHandles())
		{
			driver.switchTo().window(child);//to swich parent withdow to child
		}
		String s=driver.getTitle();
		System.out.println(s);
	}
	
		
		
	}

