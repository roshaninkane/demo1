package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass 
{
	

public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	System.out.println("launching browser");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	driver.get("https://www.urbanladder.com/");
	Thread.sleep(10000);
	driver.findElement(By.xpath("//a[@class=\"close-reveal-modal hide-mobile\"]")).click();
List<WebElement> w=driver.findElements(By.xpath("//ul[@class=\"topnav bodytext\"]/li"));
	Actions a=new Actions(driver);
	for(WebElement qq:w)
	{
	
	System.out.println(qq.getText());
	String name=qq.getText();
	a.moveToElement(qq).perform();
	Thread.sleep(2000);	
	List<WebElement>pwe=driver.findElements(By.xpath("//span[contains(.,'"+name+"')]/parent::li/descendant::ul[@class=\"taxonslist\"]"));

	
	for(WebElement o:pwe)
	{
		System.out.println(o.getText());
	}
	
}}}
