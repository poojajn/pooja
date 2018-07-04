package com.abc;

public class FirstAssnDay2 {

	public static void main(String[] args) {
		
		String input="5 1 9 5\n"+ 
					 "7 5 3\n"+ 
					 "2 4 6 8";
		
		int len=input.length();
		System.out.println(len);
		int small=Integer.parseInt(String.valueOf(input.charAt(0)));
		int big=Integer.parseInt(String.valueOf(input.charAt(0)));
		int diff=0, checkSum=0;
		
		for(int i=0;i<len;i++) {
			
			while(input.charAt(i)=='\n') {
			
				if((Integer.parseInt(String.valueOf(input.charAt(i))))>big) {
					big=Integer.parseInt(String.valueOf(input.charAt(i)));
				}
				
				if((Integer.parseInt(String.valueOf(input.charAt(i))))<small) {
					small=Integer.parseInt(String.valueOf(input.charAt(i)));
				}
			}
			
			diff=diff+(big-small);
			
			
		}

	}

}
