import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.corba.se.spi.orbutil.fsm.Action;

public class CopyPastJava {

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		

		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("java",Keys.ENTER);
		String s1=driver.getTitle();
		System.out.println(s1);
		WebElement java=driver.findElement(By.xpath("//div[@class=\"kno-ecr-pt PZPZlf gsmt\"]/span[contains(.,'Java')]"));
		Actions a=new Actions(driver);
		a.doubleClick(java).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);	
		r.keyRelease(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);	
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		String url=driver.getTitle();
		System.out.println("second tab" +url);
		if (s1.equals(url))
		{
			System.out.println("sucessfull");
		}
		else
		{
			System.out.println("unsucessfull");
		}
				
	}}
