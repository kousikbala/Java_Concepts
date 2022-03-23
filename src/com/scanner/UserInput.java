package com.scanner;

import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in); 
	
	System.out.println("Enter Your Name:-");
	String name = sc.nextLine();
	System.out.println("Your Name is:- "+ name);
	
    System.out.println("Enter Your Age:- ");
    int age = sc.nextInt();
    System.out.println("your Age Is:-" + age);
    
    System.out.println("Enter Your Height:-");
    float height = sc.nextFloat();
    System.out.println("your Height Is:-" + height);
    
    System.out.println("Enter Your Genter:-");
    String gender = sc.next();
    System.out.println("Your Gender Is:-" + gender);
    
    System.out.println("Enter Your Initial:-");
    char initial = sc.next().charAt(0);
    System.out.println("yuor Initial is:-" + initial);
    
 
	}
	

	}


