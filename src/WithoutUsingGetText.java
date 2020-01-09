import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutUsingGetText {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("launching browser");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println("tilte os web page by gettitle() method" + driver.getTitle());
		WebElement titleele=driver.findElement(By.tagName("title"));
		System.out.println("title of webpage by webelement title:" + titleele.getAttribute("textContent"));
		

	}

}
