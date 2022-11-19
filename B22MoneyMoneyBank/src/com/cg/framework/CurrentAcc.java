package com.cg.framework;

public abstract class CurrentAcc extends BankAcc{
	
	
    public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit ) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}

	private final float creditLimit=50.0f;
    
    
	
	public float getCreditLimit() {
		return creditLimit;
	}

	public void withdraw(float creditLimit) {
		System.out.println("accBal are: " + creditLimit);
		
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}	
}

	
