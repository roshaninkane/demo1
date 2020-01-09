import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {

	public static void main(String[] args) throws InterruptedException
	{
		double i=0;
		
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
		WebElement search=driver.findElement(By.xpath("//input[@class=\"LM6RPg\"]"));
		search.sendKeys("c#",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"_3ywJNQ\"]/div[contains(.,'Price -- Low to High')]")).click();

	}

}
