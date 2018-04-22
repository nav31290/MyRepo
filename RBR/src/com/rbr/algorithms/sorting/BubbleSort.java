package com.rbr.algorithms.sorting;

public class BubbleSort {
	
	static int[] buubleSort(int arr[]){
		
		int n = arr.length;
		int swapped = 0;
		
		for(int i=0; i<n; i++){
			
			for(int j=0; j<n-i-1; j++){
				
				if(arr[j]>arr[j+1]){
					swap(arr,j,j+1);
					/*int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;*/
					swapped = 1;
					
				}
				
				if(swapped == 0){
					break;
				}
			}
			
		}
		
		return arr;
		
	}
	
	static void swap(int[] arr,int a, int b){
		
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
	}
	
	
	public static void main(String[] args) {
		
		//int[] unsArr = {5,2,8,1,9,10,6,4,2,8};
				int[] unsArr = {5,2,8,1,9,10,6,4,12,18};
				System.out.print("Un-Sorted Array : ");
				for(int i=0; i<unsArr.length; i++){
					System.out.print(unsArr[i]+" ");
				}
				int[] sortArr = buubleSort(unsArr);
				System.out.println("");
				System.out.print("Sorted Array : ");
				for(int i=0; i<sortArr.length; i++){
					System.out.print(sortArr[i]+" ");
				}
		
	}
}
