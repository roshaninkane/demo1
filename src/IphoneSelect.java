import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IphoneSelect {

	public static void main(String[] args) throws InterruptedException
	{
	

		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
		String a1=driver.getTitle();
		System.out.println(a1);
		WebElement w=driver.findElement(By.name("q"));
		w.sendKeys("iphone",Keys.ENTER);
		String a2=driver.getTitle();
		System.out.println("iphone"+a2);
		Thread.sleep(2000);
		if (a1.equals(a2)) 
		{
			System.out.println("match title" +a2);
			
		}
		else {
			System.out.println("not match");
		}
		driver.findElement(By.xpath("//div[@data-id=\"MOBEMK62PN2HU7EE\"]/div[@class=\"_3liAhj\"]/descendant::a[@class=\"Zhf2z-\"]")).click();
	
		

	}

}
