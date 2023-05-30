package com.use;

public class Swap
{
	
	void reverse(int arr[], int n)
	{
		int start=0; 
		int end=n-1;
		while(start<=end)
		{
			//swap(arr[start], arr[end]);
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {5,7,2,9,4};
		new Swap().reverse(arr, 6);
	}

}
