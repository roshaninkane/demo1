package TestNgProgram;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 
{
	@DataProvider
	private String[] [] getdata()
	{
		String[] [] data=new String[3] [2];
		data[0] [0] ="user A";
		data[0] [1] =" A1";
		
		data[1] [0] ="user b";
		data[1] [1] ="B1";
		
		data[2] [0] ="user c";
		data[2] [1] ="c1";
				return data;
	}
	@Test(dataProvider = "getdata")
	private void createuser(String un,String pw)
	{
Reporter.log("create: "  +un + " pwd:  "  +pw ,true);
	}

}
