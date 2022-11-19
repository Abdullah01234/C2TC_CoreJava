package com.cg.application;

import com.cg.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {
	
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		
	}

	private static final float charges=20.0f;
	
	
	public void bookProduct(float charges) {
		System.out.println("Dear Prime Users, Your Product is booked and charges are: " + charges);
   
}


	@Override
	public String toString() {
		return "GSPrimeAcc [toString()=" + super.toString() + "]";
	}

		 
}