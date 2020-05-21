package Com.Ebanking.Masters;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExePOM 
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
	
	
	
	
	    @Test(dataProvider="bdata")
	    
		public void Brnchcre(String Bn,String Badd,String Bzpcd,String Bctry,String Bstt,String Bcy) throws InterruptedException {
	    	
	    AdminHP AHP=PageFactory.initElements(driver, AdminHP.class);
		AHP.Br();
		
	    Branchdetails BD=PageFactory.initElements(driver, Branchdetails.class);
		BD.NEWB();
		
		Thread.sleep(4000);
		
		Branchcreation BC=PageFactory.initElements(driver, Branchcreation.class);
		BC.Branchcrtn(Bn,Badd,Bzpcd,Bctry,Bstt,Bcy);
		
		Thread.sleep(4000);
		
		driver.switchTo().alert().accept();
		
		BD.Brnchhome();
		
		}
	    
	      @DataProvider
		  
		  public Object[][] bdata()
		  
		  {
		 Object[][]Obj=new Object[5][6];
			  
			  Obj[0][0]="PUNJAGUTAAA";
			  Obj[0][1]="back side of ammerpet";
			  Obj[0][2]="50000";
			  Obj[0][3]="INDIA";
			  Obj[0][4]="Andhra Pradesh";
			  Obj[0][5]="Hyderabad";
			  
			  Obj[1][0]="PUNJAGUTAkk";
			  Obj[1][1]="back side of ammerpet11";
			  Obj[1][2]="50001";
			  Obj[1][3]="INDIA";
			  Obj[1][4]="Andhra Pradesh";
			  Obj[1][5]="Hyderabad";
			  
			  Obj[2][0]="PUNJAGUTAAAbb";
			  Obj[2][1]="back side of ammerpet12";
			  Obj[2][2]="50002";
			  Obj[2][3]="INDIA";
			  Obj[2][4]="Andhra Pradesh";
			  Obj[2][5]="Hyderabad";
			  
			  Obj[3][0]="PUNJAGUTAAAab";
			  Obj[3][1]="back side of ammerpet23";
			  Obj[3][2]="50003";
			  Obj[3][3]="INDIA";
			  Obj[3][4]="Andhra Pradesh";
			  Obj[3][5]="Hyderabad";
			  
			  
			  Obj[4][0]="PUNJAGUTAAAcd";
			  Obj[4][1]="back side of ammerpet34";
			  Obj[4][2]="50004";
			  Obj[4][3]="INDIA";
			  Obj[4][4]="Andhra Pradesh";
			  Obj[4][5]="Hyderabad";
			 
				  
			return Obj;
			
		  }
	    
		@Test(dataProvider="Rdata")
		
		public void Rolcre(String Rn,String Rty) throws InterruptedException 
		{
			
			
		AdminHP AHP=PageFactory.initElements(driver, AdminHP.class);
		AHP.Rol();
		
		Roledetails RD=PageFactory.initElements(driver, Roledetails.class);
		RD.NewRole();
		
		Thread.sleep(4000);
		
		Rolecreation RC=PageFactory.initElements(driver, Rolecreation.class);
		
		RC.Rolecrtn(Rn,Rty);
		
		Thread.sleep(4000);
		
		driver.switchTo().alert().accept();
		
		RD.Rolehme();
		
		
		}
		@DataProvider
		  
		  public Object [][] Rdata()
		  {
			  
			  Object[][]obj=new Object[3][2];
			  
			  obj[0][0]="Tellerabcd";
			  obj[0][1]="E";
			  
			  obj[1][0]="Tellerpqr";
			  obj[1][1]="E";
			  
			  obj[2][0]="Tellerqwerty";
			  obj[2][1]="E";
			  
			  return obj;
		  }
			  
			  
		@Test(dataProvider="Empdata")
		public void Empcre(String Ename,String Epsd,String ER,String EB) throws InterruptedException {
			
		AdminHP AHP=PageFactory.initElements(driver, AdminHP.class);
		AHP.Emp();
		
		Employeedetails ED=PageFactory.initElements(driver, Employeedetails.class);
		ED.NEwbutton();
		
		Thread.sleep(4000);
		
		Employeecreation EC=PageFactory.initElements(driver, Employeecreation.class);
		EC.EmpCreation(Ename,Epsd,ER,EB);
		
		Thread.sleep(4000);
		
		driver.switchTo().alert().accept();
		
		ED.Emphome();
		
		}
		@DataProvider
		  
		  public Object[][] Empdata()
		  {
		      Object[][]Obj=new Object[3][4];
			  
			  Obj[0][0]="ssherlock";
			  Obj[0][1]="kamal@@@123";
			  Obj[0][2]="Tellerabcd";
			  Obj[0][3]="PUNJAGUTAAA";
			  
			  Obj[1][0]="ssherlock";
			  Obj[1][1]="kamal@@@122";
			  Obj[1][2]="Tellerpqr";
			  Obj[1][3]="PUNJAGUTAkk";
			  
			  Obj[2][0]="ssherlock";
			  Obj[2][1]="kamal@@@121";
			  Obj[2][2]="Tellerqwerty";
			  Obj[2][3]="PUNJAGUTAAAbb";
			  
			  return Obj;
			 	  
		  }
		
		@AfterTest
		public void Logout() {
			
		AdminHP AHP=PageFactory.initElements(driver, AdminHP.class);
		AHP.Lgout();
		
		
		driver.close();
		
			
}

}
