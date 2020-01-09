import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//popup display and than  display on console that op
public class ActiTimePopupDisplay {

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("launching browser");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id=\"loginButton\"]")).click();
	
		driver.findElement(By.xpath("//div[@class=\"popup_menu_button popup_menu_button_support\"]")).click();
		driver.findElement(By.xpath("//a[contains(.,'About your actiTIME')]")).click();
	WebElement w=	driver.findElement(By.xpath("//span[contains(.,'© 2019 actiTIME Inc. All rights reserved.')]"));
	System.out.println(w.getText());
	}

}
