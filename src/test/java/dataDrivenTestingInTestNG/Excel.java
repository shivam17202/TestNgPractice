package dataDrivenTestingInTestNG;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import excelUtil.UtilityClass;

public class Excel {

//		
//		 try {
//	            File file = new File("C:\\Users\\Happy\\Desktop\\Testdata.xlsx");
//	            Scanner scanner = new Scanner(file);
//	            while (scanner.hasNextLine()) {
//	                String line = scanner.nextLine(); // Read each line of the file
//	                System.out.println(line);
//	              
//	            }
//	            scanner.close();
//	        } catch (FileNotFoundException e) {
//	            e.printStackTrace();
//	        }

//	@Test
//	void readData()throws IOException {
//	
//		FileInputStream file=new FileInputStream("C:\\Users\\Happy\\Desktop\\Testdata.xlsx");
//		
//		XSSFWorkbook book=new XSSFWorkbook(file);
//		
//		XSSFSheet sheet=book.getSheetAt(1);
//		
//		int totalRow=sheet.getLastRowNum();
//		
//		int totalCells=sheet.getRow(1).getLastCellNum();
////		System.out.println("rowa "+totalRow);
////		System.out.println("cells "+totalCells);
//		
//		for(int r=0;r<=totalRow;r++) {
//			
//			XSSFRow row=sheet.getRow(r);
//			for(int c=0;c<totalCells;c++) {
//				
//				XSSFCell cell=row.getCell(c);
//				System.out.print(cell+"\t");
//			}System.out.println();
//		}
//		
//		book.close();
//		file.close();
//	}

	
	
	
}
