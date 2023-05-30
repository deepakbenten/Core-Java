package com.use;

import java.util.Scanner;

public class ClassA 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int number=sc.nextInt();
		
		int n[]=new int[number];
		int fbig=n[0];
		int sbig=n[1];
		
		for(int i=0; i<=n.length-1; i++)
		{
			n[i]=sc.nextInt();
		}
		for(int i=0; i<=n.length-1; i++)
		{
			if(fbig<n[i])
			{
				sbig=fbig;
				fbig=n[i];
			}
			else if(sbig<n[i])
			{
				sbig=n[i];
			}
		}
		System.out.println("first big : "+fbig);
		System.out.println("second big : "+sbig);
	}

}
