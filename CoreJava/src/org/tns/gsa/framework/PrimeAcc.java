package org.tns.gsa.framework;

public abstract class PrimeAcc extends ShopAcc {
	private boolean isPrime;
	private static final float deliveryCharges = 0;
	public PrimeAcc(int accNo, String accNm,float charges, boolean isPrime){
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
	}
	@Override
	public abstract void bookProduct(float charges);
	@Override
	public abstract String toString();
	public boolean getIsPrime() {
		return isPrime;
	}
	public float getDeliveryCharges() {
		return deliveryCharges;
	}
}
