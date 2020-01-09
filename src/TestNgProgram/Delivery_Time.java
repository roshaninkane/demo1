package TestNgProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Delivery_Time 

	{
		@Test
		private void pubi() throws InterruptedException
		{

	System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	Reporter.log("launching browser",true);
	driver.manage().window().maximize();
	driver.get("https://www.bluestone.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("search_query_top_elastic_search")).sendKeys("rings",Keys.ENTER);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,200)");
	Actions a=new Actions(driver);
	//driver.findElement(By.xpath("//section[@class=\"block\"]/span[contains(.,'Price')]")).click();
	//driver.findElement(By.xpath("//span[@data-tagcategory=\"Price\"]")).click();
	WebElement price=driver.findElement(By.xpath("//div[@class=\"top-filter-blocks\"]/section[@id=\"Price-form\"]"));
	a.moveToElement(price).perform();
	Thread.sleep(2000);
	WebElement count=driver.findElement(By.xpath("//span[contains(.,' Below ')]/span[@class=\"items-count\"]"));
	
	Reporter.log(count.getText(),true);

	driver.findElement(By.xpath("//a[contains(.,'Next Day Delivery')]")).click();
	
	WebElement next_delivery=driver.findElement(By.xpath("//span[@class=\"total-designs\"]"));
	Reporter.log(next_delivery.getText(),true);
	

}
}