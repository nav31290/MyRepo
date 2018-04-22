package com.rbr.algorithms.sorting;

public class CountingSort {
	
	static int[] countingSort(int[] A, int k){
		//int r=1;
		int[] c = new int[k+1];
		int n = A.length;
		int[] B = new int[n];
		
		for(int j=0; j<n; j++){
			c[A[j]] = c[A[j]]+1;
		}
		
		for(int i=1; i<=k; i++){
			c[i] = c[i-1]+c[i];
		}
		
		for(int j=n-1; j>=0; j--){
			B[c[A[j]]-1] = A[j];
			c[A[j]] = c[A[j]]-1;
		}
		
		return B;
		
	}
	
	public static void main(String[] args) {
		
		//int[] unsArr = {5,2,8,1,9,10,6,4,2,8};
		//int[] unsArr = {5,2,8,1,9,10,6,4,12,18};
		int[] unsArr = {1,2,8,1,9,3,6,4,7,4};
		//int[] unsArr = {0,4,3,2,1};
		//int[] unsArr = {5,1,3,2,0,1,5,4,1};
		System.out.print("Un-Sorted Array : ");
		for(int i=0; i<unsArr.length; i++){
			System.out.print(unsArr[i]+" ");
		}
		int[] sortArr = countingSort(unsArr,9);
		System.out.println("");
		System.out.print("Sorted Array : ");
		for(int i=0; i<sortArr.length; i++){
			System.out.print(sortArr[i]+" ");
		}
	}
}
