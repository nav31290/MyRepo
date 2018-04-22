package com.rbr.intvw.arrays;

import java.util.HashSet;
import java.util.Set;

public class PairSum {
	
	static boolean pairSum(int[] arr, int x){
		
		for(int i=0; i<arr.length; i++){
			
			int dif = x-arr[i];
			
			for(int j=0; j<arr.length; j++){
				
				if(arr[j]==dif){
					return true;
				}
			}
			
		}
		
		return false;
		
	}
	
	static boolean pairSumUsingHash(int[] arr, int x){
		
		Set<Integer> num = new HashSet<>();
		for(int i=0; i<arr.length; i++){
			int diff = x-arr[i];
			if(num.contains(diff)){
				return true;
			}
			else{
				num.add(arr[i]);
			}
			
			//System.out.println(num);
		}
		return false;
	}
	
	static void findAllPairs(int[] arr, int x){
		
		Set<Integer> num = new HashSet<>();
		for(int i=0; i<arr.length; i++){
			int diff = x-arr[i];
			if(num.contains(diff)){
				System.out.println("pair found : "+arr[i]+ " : "+diff);
			}
			else{
				num.add(arr[i]);
			}
			
			//System.out.println(num);
		}
		
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,5,2,8,12,34,21,53,5};
		
		boolean result = pairSumUsingHash(arr, 10);
		System.out.println("found : "+result);
		findAllPairs(arr, 10);
		
	}
}
