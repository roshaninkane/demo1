import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jqueryui {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href=\"https://jqueryui.com/droppable/\"]")).click();
		WebElement Frame=driver.findElement(By.xpath("//iframe[@src=\"/resources/demos/droppable/default.html\"]"));
		 driver.switchTo().frame(Frame);
		
      WebElement drag=driver.findElement(By.id("draggable"));
      WebElement drop=driver.findElement(By.id("droppable"));
        
        
        Actions a=new Actions(driver);
        		a.dragAndDrop(drag, drop).perform();
         
         
	}

}
