package com.conditional_statement;

public class IfElseIfLadder {
	
	public static void main(String[] args) {
		
		
		int mark = 51;
		
		if  (mark <50) {
		System.out.println("grade D");
		
		}else if(mark>50 && mark<60) {
		System.out.println("grade C");
		
		}else if(mark>60 && mark<70) {
		System.out.println("Grade B");
		
		}else if(mark>70 && mark<100) {
			System.out.println("grade A");
			
		}else {
			System.out.println("invalid mark");
		}
		
	}

}
