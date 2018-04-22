package com.rbr.intvw.arrays;

public class BinarySearchRecursion {
	
	
	static int binarySearch(int[] arr, int lIndex, int rIndex, int target){
		
		int mIndex = (lIndex+rIndex)/2;
		
		if(arr[mIndex] == target){
			return mIndex;
		}
		
		if(arr[mIndex] < target){
			return binarySearch(arr, mIndex+1, rIndex, target);
		}
		
		if(arr[mIndex] > target){
			return binarySearch(arr, lIndex, mIndex-1, target);
		}
		
		return -1;
		
	}
	
	
	
	public static void main(String[] args) {
		
		int arr[] = {2,3,4,6,8,9,12,17,20};
		int index = binarySearch(arr, 0, arr.length-1, 17);
		System.out.println("found at : "+index);
	}
	
}
