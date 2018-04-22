package com.rbr.intvw.strings;

public class CheckAnagrams {
	
	static boolean checkAnagrams(String str1, String str2){
		
		int n1 = str1.length();
		int n2 = str2.length();
		
		if(n1 != n2){
			return false;
		}
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		int[] hash1 = new int[26];
		int[] hash2 = new int[26];
		
		for(int i=0; i<n1; i++){
			
			hash1[ch1[i]-'a']++;
			hash2[ch2[i]-'a']++;
			
		}
		
		for(int i=0; i<26; i++){
			
			if(hash1[i] != hash2[i]){
				return false;
			}
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
		
		String s1 = "angle";
		String s2 = "angle";
		
		System.out.println(" anagram ? : "+CheckAnagrams.checkAnagrams(s1, s2));
		
	}
	
	
}
