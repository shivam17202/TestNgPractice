package dataDrivenTesting;
import org.testng.annotations.DataProvider;
public class Data {
	
	@DataProvider(name="testdata")
	Object[][] dataManage(){
		Object data[][]={
		{"unmm","asdsad"},
		{"unmm","asdsad"},
		{"unmm","asdsad"},
		{"jsmith","demo1234"}
				
	};
		return data;
		
	}

}
