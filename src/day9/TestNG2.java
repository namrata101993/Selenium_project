package day9;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG2 {
	
	@BeforeSuite
	public void BeforeSuit() {
		System.out.println("before suit method");
	}
	@BeforeTest
	public void BeforeTest() {
		System.out.println("before test method");
	}
	
  
	 @BeforeClass
		public void BeforeClass() {
			System.out.println("before Class method");
		}
	 @BeforeMethod
		public void Beforemethod() {
			System.out.println("Before method");
		}
	 @Test
		public void test() {
			System.out.println("test method");
		}
	 @Test
		public void test2() {
			System.out.println("test2 method");
		}
	 
	 @AfterMethod
		public void Aftermethod() {
			System.out.println("After method");
		}
	 @AfterClass
		public void AfterClass() {
			System.out.println("After class method");
		}
	
	 @AfterTest
		public void AfterTest() {
			System.out.println("After test method");
		}
	 @AfterSuite
		public void AfterSuit() {
			System.out.println("After suit method");
		}
}
