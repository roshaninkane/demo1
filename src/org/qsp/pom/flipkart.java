package org.qsp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipkart

{
	@FindBy(xpath = "//button[@class=\"_2AkmmA _29YdH8\"]")
	private WebElement popup;
 @FindBy(xpath = "//span[contains(.,'Electronics')]")
 private WebElement electronic;
 @FindBy(xpath = "//a[@href=\"/mobiles/mi~brand/pr?sid=tyy,4io&otracker=nmenu_sub_Electronics_0_Mi\"]")
 private WebElement mi;
 @FindBy(xpath = "//div[@class=\"col col-7-12\"]/div[contains(.,'Redmi 8 (Sapphire Blue, 64 GB)')]")
 private WebElement redmmi;
 @FindBy(xpath = "//li[@class=\"col col-6-12\"]/button")
 private WebElement button;
 
 public flipkart(WebDriver driver) 
 {
	// TODO Auto-generated constructor stub
	 PageFactory.initElements(driver, this);
	 
}
 
 public void pop() 
 {
	popup.click();
}
 public void mousehover(WebDriver driver) 
 {
	 Actions a=new Actions(driver);
	a.moveToElement(electronic).perform();
}
 public void clickB() 
 {
	mi.click();
}
 public void clickC() 
 {
	redmmi.click();
}
 public void clickD() 
 {
	button.click();
}
}
