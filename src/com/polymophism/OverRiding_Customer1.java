package com.polymophism;

public class OverRiding_Customer1 extends OverRiding_Bank {

	@Override
	public void customer(String name) {
		
		super.customer(name);
	}
	

	@Override
	public void customerDetails(String branch, String actype, long acnumber) {
		
			super.customerDetails(branch, actype, acnumber);
	}
	

	@Override
	public void loanDetails(String loantype, int loanamount) {
		
		super.loanDetails(loantype, loanamount);
	}
	
	 public static void main(String[] args) {
		
		 OverRiding_Customer1 obj = new OverRiding_Customer1();
		 
		 obj.customer("sunil");
		 obj.customerDetails("porur", "current", 896475286);
		 obj.loanDetails("education", 300000);
		 
	}
	
	

}
