 package com.scanner;

import java.util.Scanner;

public class TicketReservation {
	
	public static void main(String[] args) {
		
    Scanner TR = new Scanner(System.in);
    
    System.out.println("Enter the Destination :-");
    String Destination = TR.nextLine();   
    System.out.println( "Your Destination Is:-"+ Destination);
    
    System.out.println("enter Date:-");
    String Date = TR.nextLine();
    System.out.println("Date is:-" + Date);
    
    System.out.println("enter time:-");
    float Time = TR.nextFloat();
    System.out.println("Your time is:-" + Time);
    
    System.out.println("Enter Your Gender:-");
     String Gender = TR.next();
     System.out.println("your Gender Is:-" + Gender);
     
     System.out.println("Enter Your Seat Number");
     int Seat = TR.nextInt();
     System.out.println("your seat number is:-" + Seat);
     
     System.out.println("enter seat berth");
     char Berth = TR.next().charAt(0);
     System.out.println("your birth is:-" + Berth);
     
 
     
  			
				  
	}

}
