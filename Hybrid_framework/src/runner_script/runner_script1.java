package runner_script;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM_script.POM_script1;
import generic_script.base_class;

public class runner_script1 extends base_class
{
@Test(dataProvider = "test1")
public void login(String un,String password) throws InterruptedException
{
	POM_script1 p=new POM_script1(driver);
	p.passData(un);
	Thread.sleep(3000);
	p.passData1(password);
	Thread.sleep(3000);
	p.passData2();
}
@DataProvider(name = "test1")
public Object[][] createData1() {
 return new Object[][] {
   { "Pavithra", "pavi@123" },
   { "rakshu", "rakshu123"},
 };
}
}
