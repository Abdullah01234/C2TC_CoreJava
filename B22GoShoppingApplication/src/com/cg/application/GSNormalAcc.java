package com.cg.application;

import com.cg.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{
	
	public GSNormalAcc(int accNo, String accNm, float charges, float deliverycharges) {
		super(accNo, accNm, charges, deliverycharges);
		
	}

	public void bookProduct(float deliverycharge) {
		System.out.println("Dear Normal User, Your product is booked, your charges are:" + getCharges() + "and delivery charges are:" + deliverycharge);
		
	}

	@Override
	public String toString() {
		return "GSNormalAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	

	
}
