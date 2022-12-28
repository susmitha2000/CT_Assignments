package com.careertuner;

public class Sequencechar {
	public static void main(String[] args) {
		String str1="Careertuner";
		String str2="carertuner";
		String str3="CareerTuner"; 
		System.out.println("Given String: "+str1);
		System.out.println("Specified Sequence Of Char Values: ");
		System.out.println(str1.contains(str2));
		System.out.println("\nSpecified Sequence Of Char Values: "+str3);
		System.out.println(str1.contains(str3));
	}

}

