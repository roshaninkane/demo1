package TestNgProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listner.class)
public class Google_search 
{
	static WebDriver driver;
@BeforeMethod
private void beforM() 
{
	System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	
}
@Test
private void demo() 
{
	driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
	Reporter.log("demo",true);

}
@Test
private void demo1() 
{

	driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
	Reporter.log("demo1",true);



}
@AfterMethod
private void afterM()
{driver.close();
}
}
