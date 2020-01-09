import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Redbus{

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		
		System.out.println("launching browser");
		Thread.sleep(2000);
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(co);
    	driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(10000);

	}

}
