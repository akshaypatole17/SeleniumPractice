package TestNG;

import org.testng.annotations.Test;

public class InvocationCountTest {

	@Test(invocationCount=10)//Executed 10 times
	public void sum() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("Sum is "+c);
	}
	

	
}
