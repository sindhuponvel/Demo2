package demo2;

import org.testng.annotations.Test;

public class Demo2Test {
	@Test
	public void abcTest()
	{
		
		System.out.println("Execeuted abc");
	}
	@Test(groups="Smoke Test")
	public void xyzTest()
	{
		
		System.out.println("Execeuted xyz");
	}
}
