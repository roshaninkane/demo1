package org.qsp.testpom;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.qsp.pom.flipkart;

public class Test_Flipkart2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
	    
		flipkart fs=new flipkart(driver);
	fs.pop();
	fs.mousehover(driver);
	Thread.sleep(2000);
	fs.clickB();
	Thread.sleep(5000);
	fs.clickC();
	Thread.sleep(2000);
	Set<String>win=driver.getWindowHandles();
	for(String child:win)
	{
		driver.switchTo().window(child);
	}
	
	flipkart fs1=new flipkart(driver);
	fs.clickD();
		

		

}
}