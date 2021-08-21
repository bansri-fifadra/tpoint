package com.bf.basic;

public class Factorial {
	public static void main(String[] args) {
		int n=4;
		int fact = factorial(n);
		System.out.println("Factorial of number " + n + " is: " + fact);
	}

	private static int factorial(int n) {
/*		int fact = 1;
  		while(n > 0)
		{
			fact = fact * n;
			n--;
		}
*/
		int fact = n;
		if(n > 1)
			fact *= factorial(n-1);
		return fact;

/*		if(n <= 1) return n;
		return n * factorial(n-1);
*/
	}

}
