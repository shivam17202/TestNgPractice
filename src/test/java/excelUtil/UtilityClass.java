package excelUtil;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilityClass {

	public static XSSFWorkbook wk;
	public static XSSFSheet sh;
	public static XSSFRow rw;
	public static XSSFCell cl;
	public static FileInputStream file;
	
	
	public static String getCell(String filePath,String Sh_Name,int row_num,int cell_num) throws IOException{
		
		file=new FileInputStream(filePath);
		wk=new XSSFWorkbook(file);
		sh=wk.getSheet(Sh_Name);
		rw=sh.getRow(row_num);
		cl =rw.getCell(cell_num);
		return cl.toString();
		}
}
