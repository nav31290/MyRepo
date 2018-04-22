package com.rbr.general;

public class RotateArray {
	
	
	static void leftRotate(int[] arr, int d){
		
		for(int i=0; i<d; i++){
			leftRotatebyOne(arr);
		}
	}
	
	static void leftRotatebyOne(int[] arr){
		int n = arr.length;
		int temp = arr[0];
		for(int i=0; i<n-1; i++){
			arr[i] = arr[i+1];
		}
		arr[n-1] = temp;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7};
		leftRotate(arr, 3);
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
		System.out.println();
	}
}
