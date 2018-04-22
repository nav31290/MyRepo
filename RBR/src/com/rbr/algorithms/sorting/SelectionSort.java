package com.rbr.algorithms.sorting;

public class SelectionSort {
	
	static int[] selectionSort(int[] a){
		int n= a.length;
		int i,j,min,temp;

		for(i=0; i<n-1; i++){//last element will be in its place

			min = i;
			for(j=i+1; j<n; j++){

				if(a[j]<a[min]){
					min = j;
				}
			}

			temp = a[i];
			a[i] = a[min];
			a[min] = temp;


		}

		return a;

	}
	
	
	public static void main(String[] args) {
		

		//int[] unsArr = {5,2,8,1,9,10,6,4,2,8};
		int[] unsArr = {5,2,8,1,9,10,6,4,12,18};
		System.out.print("Un-Sorted Array : ");
		for(int i=0; i<unsArr.length; i++){
			System.out.print(unsArr[i]+" ");
		}
		int[] sortArr = selectionSort(unsArr);
		System.out.println("");
		System.out.print("Sorted Array : ");
		for(int i=0; i<sortArr.length; i++){
			System.out.print(sortArr[i]+" ");
		}
	
		
	}
}
