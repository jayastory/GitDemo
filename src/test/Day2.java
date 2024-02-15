package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
@AfterTest
public void aftertest() {
	System.out.println("i will execute last");
}
@Test(groups={"smoke"})
public void demo() {
	   
	System.out.println("how are you?");
	
}
	
@BeforeTest
    public void prerequest() {
	System.out.println("i will execute first");
}
	
}
