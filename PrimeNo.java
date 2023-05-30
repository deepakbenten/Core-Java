package com.use;

import java.util.Scanner;

public class PrimeNo 
{
	Scanner sc=new Scanner(System.in);
	void Prime()
	{
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		int i;
		for(i=2; i<n; i++)
		{
			
			if(n%i==0)
			{
				System.out.println("Not Prime number  : "+n);
				break;
			}
			
			
		}
		if(n==i)
		{
			System.out.println("Prime number : "+n);
		}
	}
	public static void main(String[] args) {
		new PrimeNo().Prime();
	}

}
