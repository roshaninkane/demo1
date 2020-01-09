package org.qsp.testpom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.pom.BlueStone_scrolldown;
import org.testng.annotations.Test;

public class Bluestone_scrolldown_test

{
@Test
 public void p() 
{

	System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	System.out.println("launching browser");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.bluestone.com/");
	BlueStone_scrolldown r=new BlueStone_scrolldown(driver);
	r.search_test("rings");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1500)");
	r.Top_click();
}
}
