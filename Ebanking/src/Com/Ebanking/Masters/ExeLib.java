package Com.Ebanking.Masters;

import java.io.IOException;

public class ExeLib 
    {
	   public static void main(String[] args) throws InterruptedException, IOException
	   {
		   // Instance class
		   Library LB=new Library();
		   
		   String Rval=LB.OpenApp("http://183.82.100.55/ranford2");
		   System.out.println(Rval);
		   
		   String Rval1=LB.Adminlogin("Admin","M1ndq");
		   System.out.println(Rval1);
		   
		   String Rval2=LB.Branchcreation("kamal153","ammerpet opp busstand,hyderabad","50003","INDIA","Andhra Pradesh","Hyderabad");
		   System.out.println(Rval2);
		   
		   String Rval3=LB.Rolecreation("kamalkanna","E");
		   System.out.println(Rval3);
		   
		   String Rval4=LB.Employee("saikamal","Kamal@123","kamalkanna","kamal143");
		   System.out.println(Rval4);
		   
		   LB.Logout("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/table/tbody/tr/td[3]/a/img");
		   
		   LB.Close();
		
	}
	
	
	

	
		

	}
	



