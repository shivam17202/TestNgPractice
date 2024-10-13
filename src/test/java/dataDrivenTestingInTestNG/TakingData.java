package dataDrivenTestingInTestNG;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import excelUtil.UtilityClass;

public class TakingData {

	Object[][] objArr = new Object[3][2];

	@DataProvider(name = "db")
	Object[][] dataReader() throws IOException {

		for (int r = 0; r < 3; r++) {
			for (int c = 0; c < 2; c++) {
				objArr[r][c] = UtilityClass.getCell("C:\\Users\\Happy\\Desktop\\Testdata.xlsx", "Sheet1", r, c);
			}

		}

		return objArr;
	}

}
