package day9;

import org.testng.annotations.Test;

public class PriorityinTestNG {

@Test (priority=0)
public void Closebrowser() {
System.out.println("close browser");
}
@Test 
public void Account() {
System.out.println("customer Account test");
}
@Test (priority=-1)
public void Openbrowser() {
System.out.println("Open browser");
}
}


