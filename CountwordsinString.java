package com.careertuner;

public class CountwordsinString {
	public static void main(String[] args) {
		String str="Welcome to Careertuner";
		System.out.println(str);
		int count=1;
		int ln=str.length();
		for(int i=0;i<ln;i++)
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println("The String Contains "+count+" Words.");
	}

}
