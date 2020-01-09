import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindOutLoc {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	WebElement login=	driver.findElement(By.id("loginbutton"));
	org.openqa.selenium.Point loc=login.getLocation();
	System.out.println(loc);
	int x= loc.getX();
	int y=loc.getY();
	System.out.println(x+"    "+y);
	
	
	}

}
