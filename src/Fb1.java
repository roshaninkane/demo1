import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb1 {
//SelectDemo
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement day=driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
		Select s=new Select(day);
		s.selectByValue("9");
		WebElement month=driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
		Select s1=new Select(month);
		s1.selectByValue("11");		
		WebElement year=driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
		
		Select s2=new Select(year);
		s2.selectByValue("2004");
	}

}
