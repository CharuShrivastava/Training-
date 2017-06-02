package program;

import java.io.File;
import java.io.IOException;

import jxl.*;
import jxl.read.biff.BiffException;

public class ExcelProgram2   { 

	public void readExcelAndReadContent(int col ,int row){


		try{
			File file1 =new File("D:/Anjali/Data-Copy.xlsx");

			Workbook wb= Workbook.getWorkbook(file1);
			Sheet sh = wb.getSheet("Sheet1");

			String cell = sh.getCell(col, row).getContents();

			System.out.println("The Cell Content is : " + cell);

		}catch (BiffException e){
			System.err.println("This is biff exception");

		}catch (IOException e){
			System.out.println(e.getMessage());
			System.err.println("Given File is not present");

		}
	}

}


