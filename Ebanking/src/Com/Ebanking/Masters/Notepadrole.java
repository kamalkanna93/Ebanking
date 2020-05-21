package Com.Ebanking.Masters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Notepadrole {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
        Library LB=new Library();
		
		LB.OpenApp("http://183.82.100.55/ranford2");
		LB.Adminlogin("Admin","M1ndq");
		
		//To get Test Data File Path
		
		String Fpath="D:\\kamalworkspace\\Ebanking\\src\\com\\ebanking\\testdata\\Role.txt";
		
		//Results File Path
		String Rpath="D:\\kamalworkspace\\Ebanking\\src\\com\\ebanking\\results\\RESULTS_Role.txt";
		String SD;
		
		//To Get Test Data File
		
		FileReader FR=new FileReader(Fpath);
		BufferedReader BR=new BufferedReader(FR);
		
		
		String Sread=BR.readLine();
		System.out.println(Sread);
		
		//Write Header to Results
		
		FileWriter FW=new FileWriter(Rpath);
		BufferedWriter BW=new BufferedWriter(FW);
		BW.write(Sread);
		BW.newLine();
		
		//Multiple Iterations 
		//LOOP
		
		
		while ((SD=BR.readLine()) != null) 
		{
			
			System.out.println(SD);
			
			//Split
			
			String SR[]=SD.split("###");
			 String ROLENAME=SR[0];
			 String ROLETYPE=SR[1];
			 
			 String RESULTS=LB.Rolecreation(ROLENAME, ROLETYPE);
			 System.out.println(RESULTS);
			 
			 //Results
			 
			 BW.write(SD+"####"+RESULTS);
			 BW.newLine();
			 		
		}	
		
		BW.close();
		BR.close();
		
		
		
		

	}

}
