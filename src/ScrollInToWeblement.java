import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollInToWeblement {

	public static void main(String[] args) throws InterruptedException
	{
		  System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      System.out.println("open browser");
	      Thread.sleep(2000);
	      driver.manage().window().maximize();
	      driver.get("https://selenium.dev/");
	      Thread.sleep(2000);
	   JavascriptExecutor js =(JavascriptExecutor)driver;
	 WebElement p=  driver.findElement(By.xpath("//h2[contains(.,'News')]"));
	 js.executeScript("arguments[0].scrollIntoView()", p);

	}

}
