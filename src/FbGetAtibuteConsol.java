import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbGetAtibuteConsol {

	public static void main(String[] args)throws InterruptedException
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email =driver.findElement(By.id("email"));
		String val=email.getAttribute("data-testid");
		System.out.println(val);
		

	}

}
