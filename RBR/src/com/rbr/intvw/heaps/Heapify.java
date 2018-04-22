package com.rbr.intvw.heaps;

public class Heapify {
	
	static void minHeapify(int[] arr, int index, int size){
		
		int left = 2*index+1;
		int right = 2*index+2;
		int smallest = index;
		
		if(left<size && arr[left] < arr[index]){
			smallest = left;
		}
		if(right<size && arr[right] < arr[smallest]){
			smallest = right;
		}
		
		if(smallest != index){
			swap(arr, index, smallest);
			minHeapify(arr, smallest, size);
		}
		
	}
	
	
	static void buildMinHeap(int[] arr, int size){
		
		for(int index = size/2 ; index>=0; index-- ){
			minHeapify(arr, index, size);
		}
		
	}
	
	static void swap(int[] arr, int a, int b){
		
		arr[a] = arr[a]+arr[b];
		arr[b] = arr[a]-arr[b];
		arr[a] = arr[a]-arr[b];
	}
	
	public static void main(String[] args) {
		
		int[] arr = {5,4,6,8,9,2,1,12};
		for(int i=0; i<arr.length; i++){
			System.out.print(" "+arr[i]);
		}
		Heapify hp = new Heapify();
		hp.buildMinHeap(arr, 8);
		System.out.println(" after heapify..");
		for(int i=0; i<arr.length; i++){
			System.out.print(" "+arr[i]);
		}
		
	}
	
}
