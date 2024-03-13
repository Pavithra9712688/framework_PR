package runner_script;

import org.testng.Assert;
import org.testng.annotations.Test;

import POM_script.POM_script1;
import generic_script.base_class;
import generic_script.generic_excel;

public class runner_read_excel 
{
	@Test
	public void login() throws InterruptedException
	{
		POM_script1 p=new POM_script1(driver);
		p.passData(generic_excel.get_data("Sheet2", 0, 0));
		Thread.sleep(3000);
		p.passData1(generic_excel.get_data("Sheet2", 1, 0));
		Thread.sleep(3000);
		p.passData2();
		Assert.fail();
	}
}
