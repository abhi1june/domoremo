package demo1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Snippet {
	@Test(groups={"a1"})
	 public void Test1(){
		 System.out.println("Test1()"); 
		 Assert.assertEquals(2, 3);
	 }
	
	@Test(groups={"a2"})
	 public void Test2(){
		 System.out.println("Test2()"); 
	 }
}

