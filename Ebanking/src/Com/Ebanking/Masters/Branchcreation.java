package Com.Ebanking.Masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Branchcreation 
{
	
	//Element Properties
	
	@FindBy(id="txtbName")
	WebElement Bname;
	
	@FindBy(id="txtAdd1")
	WebElement Badd1;
	
	@FindBy(id="txtZip")
	WebElement Bzip;
	
	@FindBy(id="lst_counrtyU")
	WebElement Bcntry;
	
	@FindBy(id="lst_stateI")
	WebElement Bst;
	
	@FindBy(id="lst_cityI")
	WebElement Bcty;
	
	@FindBy(id="btn_insert")
	WebElement Bsbmt;
	
	//Element Methods
	
	public void Branchcrtn(String Bn,String Badd,String Bzpcd,String Bctry,String Bstt,String Bcy) 
	{
		Bname.sendKeys(Bn);
		
		Badd1.sendKeys(Badd);
		
		Bzip.sendKeys(Bzpcd);
		
		//Bcntry.click();
		//Bcntry.sendKeys(Bctry);
		Select BCntry=new Select(Bcntry);
		BCntry.selectByVisibleText(Bctry);
		
		//Bst.click();
		//Bst.sendKeys(Bstt);
		Select BSt=new Select(Bst);
		BSt.selectByVisibleText(Bstt);
		
		//Bcty.click();
		//Bcty.sendKeys(Bcy);
		Select BCty=new Select(Bcty);
		BCty.selectByVisibleText(Bcy);
		
		Bsbmt.click();
	}
	
	 
	  
}

