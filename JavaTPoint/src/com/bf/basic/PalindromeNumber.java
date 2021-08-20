package com.bf.basic;

public class PalindromeNumber {
	public static void main(String[] args) {
		int num1 = 12345;
		int num2 = 12321;
		if (isPalindrom(num1))
			System.out.println(num1 + " is Palindrome");
		else
			System.out.println(num1 + " is not Palindrome");
		if (isPalindrom(num2))
			System.out.println(num2 + " is Palindrome");
		else
			System.out.println(num2 + " is not Palindrome");
	}

	private static boolean isPalindrom(int numb) {
		int revnum=reverse(numb);
		return numb == revnum;
		/*if (numb == revnum) {
			return true;
		} else {
			return false;
		}*/
	}

	private static int reverse(int numb) {
		int revnum=0;
		while (numb > 0) {
			revnum *= 10;
			revnum += numb%10;
			numb = numb / 10;
			
		}	
		return revnum;
	}
}
