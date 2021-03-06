package Com.Ebanking.Masters;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Hybrid 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		//instance class
		
		Library LB=new Library();
				 
				 String Res=null;
				 
				 String Keypath="D:\\kamalkannaworkspace\\Ebanking\\src\\Com\\Ebanking\\Masters\\keyword_data.xlsx";
				 
				 String Keyout="D:\\kamalkannaworkspace\\Ebanking\\src\\Com\\Ebanking\\Masters\\Res_data.xlsx";
				
				 
				 FileInputStream fi=new FileInputStream(Keypath);
					
				 //Workbook
					XSSFWorkbook WB=new XSSFWorkbook(fi);
                    
					//Sheet
					XSSFSheet WS=WB.getSheet("TestCase");
					XSSFSheet WS1=WB.getSheet("TestSteps");
					
					//XSSFSheet ws2=wb.getSheet("TestData");
					
					
					
					//Row count
					
					int TcRc=WS.getLastRowNum();
			        System.out.println(TcRc);
			        
					int TsRc=WS1.getLastRowNum();
					System.out.println(TsRc);
					
					//test cases

					for (int i = 1;i<=TcRc;i++)
					{
						String Exe=WS.getRow(i).getCell(2).getStringCellValue();
						if (Exe.equalsIgnoreCase("Y"))
						{
							String TcID=WS.getRow(i).getCell(0).getStringCellValue();
						System.out.println(TcID);
						
						//test steps
							
							for (int j = 1; j <= TsRc ; j++) 
							{
								String TsTcID=WS1.getRow(j).getCell(0).getStringCellValue();
								//System.out.println(tsTcid);
								if (TcID.equalsIgnoreCase(TsTcID))
								{
									String key=WS1.getRow(j).getCell(3).getStringCellValue();
									System.out.println(key);
									switch (key) 
									{
									case "RLanch":
										Res=LB.OpenApp("http://183.82.100.55/ranford2/");
										break;
									case "RLogin":
										Res=LB.Adminlogin("Admin","M1ndq");
										break;
									case "RLogout": 	
										Res=LB.Logout("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/table/tbody/tr/td[3]/a/img");
										break;
									case "RBranch":
											Res=LB.Branchcreation("gachibowli","Gachibowli","52562","INDIA","Andhra Pradesh","Hyderabad");
										break;
									case "RRole":
										//To get Test Data excel file
										
										FileInputStream Fis=new FileInputStream("D:\\kamalworkspace\\Ebanking\\src\\com\\ebanking\\testdata\\Role.xlsx");
										
										
										//workbook
										
										XSSFWorkbook WBook=new XSSFWorkbook(Fis);
										
										//sheet
										
										XSSFSheet WSheet=WBook.getSheet("Rdata");
										
										//Row count
										
										int Rcount = WSheet.getLastRowNum();
										System.out.println(Rcount);
										
										
										//Multiple Iterations--LOOP
										
										for (int k = 1; k<= Rcount; k++) 
										{
											//Row
											
											XSSFRow WRow=WSheet.getRow(k);
											
											//Cell
											
											XSSFCell WCell=WRow.getCell(0);
											XSSFCell WCell1=WRow.getCell(1);
											
											XSSFCell WCell2=WRow.createCell(2);
											
											
											//cell value
											
											String ROLENAME = WCell.getStringCellValue();
											String ROLETYPE = WCell1.getStringCellValue();
											 
											String RESULTS=LB.Rolecreation(ROLENAME, ROLETYPE);
											System.out.println(RESULTS);
											
											WCell2.setCellValue(RESULTS);
											
										}
										
										
										FileOutputStream Fos=new FileOutputStream("D:\\kamalworkspace\\Ebanking\\src\\com\\ebanking\\results\\RESULTS_Role.XLSX");
										 
										WBook.write(Fos);
										WBook.close();
										
										break;
										
									case "RClose":
										Res=LB.Close();
										break;
									
									default:
										System.out.println("Pass a Valid Keyword");
										break;
									}

									//result Updation in test steps sheet
									
									WS1.getRow(j).createCell(4).setCellValue(Res);
									
									//result updation in test case sheet
									
									if (!WS1.getRow(j).getCell(4).getStringCellValue().equalsIgnoreCase("Fail"))
									{
										WS.getRow(i).createCell(3).setCellValue(Res);
									}
									else
									{
										WS.getRow(i).createCell(3).setCellValue("Fail");
									}
										
								}
												
							}
							
						}
						else
						{
							WS.getRow(i).createCell(3).setCellValue("BLOCKED");
						}
					}
					FileOutputStream fo=new FileOutputStream(Keyout);
					WB.write(fo);
					WB.close();

				}		
	}
