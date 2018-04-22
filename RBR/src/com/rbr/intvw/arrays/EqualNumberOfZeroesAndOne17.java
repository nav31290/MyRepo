package com.rbr.intvw.arrays;

public class EqualNumberOfZeroesAndOne17 {
	
	static void findLargestSubArray(int[] arr){
		int size = arr.length;
		int[] sumLeft = new int[size];
		int maxSize = -1, min=arr[0], max = arr[0], index;
		int startIndex = 0;
		
		sumLeft[0] = (arr[0]==0)?-1:1;
		
		for(index = 1; index<size; index++){

			sumLeft[index] = sumLeft[index-1] + ((arr[index] == 0)?-1:1);
			if (sumLeft[index] < min)
				min = sumLeft[index];
			if (sumLeft[index] > max)
				max = sumLeft[index];

		}
			
		int hash[] = new int[max - min + 1];
		for(index = 0; index < max - min + 1; index++)
			hash[index] = -1;
		for (index = 0; index < size; index++)
		{
			if (sumLeft[index] == 0)
			{
				maxSize = index + 1;
				startIndex = 0;
			}
			if (hash[sumLeft[index] - min] == -1)
				hash[sumLeft[index] - min] = index;
			else
			{
				if ((index - hash[sumLeft[index] - min]) > maxSize)
				{
					maxSize = index - hash[sumLeft[index] - min];
					startIndex = hash[sumLeft[index] - min] + 1;
				}
			}
		}

		if (maxSize == -1)
			System.out.println("No such subarray");
		else
			System.out.println("Largest sub array starts from  "+startIndex+" to "+ (startIndex + maxSize - 1));
		
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {1,0,0,1,1,1,0,0,0,0,0,1,1};
		//{1,-1,-1,1,1,1,-1,-1,-1,-1,-1,1,1};
		//sumLeft[] = {1,0,-1,0,1,2,1,0,-1,-2,-3,-2,-1}
		findLargestSubArray(arr);
		
		
	}
	
	
}
