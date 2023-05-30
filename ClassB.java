package com.use;

import java.util.Scanner;

public class ClassB 
{
	int  getMaxMin(int num[] ,int n)
	{
		int max=num[0];
		int min=num[0];
		for(int i=0; i<num.length; i++)
		{
			if(num[i]>max)
			{
				max=num[i];
			}
			else if(num[i]<min)
			{
				min=num[i];
			}
		}
		System.out.println("Method Max : "+max);
		System.out.println("Method Min :"+min);
		
		return 1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Length size number : ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			else if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Max : "+max);
		System.out.println("Min : "+min);
		System.out.println("-------------------------------------------------------");
		new ClassB().getMaxMin(arr, size);
	}

}
