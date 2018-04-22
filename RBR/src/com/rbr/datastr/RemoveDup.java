package com.rbr.datastr;

public class RemoveDup {
	        /*You are required to complete this function */
		static int remove_duplicate(int arr[])
		{
			// Your code here
			int n=arr.length;
			if (n==0 || n==1)
	            return n;
	      
	        // To store index of next unique element
	        int j = 0;
	      
	        // Doing same as done in Method 1
	        // Just maintaining another updated index i.e. j
	        for (int i=0; i < n-1; i++)
	            if (arr[i] != arr[i+1])
	                arr[j++] = arr[i];
	      
	        arr[j++] = arr[n-1];
	      
	        return j;
			
		}
		
		public static void main(String[] args) {
			
			int[] arr = {1,2,2,4,4,7,7,7,9};
			int j = remove_duplicate(arr);
			for(int i=0; i<j; i++){
				System.out.print(" "+arr[i]);
			}
			System.out.println();
			
		}
}
