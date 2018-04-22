package com.rbr.intvw.arrays;

public class MaxDiffApproach3 {
	
	static int maxDiff(int arr[]){
		
		int n = arr.length;
		int minSoFar = arr[0];
		int maxDiff = arr[1]-arr[0];
		for(int i=1; i<n ;i++){
			
			if(arr[i] < minSoFar){
				minSoFar = arr[i];
			}
			else{
				int diff = arr[i]-minSoFar;
				if(diff>maxDiff){
					maxDiff = diff;
				}
				
			}
		}
		
		return maxDiff;
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {4,3,10,2,9,1,6};
		System.out.println("max diff : "+maxDiff(arr));
		
	}
	
	
}
