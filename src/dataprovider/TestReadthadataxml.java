package dataprovider;

import org.testng.annotations.Test;

public class TestReadthadataxml 
{
@Test(dataProviderClass =  ReadThaDataXml.class,dataProvider = "createuser")
private void test(String user ,String pwd) 
{

System.out.println(user);
System.out.println(pwd);
}
}
