package com.rbr.intvw.strings;

public class ReverseWords {
	
	void reverse(String str)
	{
		char[] ch = str.toCharArray();
		int start = 0;
		int end = str.length()-1;
		char temp;
		while(start < end)
		{

			temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;

		}
	}

	void RevereseWords(String str)
	{
		char wordBegin;
		wordBegin = '\0';
		char[] temp1 = str.toCharArray();
		
		//reverse the individual words
		while(temp!=null)
		{
			if((wordBegin == '\0') && (temp != ' '))
				wordBegin = temp;
			if(wordBegin && ((*(temp+1) == ' ') || (*(temp + 1) == '\0')))
			{
				reverse(wordBegin, temp);
				wordBegin = '\0';
			}
			temp++;
		}
		//reverse the whole string from start to end
		reverse(str, temp-1);
	}
	
}
