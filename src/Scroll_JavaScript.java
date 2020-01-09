import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_JavaScript {

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
	   js.executeScript("window.scrollBy(0,1000)"); //for y index
	   Thread.sleep(2000);
	   js.executeScript("window.scrollBy(0,-1000)");
	   Thread.sleep(2000);
	   js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//for to down
	   Thread.sleep(2000);
	   js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");//for to up

	}

}
