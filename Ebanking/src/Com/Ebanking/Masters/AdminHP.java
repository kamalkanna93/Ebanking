package Com.Ebanking.Masters;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminHP 
{
	
	//Element Properties
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")
	WebElement Branch;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")
	WebElement Role;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[6]/td/a/img")
	WebElement Users;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")
	WebElement Employee;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/table/tbody/tr/td[3]/a/img")
	WebElement Logout;
	
	//Element Methods
	
	public void Br() 
	{
		Branch.click();
		
	}
	
	public void Rol() 
	{
		Role.click();
	}
	
	public void UR() 
	{
		Users.click();
	}
	
	public void Emp() 
	{
		Employee.click();
	}
	
	public void Lgout() 
	{
		Logout.click();
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


