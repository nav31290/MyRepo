package com.rbr.general;

import java.util.Vector;

public class MatrixTest {
	
	
	public static void main(String[] args) {
		
		Vector<Vector<Integer>> matrix  = new Vector<>();
		
		for(int i=0; i<3; i++){
			Vector<Integer> r = new Vector<>();
			
			for(int j=0; j<3; j++){
				r.add(j);
			}
			
			matrix.add(r);
		}
		
		for(int i=0;i<3;i++){
	        Vector<Integer> r=matrix.get(i);
	        for(int j=0;j<3;j++){
	            System.out.print(r.get(j));
	        }
	        System.out.println();
	    }
		
		
	}
}
