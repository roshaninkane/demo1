package practice;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class p3 {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	System.out.println("launching browser");
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	WebElement us=driver.findElement(By.name("username"));
	us.sendKeys("admin");
	WebElement pass=driver.findElement(By.name("pwd"));
	pass.sendKeys("manager");
	WebElement enter=driver.findElement(By.id("loginButton"));
	enter.sendKeys(Keys.ENTER);
			
	
	
	
	
	
	
	
	

	}

}
