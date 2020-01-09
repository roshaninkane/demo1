package TestNgProgram;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.formula.functions.Count;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Bluestone_rings_below_10000

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
	driver.findElement(By.xpath("//section[@class=\"block\"]/span[contains(.,'Price')]")).click();
	driver.findElement(By.xpath("//span[@data-tagcategory=\"Price\"]")).click();
	List<WebElement> cou=driver.findElements(By.xpath("//div[@class=\"inner pd-gray-bg\"]"));
	int count1=0;
	for(WebElement item:cou)
	{
		
		count1++;
	}
System.out.println(count1);

Thread.sleep(2000);

	
 int count2=0;
	driver.findElement(By.xpath("//a[contains(.,'Next Day Delivery')]")).click();
	List<WebElement> nxt=driver.findElements(By.xpath("//div[@class=\"p-image\"]"));
	for(WebElement delivery:nxt)
	{
		count2++;
	}
	System.out.println("next day delivery counyt :" +count2);
	
}
}