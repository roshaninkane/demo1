import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;
import com.sun.org.apache.bcel.internal.classfile.Field;

public class ScreenShotOfFb {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 File  sc=ts.getScreenshotAs(OutputType.FILE);
		 File ss=new File(".\\screenshoot\\facebook.png");
		 Files.copy(sc, ss);

		
		 

	}

}
