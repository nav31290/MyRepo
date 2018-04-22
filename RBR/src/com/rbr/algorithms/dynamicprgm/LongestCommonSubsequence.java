package com.rbr.algorithms.dynamicprgm;

public class LongestCommonSubsequence {
	
	static int LCS(String x, String y){
		char[] x1 = x.toCharArray();
		char[] y1 = y.toCharArray();
		int m = x.length();
		int n = y.length();
		
		int c[][] = new int[x1.length+1][y1.length+1];
		
		for(int i=1; i<=m; i++){
			
			for(int j=1; j<=n; j++){
				
				 if(x1[i-1] == y1[j-1]){
					c[i][j] = 1+ c[i-1][j-1];
				}
				
				else{
					c[i][j] = max(c[i-1][j],c[i][j-1]);
				}
				
				
			}
			
		}
		
		return c[m][n];
		
	}
	
	static int max(int a, int b){
		return a>b? a : b;
	}
	
	public static void main(String[] args) {
		
		String x = "ravindra";
		String y = "ajay";
		System.out.println(LCS(x, y));
		
	}
	
	
}
