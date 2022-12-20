package com.careertuner;

public class Greatestnumber {
	public static void main(String[] args) 
	{
		int x=50,y=200,z=500;
		if(x>=y)
		{
			if(x>=z)
				System.out.println("The largest number is:"+x);
			else
				System.out.println("The largest number is:"+z);
		}
			else
			{
				if(y>=z)
					System.out.println("The largest number is:"+y);
				else
					System.out.println("The largest number is:"+z);
			}
		
	}

}

