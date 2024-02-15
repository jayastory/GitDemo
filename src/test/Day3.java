package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
@Test
	public void mobilelogin() {
	//Selenium	
	System.out.println("mobilelogin");
	
	}
@Parameters({"url"})
@Test 
   public void mobileuser(String user) {
	System.out.println("mobileuser");
	System.out.println(user);
}
@BeforeMethod	
public void beforemethod() {
	System.out.println("*************************");
}

@Test
   public void mobilesurface() {
	System.out.println("mobilesurface");
	Assert.assertTrue(false); 
}

@BeforeSuite(groups={"smoke"})
public void beforesuite() {
	System.out.println("i am the no. 1");
}
@Test(dataProvider="getdata")	
	public void weblogin(String username, String password) {
	//Appium	
	System.out.println("webLOgin");	
	System.out.println(username);
	System.out.println(password);
	}
@Test
    public void restAPI() {
    //RestAPI	
	System.out.println("restAPI");	
    }

@DataProvider
public Object[][] getdata() {
	Object[][] data=  new Object[3][2];
	data[0][0] = "firstsetusername";
	data[0][1] = "password";
	
	data[1][0] = "secondusername";
	data[1][1] = "password";
	
	data[2][0] = "thirdusername";
	data[2][1] = "password";
	return data;
}





}
