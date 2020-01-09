import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Html {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/Selinium/selinium.html");
		Thread.sleep(2000);
		WebElement opt=driver.findElement(By.xpath("//select[@id=\"b\"]"));
		Select s=new Select(opt);
		List<WebElement> values=s.getOptions();
		if(s.isMultiple())
		for(WebElement data:values)
		{
			System.out.println(data.getText());
			s.selectByValue(data.getText());
			
		}
		System.out.println("=========="+s.getFirstSelectedOption().getText());
		List<WebElement> selectopt=s.getAllSelectedOptions();
		for(WebElement val :selectopt)
		{
			System.out.println(val.getText());
		s.deselectByVisibleText(val.getText());
		}
		
		s.deselectAll();
	}

}
