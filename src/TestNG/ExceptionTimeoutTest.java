package TestNG;

import org.testng.annotations.Test;

public class ExceptionTimeoutTest {

	//@Test(timeOut=2000, expectedExceptions= {NumberFormatException.class})
	@Test(timeOut=2000)
	public void infiniteLoopTest() {
		int i = 1;
		while(i==1) {
			System.out.println(i);
			i++;
		}
	}
	
	@Test(expectedExceptions= {NumberFormatException.class})
	public void test1() {
		String x = "100A";
		Integer.parseInt(x);
		}
}