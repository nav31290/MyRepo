package com.rbr.intvw.arrays;

import java.util.Arrays;

public class NumberOfTriangles27 {
	
	static int getNumberofPossibleTriangles(int[] arr){
		
		Arrays.sort(arr);
		for(int l=0; l<arr.length; l++){
			System.out.print(arr[l]+" ");
		}
		System.out.println();
		int n = arr.length;
		int i=0,j=i+1;
		
		int sum=0;
		
		for(i=0; i<=n-3;i++){
			int k = i+2;
			for(j=i+1; j<n-2;j++){
				while(k<n && (arr[i]+arr[j]>arr[k])){
					k=k+1;
				}
				sum = sum+k-j-1;
			}
			
			
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {6,7,8,10,12,14,50};
		System.out.println(getNumberofPossibleTriangles(arr));
		
	}
	
}
