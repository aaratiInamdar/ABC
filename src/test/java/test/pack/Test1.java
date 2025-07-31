package test.pack;

import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void setUp()
	{
		System.out.println("Browser opened");
	}
	
	@Test
	public void login()
	{
		System.out.println("Logged in");
	}
	
	@Test
	public void closeApp()
	{
		System.out.println("logged out");
	}

}
