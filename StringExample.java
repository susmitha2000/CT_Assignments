package com.careertuner;

public class StringExample {
	public static void main(String[] args) {
		String str1="Java Examples";
		String str2="Java Example";
		String end_str="le";
		boolean ends1=str1.endsWith(end_str);
		boolean ends2=str2.endsWith(end_str);
		System.out.println("\""+str1+"\"ends with"+"\""+end_str+"\"?"+ends1);
		System.out.println("\""+str2+"\"ends with"+"\""+end_str+"\"?"+ends2);
		
	}

}
