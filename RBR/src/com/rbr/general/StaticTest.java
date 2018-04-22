package com.rbr.general;

import java.util.ArrayList;

public class StaticTest {
	
	private static ArrayList<int[][]> storedBitMap = new ArrayList<int[][]>(10);
	
	
	
	static void test(){
		storedBitMap.add(new int[][]{{1,2},{3,4},{5,6}});
	}
	//=0;
	
	
	public static void main(String[] args) {
		//System.out.println(i);
		
		ArrayList<Integer> al = new ArrayList<>(10);
		//System.out.println(al.size());
		test();
		System.out.println(storedBitMap.size());
		for(int i=0; i<storedBitMap.size(); i++){
		System.out.println(storedBitMap.get(i)[i][i]);
		
		}
		
		//int[][] arr = new int[2][];
		int[][] arr = {{1,2},{3,4},{5,6}};
		for(int i=0; i<arr.length; i++){
			
			for(int j=0; j<arr.length; j++){
				System.out.println(arr[i][j]);
			}
		}
		
	}
}
