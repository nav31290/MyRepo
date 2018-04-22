package com.rbr.intvw.arrays;

public class RotationOfArray23 {
	//approach 2 --> T(n) = O(n); S(n) = O(d)
	static void rotateArrayByDelements(int[] arr, int d){
		
		for(int i=0; i<d; i++){
			rotateArray(arr);
		}
		
	}
	
	static void rotateArray(int[] arr){
		
		int temp = arr[0];
		int n = arr.length;
		for(int i=1;i<n;i++){
			arr[i-1] = arr[i];
		}
		
		arr[n-1] = temp;
		
	}
	
	//approach 3 -> using gcd(euclids agorithm) : t=o(n);s=o(1)
	static int gcd(int size, int d){
		
		return (d==0) ? size : gcd(d, size%d); 
		
	}
	
	static void RotateLeft(int arr[], int d, int size)
	{
		int index1, index2, index3, temp;
		for(index1 = 0; index1 < gcd(size, d); index1++)
		{
			temp = arr[index1];
			index2 = index1;
			while(true)
			{
				index3 = index2 + d;
				if(index3 >= size)
					index3 = index3 - size;
				if(index3 == index1)
					break;
				arr[index2] = arr[index3];
				index2 = index3;
			}
			arr[index2] = temp;
		}
	}
	
	//aaproach 3 : reverse/ t=o(n)
	
	static void rotateArray(int[] arr, int d){
		
		reverseArray(arr, 0, d-1);
		reverseArray(arr, d, arr.length-1);
		reverseArray(arr, 0, arr.length-1);
		
	}
	
	static void reverseArray(int[] arr,int start, int last){
		
		int l = start,r=last;
		while(l<r){
			swap(arr, l, r);
			l++;
			r--;
		}
			
	}
	
	static void  swap(int arr[],int l, int r){
		int n = arr.length;
		arr[l] = arr[l]+arr[r];
		arr[r] = arr[l]-arr[r];
		arr[l] = arr[l]-arr[r];
	}
	
	
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		System.out.println("before rotation : ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		/*rotateArrayByDelements(arr,4);
		System.out.println("after rotation : ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();*/
		/*RotateLeft(arr, 2, arr.length);
		System.out.println("after rotation : ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}*/
		
		rotateArray(arr, 4);
		System.out.println("after rotation : ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
	
}
