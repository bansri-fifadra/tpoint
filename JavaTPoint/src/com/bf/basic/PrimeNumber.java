package com.bf.basic;

class PrimeNumber
{
    public static void main(String[] args)
    {
	int no=97;
	PrimeNumber p = new PrimeNumber();
	System.out.println(p.isPrimeNumber(no));
    }

    String isPrimeNumber(int n)
    {
	if(n == 0 || n == 1)
	    return "Not Prime";
	if(n == 2)
	    return "Prime";
	if(n % 2 == 0)
	    return "Not Prime";
	else 
	{
	    for(int i=3; i<n/2; i+=2)
	    {
		if(n % i == 0)
		    return "Not Prime";
	    }
	}
	    
	return "Prime";
    }
}