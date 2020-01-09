package Roshan_selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) throws InterruptedException
	
	{
	
         System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         System.out.println("launching Browser");
         Thread.sleep(1000);
         driver.manage().window().maximize();
         driver.get("");
         
        		 }

}
