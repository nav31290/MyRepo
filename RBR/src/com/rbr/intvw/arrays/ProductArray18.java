package com.rbr.intvw.arrays;

public class ProductArray18 {
	
	int[] getProdArray(int[] arr){
		int size = arr.length;
		
		int temp = 1;
		int[] prod = new int[size];
		for(int i=0; i<size; i++){
			
			prod[i] = temp;
			temp *= arr[i];
			
		}
		temp = 1;
		
		for(int i=size-1; i>=0; i++){
			
			
			prod[i] = temp*prod[i];
			temp = temp*arr[i];
			
		}
				
		return prod;
		
		
	}
	
	public static void main(String[] args) {
		
	}
	
}
