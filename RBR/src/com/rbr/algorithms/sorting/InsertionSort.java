package com.rbr.algorithms.sorting;

public class InsertionSort {
	
	static int[] insertionSort(int[] unsortedArr){
		
		int size = unsortedArr.length;
		for(int i=1; i<size; i++){
			
			int key = unsortedArr[i];
			int j=i-1;
			
			while(j>=0 && key<unsortedArr[j]){
				
				unsortedArr[j+1]=unsortedArr[j];
				j=j-1;
				
			}
			unsortedArr[j+1]=key;
		}
		return unsortedArr;
		
	}
	
	public static void main(String[] args) {
		int[] unsArr = {5,2,8,1,9,10,6,4,2,8};
		System.out.print("Un-Sorted Array : ");
		for(int i=0; i<unsArr.length; i++){
			System.out.print(unsArr[i]+" ");
		}
		int[] sortArr = insertionSort(unsArr);
		System.out.println("");
		System.out.print("Sorted Array : ");
		for(int i=0; i<sortArr.length; i++){
			System.out.print(sortArr[i]+" ");
		}
	}
	
	
}
