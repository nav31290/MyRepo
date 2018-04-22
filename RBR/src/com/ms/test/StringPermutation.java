package com.ms.test;

public class StringPermutation {
	public  void permutation(String str)  { 
	    permutation("", str); 
	}

	private  void permutation(String prefix, String str)  {
	    int n = str.length();
	    if (n == 0) System.out.println("output : "+prefix);
	    else {
	        for (int i = 0; i < n; i++){
	        	
	        	System.out.println("value of i : "+i);
	        	
	        	String l = prefix + str.charAt(i);
	        	System.out.println("l-->> "+l);
	        	String m = str.substring(0, i);
	        	System.out.println("m -->> "+m );
	        	String k= str.substring(i+1, n);
	        	System.out.println("k--> "+k);
	        	String o = m+k;
	        	System.out.println("o---> "+o);
	        	
	            permutation(l, o);
	        }
	    }
	}
	
	
	public static void main(String[] args)  {
		
		String s = "abcd";
		StringPermutation spr = new StringPermutation();
		spr.permutation(s);
		
		//System.out.println(s);
		
		
	}
	
	
}
