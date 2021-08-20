package com.bf.basic;

public class Factorial {
	public static void main(String[] args) {
		int n=5;
		int fact = factorial(n);
		System.out.println("Factorial of number " + n + " is: " + fact);
	}

	private static int factorial(int n) {
		int fact = 1;
		while(n > 0)
		{
			//n = n*factorial(n-1);
			fact = fact * n;
			n--;
		}
		System.out.println(n);
		return fact;
	}

}
