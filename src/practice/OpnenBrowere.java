package practice;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpnenBrowere {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("launching the browser");
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("java");
		Thread.sleep(2000);
	List<WebElement> list=	driver.findElements(By.xpath("//ul[@class=\"erkvQe\"]/li"));
	for(WebElement ww:list)
	{
		System.out.println(ww.getText());
	
	}
	System.out.println("__________________________________________");
		driver.findElement(By.xpath("//li[@data-view-type=\"1\"]/descendant::div[@class=\"sbl1\"]/span[contains(.,'jawa')]")).click();
		List<WebElement> l=driver.findElements(By.xpath("//div[@class=\"r\"]/descendant::h3[@class=\"LC20lb\"]"));
		for(WebElement w:l)
		{
			System.out.println(w.getText());
		}
		
	}}


	
	