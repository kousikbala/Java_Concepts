package com.constractor;

public class Student {
	
	public Student() {
	
		System.out.println("bala");    // non parameterized
		
	}
		
	public Student (int stuid){         // parameteraized
		System.out.println(stuid); 
		
	}
	
	public Student (int age, int m1, int m2) {               //parameteraized
		System.out.println(age + "  " + m1+ "  "+m2);
	}
	
	public static void main(String[] args) {
		
		Student obj1 = new Student ();
		Student obj2 = new Student (123456);
		Student obj3 = new Student (20,190,198);
		
		
		
	}
	
}

