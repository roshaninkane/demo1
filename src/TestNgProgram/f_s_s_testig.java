package TestNgProgram;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class f_s_s_testig
{
@Test(groups = "smoke",priority = 3)
private void demo() 
{
	Reporter.log("hi",true);
}

@Test(groups = "fuctional",dependsOnGroups = "smoke")
private void demo1() 
{
	Reporter.log("hi1",true);
}
@Test(groups = "smoke",priority = 1)
private void demo2() 
{
	Reporter.log("hi2",true);
}
@Test(groups = "fuctional",dependsOnGroups = "smoke")
private void demo3() 
{
	Reporter.log("hi3",true);
}
@Test(groups = "smoke",priority = 2)
private void demo4() 
{
	Reporter.log("hi4",true);
	
}
@Test(groups = "system",dependsOnGroups = "fuctional")
private void demo5() 
{
	Reporter.log("hi5",true);
}
}
