package demo1;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class1 {
	
	@Test
	public void test1(){
		Assert.assertTrue(1==1);
	}
	
	@Test
	public void test2(){
		Assert.assertTrue(1==2);
	}
	 @Test
	public void test3(){
		Assert.assertTrue(1==3);
	}
}
