package Com.Ebanking.Masters;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Rolecreation 
{
	
	//Element Properties
	
	@FindBy(id="txtRname")
	WebElement Rname;
	
	@FindBy(id="lstRtypeN")
	WebElement Rtyp;
	
	@FindBy(id="btninsert")
	WebElement Rsbmt;
	
	
	//Element Methods
	
	public void Rolecrtn(String Rn,String Rty) 
	{
		Rname.sendKeys(Rn);
		
		//Rtyp.click();
		//Rtyp.sendKeys(Rty);
		Select Rt=new Select(Rtyp);
		Rt.selectByVisibleText(Rty);
		
		Rsbmt.click();
	}
	

	
	

}
