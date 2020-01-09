package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone {

	public static void main(String[] args) throws InterruptedException
	 
	{

		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//a[@title=\"Gold Mine 10+1 Monthly Plan\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"Start Now\"]")).click();
		WebElement s1=driver.findElement(By.xpath("//label[contains(.,'Enter Email address')]"));
		
		WebElement s2=driver.findElement(By.xpath("//ul[@id=\"Email_error\"]"));
		
		
		if (s1.equals(s2))
		{
			System.out.println("no error");
			
		}
		else {
			
			System.out.println(s2.getText());
			driver.close();
		}
		}
		
		
		

	}
