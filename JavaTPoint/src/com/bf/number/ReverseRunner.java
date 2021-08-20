package com.bf.number;

class Reverse
{
    int no;
    Reverse(int no)
    {
	this.no = no;
    }
    int getReverseNumber()
    {
	int revNum = 0;
	while(no > 0)
	{
	    revNum *= 10;
	    revNum = revNum + (no % 10);
	    no = no / 10;
	}
	return revNum;
    }
}

public class ReverseRunner
{
    public static void main(String[] args)
    {
	Reverse r = new Reverse(98765);
	System.out.println(r.getReverseNumber());
    }
}