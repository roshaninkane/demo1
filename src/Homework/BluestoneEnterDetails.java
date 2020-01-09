package Homework;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class BluestoneEnterDetails {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("launching browser");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//a[@title=\"Gold Mine 10+1 Monthly Plan\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"amount\"]")).sendKeys("1000");
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("roshan.inkane235@gmail.com");
		driver.findElement(By.xpath("//input[@value=\"Start Now\"]")).click();
		WebElement w=driver.findElement(By.xpath("//input[@name=\"email\"]"));
		Thread.sleep(10000);
		System.out.println(w.getText());
		//driver.close();
		
	
		
	}

}
