package Com.Ebanking.Masters;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Branchdetails 
{
	//Element Properties
	
	@FindBy(id="BtnNewBR")
	WebElement newBrch;
	
	@FindBy(xpath="/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")
	WebElement Bhme;
	
	//Element Methods
	
	public void NEWB() 
	{
		newBrch.click();
	}
	
	public void Brnchhome() 
	{
		Bhme.click();
	}

}
