package com.bridgeLabz.algoProgramming;

public class InsertionSort<K extends Comparable<K>>  {

	void sort(K array[]) {
		int length = array.length;
		for (int i = 1; i < length; ++i) {
			K key = array[i];
			int j = i - 1;

			while (j >= 0 && array[j].compareTo(key) > 0) {
				array[j + 1] = array[j];
				j = j - 1;
			}

			array[j + 1] = key;
		}
	}

	public static void main(String args[]) {
		String sentence = "orange,pinapple,grapes,apple,banana";

		String array[] = sentence.toLowerCase().split(",");
		
		InsertionSort<String> insertion = new InsertionSort<>();
		insertion.sort(array);
		
		for (int i=0;i<array.length;i++) {
			System.out.print(array[i] + ",");
		}

	}
}
