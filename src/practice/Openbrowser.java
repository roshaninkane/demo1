package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowser {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("lanching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/");
		Thread.sleep(2000);
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		driver.navigate().to("https://accounts.google.com/");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
		
	}
}
