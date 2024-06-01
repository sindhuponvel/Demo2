package demo1;

import org.testng.annotations.Test;

public class Demo1Test {

	@Test(groups="Smoke Test")
	public void createObjectTest()
	{
	System.out.println("Execute create object");	
	}
	@Test
	public void object2Test()
	{
		System.out.println("Execute create object2");
	}
}
