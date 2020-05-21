package Com.Ebanking.Masters;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelrole {

		public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		Library LB=new Library();
		
		LB.OpenApp("http://183.82.100.55/ranford2");
		LB.Adminlogin("Admin","M1ndq");
		
		//To get Test Data excel file
		
		FileInputStream Fis=new FileInputStream("D:\\kamalworkspace\\Ebanking\\src\\com\\ebanking\\testdata\\Role.xlsx");
		
		
		//workbook
		
		XSSFWorkbook WB=new XSSFWorkbook(Fis);
		
		//sheet
		
		XSSFSheet WS=WB.getSheet("Rdata");
		
		//Row count
		
		int Rc = WS.getLastRowNum();
		System.out.println(Rc);
		
		
		//Multiple Iterations--LOOP
		
		for (int i = 1; i <= Rc; i++) 
		{
			//Row
			
			XSSFRow WR=WS.getRow(i);
			
			//Cell
			
			XSSFCell WC=WR.getCell(0);
			XSSFCell WC1=WR.getCell(1);
			
			XSSFCell WC2=WR.createCell(2);
			
			
			//cell value
			
			String ROLENAME = WC.getStringCellValue();
			String ROLETYPE = WC1.getStringCellValue();
			 
			String RESULTS=LB.Rolecreation(ROLENAME, ROLETYPE);
			System.out.println(RESULTS);
			
			WC2.setCellValue(RESULTS);
			
		}
		
		
		FileOutputStream Fos=new FileOutputStream("D:\\kamalworkspace\\Ebanking\\src\\com\\ebanking\\results\\RESULTS_Role.XLSX");
		 
		WB.write(Fos);
		WB.close();
		
		
		
	}

}
