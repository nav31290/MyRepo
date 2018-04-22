package com.rbr.algorithms.dynamicprgm;

public class MemoizedMatrixChain {
	
	static int memoized_matrix_chain(int[] p){
		int n = p.length-1;
		int[][] m = new int[n+1][n+1];
		
		for(int i=0; i<=n; i++){
			for(int j=0; j<=n; j++){
				m[i][j] = Integer.MAX_VALUE;
			}
		}
		
		return lookup_chain(m,p,1,n);
	}
	
	static int lookup_chain(int[][] m, int[] p, int i, int j){
		
		if(m[i][j] < Integer.MAX_VALUE){
			return m[i][j];
		}
		
		if(i==j){
			m[i][j] = 0;
		}
		else{
			for(int k=i; k<=j-1; k++){
				int q = lookup_chain(m, p, i, k) + lookup_chain(m, p, k+1, j) + (p[i-1]*p[k]*p[j]);
				
				if(q<m[i][j]){
					m[i][j] = q;
				}
			}
		}
		return m[i][j];
	}
	
	public static void main(String[] args) {


		int[] p = {1,2,1,4,1};

		System.out.println(memoized_matrix_chain(p));

		/*for(int i=0; i<m.length; i++){
			for(int j=0; j<m.length; j++){
				System.out.println("m["+i+"]"+"["+j+"]  :  "+m[i][j]);
			}
		}
	}*/
	}
	
}
