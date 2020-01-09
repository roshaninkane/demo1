package TestNgProgram;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sequetial_test 
{
@Test(dependsOnMethods = "demo2")
private void demo()
{
	Reporter.log("hi",true);
	
}
@Test()
private void demo1()
{
	Reporter.log("hi1",true);
	
}
@Test(dependsOnMethods = "demo1")
private void demo2()
{
	Reporter.log("hi2",true);
	
}
@Test()
private void demo3()
{
	Reporter.log("hi3",true);
	
}
}
