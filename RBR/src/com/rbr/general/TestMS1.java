package com.rbr.general;

public class TestMS1 {
	
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
	
	public static int solution(int[] A) {

		if (A == null || A.length < 3)
			throw new RuntimeException("Cannot find equilirbium");
		int pointer = 1;
		int lowerIndCount = A[0];
		int upperIndCount = 0;

		for (int i = 2; i < A.length; i++) {
			upperIndCount += A[i];
			if (lowerIndCount < 0) {
				if (upperIndCount > lowerIndCount && i != A.length - 1)
					continue;
				if (upperIndCount == lowerIndCount && i == A.length - 1)
					break;
				lowerIndCount += A[pointer];
				upperIndCount = 0;
				++pointer;
				i = pointer;
			} else {
				if (upperIndCount > lowerIndCount) {
					lowerIndCount += A[pointer];
					upperIndCount = 0;
					++pointer;
					i = pointer;
				}
			}
		}

		if (upperIndCount == lowerIndCount)
			return pointer;

		return -1;
	}
	
	
	
	public static void main(String[] args) {
		int[] arr = {4,3,1,8,5,3};
		//findEqui(arr);
		System.out.println(solution(arr));
		
	}
}
