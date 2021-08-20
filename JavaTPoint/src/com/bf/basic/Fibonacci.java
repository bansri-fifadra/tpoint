package com.bf.basic;

/*
Fibonacci series in Java
In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of fibonacci series are 0 and 1.

There are two ways to write the fibonacci series program in java:

Fibonacci Series without using recursion
Fibonacci Series using recursion
Fibonacci Series in Java without using recursion
Let's see the fibonacci series program in java without using recursion.
*/

public class Fibonacci
{
	public static void main(String[] args)
	{
		int terms=10;
		Fibonacci f=new Fibonacci();
		f.printFibo(terms);
		System.out.println();
		f.recursiveFibo(0, 1, 1,terms);
	}
	private void printFibo(int terms)
	{
		int a=0, b=1, sum=0;
		System.out.print(a + ", " + b);
		for(int i=0; i<terms; i++)
		{
			sum=a+b;
			System.out.print(", " + sum);
			a=b;
			b=sum;
		}
		
	}
	private void recursiveFibo(int a, int b,int term, int terms)
	{
		if(term > terms) return;
		System.out.print(a + ", ");
		recursiveFibo(b, a+b, term+1, terms);
	}
}

