package com.bf.basic;

public class Armstrong {
	public static void main(String[] args) {
		int no=153, len=0, num=no;
		// to get length
		while(no > 0)
		{
			no /= 10;
			len++;
		}
		no=num;
		
		int sum=0;
		
		while(no>0)
		{
			int times=1;	
			int digit = no % 10;
			no /= 10;
			
			for(int i=0; i<len; i++)
			{
				times *= digit;
			}
			sum += times;
		}
		System.out.println(num);
		System.out.println(sum);
		if(num == sum)
			System.out.println(num + " is an armstrong number..");
		else
			System.out.println(num + " is not an armstrong number..");
	}
}
