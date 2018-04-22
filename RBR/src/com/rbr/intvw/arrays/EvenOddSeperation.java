package com.rbr.intvw.arrays;

public class EvenOddSeperation {
	
	static int[] seperateEvenOdd(int[] arr){
		int n = arr.length;
		
		int l=0,r=arr.length-1;
		for(int i=0;i<n;i++){
			if(l<r){
				if(arr[l]%2==0){
					l++;
				}
				
				if(arr[r]%2!=0){
					r--;
				}
				
				if(arr[l]%2!=0 && arr[r]%2==0){
					swap(arr,l,r);
				}
				
			}
			
		}
		
		return arr;
		
	}
	
	static void swap(int arr[],int l, int r){
		
		arr[l] = arr[l]+arr[r];
		arr[r] = arr[l]-arr[r];
		arr[l] = arr[l]-arr[r];
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,4,6,3,7,4,9,13,12};
		int[] arr1 = seperateEvenOdd(arr);
		for(int i=0; i<arr1.length; i++){
			System.out.println(arr1[i]);
		}
	}
	
}
