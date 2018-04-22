package com.ms.test;

import java.util.Arrays;

public class StringPresentInOneAndNotInAnotherArray {
	
	
	static int[] sample(int[] arr1, int[] arr2) throws Exception{
		
		int n1 = arr1.length;
		int n2 = arr2.length;
		int k=0;
		int[] result = new int[n1>n2?n1:n2];
		//System.out.println("size of rsult : "+result.length);
		boolean match;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int value=0;
		int countOuter=0;
		int countInner=0;
		for(int i=0; i<n1; i++){
			countOuter++;
			match = false;
			//System.out.println("first array : "+arr1[i]);
			for(int j=value; j<n2; j++){
				countInner++;
				if(arr1[i]==arr2[j]){
					//System.out.println("both are equal "+arr1[i]+" "+arr2[j]);
					match = true;
					break;
				}
				else if(arr1[i]<arr2[j]){
					break;
				}
				else{
					value++;
				}
				
				
			}
			//System.out.println("first array here : "+arr1[i]+ " "+match);
			if(!match){
				result[k++] = arr1[i];
			}
			
		}
		System.out.println("outer loop : "+countOuter+ " inner loop :"+countInner);
		return result;
		
	}
	
	public static void main(String[] args) throws Exception {
		
		int[] arr1 = {1,2,4,8,7,6};
		int[] arr2 = {9,4,8,3,10};
		
	    int[] result = sample(arr1, arr2);
	    for(int i =0; i<result.length; i++){
	    	System.out.println(result[i]);
	    }
		
	}
}
