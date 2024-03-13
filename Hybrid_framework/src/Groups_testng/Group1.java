package Groups_testng;

import org.testng.annotations.Test;

public class Group1 
{
@Test(groups = {"sanity"})
public void test1()
{
	System.out.println("hello india");
}
@Test(groups = {"sanity","regression"})
public void test2()
{
	System.out.println("hello asia");
}
@Test(groups = {"regression"})
public void test3()
{
	System.out.println("hello world");
}
}
