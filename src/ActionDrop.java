import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDrop {

	public static void main(String[] args)  throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		Thread.sleep(2000);
		WebElement frame=driver.findElement(By.xpath("//iframe[@src=\"/resources/demos/slider/default.html\"]"));
		driver.switchTo().frame(frame);
		WebElement slider=driver.findElement(By.xpath("//div[@class=\"ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content\"]"));
		Actions a=new Actions(driver);
				a.dragAndDropBy(slider, 50, 0).perform();
	}

}
