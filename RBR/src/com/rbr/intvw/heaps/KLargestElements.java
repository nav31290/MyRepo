package com.rbr.intvw.heaps;

public class KLargestElements {
	
	static int[] findKLargestEle(int[] arr, int k){
		int size = arr.length;
		
		Heapify.buildMinHeap(arr, k);
		
		for(int i=k; i<size; i++){
			
			if(arr[0] < arr[i]){
				Heapify.swap(arr, 0, i);
				Heapify.minHeapify(arr, 0, i);
			}
			
		}
		
		return arr;
		
	}
	
	
	
	public static void main(String[] args) {
		
		int[] arr= {24,35,4,5,15,22,23};
		for(int i=0; i<arr.length; i++){
			System.out.print(" "+arr[i]);
		}
		int k=3;
		findKLargestEle(arr, k);
		System.out.println();
		for(int i=0; i<k; i++){
			System.out.print(" "+arr[i]);
		}
		
	}
}
