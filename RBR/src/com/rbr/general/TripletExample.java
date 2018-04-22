package com.rbr.general;

public class TripletExample {
	
	static void findTriplet(int[] arr){
		int n= arr.length;

		for(int i=0; i<n; i++){
			int key = arr[i];

			for(int j=0; j<n&&j!=i; j++){

				int first = arr[j];
				for(int k=0; k<n&&(k!=i || k!=j); k++){
					int diff = arr[k]-first;
					if(diff == key){
						System.out.println("  >>> "+key+"  >>>  "+first+"  >>>  "+arr[k]);
						break;
					}
				}
			}
		}
		System.out.println("not found ::: ");
	}
	
	
	public static void main(String[] args) {
		
		//int[] arr = {5, 32, 1, 7, 10, 50, 19, 21, 2};
		int[] arr = {5, 32, 1, 27, 19, 28, 21, 10, 2};
		findTriplet(arr);
		
	}
}
