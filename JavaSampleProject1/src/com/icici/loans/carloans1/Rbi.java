package com.icici.loans.carloans1;

public interface Rbi {

	public void withdrawl(); // abstract method doesnt contain implementations
	public void deposit();
	//public static void main(String[] args) {
		//Rbi i = new Rbi;//objects cannot be created for interface directly
	
	public static void main(String[] args) {
		
		/*
		 * Rbi r = new icici(); // r reference variable, new icici is called
		 * polymorphizm r.deposit(); r.withdrawl();
		 * 
		 * Rbi r2 = new hdfc(); r2.deposit(); r2.withdrawl();
		 */
		
		
		Rbi r;
		r = new icici();
		r. deposit();
		r. withdrawl();
		r = new hdfc();
		r. deposit();
		r. withdrawl();
	}	
}
