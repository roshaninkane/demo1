package org.qsp.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selinium_web_java_search 
{///selinium
	@FindBy(id = "gsc-i-id1")
	private WebElement search;
	
	
	public Selinium_web_java_search(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchTxt(String txt)
	{
	search.sendKeys(txt,Keys.ENTER);	
}
}
