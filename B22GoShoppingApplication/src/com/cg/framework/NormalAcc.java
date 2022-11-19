package com.cg.framework;

public abstract class NormalAcc extends ShopAcc {
	
	public NormalAcc(int accNo, String accNm, float charges, float deliverycharges) {
		super(accNo, accNm, charges);
		
	}

	private final float deliverycharge=50.0f;
	
	
	
	public float getDeliverycharge() {
		return deliverycharge;
	}

	public void bookProduct (float deliverycharge) {
		System.out.println("charges are : " + deliverycharge);
		
	}

	@Override
	public String toString() {
		return "NormalAcc [deliverycharge=" + deliverycharge + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
} 
	
