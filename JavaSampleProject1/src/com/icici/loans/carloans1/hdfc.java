package com.icici.loans.carloans1;

public class hdfc implements Rbi{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hdfc h = new hdfc();
		h.deposit();
		h.withdrawl();

	}

	@Override
	public void withdrawl() {
		// TODO Auto-generated method stub
		System.out.println("hdfc withdrawl");		
	}
	

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("hdfc Deposit");
		
	}

}
