package org.qsp.testpom;

import java.awt.Frame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.pom.Jqueryui;
import org.testng.annotations.Test;

public class jqueryui_test 
{
	@Test
private void slide1() throws InterruptedException
{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		Jqueryui w = new Jqueryui(driver);
	
		
	

}
}
