package com.variables;

public class StaticVariable {
	
    static	 int i ;   //static variable
	
	static int j = 59; // static variable
	
	
	public static void staticvari() {
		
		int a = 52; //local variable
		
		System.out.println(a);	
	} 
	
	
	public static void check() {
	
		int a = 66;  //local variable
		
		System.out.println(a);	
	}
	
	//public  void numb() {
		
	//	int b= 25;
	//	System.out.println(b);
		
//	}
	 public static void main(String[] args) {
		
		 
		// StaticVariable obj = new StaticVariable();
		// obj.numb();
		 
		 
		staticvari();
	    check();
		System.out.println(i +" " + j);
		
		
		
		
	}
	

}
