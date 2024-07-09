package day11;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;




public class Listnerstest implements ITestListener{
	
		  
		  public void onTestStart(ITestResult result) {
          System.out.println("on test starts");
		  }
			  public void onTestSuccess(ITestResult result) {
				  System.out.println("on test sucess");
			  }
				  public void onTestFailure(ITestResult result) {
					  System.out.println("on test failur");
				  }
					  public void onTestSkipped(ITestResult result) {
						  System.out.println("on test skipped");
					  }
						  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
							  System.out.println("onTestFailedButWithinSuccessPercentage");
						  }
							  public void onTestFailedWithTimeout(ITestResult result) {
								  System.out.println("onTestFailedWithTimeout");
							  }
								  public void onStart(ITestContext context) {
									  System.out.println("onstart");
								  }
									  public void onFinish(ITestContext context) {
										  System.out.println("onFunish");
									  }

}
