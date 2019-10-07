package com.icici.loans.carloans1;

public class icici implements Rbi{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		icici i = new icici();
		i.deposit();
		i.withdrawl();

	}

	@Override
	public void withdrawl() {
		// TODO Auto-generated method stub
		System.out.println("icic withdrawl");		
	}
	

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("icic Deposit");
		
	}

}
