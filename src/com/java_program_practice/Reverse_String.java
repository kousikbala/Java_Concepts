package com.java_program_practice;

public class Reverse_String {
	
	public static void main(String[] args) {
		
		
		String a = "Bala";
		String temp = "";
		
		for (int i = a.length()-1; i>=0; i--) {
			
			char value = a.charAt(i);
			temp = temp+value;
			
		}
			System.out.println(temp);
			
//type 2---------------------------------------------------------------------------------------------------------			
			
			StringBuffer b = new StringBuffer (a);
			System.out.println(b.reverse());
			
//type 3-------------------------------------------------------------------------------------------------------------			
//			char c[] = a.toCharArray();
//			int len = c.length;
//			for (int i=len-1; i>=0; i--) {
//				temp = temp+c;
//				System.out.print(c[i]);
//			}
//			
			
			
			
	}
	
	

}
