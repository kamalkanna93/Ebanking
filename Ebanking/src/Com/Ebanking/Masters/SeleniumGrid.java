package Com.Ebanking.Masters;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SeleniumGrid 

{
	
	DesiredCapabilities Cap=null;
	
	@Test
	
	public void grid() throws MalformedURLException, InterruptedException 
	{
		Cap=new DesiredCapabilities();
		Cap.setBrowserName("firefox");
		Cap.setPlatform(Platform.WINDOWS);
		
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.7:4444/wd/hub"), Cap);
		
		driver.manage().window().maximize();
		driver.get("http://183.82.100.55/ranford2/");
		
		
		RanfordHP RHP=PageFactory.initElements(driver, RanfordHP.class);
		RHP.Login();
		
		 
			
			AdminHP AHP=PageFactory.initElements(driver, AdminHP.class);
			AHP.Rol();
			
			Roledetails RD=PageFactory.initElements(driver, Roledetails.class);
			RD.NewRole();
			
			Thread.sleep(4000);
			
			Rolecreation RC=PageFactory.initElements(driver, Rolecreation.class);
			
			RC.Rolecrtn("kanna","E");
			
			Thread.sleep(4000);
			
			driver.switchTo().alert().accept();
			
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
