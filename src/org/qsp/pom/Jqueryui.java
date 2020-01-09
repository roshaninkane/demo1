package org.qsp.pom;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jqueryui 
{
@FindBy(xpath = "//span[@class=\"ui-slider-handle ui-corner-all ui-state-default\"]")
private WebElement slider;

public Jqueryui(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
}
public void slider_move() 
{
slider.click();

}
}
