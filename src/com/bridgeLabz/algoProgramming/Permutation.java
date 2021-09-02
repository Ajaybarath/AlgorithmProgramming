package com.bridgeLabz.algoProgramming;

public class Permutation {
	
	static String recArray[];
	static String itrArray[];
	static int itr = 0;

	static void printPermutation(String str, String ans) {

		if (str.length() == 0) {
			recArray[itr++] = ans;
			return;
		}

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			String ros = str.substring(0, i) + str.substring(i + 1);

			printPermutation(ros, ans + ch);
		}
	}

	
	
	private static void printPermutationsIterative(String string) {
		int[] factorials = new int[string.length() + 1];
		factorials[0] = 1;
		for (int i = 1; i <= string.length(); i++) {
			factorials[i] = factorials[i - 1] * i;
		}

		for (int i = 0; i < factorials[string.length()]; i++) {
			String onePermutation = "";
			String temp = string;
			int positionCode = i;
			for (int position = string.length(); position > 0; position--) {
				int selected = positionCode / factorials[position - 1];
				onePermutation += temp.charAt(selected);
				positionCode = positionCode % factorials[position - 1];
				temp = temp.substring(0, selected) + temp.substring(selected + 1);
			}
			itrArray[itr++] = onePermutation;
		}
	}

	public static void main(String[] args) {
		String word = "abc";
		recArray = new String[factorial(word.length()) ];
		itrArray = new String[factorial(word.length()) ];

		
		printPermutation(word, "");
		itr=0;
		
		int flag = 0;
		
		printPermutationsIterative(word);
		
		for (int i=0;i<itrArray.length;i++) {
			if (!recArray[i].equals(itrArray[i])) {
				System.out.println("Both array are not equal");
				flag = 1;
			}
		}
		
		if (flag == 0){
			System.out.println("Both array are equal");
		}
	}
	
	static int factorial(int n) {
		int sum = 1;
		for (int i=1;i<=n;i++) {
			sum = sum * i;
		}
				
		return sum;
	}

}
