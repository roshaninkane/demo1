

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Urbanladder1 {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class=\"close-reveal-modal hide-mobile\"]")).click();
		// WebElement text=driver.findElement(By.xpath("//span[contains(.,'Sale')]"));
		// System.out.println(text.getText());
		Thread.sleep(2000);
		List<WebElement> menu = driver.findElements(By.xpath("//ul[@class=\"topnav bodytext\"]/li"));
		Actions a = new Actions(driver);

		for (WebElement item : menu) {
			System.out.println(item.getText());
			String name = item.getText();
			Thread.sleep(1000);
			a.moveToElement(item).build().perform();
			Thread.sleep(1000);
			ScreenShotvoidMethod.screenshot(driver, name);
			Thread.sleep(1000);
			List<WebElement> display = driver.findElements(
					By.xpath("//span[contains(.,'" + name + "')]/parent::li/descendant::ul[@class=\"taxonslist\"]"));
			for (WebElement subitemname : menu) {
				System.err.println(subitemname.getText());
			}
		}
	}
}
