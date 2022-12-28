package com.careertuner;

public class CharacterString {
	public static void main(String[] args) {
		String message="java standard edition";
		char[] CharArray=message.toCharArray();
		boolean foundspace=true;
		for(int i=0;i<CharArray.length;i++)
		{
			if(Character.isLetter(CharArray[i])) {
				if(foundspace) {
					CharArray[i] = Character.toUpperCase(CharArray[i]);
					foundspace=false;
				}
			}
			else {
				foundspace=true;
			}
				
		}
		message=String.valueOf(CharArray);
		System.out.println("Message: "+message);
		}
	
}
