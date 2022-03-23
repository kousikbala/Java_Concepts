  package com.typecasting;

public class Child extends Parent {

	public void childMethod() {
	 
		System.out.println("Child Method");
	}
	
	public static void main(String[] args) {
		
		Parent s1 = new Child();
		Child s2 = new Child();
		
              s1.parentMethod();
              s2.childMethod();
	}
	
}
 