import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.graphbuilder.math.func.CeilFunction;
import com.sun.corba.se.spi.orbutil.threadpool.Work;

import net.bytebuddy.asm.Advice.Enter;

public class Fb_Read_Inter_PwInFb {

	

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException ,InterruptedException, AWTException
	{
		
		
		
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
		
		   System.out.print(c1);
	   }
   }
   System.out.println();
   }
   String usr=sh.getRow(1).getCell(0).toString();
   String pas= sh.getRow(1).getCell(1).toString();
   

	System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	System.out.println("launching browser");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Robot r= new Robot();
	driver.findElement(By.id("email")).sendKeys(usr);
	driver.findElement(By.id("pass")).sendKeys(pas);
	driver.findElement(By.id("loginbutton")).click();
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(1000);
	//r.keyPress(KeyEvent.VK_ENTER);
	Set<String> parant=driver.getWindowHandles();
	for(String win: parant)
	{
		driver.switchTo().window(win);
	}
	Thread.sleep(2000);
	driver.get("https://accounts.google.com/");
	driver.findElement(By.id("identifierId")).sendKeys(usr,Keys.ENTER);
   Thread.sleep(2000);
   driver.findElement(By.name("password")).sendKeys(pas,Keys.ENTER);
	
	

	
	


   

	
	

	}

}
