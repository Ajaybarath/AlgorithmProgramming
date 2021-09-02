package com.bridgeLabz.algoProgramming;

import java.util.Arrays;

public class AnagramDeduction {

	static boolean isAnagram(String str1, String str2) {
		String s1 = str1.replaceAll("\\s", "");
		String s2 = str2.replaceAll("\\s", "");
		boolean status = true;
		if (s1.length() != s2.length()) {
			status = false;
		} else {
			char[] ArrayS1 = s1.toLowerCase().toCharArray();
			char[] ArrayS2 = s2.toLowerCase().toCharArray();
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
			status = Arrays.equals(ArrayS1, ArrayS2);
		}
		if (status) {

			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		
		if (isAnagram("heart", "earth")) {
			System.out.println("these are anagram");

		} else {
			System.out.println("these are not anagram");
		}
		
		if (isAnagram("Mother In Law", "Hitler Woman")) {
			System.out.println("these are anagram");

		} else {
			System.out.println("these are not anagram");
		}
	}

}
