package Com.Ebanking.Masters;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Library 
{
   public static WebDriver driver;
   public static String actval,expval;
   public static FileInputStream Fis;
   public static Properties Pr;
  public String OpenApp(String URL) throws InterruptedException, IOException
  {
	  System.setProperty("webdriver", "C:\\Users\\lucky\\OneDrive\\Desktop\\geckodriver.exe");
	  
	Fis=new FileInputStream("D:\\kamalworkspace\\Ebanking\\src\\com\\ebanking\\properties\\Rep.properties");
	Pr=new Properties();
	Pr.load(Fis);
	
	  expval="Ranford Bank";
		
		// launch firefox
		 driver=new FirefoxDriver();
		
		//URL
		driver.get(URL);
		
		//maximise 
		
		driver.manage().window().maximize(); 
		
		 actval=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
		
		System.out.println(driver.getTitle());
		 
		//comparision
		
		if (expval.equalsIgnoreCase(actval))
				{
			System.out.println("Ranford Application succefully launched");
				}
		else {
			System.out.println("Ranford Applivation Not Succefully Launched");
				}
		Thread.sleep(4000); 
		
		return "Pass";
	  
  
	
 }
  
  public String Adminlogin(String UN,String PSWD)
  {
	  expval="Welcome to Admin";
		
		driver.findElement(By.id(Pr.getProperty("adminusername"))).sendKeys(UN);
		driver.findElement(By.id(Pr.getProperty("adminpswd"))).sendKeys(PSWD);
		driver.findElement(By.id(Pr.getProperty("adminlgn"))).click();
		
		actval=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
		
		//comparision
		
				if (expval.equalsIgnoreCase(actval))
						{
					System.out.println("Admin login sucessfully");
						}
				else {
					System.out.println("Admin login failed");
						}
				return "Pass";
	  }
  public String Branchcreation(String branchname,String address1,String zipcode,String country,String state,String city) throws InterruptedException
  {
	  expval="Sucessfully";
		
		driver.findElement(By.xpath(Pr.getProperty("Branchbutton"))).click();
		driver.findElement(By.xpath(Pr.getProperty("newBranchbutton"))).click();
		driver.findElement(By.id(Pr.getProperty("Branchname"))).sendKeys(branchname);
		driver.findElement(By.id(Pr.getProperty("Branchaddress1"))).sendKeys(address1);
		driver.findElement(By.id(Pr.getProperty("Branchzipcode"))).sendKeys(zipcode);
		
		//Dropdown
		
		Select ctry=new Select(driver.findElement(By.id(Pr.getProperty("Country"))));
		ctry.selectByVisibleText(country);
		
		Select ste=new Select(driver.findElement(By.id(Pr.getProperty("State"))));
		ste.selectByVisibleText(state);
		
		
	    Select cty=new Select(driver.findElement(By.id(Pr.getProperty("City"))));
		cty.selectByVisibleText(city);
		
		driver.findElement(By.id(Pr.getProperty("Branchsbmt"))).click();
		
		Thread.sleep(4000);
		
		//Alert
		String actval=driver.switchTo().alert().getText();
		System.out.println(actval);
		
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();
		
		//comparision
		
		if (actval.contains(expval)) 
		{
			System.out.println("Branch Created Sucessfully");
				
		}
		else {
			System.out.println("Branch Already Exist");
			}
		return actval;
		 
		
  
	
 }
  public String Rolecreation(String RN,String RT)
  {
	    expval="Sucessfully";
	  
		driver.findElement(By.xpath(Pr.getProperty("Rbutton"))).click();
		
		driver.findElement(By.id(Pr.getProperty("NEWRolebutton"))).click();
		
		driver.findElement(By.id(Pr.getProperty("Rolename"))).sendKeys(RN);
		
		//driver.findElement(By.id("txtRDesc")).sendKeys("loveyou");
		
	    Select RTpe=new Select(driver.findElement(By.id(Pr.getProperty("Roletype"))));
		RTpe.selectByVisibleText(RT);
		
		driver.findElement(By.id(Pr.getProperty("Rolesbmt"))).click();
		
		String actval=driver.switchTo().alert().getText();
		System.out.println(actval);
		
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();
		
		//comparision
		
				if (actval.contains(expval)) 
				{
					System.out.println("Role Created Sucessfully");
						
				}
				else {
					System.out.println("Role Already Exist");
					}
				return actval;
  
	
 }
  public String Employee(String employeename,String employeepassword,String employeerole,String employeebranch)
  {
	  expval="Sucessfully";
		
		driver.findElement(By.xpath(Pr.getProperty("Employeebutton"))).click();
		driver.findElement(By.id(Pr.getProperty("NEWEmployeebutton"))).click();
		
		driver.findElement(By.id(Pr.getProperty("Employeename"))).sendKeys(employeename);
		
	    driver.findElement(By.id(Pr.getProperty("Employeepswd"))).sendKeys(employeepassword);
		
		Select Rle=new Select(driver.findElement(By.id(Pr.getProperty("Emprole"))));
		Rle.selectByVisibleText(employeerole);
		
		Select BRc=new Select(driver.findElement(By.id(Pr.getProperty("Empbranch"))));
		BRc.selectByVisibleText(employeebranch);
		
		driver.findElement(By.id(Pr.getProperty("Empsbmt"))).click();
		
		String actval=driver.switchTo().alert().getText();
		System.out.println(actval);
		
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();
		
		//comparision
		
		if (actval.contains(expval)) 
		{
			System.out.println("Eemployee Created Sucessfully");
				
		}
		else {
			System.out.println("Employee Already Exist");
			}
		return actval;
  
}
  
  public String Logout(String Lurl)
  {
		driver.findElement(By.xpath(Lurl)).click();
		return "pass";
		

 }
  public String Close()
  {
	  driver.close();
	return "Pass";
	  
	 
  
	
 }
 
   
}
