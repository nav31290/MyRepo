package com.rbr.intvw.strings;

import java.util.Arrays;


public class MaxOccChar {
	
	
	static void findMaxOccChar3(String str){
		
		char[] ch = str.toCharArray();
		int[] temp = new int[256];
		for(int i=0; i<ch.length; i++){
			
			temp[ch[i]]++;
			
		}
		int max = -1;
		char res='0';
		for(int i=0; i<ch.length ; i++){
			
			if(temp[ch[i]]>max){
				max = temp[ch[i]];
				res = ch[i];
			}
			
		}
		
		System.out.println("max occ char method 3 :: "+res+" no of times occured : "+max);
	}
	
	
	
	//o(nlogn)
	static void findMaxOccrChar2(String str){
		
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		
		/*for(int i=0;i<ch.length;i++){
			System.out.print(" "+ch[i]);
		}
		System.out.println();*/
		
		char maxChar='0';
		int maxCount=0;
		
		char currChar='0';
		int currCount=1;
		
		for(int i=0; i<ch.length; i++){
			
			if(currChar == ch[i]){
				currCount++;	
			}
			else{
				currCount=1;
				currChar = ch[i];
			}
			
			if(currCount > maxCount){
				maxChar = currChar;
				maxCount = currCount;
			}
			
		}
		System.out.println(" method 2 max occ char : "+maxChar+" no of times occured : "+maxCount);
		
	}
	
	// o(n2)
	static void findMaxOccrChar(String str){
		char[] ch = str.toCharArray();
		char maxChar='0';
		int maxCount=0;
		
		char currChar;
		int currCount;
		
		for(int i=0; i<ch.length; i++){
			currChar = ch[i];
			currCount = 1;
			for(int j=i+1; j<ch.length; j++){
				
				if(ch[j]==currChar){
					currCount++;
				}
				
			}
			
			if(currCount > maxCount){
				maxChar = currChar;
				maxCount = currCount;
			}
		}
		
		System.out.println("max occ char : "+maxChar+" no of times occured : "+maxCount);
	}
	
	public static void main(String[] args) {
		
		String str = "NAVNEETEE";
		MaxOccChar.findMaxOccrChar(str);
		MaxOccChar.findMaxOccrChar2(str);
		MaxOccChar.findMaxOccChar3(str);
	}
	
	
}
