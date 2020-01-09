package practice;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Nis1class {

	public static void main(String[] args) throws InterruptedException
	{
    System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    System.out.println("launching browser");
    Thread.sleep(2000);
    // driver.get("http://www.urbanladder.com/");
   // driver.get("https://www.flipkart.com/");
    driver.get("www.myntra.com lehenga");
    
    
	}

}
