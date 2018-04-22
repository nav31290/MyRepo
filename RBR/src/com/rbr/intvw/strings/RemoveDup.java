package com.rbr.intvw.strings;

public class RemoveDup {
	
	/*static void removeDup(String str){
		char[] ch = str.toCharArray();
		char[] temp = new char[ch.length];
		
		for(int i=0; i<ch.length; i++){
			boolean present = false;
			char cur = ch[i];
			for(int j=0;j<temp.length;j++){
				
				if(cur==ch[j]){
					present = true;
				}
				
			}
			
			if(!present){
				++temp[]
			}
			
		}
		
	}*/
	
	static String removeDup(String str){
		
		char[] strArr = str.toCharArray();
		int size = str.length();
		int[] temp = new int[256];
		int count = 0;
		for(int i=0,j=0; i<size; i++){
			
			if(j==size-1){
				count =i;
				break;
			}
			
			if(temp[strArr[i]]==0){
				j++;
				temp[strArr[i]]++;
			}
			else{

				for(j=j+1; j<size; j++){

					if(temp[strArr[j]]==0){

						strArr[i] = strArr[j];
						temp[strArr[j]]++;
						break;

					}

				}


			}
			
		}
		String resStr = new String(strArr);
		resStr = resStr.substring(0, count);
		return resStr;
		
	}
	// beautiful way of writing same above pgm
	static String removeDup1(String str){
		
		char[] ch = str.toCharArray();
		int curIndex,finalIndex=0;
		char temp;
		int[] hash = new int[256];
		for( curIndex=0; curIndex< ch.length; curIndex++){
			
			temp = ch[curIndex];
			if(hash[temp]==0){
				
				hash[temp] = 1;
				ch[finalIndex++] = ch[curIndex];
				
			}
			
		}
		
		String resStr = new String(ch);
		resStr = resStr.substring(0, finalIndex);
		return resStr;
		
	}
	
	public static void main(String[] args) {
		
		String str = "gaadbbaaggaij";
		System.out.println("before : "+str);
		System.out.println("str after removal : "+RemoveDup.removeDup(str));
		System.out.println("str after removal method 2: "+RemoveDup.removeDup1(str));
	}
	
}
