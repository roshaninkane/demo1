import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class K {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement data = driver.findElement(By.xpath("//label[@for=\"email\"]"));
		System.out.println(data.getText());
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys(data.getText());
		WebElement pass = driver.findElement(By.xpath("//label[@for='pass']"));
		System.out.println(pass.getText());
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(pass.getText());
		

	}

}
