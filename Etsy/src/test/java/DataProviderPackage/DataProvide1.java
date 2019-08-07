package DataProviderPackage;

import org.testng.annotations.DataProvider;

public class DataProvide1 {
	
	@DataProvider(name="TestData")
	public String[][] TestLogin(){
		
		String[][] content = {{"puja","puja","Anvia@1"},{"Anvika","Anvika","Anvika@123"},{"pujapingale88@gmail.com","puja","Anvika@1"}};
		
		return content;
		
	}

}
