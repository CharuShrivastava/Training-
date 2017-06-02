package program;



import java.io.File;

import java.io.IOException;




import jxl.Cell;

import jxl.Sheet;

import jxl.Workbook;

import jxl.biff.WorkbookMethods;

import jxl.read.biff.BiffException;




public class StudentScore {


public static void main(String[] args) throws BiffException, IOException {

File file1=new File("D:/Anjali/Data.xls");

		Workbook wb=Workbook.getWorkbook(file1);

		Sheet sh1=wb.getSheet(0);

		int d = sh1.getColumns();

		int e=sh1.getRows();

		int sum=0;

		//System.out.println(e);

		for (int i = 1; i <e ; i++) {

			int ss=sh1.findCell("Score").getColumn();
			
			System.out.println(ss);

String f=sh1.getCell(ss, i).getContents();

			int k=Integer.parseInt(f);

			sum=sum+k;
}

		System.out.println(sum);
}

}


