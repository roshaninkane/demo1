
package TestNgProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestFb 
{
	@DataProvider
	private String[] [] getdata()
	{
		String[] [] data=new String[3] [2];
		data[0] [0] ="user A";
		data[0] [1] =" A1";
		
		data[1] [0] ="user b";
		data[1] [1] ="B1";
		
		data[2] [0] ="user c";
		data[2] [1] ="c1";
				return data;
	}
	@Test(dataProvider = "getdata")
	private void createuser(String un,String pw) throws InterruptedException
	{
Reporter.log("create: "  +un + " pwd:  "  +pw ,true);
System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
System.out.println("launching browser");
Thread.sleep(2000);
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys(un);
driver.findElement(By.id("pass")).sendKeys(pw,Keys.ENTER);
driver.close();
	}
}
