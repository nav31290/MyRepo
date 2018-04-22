package com.rbr.intvw.patternMatching;

public class FindAllOccurence {
	
	static void findAllOccOfPattern(String text, String pattern){
		
		char[] textArr = text.toCharArray();
		char[] patternArr = pattern.toCharArray();
		
		int n = textArr.length;
		int m = patternArr.length;
		
		for(int index=0; index<=n-m; index++){
			
			for(int index2=0; index2<m; index2++){
				
				if(textArr[index+index2] != patternArr[index2]){
					break;
				}
				
				if(index2 == m-1){
					System.out.println("pattern found at index : "+index);
				}
				
			}
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		String text = "Navneet";
		String pattern = "neet";
		
		FindAllOccurence.findAllOccOfPattern(text, pattern);
		
	}
	
}
