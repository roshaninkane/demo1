import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Guru99
{

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("launching browser");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/v1/index.php");
		driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
		Alert a= driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(a.getText());
		a.accept();
		
	}

}
