package Com.Ebanking.Masters;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Roledetails 
{
	//Element Properties
	
	@FindBy(id="btnRoles")
	WebElement NEWRoles;
	
	@FindBy(xpath="/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")
	WebElement Rhme;
	
	//Element Methods
	
	public void NewRole() 
	{
		NEWRoles.click();
	}
	
	public void Rolehme() 
	{
		Rhme.click();
	}

}
