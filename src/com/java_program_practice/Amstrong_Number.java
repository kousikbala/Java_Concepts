package com.java_program_practice;

public class Amstrong_Number {
	
	public static void main(String[] args) {
		
		int a = 153;
		
		int temp = a;
		
		int rem = 0;
		
		int value = 0;
		
		while (temp>0) {
			
			rem = temp % 10;      //remainder
			
			value = value + (rem * rem * rem);
			
			temp = temp/10;       //quotient
			
		}
		
		if (a== value) {
			
			System.out.println("Armstrong number");
			
		}
		else {
			 
			System.out.println("not Armstrong Number");
		}
		
	}
	

}
