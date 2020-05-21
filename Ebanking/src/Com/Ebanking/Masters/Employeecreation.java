package Com.Ebanking.Masters;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Employeecreation 
{
	
	//Element Properties
	
	@FindBy(id="txtUname")
	WebElement Enme;
	
	@FindBy(id="txtLpwd")
	WebElement Epswd;
	
	@FindBy(id="lst_Roles")
	WebElement ERole;
	
	@FindBy(id="lst_Branch")
	WebElement EBranch;
	
	@FindBy(id="BtnSubmit")
	WebElement Esbmt;
	
	//Element Methods
	
	public void EmpCreation(String Ename,String Epsd,String ER,String EB) 
	{
		Enme.sendKeys(Ename);
		
		Epswd.sendKeys(Epsd);
		
		//ERole.click();
		//ERole.sendKeys(ER);
		Select Emprole=new Select(ERole);
		Emprole.selectByVisibleText(ER);
		
		//EBranch.click();
		//EBranch.sendKeys(EB);
		Select EmpBranch=new Select(EBranch);
		EmpBranch.selectByVisibleText(EB);
		
		Esbmt.click();
		
		
		
	}

}
