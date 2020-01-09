import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgDemo
{
@Test
public void demo() {
	

	System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	System.out.println("launching browser");
	
	driver.manage().window().maximize();
	Reporter.log("hi",true);
	driver.close();
}
}