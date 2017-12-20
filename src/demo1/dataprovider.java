package demo1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	
	@DataProvider(name="test1")
	public Object[][] testing1(){
		
		Object[][] obj=new Object[3][2];
		obj[0][0]="name1";
		obj[0][1]="pass1";
		
		obj[1][0]="name1";
		obj[1][1]="pass1";
		
		obj[2][0]="name1";
		obj[2][1]="pass1";
		
		return obj;

	}
	
	@Test(dataProvider="test1")
	public void test2(String name, String pass){
		
		System.out.println(name+" "+pass);
		
	}

}
