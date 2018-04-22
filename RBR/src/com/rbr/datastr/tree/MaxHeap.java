package com.rbr.datastr.tree;

public class MaxHeap {
	
	void max_heapify(int[] a, int i, int n){
		int l = 2*i+1;
		int r = 2*i+2;
		int largest=i;
		
		/*if(l<a.length && a[l] > a[i]){
			largest = l;
		}*/
		if(l<n && a[l] > a[i]){
			largest = l;
		}
		
		/*if(r<a.length && a[r] > a[largest]){
			largest = r;
		}*/
		if(r<n && a[r] > a[largest]){
			largest = r;
		}
		
		if(largest!=i){
			swap(a,i,largest);
			/*int temp = a[i];
			a[i] = a[largest];
			a[largest] = temp;*/
			
			/*max_heapify(a, largest, a.length);*/
			max_heapify(a, largest, n);
		}
	}
	
	void swap(int[] a,int x, int y){
		a[x] = a[x]+a[y];
		a[y] = a[x]-a[y];
		a[x] = a[x]-a[y];
	}
	
	void buildMaxHeap(int a[]){
		for(int i = a.length/2;i>=0;i--){
			max_heapify(a, i, a.length);
		}
	}
	
	void heap_sort(int[] a){
		
		buildMaxHeap(a);
		int heapLength = a.length;
		for(int i= a.length-1; i>=1; i--){
			swap(a, 0, i);
			heapLength = heapLength-1;
			//a.length = a.length-1;
			max_heapify(a, 0, heapLength);
		}
		
	}
	
	public static void main(String[] args) {
		
		MaxHeap mh = new MaxHeap();
		int[] a = {9,6,5,0,8,2,1,3};
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("after");
		/*mh.buildMaxHeap(a);
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}*/
		
		mh.heap_sort(a);
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
	}
	
	
}
