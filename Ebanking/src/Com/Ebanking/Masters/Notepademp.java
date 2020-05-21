package Com.Ebanking.Masters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Notepademp {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		Library LB=new Library();
		
		LB.OpenApp("http://183.82.100.55/ranford2");
		LB.Adminlogin("Admin","M1ndq");
		
		//To Get File Path
		
		String Fpath="D:\\kamalworkspace\\Ebanking\\src\\com\\ebanking\\testdata\\Employee.txt";
		
		//Results file
		
		String Rpath="D:\\kamalworkspace\\Ebanking\\src\\com\\ebanking\\results\\RESULTS_Emp";
		String SD;
		
		//ToGet Test Data File
		
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
			
			//split
			
			String SR[]=SD.split("###");
			 
			String EMPLOYEENAME=SR[0];
			String LOGINPASSWORD=SR[1];
			String ROLE=SR[2];
			String BRANCH=SR[3];
			
			String RESULTS=LB.Employee(EMPLOYEENAME, LOGINPASSWORD, ROLE, BRANCH);
			System.out.println(RESULTS);
			
			//RESULTS
			BW.write(SD+"####"+RESULTS);
			BW.newLine();
			
		}
		BW.close();
		BR.close();
		

	}

}
