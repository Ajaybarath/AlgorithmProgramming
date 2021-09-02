package com.bridgeLabz.algoProgramming;

import java.util.Scanner;

public class FindYourNumber {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		System.out.println("Think of a number between 0 to N");

		System.out.println("Enter a number where N = 2^n");

		int N = s.nextInt();

		int status = 0;

		System.out.println("Enter 1 if higher or enter 0 if lower and 2 if that is the number");

		int left = 0, right = N - 1;
		int mid = 0;
		while (left <= right) {
			mid = left + (right - left) / 2;

			System.out.println("Is is greater or lower than " + mid);
			int res = s.nextInt();
			
			if (res ==2)
				break;

			if (res == 1)
				left = mid + 1;

			else
				right = mid - 1;
		}
		
		System.out.println("The number is " + mid);

	}

}
