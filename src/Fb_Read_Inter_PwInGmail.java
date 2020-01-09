import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.graphbuilder.math.func.CeilFunction;
import com.sun.corba.se.spi.orbutil.threadpool.Work;

public class Fb_Read_Inter_PwInGmail {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException ,InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	
		
		
		
		
	FileInputStream fis=new FileInputStream("./Data/Gmailps.xlsx");
   Workbook	wf=WorkbookFactory.create(fis);
   Sheet sh=wf.getSheet("sheet1");
  Row  firstrow=sh.getRow(0);
   int  rowcount=sh.getPhysicalNumberOfRows();
   for(int i=0;i<rowcount;i++)
   {
	 
   
	   
   {
	   for(int j=0;j<firstrow.getLastCellNum();j++)
	   {
		   
		 
		Cell c1= sh.getRow(i).getCell(j);
		
		   System.out.println(c1);
	   }
   }
	//WebElement o=driver.findElement(By.xpath("//input[@autocomplete=\"username\"]"));
	


   

	
	

	}

}
}