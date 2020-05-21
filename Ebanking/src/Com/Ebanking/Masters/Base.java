package Com.Ebanking.Masters;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

import org.testng.annotations.AfterSuite;

public class Base {
	
	Library LB=new Library();
 
  @BeforeTest
  public void beforeTest() 
  {
	  LB.Adminlogin("Admin","M1ndq");
	  
	  
  }

  @AfterTest
  public void afterTest() 
  {
	  LB.Logout("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/table/tbody/tr/td[3]/a/img");
	  
  }

  @BeforeSuite
  public void beforeSuite() throws InterruptedException, IOException 
  {
	 LB.OpenApp("http://183.82.100.55/ranford2"); 
	  
  }

  @AfterSuite
  public void afterSuite() 
  {
	  LB.Close();
	  
  }

}
