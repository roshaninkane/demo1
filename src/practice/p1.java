package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Pratik");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("123456");
		WebElement login = driver.findElement(By.id("loginbutton"));
		login.click();
		
	}
}
