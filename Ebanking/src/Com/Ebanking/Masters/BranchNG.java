package Com.Ebanking.Masters;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BranchNG extends Base
{
  @Test(dataProvider="bdata")
  public void Br(String Bn,String Ba,String Bzp,String Bcn,String Bst,String Bcty) throws InterruptedException 
  {
	  LB.Branchcreation(Bn,Ba,Bzp,Bcn,Bst,Bcty);
	  
	  
  }
  
  @DataProvider
  
  public Object[][] bdata()
  
  {
 Object[][]Obj=new Object[6][6];
	  
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
	 
	  
	  Obj[5][0]="PUNJAGUTAAAef";
	  Obj[5][1]="back side of ammerpet45";
	  Obj[5][2]="50005";
	  Obj[5][3]="INDIA";
	  Obj[5][4]="Andhra Pradesh";
	  Obj[5][5]="Hyderabad";
	  
	  
	  
	return Obj;
	  	  
}
}

