package org.qsp.testpom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.pom.FlipkartSearch;

public class Flipkart_test {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		FlipkartSearch fh=new FlipkartSearch(driver);
		Thread.sleep(2000);
		fh.searchTxt("iphone");
		fh.clickB();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		fh.searchTxt("nike");
		fh.clickB();
		

	}

}
