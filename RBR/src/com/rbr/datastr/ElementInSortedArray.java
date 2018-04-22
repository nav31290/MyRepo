package com.rbr.datastr;

import java.util.Scanner;

public class ElementInSortedArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(getDistinct(n, arr));
		}
		sc.close();
	}

	public static int getDistinct(int n, int arr[]) {
		if (arr[0] != arr[1])
			return arr[0];
		for (int i = 1; i < n - 1; i++) {
			if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1])
				return arr[i];
		}
		return arr[n - 1];
	}
}
