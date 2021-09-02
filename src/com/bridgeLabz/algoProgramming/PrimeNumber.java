package com.bridgeLabz.algoProgramming;

public class PrimeNumber {

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
		
		for (int i=0;i<1000;i++) {
			if (prime(i)) {
				System.out.println(i);
			}
		}
	}
}
