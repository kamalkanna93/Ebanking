package Com.Ebanking.Masters;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExcelPOM 
{
	WebDriver driver;
	
	@BeforeTest
	public void Login() 
	{
		
	    driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://183.82.100.55/ranford2");
		
		
		RanfordHP RHP=PageFactory.initElements(driver, RanfordHP.class);
		RHP.Login();
		
		
	}
	
	
	
	
	    @Test
	    
		public void Brnchcre() throws InterruptedException, IOException 
	    
	    {
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
				
			
	    	
	    AdminHP AHP=PageFactory.initElements(driver, AdminHP.class);
		AHP.Br();
		
	    Branchdetails BD=PageFactory.initElements(driver, Branchdetails.class);
		BD.NEWB();
		
		Thread.sleep(4000);
		
		Branchcreation BC=PageFactory.initElements(driver, Branchcreation.class);
		BC.Branchcrtn(BRANCHNAME,ADDRESS1,ZIPCODE,COUNTRY,STATE,CITY);
		
		Thread.sleep(4000);
		
		driver.switchTo().alert().accept();
		
		BD.Brnchhome();
		
		}
		
	}
	    
	    
        @Test
		
		public void Rolcre() throws InterruptedException, IOException 
		{
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
    	
			
		AdminHP AHP=PageFactory.initElements(driver, AdminHP.class);
		AHP.Rol();
		
		Roledetails RD=PageFactory.initElements(driver, Roledetails.class);
		RD.NewRole();
		
		Thread.sleep(4000);
		
		Rolecreation RC=PageFactory.initElements(driver, Rolecreation.class);
		
		RC.Rolecrtn(ROLENAME,ROLETYPE);
		
		Thread.sleep(4000);
		
		driver.switchTo().alert().accept();
		
		RD.Rolehme();
    		}
		
		}
        
        
         @Test
         public void Empcre() throws InterruptedException, IOException
         {
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
	
         AdminHP AHP=PageFactory.initElements(driver, AdminHP.class);
         AHP.Emp();

         Employeedetails ED=PageFactory.initElements(driver, Employeedetails.class);
         ED.NEwbutton();

         Thread.sleep(4000);

         Employeecreation EC=PageFactory.initElements(driver, Employeecreation.class);
         EC.EmpCreation(EMPLOYERNAME,LOGINPASSWORD,ROLE,BRANCH);

         Thread.sleep(4000);

         driver.switchTo().alert().accept();

         ED.Emphome();
     		}

         }

         @AfterTest
         public void Logout() {
	
        	 AdminHP AHP=PageFactory.initElements(driver, AdminHP.class);
        	 AHP.Lgout();


        	 driver.close();

         }
}
