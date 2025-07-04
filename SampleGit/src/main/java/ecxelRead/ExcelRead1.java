package ecxelRead;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead1 {
	static FileInputStream f; //excel file 
	static XSSFWorkbook w; //name salary
	static XSSFSheet s;// sheets
	public static String getStringData(int a,int b) throws IOException // a is row ,b is column or cell
	{
		f=new FileInputStream("C:\\Users\\Shadma\\Desktop\\Excel Sheets\\Book2.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");
		XSSFRow r=s.getRow(a);
		XSSFCell c=r.getCell(b);
		return c.getStringCellValue(); //inbuilt method for excelsheet connection
	}
	public static String getIntegerData(int a,int b) throws IOException { 
		f=new FileInputStream("C:\\Users\\Shadma\\Desktop\\Excel Sheets\\Book2.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");
		XSSFRow r=s.getRow(a);
		XSSFCell c=r.getCell(b);
		int y=(int) c.getNumericCellValue();// string - integer  = typecasting
		return String.valueOf(y);
	}

}
