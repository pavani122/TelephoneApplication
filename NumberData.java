package com.techouts.telenumbers;
import java.util.*;
import java.util.Map.Entry;
import java.util.Scanner;

public class NumberData {
	int n=2;
	static String name;
	static String num;static long number;
	static Scanner sc=new Scanner(System.in);
	static Map<String,Long> map=new LinkedHashMap<String,Long>();

	String getName()
	{
		System.out.println("Enter the name:");
		name=sc.next();
		return name;
	}
	long getNumber()
	{
		System.out.println("Enter the mobile number:");
		try
		{
			number=Long.parseLong(sc.next());
		}
		catch(Exception e)
		{
			System.out.println("Input must be a number");
			n--;
			if(n==1)
			{
				getNumber();
			}
		}
		return number;
	}
    int m=2;
	void addData(String name,long number)
	{
		if(map.containsKey(name)) 	 
		{
			System.out.println("Duplicate name: "+ name);
			getName();
		}
		if( map.containsValue(number))
		{
			System.out.println("Duplicate number: " +num);
		}
		
		System.out.println(number);
		int length=NumberData.getLenthNumber(number);
		if(length==10)
		{
			float a=number/1000000000;
			int result=(int)a;

			if(result<6)
			{
				System.out.println("Number cannot start with 1,2,3,4,5 ");			
			}
			else
			{
				map.put(name, number);
			}
		}
		else
		{
			System.out.println("Number must be of 10 digits");
		}
		
	}
	void searchName(String name)
	{
		if(map.containsKey(name))
		{
		for(Map.Entry<String, Long> me:map.entrySet())
		{
				if(name.equals(me.getKey()))
				{
					System.out.println(me.getValue());
				}
			}
		}
			else
			{
				System.out.println("No number is saved with the name "+name);
				
			}


		
	}
	void searchNum(Long number)
	{
		System.out.println(map);
		if(map.containsValue(number))
		{
		for(Map.Entry<String, Long> me:map.entrySet())
		   {
				if(number.equals(me.getValue()))
				{
				System.out.println(me.getKey());
				}
			}
		}
			else
			{
				System.out.println(number+" is not saved");
			}
		
	}
	static int getLenthNumber(long number)
	{
		int count=0;
		while(number!=0)
		{
			number=number/10;
			count++;
		}
		return count;
	}
}




























