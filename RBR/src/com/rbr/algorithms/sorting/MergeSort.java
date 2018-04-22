package com.rbr.algorithms.sorting;

public class MergeSort {
	
	static void merge(int arr[], int p, int q, int r){

		int n1 = q-p+1;
		int n2 = r-q;
		int[] left = new int[n1];
		int[] right = new int[n2];

		for(int i=0;i<n1;i++){
			left[i] = arr[p+i];
		}
		for(int j=0;j<n2;j++){
			right[j]=arr[q+1+j];
		}

		//left[n1] = 123456;
		//right[n2] = 445678;

		int i=0,j=0;
		int k=p;
		while(i<n1 && j<n2){
			
			if(left[i] < right[j]){
				arr[k] = left[i];
				i++;
			}
			else{
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i<n1){
			arr[k] = left[i];
			i++;
			k++;
		}
		
		while(j<n2){
			arr[k] = right[j];
			k++;
			j++;
		}
		
		
		
		/*for(int k=p;k<=r;k++){
			
			if(i==n1){
				while(j<n2){
					arr[k]=right[j];
					j++;
					k++;
				}
			}
			
			else if(j==n2){
				
				while(i<n1){
					arr[k]=left[i];
					i++;
					k++;
				}
				
			}

			else if(left[i] <= right[j]){
				arr[k]=left[i];
				i++;
			}
			else{
				arr[k]=right[j];
				j++;
			}

		}*/

	}
	
	static int[] mergeSort(int arr[], int p, int r){
		
		if(p<r){
			
			int q = (p+r)/2;
			mergeSort(arr, p, q);
			mergeSort(arr, q+1, r);
			merge(arr, p, q, r);
			
		}
		
		return arr;
		
	}
	
	public static void main(String[] args) {

		//int[] unsArr = {5,2,8,1,9,10,6,4,2,8};
		int[] unsArr = {5,2,8,1,9,10,6,4,12,18};
		System.out.print("Un-Sorted Array : ");
		for(int i=0; i<unsArr.length; i++){
			System.out.print(unsArr[i]+" ");
		}
		int[] sortArr = mergeSort(unsArr, 0, 9);
		System.out.println("");
		System.out.print("Sorted Array : ");
		for(int i=0; i<sortArr.length; i++){
			System.out.print(sortArr[i]+" ");
		}
	
		
		
	}
	
}
