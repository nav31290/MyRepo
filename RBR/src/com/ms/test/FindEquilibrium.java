package com.ms.test;

public class FindEquilibrium {
	
	static void findEqui(int[] arr){
		int n = arr.length;
		int sum1=0;
		int sum2=0;
		int count=0;
		for(int i=1; i<n-1; i++){

			for(int j=i-1; j<i; j++){
				sum1+=arr[j];
			}
			if(count==0){
				for(int k=i+1; k<n; k++){
					sum2+=arr[k];
				}
				count++;
			}
			else{
				sum2-=arr[i];
			}
			System.out.println(sum1+" : "+sum2);
			if(sum1 == sum2){
				System.out.println(i);
				break;
			}
		}
		
		
	}
	
	
	public static void main(String[] args) {
		int[] arr = {4,3,1,8,5,3};
		//findEqui(arr);
		findEqui(arr);
		
	}
}
