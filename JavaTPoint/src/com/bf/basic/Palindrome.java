package com.bf.basic;

public class Palindrome {
	public static void main(String[] args)
	{
		String str1 = "malayalam";
		String str2 = "Jaydeep";
		if(isPalindrom(str1))
			System.out.println(str1 + " is Palindrome");
		else
			System.out.println(str1 + " is not Palindrome");
		if(isPalindrom(str2))
			System.out.println(str2 + " is Palindrome");
		else
			System.out.println(str2 + " is not Palindrome");
	}

	private static boolean isPalindrom(String str) {
		int i = 0, j = str.length()-1;
		while(i <= j)
		{
			if(str.charAt(i) == str.charAt(j))
			{
				i++;
				j--;
			}
			else
			{	return false; }
		}
		return true;
	}
}
