package org.qsp.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlueStone_scrolldown
{

	  @FindBy(id = "search_query_top_elastic_search")
	  private  WebElement search;
	  @FindBy(id = "scrollTop")
	  private WebElement top;
	  
	  
	  public BlueStone_scrolldown(WebDriver driver)
	  {
		PageFactory.initElements(driver, this);
	}
	  
	  
	  public void search_test(String txt)
	  {
		  search.sendKeys(txt,Keys.ENTER);
	  }
	  public void Top_click() 
	  {top.click();
		
	}
}
