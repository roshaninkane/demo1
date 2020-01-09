import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_search_java {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		WebElement ele=driver.findElement(By.xpath("//input[@class=\"gsc-input\"]"));
		ele.sendKeys("testNG",Keys.ENTER);
		driver.navigate().back();
		Thread.sleep(2000);
				
		ele.sendKeys("java",Keys.ENTER);
	}

}
