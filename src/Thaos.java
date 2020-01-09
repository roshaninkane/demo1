import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thaos {

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
		 JavascriptExecutor js =(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,600)");
		 Thread.sleep(1000);
		 
		// WebElement p=  driver.findElement(By.xpath("//canvas[@jsname=\"wvK4k\"]"));
	//	 js.executeScript("arguments[0].scrollIntoView()", p);
		// Thread.sleep(1000);
		 driver.findElement(By.xpath("//canvas[@jsname=\"wvK4k\"]")).click();
		
	}

}
