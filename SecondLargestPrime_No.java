package com.use;

public class SecondLargestPrime_No
{
	static boolean isPrime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		for(int i=2; i<=Math.sqrt(n); i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] nums= {102,44,19,12,7,13,18,49,3,59};
		int largestPrime=0;
		int secondLargestPrime=0;
		
		for(int num : nums)
		{
			if(isPrime(num))
			{
				if(num > largestPrime)
				{
					secondLargestPrime=largestPrime;
					largestPrime=num;
				}
				else if(num>secondLargestPrime)
				{
					secondLargestPrime=num;
				}
			}
		}
		System.out.println("The 2nd largest prime is : "+secondLargestPrime);
	}

}
