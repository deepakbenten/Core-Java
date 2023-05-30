package com.use;

import java.util.Scanner;

import javax.swing.DefaultBoundedRangeModel;

public class OddEven {
	Scanner sc = new Scanner(System.in);

	void Even() {
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	void Odd() {
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		boolean out = false;
		while (choice!=3) {
			System.out.println("Choice The number :");
			System.out.println("1   :   Even ");
			System.out.println("2   :   Odd");
			System.out.println("3   :   Exit");
			choice=sc.nextInt();
			switch (choice) {
			case 1:
				new OddEven().Even();
				break;
			case 2:
				new OddEven().Odd();
				break;
			case 3:
				out = true;
				break;
			default:
				System.out.println("Invalid number input !!");
			}
		}

	}

}
