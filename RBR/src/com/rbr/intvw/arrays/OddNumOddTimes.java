package com.rbr.intvw.arrays;

import java.util.HashMap;
import java.util.Map;

public class OddNumOddTimes {
	
	static int findOddNumOccuringOddTimes(int[] arr){
		int n = arr.length;
		HashMap<Integer, Integer> map = new HashMap<>();		
		for(int i=0; i<n; i++){
			
				if(map.get(arr[i])==null){
					map.put(arr[i], 1);
				}
				else{
					map.put(arr[i], map.get(arr[i])+1);
				}
			
		}
		//System.out.println(map);
		for(int i=0; i<n; i++){
			int count = map.get(arr[i]);
			if(count%2 !=0){
				return arr[i];
			}
		}
		
		return -1;
		
	}
	
	static int approach2(int[] arr){
		int n= arr.length;
		int result = 0;
		for(int i=0; i<n; i++){
			result = result^arr[i];
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		int[] arr= {3,2,1,2,3,1,1};
		
		System.out.println("odd no occuring odd no of times : "+findOddNumOccuringOddTimes(arr));
		
		int[] arr1= {1,2,3,2,1,2,3};
		System.out.println("odd no occuring odd no of times from approach 2 : "+findOddNumOccuringOddTimes(arr1));
		
	}
}
