package com.bridgeLabz.algoProgramming;

public class Palindrome extends AnagramDeduction{

	public static void main(String args[]) {
		
	}

	static boolean isPalindrome(String word) {

		String reverse = "";

		int length = word.length();
		
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + word.charAt(i);
		
		if (word.equals(reverse))
			return true;
		else
			return false;
	}

}
