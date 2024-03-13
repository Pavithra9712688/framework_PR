package Listeners;

import org.testng.annotations.Test;

public class runner_class1 
{
@Test
public void Compose()
{
	System.out.println("message composed");
}
@Test
public void sent_Items()
{
	System.out.println("message sent");
}
@Test(dependsOnMethods = "sent_Items")
public void trash()
{
	System.out.println("message deleted");
}
}
