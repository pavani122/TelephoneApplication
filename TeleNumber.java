package com.techouts.telenumbers;

import java.security.PKCS12Attribute;
import java.util.Scanner;

public class TeleNumber {
     
	public static void main(String[] args) {
		String name;long number;boolean flag=true;Long searchNumber = null;
		Scanner sc=new Scanner(System.in);
		NumberData dataObj=new  NumberData();
		String s="y";
		while(s.equalsIgnoreCase("y"))
		{
		name=dataObj.getName();
		number=dataObj.getNumber();
		dataObj.addData(name,number);
		
		 System.out.println("Do the user want to continue,enter Y or N:");
	     s=sc.next();
		}
		if(s.equalsIgnoreCase("n"))
		{
			String s1="y";
			while(s1.equalsIgnoreCase("y"))
		    {
			System.out.println("1.Searching using name \t2.Searching using number");
			int ch=sc.nextInt();
			if(ch==1)
			{
	        System.out.println("Enter the name you want to search:");
			String searchName=sc.next();
			dataObj.searchName(searchName);
			}
			if(ch==2)
			{
				while(true)
				{
				flag=true;
				System.out.println("Enter the number you want to search:");
				try
				{
				searchNumber=Long.parseLong(sc.next());
				}
				catch(Exception e)
				{
					System.out.println("Input must be a number");
					flag=false;
				
				}
				if(flag)
				{
				dataObj.searchNum(searchNumber);
				break;
				}
				}
			}
			System.out.println("Do the user want to continue searching,enter Y or N:");
		    s1=sc.next();
			
		    }
		}
	}

}
