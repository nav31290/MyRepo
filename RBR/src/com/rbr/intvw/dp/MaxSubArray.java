package com.rbr.intvw.dp;

public class MaxSubArray {
	
	static int max_sub_array(int[] arr){
		
		int max_sum_sofar = 0;
		int curr_sum = 0;
		int index = -1;
		for(int i=0; i<arr.length; i++){
			
			curr_sum += arr[i];
			
			if(curr_sum < 0){
				curr_sum = 0;
			}
			
			if(curr_sum > max_sum_sofar){
				max_sum_sofar = curr_sum;
				index = i;
			}
			
			
			
		}
		int sum=0;
		int lIndex = 0;
		for(int j=index; j>=0; j--){
			sum += arr[j];
			if(sum==max_sum_sofar){
				lIndex = j;
			}
		}
		System.out.println(" left Index : "+lIndex+ " right index : "+index);
		return max_sum_sofar;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {10,-5,-3,4,2,12,-8,-12,19};
		
		System.out.println(max_sub_array(arr));
		
	}
	
}
