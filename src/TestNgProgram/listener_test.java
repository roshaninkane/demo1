package TestNgProgram;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listner.class)
public class listener_test 

{
	@Test()
	private void demo() 
	{
	System.out.println("hi");
	}
	
	@Test()
	private void demo1() 
	{
	System.out.println("hi2");
	Assert.fail();
	}
}
