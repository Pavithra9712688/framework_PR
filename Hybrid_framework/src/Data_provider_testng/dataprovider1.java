package Data_provider_testng;

import org.testng.annotations.DataProvider;

public class dataprovider1 
{
 @DataProvider(name = "loginCredential")
 public Object[][] getData()
 {
	 Object[][] data={{"pavithra","1256"},{"rakshu","587"},{"pavi","987"}};
	 return data;
	 
 }
}
