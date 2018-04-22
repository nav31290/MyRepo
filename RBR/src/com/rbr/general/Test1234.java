package com.rbr.general;

import java.util.HashMap;

public class Test1234 {
	
 void swap(int[] arr, int a, int b){
		
		arr[a] = arr[a]+arr[b];
		arr[b] = arr[a]-arr[b];
		arr[a] = arr[a]-arr[b];
	}
	
	public static void main(String[] args) {
		String acc = "asd";
		//acc.ma
		//System.out.println(acc.trim());
		
		HashMap<String, String> accDetails = new HashMap<String, String>();
		accDetails.put("AccNumber", null);
		
		Test1234 t = new Test1234();
		int[] arr = {1,2,3,4,5,6};
		t.swap(arr, 2, 4);
		for(int i=0; i< arr.length; i++){
			System.out.print("  "+arr[i]);
		}
	}
	
	
}
