package com.neoprism.bankaplicaton;

/*
Content of accmaster.txt

1 Adarsh 5000
2 Patel 10000

Content of acctrans.txt
1 D 5000
1 W 200
2 D 3000

*/

import java.io.*;
import java.util.*;

public class File3 
{
	public static void main(String[] ar) throws IOException
	{
		File f1 = new File("C:/Users/ranjith/Desktop/Bankdetails.txt");		
		File f2 = new File("C:/Users/ranjith/Desktop/bankretrive.txt");		

		//===========================================================
		//	Read Master File
		//===========================================================
		Scanner sc1 = new Scanner(f1);
		String mydata="";
		while(sc1.hasNext())
		{
			String no = sc1.next();
			String name = sc1.next();
			String bal = sc1.next();
			mydata = mydata + no + "," + name + "," + bal + ",";
		}

		//===========================================================
		//	Display Account File in Array Format.	Comment it if you don't want to display
		//===========================================================

		String myarr[] = mydata.split(",");

		for(int i=0;i<myarr.length;i++)
		{
		System.out.println(myarr[i]);
		}

		//===========================================================
		//	Read Transaction File
		//===========================================================
		Scanner sc2 = new Scanner(f2);
		String mydata2="";
		while(sc2.hasNext())
		{
			String no = sc2.next();
			String ttype = sc2.next();
			String amount = sc2.next();
			mydata2 = mydata2 + no + "," + ttype + "," + amount + ",";
		}

		//===========================================================
		//	Display Trasncation File in Array Format.	Comment it if you don't want to display
		//===========================================================
		String myarr2[] = mydata2.split(",");
		for(int j=0;j<myarr2.length;j++)
		{
			//System.out.println(myarr2[j]);
		}

		//=======================================
		//	User Transaction
		//=======================================
		System.out.println("Enter Account Number : ");
		Scanner userinput = new Scanner(System.in);
		String a = userinput.nextLine();				//Get Account Number

		int i;
		//Search for Account Name:
		for(i=0;i<myarr.length;i++)
		{
			if(myarr[i].equals(a)==true)
				System.out.println("Name of Account Holder is : " + myarr[i+1]);		
		}

		System.out.println("Enter Transaction Type (W/D) :");
		String b = userinput.nextLine();							//Get Transaction Type
		System.out.println("Enter Amount :");	
		String c = userinput.nextLine();							//Get Amount

		//Now Next Step is to add transcation to string where we have previous transactions.
		mydata2 = mydata2 + a + "," + b + "," + c + ",";
		//Update mydata2 to Array
		myarr2 = mydata2.split(",");

		//Now Update Balance in Account Master Array
		for(i=0;i<myarr.length;i++)
		{
			if(myarr[i].equals(a)==true)
			{
				if(b.equals("D")==true || b.equals("d")==true)
				{
					myarr[i+2]= (Integer.parseInt(myarr[i+2]) + Integer.parseInt(c)) + "";
				}
				else
				{
					myarr[i+2]= (Integer.parseInt(myarr[i+2]) - Integer.parseInt(c) )+ "";
				}
			}
		}

		//===============================
		// Write Updated Account Master to file.
		//===============================
		f1.createNewFile();							//Blank Existing File
		FileWriter w1 = new FileWriter(f1);
		for(i=0;i<myarr.length;i++)
		{
			w1.write(myarr[i] + " ");
			w1.flush();
		}

		//===============================
		// Write Updated Transaction to file.
		//===============================
		f2.createNewFile();
		FileWriter w2 = new FileWriter(f2);
		for(i=0;i<myarr2.length;i++)
		{
			w2.write(myarr2[i] + " ");
			w2.flush();
		}
		//Now Check our both Text File... They Have updated.
	}
}
