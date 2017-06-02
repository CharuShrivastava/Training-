package program;

import java.io.File;
import java.io.IOException;

import jxl.*;
import jxl.read.biff.BiffException;

public class ExcelProgram   {
	public static void main(String args[])     {


		try{
			File file1 =new File("D:/Anjali/Data1.xls");
				
			Workbook wb= Workbook.getWorkbook(file1);
			Sheet sh = wb.getSheet(0);

			int rowcount = sh.getRows(); 

			int add =0 ;

			for (int i=1 ; i<rowcount;i++){	

			
				String cell = sh.getCell(2, i).getContents();
				System.out.println(cell);
				int n = Integer.parseInt(cell);
				add = add+ n;
				System.out.println("Addition is :" +add);
			}

		}catch (BiffException e){
			System.err.println("This is biff exception");

		}catch (IOException e){
			System.err.println("Given File is not present");

		}
	}

}
