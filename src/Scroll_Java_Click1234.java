import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class Scroll_Java_Click1234 {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		  JavascriptExecutor js =(JavascriptExecutor)driver;
		driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("java",Keys.ENTER);
		WebDriverWait ww=new WebDriverWait(driver,50);
		do
		{
		  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//for to down
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//span[@style=\"display:block;margin-left:53px\"]")).click();
		}while(ww.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Next']")))!=null);	  
	}

}
