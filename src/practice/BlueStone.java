package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.sun.corba.se.spi.orbutil.fsm.Action;

public class BlueStone {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		WebElement wwe=driver.findElement(By.xpath("//a[contains(.,'All Jewellery ')]"));
		Actions a=new Actions(driver);
		a.moveToElement(wwe).build().perform();
		
		driver.findElement(By.xpath("//a[@title=\"Kadas\"]")).click();
		
		driver.findElement(By.xpath("//img[@src=\"https://kinclimg6.bluestone.com/f_webp,c_scale,w_515,b_rgb:ffffff/product/BVOR0172B03_YAA22XXXXXXXXXXXX_ABCD00-pr-1024.jpg\"]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[@class=\"size-box-overlay\"]")).click();
		//Thread.sleep(1000);
		List<WebElement>size=driver.findElements(By.xpath("//div[@class=\"scrollable-list active\"]"));
		for(WebElement ss:size)
		{
			System.out.println(ss.getText());
		}
		
		
		
		
	}

}
