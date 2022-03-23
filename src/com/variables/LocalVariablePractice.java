package com.variables;

public class LocalVariablePractice {
	
	   int i =12;
	   
	
	public void localvariables() {
	
		int a = 45; 
		
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {
		
		LocalVariablePractice obj = new LocalVariablePractice();
		
		obj.localvariables();
		
		System.out.println(obj.i);
		
		
	}

}
