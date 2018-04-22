package com.rbr.intvw.arrays;

public class Equilibrium {
	
	static void findEquilibrium(int[] arr){
		int n= arr.length;
		
		int sum=0;
		for(int i=0; i<n; i++){
			sum+= arr[i];
		}
		int lSum = 0;
		for(int i=0; i<n; i++){
			sum = sum-arr[i];
			if(lSum == sum){
				System.out.println("equilibrium :: "+i);
			}
			else{
				lSum = lSum+arr[i];
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		int arr[] = {7,2,1,4,6,4,0};
		findEquilibrium(arr);
		
	}
	
}
