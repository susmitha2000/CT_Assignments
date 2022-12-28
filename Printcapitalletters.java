package com.careertuner;

public class Printcapitalletters {
	public static void main(String[] args) {
		String str="Hello World";
		for(int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				System.out.println(str.charAt(i));
			}
		}
		
	}

}
