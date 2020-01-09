import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_Scroll
{
public static void main(String[] args) throws InterruptedException
{


	  System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    System.out.println("open browser");
    Thread.sleep(2000);
  //  driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    
    Thread.sleep(10000);
    JavascriptExecutor js =(JavascriptExecutor)driver;
      js.executeScript("window.scrollBy(100,0)");
      Thread.sleep(2000);
      js.executeScript("window.scrollBy(-100,0)");
    
    
}
}
