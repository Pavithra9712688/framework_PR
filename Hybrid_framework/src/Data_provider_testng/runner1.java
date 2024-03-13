package Data_provider_testng;

import org.testng.annotations.Test;

public class runner1 
{
@Test(dataProvider = "loginCredential",dataProviderClass = dataprovider1.class)
public void loginTest(String un,String pwd)
{
	System.out.println(un+""+pwd);
}
}
