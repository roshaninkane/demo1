package org.qsp.testpom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.pom.BlueStone;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Bluestone_test
{


@Test
public void  Blue() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	System.out.println("launching browser");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.bluestone.com/");
	BlueStone bs=new BlueStone(driver);
	
	bs.search_test("rings");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,200)");
	Thread.sleep(2000);
	bs.click_price();
	Thread.sleep(1000);
	bs.below_click();
	Thread.sleep(1000);
	String str=String.valueOf(bs.countrings());
	Reporter.log(str,true);
	Thread.sleep(1000);
	bs.search_test("rings");
	Thread.sleep(1000);
	js.executeScript("window.scrollBy(0,200)");
	bs.metal_click();
	Reporter.log(bs.count_platanium(),true);
	bs.search_test("rings");
	bs.gender_click();
	js.executeScript("window.scrollBy(0,300)");
	
	Reporter.log(bs.women_c(),true);



}
}
	
