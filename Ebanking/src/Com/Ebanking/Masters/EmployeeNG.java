package Com.Ebanking.Masters;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmployeeNG extends Base
{
  @Test(dataProvider="Empdata")
  public void Empcre(String En,String Epwd,String Er,String Eb) 
  {
	LB.Employee(En,Epwd,Er,Eb);  
	  
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
}
