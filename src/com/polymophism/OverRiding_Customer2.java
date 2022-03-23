package com.polymophism;

public class OverRiding_Customer2 extends OverRiding_Bank {

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

		super.loanDetails(loantype,          loanamount);
	}
	
	public static void main(String[] args) {
		
		OverRiding_Customer2 obj = new OverRiding_Customer2();
		
		obj.customer("bharathi");
		obj.customerDetails("ramapuram", "savings", 589632789);
		obj.loanDetails("business", 1000000);
	}

}
  