package Com.Ebanking.Masters;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelemp {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver", "C:\\Users\\lucky\\OneDrive\\Desktop\\geckodriver.exe");
		Library LB=new Library();
		
		LB.OpenApp("http://183.82.100.55/ranford2");
		LB.Adminlogin("Admin","M1ndq");
		
		// To get Test Data excel file
		
		FileInputStream Fis=new FileInputStream("D:\\kamalworkspace\\Ebanking\\src\\com\\ebanking\\testdata\\Employee.xlsx");
		
		//Workbook
	
		XSSFWorkbook WB=new XSSFWorkbook(Fis);
		
		//Sheet
		
		XSSFSheet WS=WB.getSheet("Edata");
		
		//Row count
		
		int RC = WS.getLastRowNum();
		System.out.println(RC);
		
		//Multiple Iterations-----LOOP
		
		for (int i = 1; i <=RC; i++) 
		{
			//Rows
			
			XSSFRow WR=WS.getRow(i);
			
			//cell
			XSSFCell WC=WR.getCell(0);
			XSSFCell WC1=WR.getCell(1);
			XSSFCell WC2=WR.getCell(2);
			XSSFCell WC3=WR.getCell(3);
			
			XSSFCell WC4=WR.createCell(4);
			
			//Cell values
			
			String EMPLOYERNAME=WC.getStringCellValue();
			String LOGINPASSWORD=WC1.getStringCellValue();
			String ROLE=WC2.getStringCellValue();
			String BRANCH=WC3.getStringCellValue();
			
			String RESULTS=LB.Employee(EMPLOYERNAME,LOGINPASSWORD,ROLE,BRANCH);
			System.out.println(RESULTS);
			
			WC4.setCellValue(RESULTS);
			
			
			
				}
		
		FileOutputStream Fos=new FileOutputStream("D:\\kamalworkspace\\Ebanking\\src\\com\\ebanking\\results\\RESULTS_Employee.XLSX");
		
		WB.write(Fos);
		WB.close();
			
	}

}

