package com.icici.loans.carloans1;

public class AbstractChildClass extends FirstAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChildClass c = new AbstractChildClass();
		c.m1();
		c.m2();
		
		FirstAbstract F = new AbstractChildClass();
		F.m1();
		F.m2();

	}
	public void m2()
	{
		System.out.println("I am overriden m2 from child class");
	}
	
	  public void m1() {
	  System.out.println("I am overriden method m1 in child class"); }
	 

}
