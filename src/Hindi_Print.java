import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hindi_Print {

	public static void main(String[] args)throws InterruptedException, IOException
	{

		  System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      System.out.println("open browser");
	      Thread.sleep(2000);
	      driver.manage().window().maximize();
	      driver.get("https://www.google.com/");
	      ScreenShotvoidMethod.screenshot(driver, "1st");
	      Thread.sleep(2000);
	      WebElement w=   driver.findElement(By.xpath("//a[contains(.,'हिन्दी')]"));
	       System.out.println(w.getText());
	       
	       driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys(w.getText());
	       Thread.sleep(2000);
	       List<WebElement>q=driver.findElements(By.xpath("//div[@class=\"sbl1\"]"));
	       for(WebElement o:q)
	       {
	    	  
	    	   
	    	   System.out.println(o.getText());
	    	   
	    	   
	       }
	       
	}
	}


	