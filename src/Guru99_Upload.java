import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99_Upload {

	public static void main(String[] args)throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("launching browser");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://demo.guru99.com/test/upload/");
	
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//body[@style=\"margin: 0px;\"]")).click();
		driver.findElement(By.id("file_wraper0")).click();
		Thread.sleep(2000);
		Runtime rt=Runtime.getRuntime();
		rt.exec("‪‪‪C:\\Users\\HP\\Desktop\\outofbox.au4.exe");
		

	}

}
