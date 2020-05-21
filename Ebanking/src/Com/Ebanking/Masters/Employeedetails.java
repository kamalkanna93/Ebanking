package Com.Ebanking.Masters;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Employeedetails 
{

	//Element Properties
	
	@FindBy(id="BtnNew")
	WebElement Newbttn;
	
	@FindBy(xpath="/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")
	
	WebElement Ehme;
	
	//Element Methods
	
	public void NEwbutton() 
	{
		Newbttn.click();
	}
	
	public void Emphome() 
	{
	Ehme.click();	
	}
	

}



