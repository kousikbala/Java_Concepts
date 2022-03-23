package com.polymophism;

public class OverRiding_Bank {
	
	public void customer(String name) {
		
		System.out.println(name);
		
	}
	
	public void customerDetails(String branch, String actype, long acnumber) {
		
		System.out.println(branch + " "+ actype + "  " + acnumber);

	}
	
	 public void loanDetails(String loantype, int loanamount) {
		 
		 System.out.println(loantype +"  " + loanamount );
		 
	}
	 
	 public static void main(String[] args) {
		
		 OverRiding_Bank obj = new OverRiding_Bank();
		 
		 obj.customer("Balachandiran");
		 obj.customerDetails("porur", "saving", 784565958);
		 obj.loanDetails("business", 2000000);
		
	}
	 

}
