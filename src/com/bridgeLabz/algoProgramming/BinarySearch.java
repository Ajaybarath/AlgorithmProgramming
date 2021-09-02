package com.bridgeLabz.algoProgramming;

import java.util.Scanner;

public class BinarySearch {

	static int binarySearch(String[] arr, String word) {
		int left = 0, right = arr.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;

			int res = word.compareTo(arr[mid]);

			if (res == 0)
				return mid;

			if (res > 0)
				left = mid + 1;

			else
				right = mid - 1;
		}

		return -1;
	}

	public static void main(String args[]) {

		String sentence = "apple,orange,pinapple,grapes,water";

		String words[] = sentence.toLowerCase().split(",");
		
		Scanner s = new Scanner(System.in);
		
		String searchWord = s.next();
		
		int result = binarySearch(words, searchWord);

		if (result == -1)
			System.out.println("word not found");
		else
			System.out.println("word is found");
	}

}
