package org.college;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("Must deposit Rs 500");
		
	}
	

	public static void main(String[] args) {
		
		AxisBank Axis = new AxisBank ();
		Axis.saving();
		Axis.fixed();
		Axis.deposit();
		
		BankInfo bank = new BankInfo();
		bank.deposit();
		
	}

}
