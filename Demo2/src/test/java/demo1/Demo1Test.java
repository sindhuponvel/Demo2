package demo1;

import org.testng.annotations.Test;

public class Demo1Test {

	@Test(groups="Smoke Test")
	public void createObjectTest()
	{
		String URL = System.getProperty("Url");
		String BROWSER = System.getProperty("Browser");
		String USERNAME = System.getProperty("Username");
		String PASSWORD = System.getProperty("Password");
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	System.out.println("Execute create object");	
	}
	@Test
	public void object2Test()
	{
		System.out.println("Execute create object2");
	}
}
