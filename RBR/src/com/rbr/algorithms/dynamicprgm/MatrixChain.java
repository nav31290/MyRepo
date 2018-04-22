package com.rbr.algorithms.dynamicprgm;

public class MatrixChain {
	
	static int[][] matrix_chain(int[] p){
		
		int n = p.length-1;
		int[][] m = new int[n+1][n+1];
		int[][] s = new int[n+1][n+1];
		
		for(int i=1; i<n; i++){
			m[i][i] = 0;
		}
		
		for(int l=2; l<=n; l++){
			
			for(int i=1; i<=(n-l+1); i++){
				
				int j = i+l-1;
				m[i][j] = Integer.MAX_VALUE;
				
				for(int k=i; k<=j-1; k++){
					
					int q = m[i][k]+m[k+1][j] + (p[i-1]*p[k]*p[j]);
					System.out.println(" q : "+q);
					if(q<m[i][j]){
						m[i][j]=q;
						s[i][j]=k;
					}
					
				}
				
				
			}
			
			
		}
		
		return m;
		
	}
	
	public static void main(String[] args) {
		
		int[] p = {1,2,1,4,1};
		
		int[][] m = matrix_chain(p);
		
		for(int i=0; i<m.length; i++){
			for(int j=0; j<m.length; j++){
				System.out.println("m["+i+"]"+"["+j+"]  :  "+m[i][j]);
			}
		}
	}
	
}
