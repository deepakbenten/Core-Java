package com.use;

import java.util.Scanner;

public class DotRemove
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		String numbersString=sc.nextLine();
		
		String[] numbers=numbersString.split("@");
		for(String number : numbers )
		{
			System.out.print(number +" ");
		}
	}

}
