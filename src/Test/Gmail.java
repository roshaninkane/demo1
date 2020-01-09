package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com/");
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("roshan.inkane23594@gmail.com");
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.id("identifierNext"));
		button.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	    WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("98979695",Keys.ENTER);
		

	}

}
