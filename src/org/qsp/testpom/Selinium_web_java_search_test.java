package org.qsp.testpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.pom.Selinium_web_java_search;

public class Selinium_web_java_search_test {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");	
		
Selinium_web_java_search ss=new Selinium_web_java_search(driver);
ss.searchTxt("java");
Thread.sleep(2000);
driver.navigate().back();
ss.searchTxt("testNG");


	}

}
