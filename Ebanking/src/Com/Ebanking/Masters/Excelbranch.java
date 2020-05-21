package Com.Ebanking.Masters;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelbranch {

	

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		Library LB=new Library();
		
		LB.OpenApp("http://183.82.100.55/ranford2");
		LB.Adminlogin("Admin","M1ndq");
		
		//To get Test Data Excel file
		
		FileInputStream Fis=new FileInputStream("D:\\kamalworkspace\\Ebanking\\src\\com\\ebanking\\testdata\\Branch.xlsx");
		
		//Workbook
		
		XSSFWorkbook WB=new XSSFWorkbook(Fis);
		
		//sheet
		
		XSSFSheet WS=WB.getSheet("Bdata");
		
		//Row count
		
		int Rc = WS.getLastRowNum();
		System.out.println(Rc);
		
		//Multiple Iterations------LOOP
		for (int i = 1; i <=Rc; i++) 
		{
			//Row
			
			XSSFRow WR=WS.getRow(i);
			
			//cell
			
			XSSFCell WC=WR.getCell(0);
			XSSFCell WC1=WR.getCell(1);
			XSSFCell WC2=WR.getCell(2);
			XSSFCell WC3=WR.getCell(3);
			XSSFCell WC4=WR.getCell(4);
			XSSFCell WC5=WR.getCell(5);
			
			XSSFCell WC6=WR.createCell(6);
			
			//cell values
			 
			String BRANCHNAME=WC.getStringCellValue();
			String ADDRESS1=WC1.getStringCellValue();
			String ZIPCODE=WC2.getStringCellValue();
			String COUNTRY=WC3.getStringCellValue();
			String STATE=WC4.getStringCellValue();
			String CITY=WC5.getStringCellValue();
			
		
			String RESULTS=LB.Branchcreation(BRANCHNAME, ADDRESS1, ZIPCODE, COUNTRY, STATE, CITY);
			System.out.println(RESULTS);
			
			WC6.setCellValue(RESULTS);
			
			}
		
		FileOutputStream Fos=new FileOutputStream("D:\\kamalworkspace\\Ebanking\\src\\com\\ebanking\\results\\RESULTS_Branch.XLSX");
		
		WB.write(Fos);
		WB.close();
		
	}

}

