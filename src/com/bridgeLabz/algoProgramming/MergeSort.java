package com.bridgeLabz.algoProgramming;

import java.util.Arrays;

public class MergeSort <K extends Comparable<K>> {

	public static void main(String[] args) {

		String sentence = "apple,orange,pinapple,grapes,water";

		String array[] = sentence.toLowerCase().split(","); 
		
		MergeSort<String> mSort = new MergeSort<>();
		
		mSort.mergeSort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
	}

	public void mergeSort(String[] array, int from, int to) {
		if (from == to) {
			return;
		}
		int mid = (from + to) / 2;
		mergeSort(array, from, mid);
		mergeSort(array, mid + 1, to);
		merge(array, from, mid, to);
	}

	public void merge(String[] array, int from, int mid, int to) {
		int n = to - from + 1;
		String[] b = new String[n];
		int i1 = from;
		int i2 = mid + 1;
		int j = 0;

		while (i1 <= mid && i2 <= to) {
			if (array[i1].compareTo(array[i2]) < 0) {
				b[j] = array[i1];
				i1++;
			} else {
				b[j] = array[i2];
				i2++;
			}
			j++;
		}

		while (i1 <= mid) {
			b[j] = array[i1];
			i1++;
			j++;
		}

		while (i2 <= to) {
			b[j] = array[i2];
			i2++;
			j++;
		}

		for (j = 0; j < n; j++) {
			array[from + j] = b[j];
		}
	}
}
