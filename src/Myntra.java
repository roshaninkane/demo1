import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args)  throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		List<WebElement> menu=driver.findElements(By.xpath("//div[@class=\"desktop-navLinks\"]/div"));
		Actions a=new Actions(driver);
		for (WebElement item :menu)
		{
			System.out.println(item.getText());
			a.moveToElement(item).build().perform();
		}
	}

}
