import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotcCkass
{

	public static void main(String[] args) throws AWTException 
	{
	System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	System.out.println("launching browser");

	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	Robot r=new Robot();
	/*r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_T);
	*/
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_N);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_N);
	
	
	
	
		
	}

}
