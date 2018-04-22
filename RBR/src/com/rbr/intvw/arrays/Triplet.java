package com.rbr.intvw.arrays;

import java.util.Arrays;

public class Triplet {
	
	//T(n) = o(n^3)
	static void findTriplet(int[] arr,int num){
		int n= arr.length;
		for(int i=0; i<n; i++){
			
			for(int j=i+1; j<n; j++){
				
				for(int k=j+1; k<n; k++){
					
					if(arr[i]+arr[j]+arr[k]==num){
						System.out.println(" i : "+i+" j : "+j+" k : "+k);
					}
					
				}
			}
			
		}
		
	}
	
	static void findTripletAppr2(int[] arr, int num){
		int n = arr.length;
		//Arrays.sort(arr);
		for(int i=0; i < n;i++){
			
			for(int j=i+1; j<n-1;j++){
				//System.out.println(" arr[i] : "+arr[i]+ " arr[j] : "+arr[j]);
				int diff = num-(arr[i]+arr[j]);
				//System.out.println();
				//System.out.println("j+1 : "+(j+1)+" arr[j+1]: "+arr[j+1]+ " n-1 : "+(n-1)+" arr[n-1] : "+arr[n-1]+" diff : "+diff);
				int res = binarySearch(arr, j+1, n-1, diff);
				//System.out.println("res : "+res);
				if(res!=-1){
					System.out.println("from appr 2 : : "+i+" "+j+" "+res);
				}
			}
		}
		
		
	}
	
	//T(n) = o(n^2 log n)
	static int binarySearch(int arr[], int strt, int end, int key){
		
		int mid = (strt+end)/2;
		//System.out.println("mid : "+mid);
		//System.out.println("strt : "+strt+ " end : "+end);
		//base case
		if(strt>end){
			return -1;
		}
		
		else if(key==arr[mid]){
			return mid;
		}
		else if(key< arr[mid]){
			return binarySearch(arr, strt, mid-1, key);
		}
		else {
			return binarySearch(arr, mid+1, end, key);
		}
		
		
	}
	
	//T(n) = o(n^2)
	static void findTripletAppr3(int[] arr, int num){
		int n= arr.length;
		
		Arrays.sort(arr);
		for(int i=0; i<n; i++){
			
			int left = i+1;
			int right = n-1;
			int sum = num-(arr[i]);
			while(left<right){
				
				if(sum==(arr[left]+arr[right])){
					System.out.println(i+" "+left+" "+right);
					break;
				}
				else if(sum < (arr[left]+arr[right])){
					right--;
				}
				else{
					left++;
				}
				
			}
			
		}
	
	}
	
	
	
	
	public static void main(String[] args) {
		
		int[] arr = {6,9,1,4,2,7};
		//findTriplet(arr, 7);
		//Arrays.sort(arr);
		//int key = binarySearch(arr, 0, 5, 5);
		//System.out.println(key);
		findTripletAppr2(arr, 9);
		findTripletAppr3(arr, 9);
	}
	
	
}
