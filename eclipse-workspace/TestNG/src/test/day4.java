package test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day4 {
	@Test
	public void WebLoginHomeLoan() {
		System.out.println("webloginHome");
	
	}
	@Test
	public void MobileLoginHomeLoan() {
		System.out.println("MobileloginHome");
	
	}
	@Test(dataProvider="getData")
	public void LoginAPIHomeLon(String username, String password) 
	{
		System.out.println(username);
		System.out.println(password);
	
	}
@DataProvider
public  Object[][] getData() {
	//initialize multidimensional array Object
	Object[][] data=new Object[3][2];
	//3 means 3 rows or 3 times
	//2 means 2 values
	data[0][0]="firstusername";
	data[0][1]="firstpassward";
	data[1][0]="secondusername";
	data[1][1]="secondpassword";
	data[2][0]="thirdusername";
	data[2][1]="thirdpassword";
	return data;
	
	
	
	
}}
