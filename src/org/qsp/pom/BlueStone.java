package org.qsp.pom;

import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BlueStone 
{
  @FindBy(id = "search_query_top_elastic_search")
  private  WebElement search;
  @FindBy(xpath = "//section[@class=\"block\"]/span[contains(.,'Price')]")
  private WebElement price;
  @FindBy(xpath = "//span[@data-tagcategory=\"Price\"]")
  private WebElement below;
  @FindBy(xpath = "//div[@class=\"inner pd-gray-bg\"]")
  private List<WebElement>count_rings;
// @FindBy(id = "Delivery Time-form")
// private WebElement delivery;
  @FindBy(xpath = "//span[contains(.,'Metal')]")
  private WebElement metal;
  @FindBy(xpath = "//span[@data-displayname=\"platinum\"]")
  private WebElement platanium;
  @FindBy(xpath = "//span[contains(.,'47 Designs')]")
  private WebElement total_p;
  @FindBy(id = "Gender-form")
 private WebElement gender;
  @FindBy(xpath = "//span[@data-displayname=\"women\"]")
  private WebElement women;
  @FindBy(xpath = "//span[contains(.,'1853 Designs')]")
  private WebElement count_women;
  
  public BlueStone(WebDriver driver) 
  {
      PageFactory.initElements(driver,this);
  }
   
  public void search_test(String txt)
  {
	  search.sendKeys(txt,Keys.ENTER);
  }
  public void click_price()
  {
	  price.click();
  }
  public void below_click() 
  {
	below.click();
  }
	
	public int countrings()
	{
		int count = 0;
		for(WebElement li:count_rings)
		{
			count++;
		}
		return count;
		
	}
	 //public void delivery_click() 
	 //{
//delivery.click();
	//}
	public void metal_click()
	{
		metal.click();
		platanium.click();
			
	}
	public String count_platanium()
	{
		
	return total_p.getText();
	
	}
	public void gender_click()
	{
		gender.click();

	}
	public String women_c() 
	{
		women.click();
		return count_women.getText();
		
	}
}

