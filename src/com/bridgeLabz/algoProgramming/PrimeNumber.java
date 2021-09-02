package com.bridgeLabz.algoProgramming;

import java.util.ArrayList;

public class PrimeNumber extends Palindrome {

	static boolean prime(int n) {
		int m = n / 2;
		if (n == 0 || n == 1) {
			return false;
		} else {
			for (int i = 2; i <= m; i++) {
				if (n % i == 0) {
					return false;
				}
			}
		}
		
		return true;
	}

	public static void main(String args[]) {
		
		ArrayList<String> list = new ArrayList<>();
		
		for (int i=0;i<1000;i++) {
			if (prime(i)) {
				list.add(""+i);
			}
		}
		
		for (int i=0;i<list.size();i++) {
			for (int j=i;j<list.size();j++) {
				if (isAnagram(list.get(i), list.get(j)) && isPalindrome(""+i)) {
					System.out.println(i + " is a palindrome and anagram and a prime number");
				}
			}
		}
		
	}
}
