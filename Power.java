package com.use;

import java.util.Scanner;

public class Power 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		System.out.println("Enter the power number : ");
		int p=sc.nextInt();
		int s=1;
		for(int i=1; i<=p; i++)
		{
			s=n*s;
		}
		System.out.println(n+"*"+p+" - Power : "+s);
	}
}
