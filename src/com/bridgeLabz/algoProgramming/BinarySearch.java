package com.bridgeLabz.algoProgramming;

import java.util.Scanner;

public class BinarySearch<K extends Comparable <K>> {

	int binarySearch(K[] arr, K word) {
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
		
		BinarySearch<String> binSearch = new BinarySearch<>();
		
		int result = binSearch.binarySearch(words, searchWord);

		if (result == -1)
			System.out.println("word not found");
		else
			System.out.println("word is found");
	}

}
