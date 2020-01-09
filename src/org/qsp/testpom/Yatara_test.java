package org.qsp.testpom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.qsp.pom.Yartra;
import org.testng.annotations.Test;

public class Yatara_test 
{
@Test
private void pu() throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver(co);
	System.out.println("launching browser");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.yatra.com/");
	
	Yartra y=new Yartra(driver);
	y.de();
	//Thread.sleep(2000);
	y.loc1();
	Thread.sleep(2000);
	y.loc2();
	y.date();
    Thread.sleep(2000);
	   JavascriptExecutor js =(JavascriptExecutor)driver;
	 WebElement p=  driver.findElement(By.id("13/02/2020"));
	 js.executeScript("arguments[0].scrollIntoView()", p);
	y.return1();
	y.Economy1();
	y.passengers();
	 



}
}
