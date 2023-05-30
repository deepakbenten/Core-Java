package com.use;

import java.util.Scanner;

public class Print_Prime_NO 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		
		int fbig=0;
		int sbig=1;
		if(number==1)
		{
			System.out.println("prime number will be start 2");
		}
		for(int i=1; i<number; i++)
		{
			boolean isPrime = true;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.print(i+" ");
			}
			
		}
		
	}
}
