package Com.Ebanking.Masters;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Notepadbranch {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		 Library LB=new Library();
			
			LB.OpenApp("http://183.82.100.55/ranford2");
			LB.Adminlogin("Admin","M1ndq");
		
		
			//To Get Test Data File Path
			
			String Fpath="D:\\kamalworkspace\\Ebanking\\src\\com\\ebanking\\testdata\\Branch.txt";
			
			//Result File Path
			
			String Rpath="D:\\kamalworkspace\\Ebanking\\src\\com\\ebanking\\results\\RESULTS_BRANCH.txt";
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
			
			///Multiple Iterations
			//LOOP
			
			while ((SD=BR.readLine()) != null )
					{
				System.out.println(SD);
				
				//Split
				
				String SR[]=SD.split("###");
				
				String BRANCHNAME = SR[0];
				String ADDRESS1=SR[1];
				String ZIPCODE=SR[2];
				String COUNTRY=SR[3];
				String STATE=SR[4];
				String CITY=SR[5];
				
				String RESULTS=LB.Branchcreation(BRANCHNAME, ADDRESS1, ZIPCODE, COUNTRY, STATE, CITY);
				System.out.println(RESULTS);
				
				//RESULTS
				BW.write(SD+"####"+RESULTS);
				BW.newLine();
					}
			
			BW.close();
			BR.close();
			

	}

}
