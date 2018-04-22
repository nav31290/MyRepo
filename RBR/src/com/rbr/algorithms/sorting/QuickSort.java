package com.rbr.algorithms.sorting;

public class QuickSort {
	
	static int partition(int arr[], int p, int r){
		//int n = arr.length;
		//int key = arr[r];
		
		int i=p-1;
		int temp;
		for(int j=p; j<r; j++){
			
			if(arr[j]<=arr[r]){
				i++;
				
				temp = arr[j];
				arr[j]  =arr[i];
				arr[i]  = temp;
			}
			
		}
		
		temp = arr[i+1];
		arr[i+1] = arr[r];
		arr[r] = temp;
		
		return i+1;
	}
	
	static int[] quickSort(int[] arr, int p, int r){
		
		if(p<r){
			
			int q = partition(arr, p, r);
			quickSort(arr, p, q-1);
			quickSort(arr, q+1, r);
		}
		
		return arr;
	}
	
	public static void main(String[] args) {

		int[] unsArr = {5,2,8,1,9,10,6,4,2,8};
		//int[] unsArr = {5,2,8,1,9,10,6,4,12,18};
		System.out.print("Un-Sorted Array : ");
		for(int i=0; i<unsArr.length; i++){
			System.out.print(unsArr[i]+" ");
		}
		int[] sortArr = quickSort(unsArr, 0, 9);
		System.out.println("");
		System.out.print("Sorted Array : ");
		for(int i=0; i<sortArr.length; i++){
			System.out.print(sortArr[i]+" ");
		}
	
		
		
	}
	
}
