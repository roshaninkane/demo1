import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStoneRings {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		ScreenShotvoidMethod.screenshot(driver, "bluestonemain");
		
		Thread.sleep(2000);
		WebElement wwe=driver.findElement(By.xpath("//a[contains(.,'Rings ')]"));
		ScreenShotvoidMethod.screenshot(driver, "rigs");

		Actions a=new Actions(driver);
		a.moveToElement(wwe).perform();
		driver.findElement(By.xpath("//a[@title=\"Diamond Rings\"]")).click();
		Thread.sleep(2000);
		ScreenShotvoidMethod.screenshot(driver, "diamondsring");
		driver.findElement(By.xpath("//span[contains(.,'Price')]")).click();
		Thread.sleep(2000);
		
		List<WebElement> item = driver.findElements(By.xpath("//form[@id=\"price\"]"));
		for(WebElement  price:item)
		{
			ScreenShotvoidMethod.screenshot(driver, "3");
		System.out.println(price.getText());//list of price disapaly
		}
	}

}
