import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class H
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		System.out.println("Launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com/");
		Thread.sleep(2000);
        WebElement email= driver.findElement(By.id("identifierId"));
        email.sendKeys("someshrai@gmail.com");
        WebElement button= driver.findElement(By.name("identifier"));
        button.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("33676877",Keys.ENTER);
        
      
        
}
}
