package com.rbr.intvw.arrays;

import java.util.Arrays;

public class NextGreaterNumber25 {
	
	static void getNextGreaterNumber(int[] arr){
		int indexReplace=-1;
		int size = arr.length;
		for(int i=arr.length-1; i>0; i--){
			if(arr[i-1]<arr[i]){
				indexReplace = i-1;
				break;
			}
			
			
		}
		if(indexReplace==-1){
			System.out.println("not possible***");
		}
		else{
			int min = arr[indexReplace+1];
			int indexToBeReplaced = indexReplace+1;
			for(int i=indexReplace+2;i<size;i++){
				
				if(arr[i]< min && min>arr[indexReplace]){
					System.out.println("min : "+min);
					min = arr[i];
					indexToBeReplaced = i;
				}
				
			}
			System.out.println("indexReplace : "+indexReplace);
			System.out.println("indexToBeReplaced : "+indexToBeReplaced);
			//swap
			arr[indexReplace] = arr[indexToBeReplaced]+arr[indexReplace];
			arr[indexToBeReplaced] = arr[indexReplace] - arr[indexToBeReplaced];
			arr[indexReplace] = arr[indexReplace] - arr[indexToBeReplaced];
			
			Arrays.sort(arr,indexReplace+1, size);
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {2,1,8,7,6,5};
		getNextGreaterNumber(arr);
		System.out.println("next gratest number : ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
}
