package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2 {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	System.out.println("lanching broweser");
	driver.manage().window().maximize();
	driver.navigate().to("https://accounts.google.com/");
	Thread.sleep(2000);
	driver.get("https://www.facebook.com/");
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	driver.close();
	
	
	
	
	
	

	}

}
