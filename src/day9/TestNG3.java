package day9;

import org.testng.annotations.Test;

public class TestNG3 {

	@Test (priority=-1, invocationCount=3)
	public void test() {
		System.out.println("test method");
	}
	
  
	 @Test (priority=1,enabled=false)
	public void test1() {
		System.out.println("test1 method");
	}
	 @Test (priority=2)
		public void test2() {
			System.out.println("test2 method");
		}
}
