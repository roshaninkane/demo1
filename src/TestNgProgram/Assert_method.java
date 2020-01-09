package TestNgProgram;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_method

{
	
	@Test
	public void Assert_method1()
	{
	/*	String s1="r";
		String s2="r";
		Assert.assertEquals(s1, s2);
		System.out.println("valid");
		*/
	 List st1=new ArrayList<>();
	 st1.add("roshan");
	 st1.add("sau");
	 st1.add(true);
	 List st2=new ArrayList<>();
	
	 st2.add("roshan");
	 st2.add("su");
	st2.add(true);
	 
	
	SoftAssert sa =new SoftAssert();
			sa.assertEquals(st1, st2);
			sa.assertAll();
	
	 System.out.println("run");
	}
	
	}
	
