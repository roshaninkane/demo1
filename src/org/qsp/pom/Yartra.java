package org.qsp.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Yartra
{
    	@FindBy(id = "BE_flight_origin_city")  
    	private WebElement depart;
    	@FindBy(xpath = "//p[contains(.,'Hyderabad')]")
    	private WebElement location1;
    @FindBy(xpath = "//p[contains(.,'Pune')]")
    	private WebElement  mum;
    	@FindBy(id ="BE_flight_origin_date")
    	private WebElement  date_press;
    	@FindBy(id = "19/01/2020")
    	private WebElement date_click_jan;
    	@FindBy(xpath = "//input[@name=\"flight_destination_date\"]")
    	private WebElement return_date;
    @FindBy(id = "14/02/2020")
    private WebElement return_clik2;
    @FindBy(xpath = "//span[@class=\"txt-ellipses flight_passengerBox travellerPaxBox\"]")
    private WebElement  economy;
    @FindBy(id = "adultPax")
    private WebElement adult;
    @FindBy(id = "childPax")
    private WebElement child;
    @FindBy(id = "infantPax")
    private WebElement infantclild;
    @FindBy(xpath = "//span[@class=\"ddSpinnerPlus\"]")
    private WebElement count_pass;
    	
    	
    	
    	public Yartra(WebDriver driver) 
    	{
			PageFactory.initElements(driver, this);
		}
    	
    	
    	public void de()
    	{
			depart.click();
		}
    	public void loc1()  
    	{
			location1.click();;
		
		}
    	public void loc2()  
    	{
			mum.click();
			
	}
    	public void date()  
    	{
		date_press.click();
		date_click_jan.click();
		return_date.click();
		
    	}
    	public void return1()
    	{return_clik2.click();
			
		}
    	public void Economy1() 
    	{
			economy.click();
		}
    	public void passengers()
    	{
			adult.click();
			count_pass.click();
			child.click();
			count_pass.click();
			infantclild.click();
			count_pass.click();
		}
    	}



        
