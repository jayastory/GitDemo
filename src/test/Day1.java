package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day1 {
@Test(groups={"smoke"}) 
	public void demo() {
		
		System.out.println("hello");
	}
	
@Test(dependsOnMethods= {"demo"})
   public void Secondtest() {
	System.out.println("jaya");
}

@AfterSuite
public void aftersuite() {
	System.out.println("i am the no. 1 from last");
}
	
	
}
